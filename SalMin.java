import javax.swing.JOptionPane;

public class SalMin{
    public static void main(String[] args) {
        double salMin = 1100;
        double salario = Double.parseDouble(JOptionPane.showInputDialog("Insira seu salario"));
        if (salario >= salMin){
            JOptionPane.showMessageDialog(null,"Voce esta ganhando pelo menos um salario minimo!");
        }
        else{
            JOptionPane.showMessageDialog(null,"Voce nao ganha nem um salario minimo.");
        }
    }
}