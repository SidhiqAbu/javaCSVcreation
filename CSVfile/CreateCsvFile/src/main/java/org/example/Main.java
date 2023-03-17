package org.example;
import java.io.FileWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the Items Count:");
        int n=scan.nextInt();
        scan.nextLine();
        System.out.println("Enter your csv file name: ");
        String fileName= scan.nextLine();
        StringBuilder strBdr= new StringBuilder();
        strBdr.append("Product Name").append(",").append("Product Price").append(",").append("Item Number/SKU/Product Code").append(",").append("Model Number").append(",").append("Product Category").append(",").append("Product Description").append("\n");
        while(n>0){
            System.out.println("Enter Product Name: ");
            String Name= scan.nextLine();
            System.out.println("Enter Product Price:");
            String Price= scan.nextLine();
            System.out.println("Enter Item Number/SKU/Product Code: ");
            String code= scan.nextLine();
            System.out.println("Enter Model Number: ");
            String model= scan.nextLine();
            System.out.println("Enter Product Category: ");
            String category= scan.nextLine();
            System.out.println("Enter Product Description: ");
            String description= scan.nextLine();
            strBdr.append(Name).append(",").append(Price).append(",").append(code).append(",").append(model).append(",").append(category).append(",").append(description).append("\n");
            try(FileWriter flWtr=new FileWriter("C:\\Users\\70936\\Downloads\\SidhiqAbu\\CSVfile\\"+fileName)){
                flWtr.write(strBdr.toString());
            }catch (Exception ex){
                ex.printStackTrace();
            }
            n--;
        }

    }
}