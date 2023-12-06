
import javax.swing.JOptionPane;


public class Principal {

   

    public static void main(String[] args) {
      Calculadora calc = new Calculadora();
      
      int op;
      double a,b;
      
      do{
          op = Integer.parseInt(JOptionPane.showInputDialog("Digite a opcao \n" + "\n 1- Somar \n 2- Subtrair \n 3- Multiplicar \n 4- Dividir" + "\n 0 - Sair"));
      
      
      switch (op)
      {
          case 1:
              calc.Somar();
              break;
          case 2:
              a = Double.parseDouble(JOptionPane.showInputDialog("Digite o Numero um:"));
              b = Double.parseDouble(JOptionPane.showInputDialog("Digite o Numero dois:"));
              break;
          case 3:
             JOptionPane.showMessageDialog(null,"A Multiplicacao e:" + calc.Multiplicacao());
              break;
          case 4:
              a = Double.parseDouble(JOptionPane.showInputDialog("Digite o Numero um:"));
              b = Double.parseDouble(JOptionPane.showInputDialog("Digite o Numero dois:"));
              JOptionPane.showMessageDialog(null,"A Divisao e:" + calc.Dividir(a, b));
              break;
          case 0:
            JOptionPane.showMessageDialog(null,"A Finalizar Programa");
              break;
          default:
           JOptionPane.showMessageDialog(null,"Opcao Invalida");
              break;
      }     
      } while(op!= 0);
        }
}
            
            
      
      
