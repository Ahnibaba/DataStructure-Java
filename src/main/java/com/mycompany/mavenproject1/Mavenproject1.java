/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

/**
 *
 * @author Ani
 */

import java.util.Scanner;


public class Mavenproject1 {
    
    public static final Scanner scanner = new Scanner(System.in);
    public static int i, n, result, pos, e, found, eI;
    public static int[]b = new int[20];
    public static int MAX = 10;

    public static void main(String[] args) {
        
        int ch;
        char g;
        do
        {
          System.out.println("\n Main Menu");
          System.out.println("\n 1.Create \n 2.Delete \n 3.Search \n 4.Insert \n 5.Display \n 6.Exit \n");
          System.out.println("\n Enter your choice");
          ch = scanner.nextInt();
          switch(ch) {
              case 1:
                  create();
                  break;
              case 2:
                  delete();
                  break;    
              case 3:
                  search();
                  break;     
              case 4:
                  insert();
                  break;     
              case 5:
                  display();
                  break;     
              case 6:
                  return;
                    
              default:
                  System.out.println("\n Enter the correct choice");
          }
          System.out.println("\n Do you want to continue");
          g = scanner.next().charAt(0);
          
          
        }while(g == 'y' || g == 'Y');
    }
    
        public static void create() {
        System.out.println("\n Enter the number of nodes");
        n = scanner.nextInt();
        for(i=0; i<n; i++) {
            result = i + 1;
            System.out.println("\n Enter the element " + result);
            b[i] = scanner.nextInt();
        }
        
    }
        
    public static void delete(){
        System.out.println("\n Enter the position you want to delete");
        pos = scanner.nextInt();
        if(pos >= n) {
            System.out.println("\n Invalid Location");
        } else {
            for(i=pos+1; i<n; i++){
                b[i-1] = b[i];
            }
            n--;
        }
        System.out.println("\n The elements after deletion");
        for(i=0; i<n; i++){
            System.out.println("\t" + b[i]);
        }
    }    
    
    
    public static void search(){
        System.out.println("\n Enter the element to be searched");
        e = scanner.nextInt();
        for(i=0; i<n; i++){
            if(b[i] == e){
                System.out.println("Value is in the position " + i);
                found = 1;
                break;
            }
        }
        if(found != 1){
            System.out.println("Value " + e + " is not in the list");
        }
        
    }
    
    public static void insert(){
        System.out.println("\n Enter the position you want to insert");
        pos = scanner.nextInt();
        if(pos>=n){
           System.out.println("\n Invalid Location"); 
        } else {
            for(i=MAX-1; i>=pos; i--) {
                b[i+1] = b[i];
            }
            System.out.println("\n Enter the element you want to insert\n");
            eI = scanner.nextInt();
            b[pos] = eI;
            n++;
            
        }
        System.out.println("\n The list after insertion\n");
        display();
        
    }
    
    public static void display(){
        System.out.println("\n The elements of the list ADT are:");
        for(i=0; i<n; i++) {
            System.out.println("\n\n" + b[i]);
        }
    }
    

}
