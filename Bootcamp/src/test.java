import java.util.Formatter;

public class test {

    public static void main(String[] args) {


        /* Exercitiu 1

        Exercitiu_1 ex1 = new Exercitiu_1("Exemplu");
        Exercitiu_1 ex1_2 = new Exercitiu_1("Caine");

        System.out.println(ex1);
        //Afiseaza Exercitiu_1@58372a00
        System.out.println(ex1.getId());
        //Afiseaza 1

        System.out.println(ex1_2);
        //Afiseaza Exercitiu_1@4dd8dc3
        System.out.println(ex1_2.getId());
        //Afiseaza 2

         */


        /* Exercitiu 2

        Exercitiu_2 ex2 = new Exercitiu_2();
        System.out.println(ex2.getId());
        // Afiseaza 0
        System.out.println(ex2.getSir());
        // Afiseaza null

        */


        /* Exercitiu 3

        Exercitiu_3 ex3 = new Exercitiu_3(3680);
        System.out.println("numar ore:"+ex3.getOre());
        //numar ore:1
        System.out.println("numar minute:"+ex3.getMinute());
        //numar minute:1
        System.out.println("numar secunde:"+ex3.getSecunde_ramase());
        //numar secunde:20

         */


        /* Exercitiu 4

        Formatter fmt = new Formatter();
        fmt.format("%15s %15s %15s\n","Numar","Patrat","Cub");
        for(int i=0;i<=10;i++){
            fmt.format("%14s %14s %17s\n", i, (i*i), (i*i*i));
        }
        System.out.println(fmt);

         */


        /* Exercitiu 5

        int a = 10,b = 5,temp;
        temp=a;
        a=b;
        b=temp;

         */


        /* Exercitiu 6

        System.out.print ("*********      ***        *          * \n");
        System.out.print ("*       *    *     *     ***        * * \n");
        System.out.print ("*       *   *       *   *****      *   * \n");
        System.out.print ("*       *   *       *     *       *     * \n");
        System.out.print ("*       *   *       *     *      *       * \n");
        System.out.print ("*       *   *       *     *       *     * \n");
        System.out.print ("*       *   *       *     *        *   * \n");
        System.out.print ("*       *    *     *      *         * * \n");
        System.out.print ("*********      ***        *          * \n");

         */


        /* Exercitiu 7

        Exercitiu_7 ex7 = new Exercitiu_7();
        System.out.println(ex7.getMedia());
        System.out.println(ex7.getVarianta());
        System.out.println(ex7.getDeviatie());

         */


        /* Exercitiu 8

        Exercitiu_8 ex8 = new Exercitiu_8(40);

         */


        /* Exercitiu 9

        for(Integer ex9 : new Exercitiu_9().findVampireNum()){
            System.out.println(ex9 + " ");
        }

         */

    }
}
