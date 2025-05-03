public class Alimentacao extends Loja{

    //atributos
    private Data dataAlvara;

    //construtor
    public Alimentacao(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, Data dataAlvara) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao);
        this.dataAlvara = dataAlvara;
    }

    //metodos de acesso getters and setters
    public Data getDataAlvara(){
        return this.dataAlvara;
    }
    public void setDataAlvara(Data dataAlvara){
        this.dataAlvara = dataAlvara;
    }

    //Sobrescrita do toString
    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Data Alvara: " + dataAlvara;
    }
}
