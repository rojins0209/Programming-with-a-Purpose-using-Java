public class GreatCircle {
    public static void main(String args[]){
        if(args.length<4){
            System.out.print("Enter the coordinates of two points:");
            return;
        }
        double x1=Double.parseDouble(args[0]);
        double y1=Double.parseDouble(args[1]);
        double x2=Double.parseDouble(args[2]);
        double y2=Double.parseDouble(args[3]);

        double r=6371.0;

        double lat1=Math.toRadians(x1);
        double lon1=Math.toRadians(y1);
        double lat2=Math.toRadians(x2);
        double lon2=Math.toRadians(y2);

        double dlat=lat2-lat1;
        double dlon=lon2-lon1;

        double a=Math.sin(dlat/2)*Math.sin(dlat/2)+Math.cos(lat1)*Math.cos(lat2)*Math.sin(dlon/2)*Math.sin(dlon/2);

        double c=2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        double distance=c*r;
        System.out.println(distance+" Kilometers");
    }
}
