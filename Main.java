import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
class Main {
  public static void main(String[] args) throws FileNotFoundException {
    FileReader frr = new FileReader("names.txt");
    Scanner scann = new Scanner(frr);
    Scanner scanner = new Scanner(System.in);
    ArrayList<String> names = new ArrayList<>();
    int option = 0;
    while(option != 5){
    System.out.println("Press 1 to learn about salary.");
    System.out.println("Press 2 to learn about the job.");
    System.out.println("Press 3 to learn demand.");
    System.out.println("Press 4 to view current students.");
    System.out.println("Press 5 to quit.");
    option = scanner.nextInt();
    if(option == 1){
      System.out.println("$98,345 average salary in South Florida!");
    }
    if(option == 2){
      System.out.println("US - News 100 Best Jobs!");
    }
    if(option == 3){
      System.out.println("Top 10 Forbes In-Demand Jobs!");
    }
    if(option == 4){
      try {
        FileReader fr = new FileReader("names.txt");
        Scanner scan = new Scanner(fr);
            while(scan.hasNextLine()){
                String curLine = scan.nextLine();
                  String name [] = curLine.split(System.lineSeparator());
                  names.add(new String(name[0].trim()));          
            }
        } catch (FileNotFoundException ex) {
            System.out.println("File Not Found.");
        }
            for(int i = 0; i < names.size(); i++){
              System.out.println(names.get(i));
            }
      names.clear();
    }
      if(option == 5){
      break;
        }
      }
    }
  }
