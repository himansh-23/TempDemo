package org.example.enums;

public enum SimpleEnum {

    X("/home/user/Desktop/Testing",1),Y("/home/user/Desktop",2);

    private String location;
    private int x;

     SimpleEnum(String location,int x){
        this.location = location;
        this.x = x;
    }

    public String getLocation() {
        return location;
    }
}
