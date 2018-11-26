package com.sankalp.reactivedemo;




public class Image {

    private String id;
    private String name;

    public Image(String id, String name) {

        this.id = id;
        this.name = name;
    }

    public Image() {

    }

    public String getId() {

        return id;
    }

    public void setId(String id) {

        this.id = id;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }
}