package com.example.ndf;

public class NF {
private String ID;
    private String Name;
    private String Address;
    private String Area;
    private String Cno;
    private String Quantity;
    public NF(){

    }

    public NF(String ID, String name, String address, String area, String cno, String quantity) {
        this.ID = ID;
        Name = name;
        Address = address;
        Area = area;
        Cno = cno;
        Quantity = quantity;
    }

    public String getID() {
        return ID;
    }

    public String getName() {
        return Name;
    }

    public String getAddress() {
        return Address;
    }

    public String getArea() {
        return Area;
    }

    public String getCno() {
        return Cno;
    }

    public String getQuantity() {
        return Quantity;
    }
}
