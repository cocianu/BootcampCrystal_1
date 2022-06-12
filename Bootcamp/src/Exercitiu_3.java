public class Exercitiu_3 {

    private int secunde;
    private int ore;
    private int minute;
    private int secunde_ramase;

    public Exercitiu_3(int secunde){


        ore = secunde/3600;
        minute = (secunde-ore*3600)/60;
        secunde_ramase =  secunde-ore*3600-minute*60;

    }


    public int getSecunde() {
        return secunde;
    }

    public void setSecunde(int secunde) {
        this.secunde = secunde;
    }

    public int getOre() {
        return ore;
    }

    public void setOre(int ore) {
        this.ore = ore;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecunde_ramase() {
        return secunde_ramase;
    }

    public void setSecunde_ramase(int secunde_ramase) {
        this.secunde_ramase = secunde_ramase;
    }
}
