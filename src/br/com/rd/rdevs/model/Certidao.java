package br.com.rd.rdevs.model;

public class Certidao implements Comparable<Certidao> {
    private static int totalCertidao = 0;
    private int registroCertidao;
    private String nomePessoa;
    private String dtNascimento;
    private String casamento;
    private String obito;
    private String propriedade;
    private Certidao tipoCertidao;
    private String dtEmissaoCertidao;

    // construtor
    public Certidao(int registroCertidao,  String nomePessoa, String dtEmissaoCertidao) {
        totalCertidao++;
        this.registroCertidao = registroCertidao;
        this.nomePessoa = nomePessoa;
        this.dtEmissaoCertidao = dtEmissaoCertidao;

    }
    public Certidao() {

    }

    // GET DT_NASCIMENTO
    public String getDtNascimento() {
        return this.dtNascimento;
    }

    // SET DT_NASCIMENTO
    public void setDtNascimento (String dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    // GET CASAMENTO
    public String getCasamento() {
        return this.casamento;
    }

    // SET CASAMENTO
    public void setCasamento (String casamento) {
        this.casamento = casamento;
    }

    // GET OBITO
    public String getobito() {
        return this.obito;
    }

    // SET OBITO
    public void setObito (String obito) {
        this.obito = obito;
    }

    // GET PROPRIEDADE
    public String getPropriedade() {
        return this.propriedade;
    }

    // SET PROPRIEDADE
    public void setPropriedade (String propriedade) {
        this.propriedade = propriedade;
    }


    public String getNomePessoa() {
        return nomePessoa;
    }

    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }

    public int getRegistroCertidao() {
        return registroCertidao;
    }

    public void setRegistroCertidao(int registroCertidao) {
        this.registroCertidao = registroCertidao;
    }

    public String getDtEmissaoCertidao() {
        return dtEmissaoCertidao;
    }

    public void setDtEmissaoCertidao(String dtEmissaoCertidao) {
        this.dtEmissaoCertidao = dtEmissaoCertidao;
    }

    public void totalCertidao(int totalCertidao) {
        System.out.println("Total de Certidao:" + totalCertidao);

    }

    public void imprimirDados() {
        System.out.println("Nome Pessoa: " + nomePessoa);
        System.out.println("Data Nascimento: " + dtNascimento);
        System.out.println("Data Emissao Certidao: " + dtEmissaoCertidao);
        System.out.println("Registro Certidao: " + registroCertidao);


    }

    @Override
    public int compareTo(Certidao o) {
        return 0;
    }
}
