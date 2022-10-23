public class Carro {
    private String modelo;
    private String cor;

    public void viraEsquerda() {
        System.out.printf("%s %s virando a esquerda", modelo, cor);
    
    }

    public void acelera() {
        System.out.printf("%s %s acelerando...", modelo, cor);

    }

    public String getModelo(String modelo) {
        return modelo;
    }

    public void setModelo(String setModelo) {   
        this.modelo = setModelo;
    }

    public String getCor(String cor) {
        return cor;
    }

    public void setCor(String setCor) {
        this.cor = setCor;
    }
}