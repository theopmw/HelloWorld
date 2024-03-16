public class MethodOverloadingChallenge {

    public static void main(String[] args) {

        System.out.println("80\" = " + convertToCentimeters(80) + " cm");
        System.out.println("6' 1\" = " + convertToCentimeters(6,1) + " cm");

    }

    public static double convertToCentimeters(int inches) {

        return inches * 2.54;
    }

    public static double convertToCentimeters(int feet, int inches) {

//        return convertToCentimeters((feet * 12) + inches);

        int feetToInches = feet * 12;
        int totalInches = feetToInches + inches;
        double result = convertToCentimeters(totalInches);
        return result;


    }
}
