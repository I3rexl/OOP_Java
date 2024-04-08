/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import java.util.Scanner;

/**
 *
 * @author Nguyen Hoang Anh
 */
public class Bus extends Xe{
    private String choNgoi;
    private String nhienLieu;
    private String loaiGhe;
    private String maLuc;

    public Bus() {
    }

    public String getChoNgoi() {
        return choNgoi;
    }

    public void setChoNgoi(String choNgoi) {
        this.choNgoi = choNgoi;
    }

    public String getNhienLieu() {
        return nhienLieu;
    }

    public void setNhienLieu(String nhienLieu) {
        this.nhienLieu = nhienLieu;
    }

    public String getLoaiGhe() {
        return loaiGhe;
    }

    public void setLoaiGhe(String loaiGhe) {
        this.loaiGhe = loaiGhe;
    }

    public Scanner getS() {
        return s;
    }

    public void setS(Scanner s) {
        this.s = s;
    }

    public String getMaLuc() {
        return maLuc;
    }

    public void setMaLuc(String maLuc) {
        this.maLuc = maLuc;
    }
    
    
    @Override
    public void nhap(){
        System.out.println("Moi ban nhap thong tin xe bus");
        super.nhap();
        System.out.print("Nhap ma luc cua xe bus: ");
        maLuc= s.nextLine();
        System.out.print("Nhap loai ghe cua xe bus: ");
        loaiGhe= s.nextLine();
        System.out.print("Nhap so luong cho ngoi/nam tren xe bus: ");
        choNgoi= s.nextLine();
        System.out.print("Nhap loai nhieu lieu ma xe bus su dung: ");
        nhienLieu= s.nextLine();
    }
    
    @Override
    public void xuat(){
//        String ma= "Ma xe";
//        String ten= "Ten xe";
//        String hang= "Hang xe";
//        String gia= "Gia xe";
//        String mau= "Mau xe";
//        String bien= "Bien so xe";
//        String loai= "Loai ghe";
//        String cho= "Cho ngoi";
//        String xang= "Loai nhien lieu";
//        System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s\n\n" ,ma ,ten ,hang ,gia ,mau ,bien ,loai ,cho ,xang);
        super.xuat();
        System.out.printf("%-20s %-20s %-20s %-20s\n\n" ,maLuc ,loaiGhe ,choNgoi ,nhienLieu);
    }
    
}
