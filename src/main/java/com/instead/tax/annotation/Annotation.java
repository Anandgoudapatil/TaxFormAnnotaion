package com.instead.tax.annotation;
public class Annotation {
    private String id;
    private int page;
    private AnnotationType type;
    private DataReference source;
    private Position position;
    private TextFormat format;
    public String getId(){return id;} public void setId(String v){id=v;}
    public int getPage(){return page;} public void setPage(int v){page=v;}
    public AnnotationType getType(){return type;} public void setType(AnnotationType v){type=v;}
    public DataReference getSource(){return source;} public void setSource(DataReference v){source=v;}
    public Position getPosition(){return position;} public void setPosition(Position v){position=v;}
    public TextFormat getFormat(){return format;} public void setFormat(TextFormat v){format=v;}
}
