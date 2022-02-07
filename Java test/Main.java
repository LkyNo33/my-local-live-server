import java.util.Scanner; // import the Scanner class 

class Main {
  public String decider(String chore, String user1, String user2) {
    double randomNum = (double) (Math.random());
    String winner = "";

    if (randomNum < 0.5) {
      winner = "Congratulations " + user1 + " you have the honor of " + chore +"!";
    } else {
      winner = "Congratulations " + user2 + " you have the honor of " + chore +"!";
    }
    //System.out.println(randomNum);

    return winner;
  }

  public static void main(String[] args) {
    //System.out.println("Hello, World");

    Scanner scnr = new Scanner(System.in);
    String user1;
    String user2;
    String chore;
    String winner;
    Main houseOfChores = new Main();

    System.out.println("Please enter chore:");
    chore = scnr.nextLine();

    System.out.println("Please enter first user's name:");
    user1 = scnr.nextLine();

    System.out.println("Please enter second user's name:");
    user2 = scnr.nextLine();

    winner = houseOfChores.decider(chore, user1, user2);
    
    System.out.println(winner);
    
    
  }
}