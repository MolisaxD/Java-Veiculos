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
public class Caminhao extends Veiculo {
    private int eixos;

    public Caminhao() {
        
    }
    
    public Caminhao(int eixos) {
        this.eixos = eixos;
    }

    public Caminhao(int eixos, String placa, String ano) {
        super(placa, ano);
        this.eixos = eixos;
    }

    public int getEixos() {
        return eixos;
    }

    public void setEixos(int eixos) {
        this.eixos = eixos;
    }
    
    @Override
    public void exibirDados() {
        System.out.println("Placa: " + getPlaca() );
        System.out.println("Ano: " + getAno());
        System.out.println("Eixos: " + this.eixos);
    }
    
}
