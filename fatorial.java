import javax.swing.JOptionPane;

public class fatorial {
    public static void main(String[] args){
        int fat = 1;
        int n = Integer.parseInt(JOptionPane.showInputDialog("Insira o numero para ver o fatorial dele"));

        for(int i = n; i > 1; i --){
            fat = fat * i;
        }

        System.out.println(fat);
    }
}
