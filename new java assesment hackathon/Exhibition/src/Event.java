package org.ness;

public abstract class Event {
    protected String name;
    protected String detail;
    protected String type;
    protected String organizer;
    public Event(String name,String detail,String type,String organizer)
    {
        this.name = name;
        this.detail = detail;
        this.type = type;
        this.organizer = organizer;
    }



    public String getName() {
        return this.name;
    }

    public String getDetail() {
        return this.detail;
    }

    public String getType() {
        return this.type;
    }

    public String getOrganizer() {
        return this.organizer;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setOrganizer(String organizer) {
        this.organizer = organizer;
    }
    abstract double calculateAmount();
}