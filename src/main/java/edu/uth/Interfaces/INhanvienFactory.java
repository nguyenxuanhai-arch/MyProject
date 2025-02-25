package edu.uth.Interfaces;

import edu.uth.ImplementClass.Nhanvien;

public interface INhanvienFactory {
    public Nhanvien createNhanvien(String loaiNV);
    public  Nhanvien createNhanvien(String loaiNV, String maso, String hoten, double luongCB);
}
