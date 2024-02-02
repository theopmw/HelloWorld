public class StatementsWhiteSpaceAndIndenting {

    public static void main(String[] args) {

        int myVariable = 50;

        myVariable++;
        myVariable--;

        System.out.println("This is a test");

        System.out.println("This is " +
                "another line " +
                "and another, " +
                "but all the same statement");

//      3 statements on one line (can be done but don't): NOT READABLE!
        int anotherVariable = 50; myVariable--; System.out.println("myVariable = " + myVariable);

        if (myVariable == 0) {
            System.out.println("it's now zero");
        }
    }
}
