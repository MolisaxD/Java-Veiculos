/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioveiculos;

/**
 *
 * @author mborges
 */
public class Onibus extends Veiculo {
    private int assentos;

    public Onibus() {
        
    }
    
    public Onibus(int assentos) {
        this.assentos = assentos;
    }

    public Onibus(int assentos, String placa, String ano) {
        super(placa, ano);
        this.assentos = assentos;
    }

    public int getAssentos() {
        return assentos;
    }

    public void setAssentos(int assentos) {
        this.assentos = assentos;
    }

    @Override
    public void exibirDados() {
        System.out.println("Placa: " + getPlaca());
        System.out.println("Ano: " + getAno());
        System.out.println("Assentos: " + this.assentos);
    }
    
}
