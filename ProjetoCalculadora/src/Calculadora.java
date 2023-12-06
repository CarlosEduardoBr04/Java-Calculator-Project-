
import javax.swing.JOptionPane;


public class Calculadora {
    private double n1;
    private double n2;
    private double r;

    public Calculadora() {
        this(0.0, 0,0);
        
    }

    public Calculadora(double n1, double n2, double r) {
        this.n1 = n1;
        this.n2 = n2;
        this.r = r;
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
    
    public void Somar(){
        setN1(Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro Numero:")));
        setN2(Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro Numero:")));
        setR(getN1()+ getN2());
        JOptionPane.showMessageDialog(null,"A soma:"+ getR());
    }
    
    public void Subtrair (double a, double b){
        setR(a - b);
         JOptionPane.showMessageDialog(null,"A Subtracao e:"+ getR());
    }
    
    public double Multiplicacao(){
       setN1(Double.parseDouble(JOptionPane.showInputDialog("Digite o Primeiro Numero:")));
       setN2(Double.parseDouble(JOptionPane.showInputDialog("Digite o Segundo Numero:"))); 
        setR(getN1() * getN2());
        return getR();
    }
    
    public double Dividir(double a, double b){
        setR(a / b);
        return getR();
    }
}
