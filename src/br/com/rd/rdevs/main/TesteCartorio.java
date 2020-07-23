package br.com.rd.rdevs.main;

import br.com.rd.rdevs.model.Cartorio;


public class TesteCartorio {
    public static void main(String[] args) {

        Cartorio c3 = new Cartorio("sadasda","asdasda");

        c3.setNomeCartorio("NEWS - FREDERICO");

        System.out.print(c3.getNomeTabeliao());

        c3.imprimirDados();
    }

}
