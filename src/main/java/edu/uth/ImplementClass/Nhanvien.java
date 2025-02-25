package edu.uth.ImplementClass;

import edu.uth.Interfaces.ITienthuong;

public abstract class Nhanvien {
    protected  String maso;
    protected  String hoten;
    protected  double luongCB;
    protected ITienthuong phuongthucTinhThuong;

    public Nhanvien(String maso, String hoten, double luongCB) {
        this.maso = maso;
        this.hoten = hoten;
        this.luongCB = luongCB;
    }

    public Nhanvien() {
    }

    public String getMaso() {
        return maso;
    }

    public String getHoten() {
        return hoten;
    }

    public double getLuongCB() {
        return luongCB;
    }

    public ITienthuong getPhuongthucTinhThuong() {
        return phuongthucTinhThuong;
    }

    public void setMaso(String maso) {
        this.maso = maso;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public void setLuongCB(double luongCB) {
        this.luongCB = luongCB;
    }

    @Override
    public String toString() {
        return "Nhanvien{" +
                "maso='" + maso + '\'' +
                ", hoten='" + hoten + '\'' +
                ", luongCB=" + luongCB +
                '}';
    }
}
