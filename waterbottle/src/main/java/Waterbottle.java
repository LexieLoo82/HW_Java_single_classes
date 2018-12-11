public class Waterbottle {
    private int volume;

    public Waterbottle(){
        this.volume = 100;
    }


    public int getVolume() {
        return this.volume;
    }

    public void setVolume(int volume){
        this.volume = volume;
    }


    public int takeSip() {
        this.volume -= 10;
        return this.volume;
    }


    public void empty() {
        this.volume = 0;
    }

    public void fill() {
        this.volume = 100;
    }
}
