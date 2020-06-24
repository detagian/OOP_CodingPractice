/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.week.pkg2_3;

/**
 *
 * @author User
 */
public class OperasiPembagian extends OperasiBilanganAbs{
        public OperasiPembagian(double a, double b) {
        super(a, b);
    }
    @Override
    protected void set_A(double A) {
        this.a = A;
    }

    @Override
    protected void set_B(double B) {
        this.b = B;
    }

    @Override
    protected void set_C() {
        this.c = get_C();
    }

    @Override
    protected double get_A() {
        return a;
    }

    @Override
    protected double get_B() {
        return b;
    }

    @Override
    protected double get_C() {
        return get_A()/get_B();
    }

    @Override
    protected void tampil() {
           System.out.println("Hasil Pembagian : "+get_C());
    }
}
