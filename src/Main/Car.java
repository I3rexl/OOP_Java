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
public class Car extends Xe{
    private String choNgoi;
    private String nhienLieu;
    private String maLuc;

    public Car() {
    }

    public String getMaLuc() {
        return maLuc;
    }

    public void setMaLuc(String maLuc) {
        this.maLuc = maLuc;
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

    public Scanner getS() {
        return s;
    }

    public void setS(Scanner s) {
        this.s = s;
    }
    
    @Override
    public void nhap(){
        System.out.println("Moi ban nhap thong tin xe oto");
        super.nhap();
        System.out.print("Nhap ma luc cua xe oto: ");
        maLuc= s.nextLine();
        System.out.print("Nhap so cho cua xe oto: ");
        choNgoi= s.nextLine();
        System.out.print("Nhap loai nguyen lieu ma xe oto su dung: ");
        nhienLieu= s.nextLine();
    }
    
    @Override
    public void xuat(){
        super.xuat();
//        System.out.printf("Ma xe         Ten xe          Hang xe          Gia xe          Mau xe          Bien so xe          So cho          Nguyen lieu\n\n");
        System.out.printf("%-20s %-20s %-20s\n\n" ,maLuc ,choNgoi ,nhienLieu);
    }
}
