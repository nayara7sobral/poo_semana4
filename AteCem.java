public class AteCem {
    public static void main(String[] args){
        //com for
        for(int i = 0; i < 100; i++){
            System.out.println(i);
        }
        System.out.println("Agora com while");
        
        //com while
        int i = 0;
        while (i < 100){
            System.out.println(i);
            i++;
        }

        System.out.println("Agora com do-while");
        i = 0;
        do{
            System.out.println(i);
            i++;
        }while(i < 100);

    }
}

