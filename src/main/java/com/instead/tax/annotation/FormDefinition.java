package com.instead.tax.annotation;
public class FormDefinition {
    private String formId, revision, coordinateSystem;
    private PageSize pageSize;
    public String getFormId(){return formId;} public void setFormId(String v){formId=v;}
    public String getRevision(){return revision;} public void setRevision(String v){revision=v;}
    public PageSize getPageSize(){return pageSize;} public void setPageSize(PageSize v){pageSize=v;}
    public String getCoordinateSystem(){return coordinateSystem;} public void setCoordinateSystem(String v){coordinateSystem=v;}
}
