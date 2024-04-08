/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Nguyen Hoang Anh
 */
public class QLXE {
    ArrayList<Xe> lst= new ArrayList<>();
    Scanner s= new Scanner(System.in);
    
    int n;
    // Nhap
    public void YC1(){
        System.out.print("Moi ban nhap vao so luong xe: ");
        n= Integer.parseInt(s.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin cho xe thu " + (i+1) +"");
            System.out.println("1-Xe may    2-O to  3-Xe bus");
            int chon= s.nextInt();
            
            switch (chon) {
                case 1:
                    Motorbike mtb= new Motorbike();
                    mtb.nhap();
                    lst.add(mtb);
                    break;
                case 2:
                    Car oto= new Car();
                    oto.nhap();
                    lst.add(oto);
                    break;
                case 3:
                    Bus buyt= new Bus();
                    buyt.nhap();
                    lst.add(buyt);
                    break;
                default:
                    System.out.println("Moi ban chon lai !");
                    break;
            }
        }
    }
    
    // Xuat
    public void YC2(){
        System.out.printf("--------------------Danh sach xe--------------------\n\n");
        for (Xe item : lst) {
            item.xuat();
        }
    }
    
    //Tim xe theo ma
    public void YC3(){
        Scanner ss= new Scanner(System.in);
        System.out.print("Nhap ma xe muon tim: ");
        String ma= ss.nextLine();
        
        System.out.println("--------------------Thong tin xe muon tim--------------------");
        for (Xe item : lst) {
            lst.indexOf(s);
            if (item.getMaXe().equalsIgnoreCase(ma)) {
                item.xuat();
            }
        }
    }
    
    //Xoa xe theo ma
    public void YC4(){
        Scanner cs= new Scanner(System.in);
        System.out.print("Nhap ma xe muon xoa: ");
        String ma= cs.nextLine();
        for (Xe item : lst) {
            if(ma.equalsIgnoreCase(item.getMaXe())){
                lst.remove(item);
                break;
            }
        }
        YC2();
        
    }
    
    //Tim kiem xe theo ma va cap nhat thong tin xe
    public void YC5(){
        Scanner sc= new Scanner(System.in);
        System.out.print("Nhap ma xe muon thay doi: ");
        String ma= sc.nextLine();
        for (Xe item : lst) {
            if (item.getMaXe().equalsIgnoreCase(ma)) {
                System.out.println("--------------------Cap nhat lai thong tin xe--------------------");
                item.nhap();
            }
        }
        YC2();
    }
    
    //Tim xe theo khoang gia xe
    public void YC6(){
        System.out.println("------Nhap vao khoang gia cua xe------");
        System.out.print("Nhap vao min gia: ");
        double min= s.nextInt();
        System.out.print("Nhap vao max gia: ");
        double max= s.nextInt();
        System.out.println("--------------------Danh sach xe trong khoang gia yeu cau--------------------");
        for (Xe item : lst) {
            if (item.getGiaXe() >= min && item.getGiaXe() <= max) {
                item.xuat();
            }
        }
        
    }
    
    //Sap xep xe theo ma
    public void YC7(){
        Comparator<Xe> comp= new Comparator<Xe>(){
            @Override
            public int compare(Xe o1, Xe o2){
                return o1.getMaXe().compareTo(o2.getMaXe());
            }
            
        };
        Collections.sort(lst, comp);
        YC2();
    }
    
    //Xuat 5 xe co gia cao nhat
    public void YC8(){
        System.out.println("--------------------5 xe co gia thanh cao nhat--------------------");
        if(lst.size() < 5){
            for (int i = 0; i < lst.size(); i++) {
                lst.get(i).xuat();
            }
        }else{
            for (int i = 0; i < 5; i++) {
                lst.get(i).xuat();
            }
        }

    }
    
    //Xe gia dat nhat
    public void YC9(){
        double max= 0;
        String ten= "";
        for (Xe item : lst) {
            if (max < item.getGiaXe()) {
                max= (int) item.getGiaXe();
                ten= item.getTenXe();
            }
        }
        System.out.println("Xe co gia dat nhat la xe " + ten + " voi gia la: " +max);
        
    }
    
    public void YC10(){
        double min= 1000000;
        String ten= "";
        for (Xe item : lst) {
             min= item.getGiaXe();
            if (item.getGiaXe() < min) {
                min= (int) item.getGiaXe();
                ten= item.getTenXe();
            }
        }
        System.out.println("Xe co gia re nhat la xe " + ten + " voi gia la: " +min);
        
    }
}
