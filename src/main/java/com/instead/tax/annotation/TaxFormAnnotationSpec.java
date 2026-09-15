package com.instead.tax.annotation;
import java.util.List;
public class TaxFormAnnotationSpec {
    private String specVersion;
    private FormDefinition form;
    private List<Annotation> annotations;
    public String getSpecVersion(){return specVersion;} public void setSpecVersion(String v){specVersion=v;}
    public FormDefinition getForm(){return form;} public void setForm(FormDefinition v){form=v;}
    public List<Annotation> getAnnotations(){return annotations;} public void setAnnotations(List<Annotation> v){annotations=v;}
}
