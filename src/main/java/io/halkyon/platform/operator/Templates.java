package io.halkyon.platform.operator;

import io.halkyon.platform.operator.model.Step;
import io.quarkus.qute.CheckedTemplate;
import io.quarkus.qute.TemplateInstance;

@CheckedTemplate(requireTypeSafeExpressions = false)
public class Templates {
    public static native TemplateInstance helmscript(Step step);
    public static native TemplateInstance uninstallhelmscript(Step step);
    public static native TemplateInstance waitscript(Step step);
    public static native TemplateInstance waitresourcescript(Step step);
    public static native TemplateInstance manifestscript(Step step);
    public static native TemplateInstance uninstallmanifestscript(Step step);
}
