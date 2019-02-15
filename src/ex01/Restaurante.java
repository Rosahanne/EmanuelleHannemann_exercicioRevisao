package ex01;

public class Restaurante {

    private double valorConta;
    private double totalConta;


    public Restaurante(double valorConta, double totalConta) {
        this.valorConta = valorConta;
       this.totalConta = totalConta;
    }

    public double getValorConta() {
        return valorConta;
    }

    public void setValorConta(double valorConta) {
        this.valorConta = valorConta;
    }

   public double getTotalConta() {
        this.totalConta = this.valorConta * 1.1;
        return totalConta;
    }

    public void setTotalConta(double totalConta) {
        this.totalConta = totalConta;
    }
}
