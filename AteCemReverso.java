public class AteCemReverso {
    public static void main(String[] args){
        System.out.println("Usando com o for");
        for(int i = 99; i >= 0; i--){
            System.out.println(i);
        }

        System.out.println("Usando o while");
        int i = 99;
        while (i >= 0){
            System.out.println(i);
            i--;
        }

        System.out.println("Usando o do-while");
        i = 99;
        do{
            System.out.println(i);
            i--;
        }while(i >= 0);
    }
}
