package Shuler.Willie.InitializationLab;

/**
 * Created by willieshuler on 9/10/16.
 */
public class InitializationLab1 {

    public String toString(){
        return null;
    }

    public static void main(String[] args){

        BoringThing boringThing1 = new BoringThing();
        BoringThing boringThing2 = new BoringThing();
        BoringThing boringThing3 = new BoringThing();
        BoringThing boringThing4 = new BoringThing();
        BoringThing boringThing5 = new BoringThing();

        ColorfulThing green = new ColorfulThing(ColorfulThing.Color.GREEN);
        ColorfulThing red = new ColorfulThing(ColorfulThing.Color.RED);
        ColorfulThing blue = new ColorfulThing(ColorfulThing.Color.BLUE);
        ColorfulThing black = new ColorfulThing(ColorfulThing.Color.BLACK);
        ColorfulThing grey = new ColorfulThing(ColorfulThing.Color.GREY);

        System.out.println(green.getColor() + " " + red.getColor() + " " + blue.getColor() + " " + black.getColor()
                + " " + grey.getColor());
    }
}
