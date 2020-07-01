package com.company;
import java.util.Date;

public class ExemploData {
    public static void main(String[] args){
        long CurrentTimeMillis = System.currentTimeMillis();

        Date novaData = new Date(CurrentTimeMillis);

        System.out.println(CurrentTimeMillis);
        System.out.println(novaData);


    }
}
