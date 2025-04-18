public class Main {
    public static void main(String[] args) {
        Motor motor1 = new Motor("Gasolina", 120);
        Motor motor2 = new Motor("Elétrico", 150);

        Condutor condutor1 = new Condutor("Giovana", "123456789");
        Condutor condutor2 = new Condutor("Carlesso" 987654321");

        //Carro com motor e condutor
        Carro carro1 = new Carro("Toyota", "Corolla", "ABC-1234", motor1, condutor1);
        carro1.exibirDados();

        //Carro sem condutor
        Carro carro2 = new Carro("Tesla", "Model 3", "XYZ-5678", motor2);
        carro2.exibirDados();

        //Atribuindo condutor
        carro2.setCondutor(condutor2);
        carro2.exibirDados();

        //Trocando motor do carro1
        carro1.setMotor(new Motor("Diesel", 140));
        carro1.exibirDados();
    }
}
