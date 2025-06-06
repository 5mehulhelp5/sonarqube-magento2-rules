<h2>Checks to be implemented</h2>

<p>
    This TODO list is taken from the <a href="https://github.com/magento/magento-coding-standard/blob/develop/Magento2/ruleset.xml">
        official rule set for PHPCodeSniffer for Magento 2
    </a>. 
    Only rules from Magento 2 namespace are considered, as the rest are pretty well covered by standard SQ rules. 
    Also omitted are rules not related to .php & .phtml files
</p>

<h3>Classes</h3>
<ul>
    <li>❌ DiscouragedDependencies</li>
    <li>❌ AbstractApi</li>
</ul>

<h3>Legacy</h3>
<ul>
    <li>❌ MageEntity</li>
    <li>❌ AbstractBlock</li>
    <li>❌ EmailTemplate</li>
    <li>❌ InstallUpgrade</li>
    <li>❌ PhtmlTemplate</li>
    <li>❌ ObsoleteConnection</li>
    <li>✖️ ObsoleteConfigNodes ( XML scope )</li>
    <li>✖️ Layout ( XML scope )</li>
    <li>✖️ RestrictedCode ( XML & JS Scope )</li>
    <li>✖️ ClassReferencesInConfigurationFiles ( XML scope )</li>
    <li>✖️ ModuleXML ( XML Scope )</li>
    <li>✖️ DiConfig ( XML Scope )</li>
    <li>✖️ WidgetXML ( XML Scope )</li>
    <li>✖️ ObsoleteAcl ( XML Scope )</li>
    <li>✖️ ObsoleteMenu ( XML Scope )</li>
    <li>✖️ ObsoleteSystemConfiguration ( XML Scope )</li>


</ul>

<h3>NamingConvention</h3>
<ul>
    <li>❌ ReservedWords</li>
    <li>❌ InterfaceName</li>
</ul>

<h3>PHP</h3>
<ul>
    <li>✅ Goto ( As part of the standard PHP ruleset, php:S907 )</li>
    <li>✅ ReturnValueCheck ( M1.2 , change key )</li>
    <li>✅ LiteralNamespaces ( MCS0.1, change key)</li>
    <li>✅ Var ( As part of the standard PHP ruleset, php:S1765 )</li>
    <li>️⚠ AutogeneratedClassNotInConstructor ( Partially implemented in M2.5 )</li>
    <li>❌ FinalImplementation</li>
    <li>❌ ShortEchoSyntax</li>
    <li>❌ ArrayAutovivification</li>
</ul>

<h3>Security</h3>
<ul>
    <li>️⚠️ InsecureFunction ( Partially implemented as part of the standard PHP ruleset ( exec ), php:S1523 )</li>
    <li>️⚠ Superglobal ( Partially implemented as part of the standard PHP ruleset, php:S2011 )</li>
    <li>❌ LanguageConstruct</li>
    <li>❌ ExecutableRegEx </li>
    <li>❌ IncludeFile</li>
    <li>✅ XssTemplate ( M15.3.1, change key )</li>
</ul>

<h3>Html</h3>
<ul>
    <li>❌ HtmlSelfClosingTags</li>
    <li>❌ HtmlClosingVoidTags</li>
    <li>❌ HtmlCollapsibleAttribute</li>
    <li>❌ HtmlBinding</li>
    <li>✖️ HtmlDirective ( XML Scope )</li>

</ul>

<h3>SQL</h3>
<ul>
    <li>❌ RawQuery</li>
</ul>

<h3>Exceptions</h3>
<ul>
    <li>❌ DirectThrow</li>
    <li>❌ ThrowCatch</li>
    <li>❌ TryProcessSystemResources</li>

</ul>

<h3>Functions</h3>
<ul>
    <li>❌ DiscouragedFunction</li>
    <li>❌ StaticFunction</li>
    <li>❌ FunctionsDeprecatedWithoutArgument</li>
</ul>

<h3>Namespaces</h3>
<ul>
    <li>❌ ImportsFromTestNamespace</li>
</ul>

<h3>Templates</h3>
<ul>
    <li>✅ ThisInTemplate ( MCS0.3, change key )</li>
    <li>✅ ObjectManager ( MCS0.2, change key )</li>
</ul>

<h3>Translation</h3>
<ul>
    <li>❌ ConstantUsage</li>
</ul>

<h3>Methods</h3>
<ul>
    <li>❌ DeprecatedModelMethod</li>
</ul>

<h3>CodeAnalysis</h3>
<ul>
    <li>✅ EmptyBlock ( As part of the standard PHP ruleset, php:S1116 )</li>
</ul>

<h3>Performance</h3>
<ul>
    <li>❌ ForeachArrayMerge</li>
</ul>

<h3>Strings</h3>
<ul>
    <li>️⚠ StringConcat  ( Partially implemented as part of the standard PHP ruleset, php:S2005 )</li>
</ul>

<h3>GraphQL</h3>
<ul>
    <li>❌ ValidArgumentName</li>
    <li>❌ ValidEnumValue</li>
    <li>❌ ValidFieldName</li>
    <li>❌ ValidTopLevelFieldName</li>
    <li>❌ ValidTypeName</li>
</ul>

<h3>Whitespace</h3>
<ul>
    <li>❌ MultipleEmptyLines</li>
</ul>

<h3>Commenting</h3>
<ul>
    <li>❌ ClassAndInterfacePHPDocFormatting</li>
    <li>❌ ClassPropertyPHPDocFormatting</li>
    <li>❌ ConstantsPHPDocFormatting</li>
    <li>❌ Annotation</li>
</ul>

<h3>Other</h3>
<ul>
    <li>✖️ Less ( Less scope )</li>
</ul>
