import java.io.*;
public class GameHelper {

  public String getUserGuess(String prompt){
    String inputLine = null;
    System.out.println(prompt + " ");

    try {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      inputLine = reader.readLine();
      if (inputLine.length() == 0) {
        return null;
      }
    } catch (IOException e) {
      System.out.println("Error" + e);
    }

    return inputLine;
  }
}
