package ru.workMatters.tasks.domain;

import java.util.Objects;

public class Tasks{

    private long id;
    private String name;
    private String description;
    private boolean status;
    private String date;

    public Tasks(String name, String description, boolean status, String date){
        this.name = name;
        this.description = description;
        this.status = status;
        this.date = date;
    }

    @Override
    public String toString(){
        return "Tasks{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", status='" + status + '\'' +
                ", date='" + date + '\'' +
                '}';
    }

    @Override
    public boolean equals( Object o ){
        if (o == null || getClass() != o.getClass()) return false;
        Tasks tasks = (Tasks) o;
        return id == tasks.id && Objects.equals( name, tasks.name ) && Objects.equals( description, tasks.description ) && Objects.equals( status, tasks.status ) && Objects.equals( date, tasks.date );
    }

    @Override
    public int hashCode(){
        return Objects.hash( id, name, description, status, date );
    }

    public long getId(){
        return id;
    }

    public void setId( long id ){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName( String name ){
        this.name = name;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription( String description ){
        this.description = description;
    }

    public boolean getStatus(){
        return status;
    }

    public void setStatus( boolean status ){
        this.status = status;
    }

    public String getDate(){
        return date;
    }

    public void setDate( String date ){
        this.date = date;
    }
}
