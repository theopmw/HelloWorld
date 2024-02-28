public class MethodsChallenge {

    public static void main(String[] args) {

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Theo", highScorePosition);

        highScorePosition = calculateHighScorePosition(999);
        displayHighScorePosition("Lucy", highScorePosition);

        highScorePosition = calculateHighScorePosition(100);
        displayHighScorePosition("Benny", highScorePosition);

        highScorePosition = calculateHighScorePosition(25);
        displayHighScorePosition("Lila", highScorePosition);
    }

    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + " got into position "
                + highScorePosition + " on the high score list");
    }

    public static int calculateHighScorePosition(int playerScore) {

//        Solution using multiple return statements
//        if (playerScore >= 1000) {
//            return 1;
//        } else if (playerScore >= 500) {
//            return 2;
//        } else if (playerScore >=100) {
//            return 3;
//        }
//        return 4;

//      Solution using 1 return statement
        int position = 4;
        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >=100) {
            position = 3;
        }
        return position;
        }
    }
