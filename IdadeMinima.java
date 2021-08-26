import javax.swing.JOptionPane;

public class IdadeMinima {
    public static void main(String[] args) {
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Insira sua idade"));

        //com if-else
        if (idade >= 18){
            JOptionPane.showMessageDialog(null,"Voce e maior de idade");
        }
        else{
            JOptionPane.showMessageDialog(null,"Voce e menor de idade");
        }

        //utilizando operador ternario
        idade = Integer.parseInt(JOptionPane.showInputDialog("Insira sua idade"));
        System.out.printf("Voce %stem a idade minima.", idade >= 18 ? "" : "nao ");
        
    
    }
}
