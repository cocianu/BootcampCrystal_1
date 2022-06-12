import java.util.Scanner;



public class Exercitiu_7 {

    private double x1,x2,x3,media,varianta,deviatie;
    Scanner tasta = new Scanner(System.in);


    public Exercitiu_7(){

        System.out.println("x1 = ");
        x1 = tasta.nextInt();
        System.out.println("x2 = ");
        x2 = tasta.nextInt();
        System.out.println("x3 = ");
        x3 = tasta.nextInt();

        media=(x1+x2+x3)/3;
        varianta = Math.sqrt(Math.pow((x1-media),2) + Math.pow((x2-media),2) + Math.pow((x3-media),2)/3);
        deviatie= Math.sqrt(varianta) ;
    }

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double getX3() {
        return x3;
    }

    public void setX3(double x3) {
        this.x3 = x3;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public double getVarianta() {
        return varianta;
    }

    public void setVarianta(double varianta) {
        this.varianta = varianta;
    }

    public double getDeviatie() {
        return deviatie;
    }

    public void setDeviatie(double deviatie) {
        this.deviatie = deviatie;
    }
}
