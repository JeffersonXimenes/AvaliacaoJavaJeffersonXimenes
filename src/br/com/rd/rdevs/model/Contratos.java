package br.com.rd.rdevs.model;

public abstract class Contratos extends Certidao {
    private String dtCompra;
    private String dtVenda;
    private int prestacaoServico;
    private String trabalho;

    // implementado
    private int registroContrato;
    private String pessoaEnvolvida;
    private String testemunha;

    //
    private String dtEmissaoContrato;
    private String dtRegistro;
    private static int totalContratos = 0;


    public Contratos (String dtCompra, int prestacaoServico, String trabalho) {
        totalContratos ++;
        this.dtCompra = dtCompra;
        this.prestacaoServico = prestacaoServico;
        this.trabalho = trabalho;
    }

    public Contratos() {

    }

    // GET DT_COMPRA
    public String getDtCompra() {
        return this.dtCompra;
    }

    // SET DT_COMPRA
    public void setDtCompra (String dtCompra) {
        this.dtCompra = dtCompra;
    }

    // GET DT_VENDA
    public String getDtVenda() {
        return this.dtVenda;
    }

    // SET DT_VENDA
    public void setDtVenda (String dtVenda) {
        this.dtVenda = dtVenda;
    }

    // GET PRESTACAO_SERVICO
    public int getPrestacaoServico() {
        return this.prestacaoServico;
    }

    // SET PRESTACAO_SERVICO
    public void setPrestacaoServico (int prestacaoServico) {
        this.prestacaoServico = prestacaoServico;
    }

    // GET TRABALHO
    public String getTrabalho() {
        return this.trabalho;
    }

    // SET TRABALHO
    public void setTrabalho (String trabalho) {
        this.trabalho = trabalho;
    }

    public int getRegistroContrato() {
        return registroContrato;
    }

    public void setRegistroContrato(int registroContrato) {
        this.registroContrato = registroContrato;
    }

    public String getPessoaEnvolvida() {
        return pessoaEnvolvida;
    }

    public void setPessoaEnvolvida(String pessoaEnvolvida) {
        this.pessoaEnvolvida = pessoaEnvolvida;
    }

    public String getTestemunha() {
        return testemunha;
    }

    public void setTestemunha(String testemunha) {
        this.testemunha = testemunha;
    }

    public String getDtEmissaoContrato() {
        return dtEmissaoContrato;
    }

    public void setDtEmissaoContrato(String dtEmissaoContrato) {
        this.dtEmissaoContrato = dtEmissaoContrato;
    }

    public String getDtRegistro() {
        return dtRegistro;
    }

    public void setDtRegistro(String dtRegistro) {
        this.dtRegistro = dtRegistro;
    }

    public void totalContratos(int totalContratos) {
        System.out.println("Total de Contratos realizados:" + totalContratos);

    }
}
