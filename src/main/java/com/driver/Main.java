package com.driver;
class Product{
    public  int product(int x,int y){ return x;}
    public int product(int x,int y,int z){return x;}
    public double product(double x,double y){return x;}

}
public class Main {
    public static void main(String[] args){
        Product p = new Product();
        p.product(2,3);
        p.product(2,3,4);
        p.product(0.1,0.3);
    }

}