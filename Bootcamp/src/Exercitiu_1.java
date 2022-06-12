public class Exercitiu_1 {

    private static int numar=0;
    private String nume;
    private int id;

    public Exercitiu_1(String numeEx){
        nume = numeEx;

        //incrementeaza numar
        //aloca id
        id = ++numar;
    }

    public int getId(){
        return id;
    }

    public String getNume() {
        return nume;
    }

    public static int getNumar() {
        return numar;
    }

    public static void setNumar(int numar) {
        Exercitiu_1.numar = numar;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setId(int id) {
        this.id = id;
    }
}
