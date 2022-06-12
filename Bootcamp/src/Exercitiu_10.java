import java.util.Formatter;
import java.util.Scanner;

public class Exercitiu_10 {


    static int[][] Tabla = new int[2][6];
    static int casaStanga=0,casaDreapta=0;


    public static void Misca(int n, int i, int j,int rand){

        if(n==1)
        {
            if(i==0)
                if(j-1>=0)
                {
                    if(Tabla[0][j-1]==0){
                        Tabla[0][j-1]=0;
                        for(int a=0;a<=Tabla[1][j-1];a++)
                            if(rand==0)casaStanga++;
                        Tabla[1][j-1]=0;}

                }
                else
                {

                    Tabla[0][0]=0;
                    if(rand==0)casaStanga++;
                    Scanner keyboard1 = new Scanner(System.in);
                    System.out.println("DUBLA MISCARE SUS de la 1-6:");
                    int pozitie = keyboard1.nextInt();
                    n = Tabla[0][pozitie-1];
                    Misca(n,0,pozitie-1,rand);
                }
            else
                if(j+1<=5)
                {
                    if(Tabla[1][j+1]==0){
                        Tabla[1][j+1]=0;
                        for(int a=0;a<=Tabla[0][j+1];a++)
                            if(rand==1)casaDreapta++;
                        Tabla[0][j+1]=0;}

                }
                else
                {
                    Tabla[1][5]=0;
                    if(rand==1)casaDreapta++;
                    Scanner keyboard1 = new Scanner(System.in);
                    System.out.println("DUBLA MISCARE JOS de la 1-6:");
                    int pozitie = keyboard1.nextInt();
                    n = Tabla[1][pozitie-1];
                    Misca(n,1,pozitie-1,rand);
                }
        }


        if(n>1)
        {
            if(i==0)
                    if(j>0)
                        for(int a=j-1;a>=0;a--)
                        {
                            Tabla[0][a]++;
                            n--;
                            if(n<1)break;
                            if(a==0)Misca(n,0,0,rand);
                        }
                    else
                    {
                        if(rand==0)casaStanga++;
                        n--;
                        if(n>1) Misca(n,1,-1,rand);
                    }
            else
                if (j<5)
                    for(int a=j+1;a<=5;a++)
                    {

                        Tabla[1][a]++;
                        n--;
                        if(n<1)break;
                        if(a==5)Misca(n,1,5,rand);
                    }
                else
                {
                if(rand==1)casaDreapta++;
                n--;
                if(n>1) Misca(n,0,6,rand);
                }

        }

    }



    public static void main(String[] args) {

        int i,j,rand=0;

        for(i=0;i<=1;i++)
            for(j=0;j<=5;j++)
                Tabla[i][j]=6;

        Scanner keyboard = new Scanner(System.in);

        Formatter fmt = new Formatter();



        int k=0;




         while (casaStanga<36 && casaDreapta<36)
        {
            fmt = new Formatter();
            for(i=0;i<=1;i++)
            {
                for(j=0;j<=5;j++)
                {
                    fmt.format("%5s ",Tabla[i][j]);
                }
                if(i==0) fmt.format(("\n %s %35s\n"),casaStanga,casaDreapta);
                else break;
            }

            System.out.println(fmt+"\n");

            if(k==0)
            System.out.println("Introduceti pozitia linia SUS de la 1-6:");
            else System.out.println("Introduceti pozitia linia JOS de la 1-6:");

            int pozitie = keyboard.nextInt();

            if(k==0){
                int n = Tabla[0][pozitie-1];
                Tabla[0][pozitie-1]=0;
                Misca(n,0,pozitie-1,rand);
                rand=1;
                k=1;
            }
            else{
                int n = Tabla[1][pozitie-1];
                Tabla[1][pozitie-1]=0;
                Misca(n,1,pozitie-1,rand);
                rand=0;
                k=0;
            }


        }


        //System.out.println(fmt);



    }


}
