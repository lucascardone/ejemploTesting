/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entities;


public class Bank {
    
    private Integer numAccount;
    private Integer currentBalance;
    private Integer dni;

    public Bank() {
    }

    public Bank(Integer numAccount, Integer currentBalance, Integer dni) {
        this.numAccount = numAccount;
        this.currentBalance = currentBalance;
        this.dni = dni;
    }

    public Integer getNumAccount() {
        return numAccount;
    }

    public void setNumAccount(Integer numAccount) {
        this.numAccount = numAccount;
    }

    public Integer getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(Integer currentBalance) {
        this.currentBalance = currentBalance;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Bank{" + "numAccount=" + numAccount + ", currentBalance=" + currentBalance + ", dni=" + dni + '}';
    }
    
    

}
