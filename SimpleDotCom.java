public class SimpleDotCom {
  private int[] cellLocation;
  int numOfHits = 0;


  public void setLocation(int[] location) {
    this.cellLocation = location;
  }

  public String checkYourself(String userInput) {
    int input = Integer.parseInt(userInput);
    String result = "miss";

    for (int cell: cellLocation) {
      if (input == cell) {
        result = "hit";
        numOfHits++;
        break;
      }
    }

    if (numOfHits == cellLocation.length) {
      result = "kill";
    }

    return result;
  }
}
