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
public class Veiculo {
    private String placa;
    private String ano;

    public Veiculo() {
    }

    public Veiculo(String placa, String ano) {
        this.placa = placa;
        this.ano = ano;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }
    
    public void exibirDados() {
        System.out.println("Placa: " + placa);
        System.out.println("Ano: " + ano);
    }
}
