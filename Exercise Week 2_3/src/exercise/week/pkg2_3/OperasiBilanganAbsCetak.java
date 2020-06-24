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
public final class OperasiBilanganAbsCetak extends OperasiBilanganAbs{

    public OperasiBilanganAbsCetak(double a, double b) {
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    protected void tampil() {
        OperasiPenjumlahan opj = new OperasiPenjumlahan(get_A(),get_B());
        OperasiPengurangan opr = new OperasiPengurangan(get_A(),get_B());
        OperasiPerkalian opk = new OperasiPerkalian(get_A(),get_B());
        OperasiPembagian opb = new OperasiPembagian(get_A(),get_B());
        cetaksemua(opj,get_A(),get_B());
        cetaksemua(opr,get_A(),get_B());
        cetaksemua(opk,get_A(),get_B());
        cetaksemua(opb,get_A(),get_B());

        
    }
    
    
    private void cetaksemua(OperasiBilanganAbs OB,double a,double b){
            OB.set_A(a);
            OB.set_B(b);
            OB.tampil();
        }

    }
