public class Cube {

    private int side;
    private int surfaceArea;
    private int volume;

    public Cube(int side){

        if(side < 1){
            throw new IllegalArgumentException ("A cube’s side length cannot be less than 1!");
        }
        else {
            this.side = side;
        }

        this.surfaceArea = side*side*6;
        this.volume = side*side*side;

    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        if(side < 1){
            throw new IllegalArgumentException ("A cube’s side length cannot be less than 1!");
        }
        else {
            this.side = side;
        }
    }

    public int getSurfaceArea() {
        return surfaceArea;
    }

    public void setSurfaceArea(int surfaceArea) {
        this.surfaceArea = surfaceArea;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
