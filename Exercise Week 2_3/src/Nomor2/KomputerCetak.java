/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nomor2;

/**
 *
 * @author User
 */
public final class KomputerCetak {
    
    public KomputerCetak(){
    }
    public void panggil(){
        
        personalkomputer pc = new personalkomputer();
        Notebook nb = new Notebook();
        Netbook net = new Netbook();
        
        pc.cetak_data();
        System.out.println("");
        nb.cetak_data();
        System.out.println("");
        net.cetak_data();
        
    }
}
