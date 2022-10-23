public class TesteCarro {

    public void main() {
        Carro Carro1 = new Carro();
        Carro1.setModelo("Duster");
        Carro1.setCor("Vermelho");
        Carro1.viraEsquerda();
        Carro1.acelera();
        System.out.println(Carro1.getCor(null));
        System.out.println(Carro1.getModelo(null));
         
        
         Carro Carro2 = new Carro();
         Carro2.setModelo("Duster");
         Carro2.setCor("Prata");
         Carro2.viraEsquerda();
         Carro2.acelera();
         System.out.println(Carro2.getModelo(null));
         System.out.println(Carro2.getModelo(null));
    }
}
