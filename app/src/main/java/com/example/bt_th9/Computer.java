package com.example.bt_th9;

public class Computer {
    String ten;
    String dungluong;
    int ram;

    public Computer() {
    }

    public Computer(String ten, String dungluong, int ram) {
        this.ten = ten;
        this.dungluong = dungluong;
        this.ram = ram;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDungluong() {
        return dungluong;
    }

    public void setDungluong(String dungluong) {
        this.dungluong = dungluong;
    }

    public int getRam() {
        return ram;
    }

    public void setBonho(int ram) {
        this.ram = ram;
    }
}
