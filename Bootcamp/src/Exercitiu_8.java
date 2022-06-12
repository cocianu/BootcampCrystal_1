public class Exercitiu_8 {

    private int numar;


    public Exercitiu_8(int numar){

        for (int i =1;i<=numar;i++) {
            int k = 0;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    k = 2;
                    break;
                }
            }
            if(k==0) System.out.println(" "+i);
        }
    }
}
