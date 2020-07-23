package br.com.rd.rdevs.model;

public class Cartorio {
    private String nomeTabeliao;
    private String nomeCartorio;


    public Cartorio(String nomeTabeliao, String nomeCartorio) {
        this.nomeTabeliao = nomeTabeliao;
        this.nomeCartorio = nomeCartorio;
    }

    public Cartorio() {

    }

    public String getNomeTabeliao() {
        System.out.println("Nome Tabeliao:" + this.nomeTabeliao);
        return nomeTabeliao;
    }

    public void setNomeTabeliao(String nomeTabeliao) {
        this.nomeTabeliao = nomeTabeliao;
    }

    public String getNomeCartorio() {
        return nomeCartorio;
    }

    public void setNomeCartorio(String nomeCartorio) {
        this.nomeCartorio = nomeCartorio;
    }

    public void imprimirDados() {
        System.out.println("Nome Tabelião: "+ nomeTabeliao);
        System.out.println("Nome Cartório: "+ nomeCartorio);

    }
}
