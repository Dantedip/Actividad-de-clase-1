import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad.de.clase.1;

/**
 *
 * @author Dante dip
 */
public class ActividadDeClase1 {


    public static void main(String[] args) {
        int n;
        System.out.print ("Dame el numero de escalones");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        ActividadDeClase1.escalones(n);
        if(n == 0){
        System.out.print ("Ya terminaste de bajar");
        }else{
        System.out.print ("Faltan de bajar" + n);
    }
    
}
}
