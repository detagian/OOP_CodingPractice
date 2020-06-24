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
public class Notebook extends komputer {

    public void Notebook(){
        
    }
    @Override
    public void klik_kanan() {
        System.out.println("klik kanan notebook");
    }

    @Override
    public void klik_kiri() {
        System.out.println("klik kiri notebook");
    }

    @Override
    public void enter() {
        System.out.println("emter notebook");
    }

    @Override
    public void cetak_data() {
        hidupkan_os();
        klik_kanan();
        klik_kiri();
        enter();
        matikan_os();
    }
        @Override
    public void hidupkan_os(){
            System.out.println("Notebook Nyalan");
    }
    @Override
    public void matikan_os(){
        System.out.println("Notebook Mati");
    }
}
