package org.sysimc.model;

public class Pessoa {
    private String nome;
    private float altuta;
    private float peso;
    private float imc;

    public Pessoa(String nome, float altuta, float peso, float imc) {
        this.nome = nome;
        this.altuta = altuta;
        this.peso = peso;
        this.imc = imc;
    }

    public Pessoa() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getAltuta() {
        return altuta;
    }

    public void setAltuta(float altuta) {
        this.altuta = altuta;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getImc() {
        return imc;
    }

    public void setImc(float imc) {
        this.imc = imc;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", altuta=" + altuta +
                ", peso=" + peso +
                '}';
    }

    public float calcularIMC(){
        this.imc = this.peso / (this.altuta * this.altuta);
        return this.imc;
    }

    public String classificacaoIMC(){
        String classificacao;
        if (this.imc < 18.5)
            return "Abaixo do Peso!";
        else if (this.imc >= 18.5 && this.imc <24.9)
            return "Peso Normal!";
        else if (this.imc >= 25 && this.imc <29.9)
            return "Sobre Peso!";
        else if (this.imc >= 30 && this.imc <34.9)
            return "Obsidade Grau I!";
        else if (this.imc >= 35 && this.imc <39.9)
            return "Obsidade Grau II!";
        else
            return "Obsidade Grau III!";

    }


}