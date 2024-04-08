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
public class Motorbike extends Xe{
    private String phanKhoi;
    private String nhienLieu;

    public Motorbike() {
    }

    public Motorbike(String phanKhoi, String nhienLieu) {
        this.phanKhoi = phanKhoi;
        this.nhienLieu = nhienLieu;
    }

    public String getPhanKhoi() {
        return phanKhoi;
    }

    public void setPhanKhoi(String phanKhoi) {
        this.phanKhoi = phanKhoi;
    }

    public String getNhienLieu() {
        return nhienLieu;
    }

    public void setNhienLieu(String nhienLieu) {
        this.nhienLieu = nhienLieu;
    }

    public Scanner getS() {
        return s;
    }

    public void setS(Scanner s) {
        this.s = s;
    }
    
    @Override
    public void nhap(){
        System.out.println("Moi ban nhap thong tin xe may");
        super.nhap();
        System.out.print("Nhap phan khoi cua xe may: ");
        phanKhoi= s.nextLine();
        System.out.print("Nhap loai nguyen lieu ma xe may su dung: ");
        nhienLieu= s.nextLine();
    }
    
    @Override
    public void xuat(){
        super.xuat();
//        System.out.printf("Ma xe         Ten xe          Hang xe          Gia xe          Mau xe          Bien so xe          So cho          Nguyen lieu\n\n");
        System.out.printf("%-20s %-20s\n\n" ,phanKhoi ,nhienLieu);
    }
}
