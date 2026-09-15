package com.instead.tax.annotation;
public class TextFormat {
    private String fontFamily="Helvetica";
    private double fontSize=10;
    private String alignment="LEFT";
    private String color="#000000";
    private Integer maxLength;
    private String overflow="SHRINK";
    private String currency;
    private Integer decimalPlaces;
    private Boolean thousandsSeparator;
    private String checkedMark;
    private String mask;

    public String getFontFamily(){return fontFamily;} public void setFontFamily(String v){fontFamily=v;}
    public double getFontSize(){return fontSize;} public void setFontSize(double v){fontSize=v;}
    public String getAlignment(){return alignment;} public void setAlignment(String v){alignment=v;}
    public String getColor(){return color;} public void setColor(String v){color=v;}
    public Integer getMaxLength(){return maxLength;} public void setMaxLength(Integer v){maxLength=v;}
    public String getOverflow(){return overflow;} public void setOverflow(String v){overflow=v;}
    public String getCurrency(){return currency;} public void setCurrency(String v){currency=v;}
    public Integer getDecimalPlaces(){return decimalPlaces;} public void setDecimalPlaces(Integer v){decimalPlaces=v;}
    public Boolean getThousandsSeparator(){return thousandsSeparator;} public void setThousandsSeparator(Boolean v){thousandsSeparator=v;}
    public String getCheckedMark(){return checkedMark;} public void setCheckedMark(String v){checkedMark=v;}
    public String getMask(){return mask;} public void setMask(String v){mask=v;}
}
