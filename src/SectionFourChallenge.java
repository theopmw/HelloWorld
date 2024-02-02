public class SectionFourChallenge {

    public static void main(String[] args) {
        double amountOne = 20.00;
        double amountTwo = 80.00;

        double totalTimes100 = (amountOne + amountTwo) * 100;
        System.out.println("totalTimes100 = " + totalTimes100);

        double remainder = totalTimes100 % 40.00d;
        System.out.println("remainder = " + remainder);

        boolean isNoRemainder = (remainder == 0) ? true : false;
        System.out.println(isNoRemainder);

        if (!isNoRemainder) {
            System.out.println("Got some remainder");
        }

    }


}
