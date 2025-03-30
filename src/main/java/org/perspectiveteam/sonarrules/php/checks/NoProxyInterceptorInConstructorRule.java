package org.perspectiveteam.sonarrules.php.checks;

import org.perspectiveteam.sonarrules.php.utils.CheckUtils;
import org.sonar.check.Priority;
import org.sonar.check.Rule;
import org.sonar.plugins.php.api.tree.declaration.MethodDeclarationTree;
import org.sonar.plugins.php.api.tree.declaration.ParameterTree;
import org.sonar.plugins.php.api.visitors.PHPVisitorCheck;

import java.util.List;
import java.util.Objects;
import java.util.regex.Pattern;

@Rule(
        key = org.perspectiveteam.sonarrules.php.checks.NoProxyInterceptorInConstructorRule.KEY,
        name = org.perspectiveteam.sonarrules.php.checks.NoProxyInterceptorInConstructorRule.MESSAGE,
        description = "Proxies and interceptors must never be explicitly requested in constructors. Use dependency injection with the class type instead.",
        priority = Priority.BLOCKER,
        tags = {"magento2", "dependency-injection", "design", "bug"}
)
public class NoProxyInterceptorInConstructorRule extends PHPVisitorCheck {
    public static final String KEY = "M2.5";
    public static final String MESSAGE = "No explicit proxy/interceptor requests in constructors.";
    public static final Pattern PROXY_INTERCEPTOR_PATTERN = Pattern.compile(".*(\\\\Proxy|\\\\Interceptor)$");

    @Override
    public void visitMethodDeclaration(MethodDeclarationTree tree) {
        if (CheckUtils.isConstructorMethodPromotion(tree)) {
            List<ParameterTree> parameters = tree.parameters().parameters();
            for (ParameterTree param : parameters) {
                if(param.declaredType().toString() == null){
                    continue;
                }
                if (PROXY_INTERCEPTOR_PATTERN.matcher(param.declaredType().toString()).matches()) {
                    context().newIssue(this, param, MESSAGE);
                }
            }
        }

        super.visitMethodDeclaration(tree);
    }
}