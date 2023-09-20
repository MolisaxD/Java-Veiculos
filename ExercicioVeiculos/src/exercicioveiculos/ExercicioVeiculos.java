/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioveiculos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mborges
 */
public class ExercicioVeiculos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Veiculo coche = new Veiculo();
        
        Veiculo maquinaAgricola = new Veiculo("JJK-1960", "30/06/2004");
        
        Onibus autobus = new Onibus(100, "LLH1C52", "14/02/2022");
        
        Caminhao camion = new Caminhao(3, "BEE4R22", "12/02/1999");
        
        coche.setPlaca("HMG-0248");
        coche.setAno("28/05/1999");
        
        /*coche.exibirDados();
        System.out.println("------------------------------------");
        maquinaAgricola.exibirDados();
        System.out.println("------------------------------------");
        autobus.exibirDados();
        System.out.println("------------------------------------");
        camion.exibirDados();*/
        
        List<Veiculo> putz = new ArrayList();
        putz.add(coche); putz.add(maquinaAgricola); putz.add(autobus); putz.add(camion);
        
        for(Veiculo a : putz) {
            a.exibirDados();
            System.out.println("------------------------------------");
        }
    }
    
}
