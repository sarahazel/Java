public class Constants2 {

    /**
     * @param args the command line arguments
     */
    public static final double CM_PER_INCH = 2.54;
    public static void main(String[] args) {
        // TODO code application logic here
        double paperWidth = 8.5;
        double paperHeight = 11;
        System.out.println("Paper size in centimeters:"
         + paperWidth * CM_PER_INCH + "by" + paperHeight * CM_PER_INCH);
    }
