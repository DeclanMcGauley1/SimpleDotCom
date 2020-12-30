public class SimpleDotComGame {

  public static void main(String[] args) {
    // create a simple dot com
    int numOfGuesses = 0;
    SimpleDotCom simple = new SimpleDotCom();
    GameHelper helper = new GameHelper();

    //initialise the location
    int initialLocation = (int)(Math.random() * 5);
    int[] location = {initialLocation, initialLocation + 1, initialLocation + 2};
    simple.setLocation(location);

    while (true) {
      String userGuess = helper.getUserGuess("Enter a guess: ");
      numOfGuesses++;
      String result = simple.checkYourself(userGuess);

      if (result.equals("kill")) {
        System.out.println("You sunk the dotcom");
        System.out.println("You took " + numOfGuesses + " guesses");
        break;
      } else if (result.equals("hit")) {
        System.out.println("You hit the dot com");
      } else {
        System.out.println("you missed");
      }
    }
  }
}
