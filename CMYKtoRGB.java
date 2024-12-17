public class CMYKtoRGB {
    public static void  main(String[] args){
        if(args.length<4){
            System.out.print("cyan, magenta, yellow, and black");
            return;
        }
        double cyan=Double.parseDouble(args[0]);
        double magenta=Double.parseDouble(args[1]);
        double yellow=Double.parseDouble(args[2]);
        double black=Double.parseDouble(args[3]);

        double white=1-black;
        double red=255*white*(1-cyan);
        double green=255*white*(1-magenta);
        double blue=255*white*(1-yellow);

        System.out.print("red="+red +"\nGreen="+green+"\nBlue="+blue );
    }
}
