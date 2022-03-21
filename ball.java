public class ball {
    String color;
    int size;
    String material;
    String game;


    static ball b1= new ball("white",180,"rubber","football");
    static ball b2= new ball("blue", 200, "rubber", "cricket");

    public ball(String color, int size, String material, String game){
        this.color=color;
        this.game=game;
        this.material=material;
        this.size=size;
    }

    
    public String getColor() {
        return color;
    }


    public void setColor(String color) {
        this.color = color;
    }


    public int getSize() {
        return size;
    }


    public void setSize(int size) {
        this.size = size;
    }


    public String getMaterial() {
        return material;
    }


    public void setMaterial(String material) {
        this.material = material;
    }


    public String getGame() {
        return game;
    }


    public void setGame(String game) {
        this.game = game;
    }


    public static ball getB1() {
        return b1;
    }


    public static void setB1(ball b1) {
        ball.b1 = b1;
    }


    public String toString(){
        return "Ball [color=" + color + ", game=" + game + ", material=" + material + ", size=" + size + "]";
    }

    public static void main(String args[]){
        b1.setColor("blue");
    
        System.out.println(b1.toString());
    }




    
}
