package org.perspectiveteam.sonarrules.php;

import org.sonar.api.Plugin;

/**
 * Extension point to define a Sonar Plugin.
 */
public class PHPCustomRulesPlugin implements Plugin {

    @Override
    public void define(Context context) {
        context.addExtension(Magento2PhpRules.class);
    }
}
