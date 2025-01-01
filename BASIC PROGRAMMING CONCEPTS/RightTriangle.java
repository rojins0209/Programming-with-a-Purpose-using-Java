public class RightTriangle {
    public static void main(String args[]){
        if(args.length<3){
            System.out.println("Enter length of three sides of a triangle:");
            return;
        }
        int num1=Integer.parseInt(args[0]);
        int num2=Integer.parseInt(args[1]);
        int num3=Integer.parseInt(args[2]);
        if(num1<=0||num2<=0||num3<=0){
            System.out.println("All the sides must be positive");
            return;
        }
        boolean isRightTriangle=((int)Math.pow(num1, 2) + (int)Math.pow(num2, 2)==(int)Math.pow(num3, 2))||
                ((int)Math.pow(num1, 2)+(int)Math.pow(num3, 2)==(int)Math.pow(num2, 2))||
                ((int)Math.pow(num2, 2)+(int)Math.pow(num3, 2)==(int)Math.pow(num1, 2));

        if(isRightTriangle){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
