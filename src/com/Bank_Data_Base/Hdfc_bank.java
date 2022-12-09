package com.Bank_Data_Base;

public class Hdfc_bank {
    private String name;
    private String bankname;
    private int mobnumber;
    private int accno;
    private String city;

    public Hdfc_bank(String name, String bankname, int mobnumber, int accno, String city) {
        this.name = name;
        this.bankname = bankname;
        this.mobnumber = mobnumber;
        this.accno = accno;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBankname() {
        return bankname;
    }

    public void setBankname(String bankname) {
        this.bankname = bankname;
    }

    public int getMobnumber() {
        return mobnumber;
    }

    public void setMobnumber(int mobnumber) {
        this.mobnumber = mobnumber;
    }

    public int getAccno() {
        return accno;
    }

    public void setAccno(int accno) {
        this.accno = accno;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Hdfc_bank{" +
                "name='" + name + '\'' +
                ", bankname='" + bankname + '\'' +
                ", mobnumber=" + mobnumber +
                ", accno=" + accno +
                ", city='" + city + '\'' +
                '}';
    }
}
