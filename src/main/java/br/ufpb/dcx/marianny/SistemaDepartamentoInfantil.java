package br.ufpb.dcx.marianny;

public interface SistemaDepartamentoInfantil{
    public void cadastrarCrianca(String nome,int idade, String alergia) throws CriancaCadastradaExeption;
    public List<crianca>pesquuisarCriancaCadastradas();
    public String pesquisarAlergiaDaCranca(String crianca)throws NaoExisteCriancaExeption;
    public int pesquisarCriancasComIdade(int idade);

}
