/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import implement.BankImplementService;



public class Main {

    public static void main(String[] args) {
        BankImplementService bankImpl = new BankImplementService();
        bankImpl.menu();
    }
    
    
    
    

//    public static String formateador(String fecha) {
//        DateTimeFormatter f = DateTimeFormatter.ofPattern("d/M/yyyy",Locale.ENGLISH);
//        LocalDate fechaFormat = LocalDate.parse(fecha, f);
//        return fechaFormat.toString();
//    }
}
