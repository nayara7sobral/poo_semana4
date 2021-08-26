import javax.swing.JOptionPane;
public class primo {
    public static void main(String[] args){
        int n = Integer.parseInt(JOptionPane.showInputDialog("Insira o numero para verificar se e primo"));

        for(int i = 2; i <= n; i ++){
            if(n % i == 0 && i != n){
                System.out.println("O numero digitado nao e primo.");
                break;
            }
            if(i == n){
                System.out.println("O numero digitado e primo.");
            }
        }
    }   
}
