public class Carro {
    private String marca;
    private String modelo;
    private String placa;
    private Motor motor;
    private Condutor condutor;

    public Carro(String marca, String modelo, String placa, Motor motor, Condutor condutor) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.motor = motor;
        this.condutor = condutor;
    }

    public Carro(String marca, String modelo, String placa, Motor motor) {
        this(marca, modelo, placa, motor, null);
    }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public String getPlaca() { return placa; }
    public void setPlaca(String placa) { this.placa = placa; }

    public Motor getMotor() { return motor; }
    public void setMotor(Motor motor) { this.motor = motor; }

    public Condutor getCondutor() { return condutor; }
    public void setCondutor(Condutor condutor) { this.condutor = condutor; }

    public void exibirDados() {
        System.out.println("Carro: " + marca + " " + modelo + " (" + placa + ")");
        if (motor != null) {
            System.out.println("Motor: " + motor.getTipo() + " - " + motor.getPotencia() + "cv");
        }
        if (condutor != null) {
            System.out.println("Condutor: " + condutor.getNome() + " - CNH: " + condutor.getCnh());
        } else {
            System.out.println("Condutor: Nenhum condutor atribuído.");
        }
        System.out.println("---------------------------------");
    }
