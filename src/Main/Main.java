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
public class Main {
    public static void main(String[] args) {
        QLXE QL= new QLXE();
        int chon= 0;
        
       do{
        System.out.println("");
        System.out.println(">--------------------Menu--------------------<");
        System.out.println("1.Nhap danh sach xe");
        System.out.println("2.Xuat danh sach xe");
        System.out.println("3.Tim kiem xe theo ma");
        System.out.println("4.Xoa xe theo ma nhap vao");
        System.out.println("5.Tim kiem xe theo ma va cap nhat thong tin xe");
        System.out.println("6.Tim xe theo khoang gia");
        System.out.println("7.Sap xep xe theo ma");
        System.out.println("8.Xuat 5 xe co gia thanh cao nhat");
        System.out.println("9.Xuat xe co gia thanh dat nhat");
        System.out.println("10.Xuat xe co gia thanh re nhat");
        System.out.println("0.Thoat");
        System.out.println(">---------------------------------------------<");
        System.out.printf("Chon chuong trinh: ");
        Scanner s= new Scanner(System.in);
        chon= s.nextInt();
        System.out.println("");
        
        
           switch (chon) {
               case 1:
                   QL.YC1();
                   break;
               
               case 2:
                   QL.YC2();
                   break;
                   
               case 3:
                   QL.YC3();
                   break;
                   
               case 4:
                   QL.YC4();
                   break;    
               case 5:
                   QL.YC5();
                   break;  
                   
               case 6:
                   QL.YC6();
                   break; 
                   
               case 7:
                   QL.YC7();
                   break; 
                   
               case 8:
                   QL.YC8();
                   break;
                   
               case 9:
                   QL.YC9();
                   break;  
                   
               case 10:
                   QL.YC10();
                   break;    
                   
               case 0:
                   System.out.println("Thoat chuong trinh !");
                   break;
               default:
                   System.out.println("Khong co chuong trinh do vui long chon lai !");
                   break;
           }
       }while(chon != 0);
    }
}
