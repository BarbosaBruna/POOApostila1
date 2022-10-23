public class Carro {
    private String modelo = "Fusca";
    private String cor = "Azul";

    public void viraEsquerda() {
        System.out.printf("%s %s virando a esquerda", modelo, cor);
    }

    public void acelera() {
        System.out.printf("%s %s acelerando...", modelo, cor);

    }

    public String getModelo(String modelo) {
        return this.modelo;
    }

    public void setModelo(String modelo) {   
        this.modelo = modelo;
    }

    public String getCor(String cor) {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}