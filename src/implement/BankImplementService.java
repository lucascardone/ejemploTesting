/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package implement;

import entities.Bank;
import java.util.Scanner;


public class BankImplementService {
    
    public void menu(){
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Account Number:");
        Integer numAccount = input.nextInt();
        System.out.println("Account Balance:");
        Integer currentBalance = input.nextInt();
        System.out.println("Account DNI:");
        Integer dni= input.nextInt();
        
        Bank bank = createAccount(currentBalance, dni, numAccount);
        
        Integer option;
        Boolean exit = false;
        do{
            System.out.println("Options: \n"
                    + "1: Income.\n"
                    + "2: Withdraw.\n"
                    + "3: FastWithdraw.\n"
                    + "4: Show Data.\n"
                    + "5: Exit.");
            option = input.nextInt();
            switch(option){
                case 1:
                    System.out.println("Money to deposit:");
                    bank.setCurrentBalance(incomeMoney(bank.getCurrentBalance(), input.nextInt()));
                    break;
                case 2:
                    System.out.println("Money to withdraw:");
                    bank.setCurrentBalance(withdrawMoney(bank.getCurrentBalance(), input.nextInt()));
                    break;
                case 3:
                    System.out.println("Money to Fast withdraw (no more than: "+ bank.getCurrentBalance()*0.20+"):");
                    bank.setCurrentBalance(fastWithdrawMoney(bank.getCurrentBalance(), input.nextInt()));
                    break;
                case 4:
                    System.out.println(showData(bank));
                    break;
                case 5:
                    exit = true;
                    break;
            }
        }while(!exit);
    }
    
    public Bank createAccount(Integer currentBalance, Integer dni, Integer numAccount){
        return new Bank(numAccount, currentBalance, dni);
    }
        
    public Integer incomeMoney(Integer currentBalance, Integer money){
        return currentBalance + money;
    }
    
    public Integer withdrawMoney(Integer currentBalance, Integer money){
        return currentBalance - money;
    }

    public Integer fastWithdrawMoney(Integer currentBalance, Integer money){
        if(currentBalance * 0.20 >= money){
            return currentBalance -= money; 
        }
        return currentBalance;
    }
    
    public String showData(Bank bank){
        return bank.toString();
    }
}
