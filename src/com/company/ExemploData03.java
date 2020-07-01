package com.company;
import java.util.Date;
public class ExemploData03 {
    public static void main(String[] args){
        Date dataNoPassado = new Date(1513124807691l);

        Date dataNoFuturo  = new Date(1613124807691l);

        boolean isAfter = dataNoPassado.after(dataNoFuturo);
        System.out.println(isAfter);
        boolean isBefore = dataNoFuturo.before(dataNoFuturo);
        System.out.println(isBefore);
    }

}
