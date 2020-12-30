public class SimpleDotComTestDriver {

  public static void main(String[] args) {
    SimpleDotCom simple = new SimpleDotCom();

    int[] location = {2,3,4};
    simple.setLocation(location);

    String result = simple.checkYourself("2");
    String testResult = "False";

    if (result.equals("hit")) {
      testResult = "True";
    }

    System.out.println(testResult);
  }
}
