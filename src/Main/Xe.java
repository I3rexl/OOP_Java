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
public class Xe {
    private String maXe;
    private String tenXe;
    private String hangXe;
    private double giaXe; 
    private String mauXe;
    private String bienSo;
    Scanner s= new Scanner(System.in);

    public Xe() {
    }

    public Xe(String maXe, String tenXe, String hangXe, double giaXe, String mauXe, String bienSo) {
        this.maXe = maXe;
        this.tenXe = tenXe;
        this.hangXe = hangXe;
        this.giaXe = giaXe;
        this.mauXe = mauXe;
        this.bienSo = bienSo;
    }

    public String getMaXe() {
        return maXe;
    }

    public void setMaXe(String maXe) {
        this.maXe = maXe;
    }

    public String getTenXe() {
        return tenXe;
    }

    public void setTenXe(String tenXe) {
        this.tenXe = tenXe;
    }

    public String getHangXe() {
        return hangXe;
    }

    public void setHangXe(String hangXe) {
        this.hangXe = hangXe;
    }

    public double getGiaXe() {
        return giaXe;
    }

    public void setGiaXe(double giaXe) {
        this.giaXe = giaXe;
    }

    public String getMauXe() {
        return mauXe;
    }

    public void setMauXe(String mauXe) {
        this.mauXe = mauXe;
    }

    public String getBienSo() {
        return bienSo;
    }

    public void setBienSo(String bienSo) {
        this.bienSo = bienSo;
    }
    
    
    public void nhap(){
        
        System.out.print("Nhap ma xe: ");
        maXe= s.nextLine();
        System.out.print("Nhap ten xe: ");
        tenXe= s.nextLine();
        System.out.print("Nhap hang xe: ");
        hangXe= s.nextLine();
        System.out.print("Nhap gia xe: ");
        giaXe= Double.parseDouble(s.nextLine());
        System.out.print("Nhap mau xe: ");
        mauXe= s.nextLine();
        System.out.print("Nhap bien so xe: ");
        bienSo= s.nextLine();
    }
    
    public void xuat(){
        String ma= "Ma xe";
        String ten= "Ten xe";
        String hang= "Hang xe";
        String gia= "Gia xe";
        String mau= "Mau xe";
        String bien= "Bien so xe";
//        System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s\n\n" ,ma ,ten ,hang ,gia ,mau ,bien);
//        System.out.printf("%s          %s          %s          %s          %s          %s\n\n" ,ma ,ten ,hang ,gia ,mau ,bien);
        System.out.printf("%-20s %-20s %-20s %-20.0f %-20s %-20s" ,maXe ,tenXe ,hangXe ,giaXe ,mauXe ,bienSo);
        
          
    }
}
