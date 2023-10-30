/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihan26;
import java.util.Date;
import java.text.SimpleDateFormat;
/**
 *
 * @author nm
 */
public class Latihan26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Date HariSekarang = new Date( );
      SimpleDateFormat ft = 
      new SimpleDateFormat ("EEEE dd MMMM yyyy hh:mm:ss");

      System.out.println("Hari ini adalah hari : " + ft.format(HariSekarang));
    }
    
}
