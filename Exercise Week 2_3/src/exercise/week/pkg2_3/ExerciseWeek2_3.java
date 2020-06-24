
package exercise.week.pkg2_3;

public class ExerciseWeek2_3 {

    public static void main(String[] args) {
        
            
        try{
            double[] angka = {10.5,2.5};
            OperasiBilanganAbsCetak cetak = new OperasiBilanganAbsCetak (angka[2],angka[3]);
            cetak.tampil();
            
        }
        
        catch (Exception e){
            System.out.println(e );
            double[] angka = {10.5,2.5};
            OperasiBilanganAbsCetak cetak = new OperasiBilanganAbsCetak (angka[0],angka[1]);
            cetak.tampil();
        }
        finally{
            System.out.println("Error ditelah diperbaiki");
        }
        
//        OperasiBilanganAbsCetak cetak = new OperasiBilanganAbsCetak (10.5,2.5);
//        cetak.tampil();
//    
    
    
    }

    
}
