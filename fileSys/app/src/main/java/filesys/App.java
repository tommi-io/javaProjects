package filesys;

import java.util.Scanner;

public class App {
    static Directory root = new Directory(" ");
    static Directory currentDirectory = root;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line;
        while(1){
            line = sc.nextLine();
            resolveCommand(line);
        }
    }

    private static resolveCommand(String c){
        String[] parts = c.split(" ");
        switch (parts[0]) {
            case "ls":
                if(parts.length > 1){
                    System.out.println(listDirectory(parts[1]));
                }
                else{
                    System.out.println(listDirectory());
                }
                break;
        
            default:
                break;
        }
    }

    private static String listDirectory(String path){

    }
    private static String listDirectory(){
        return currentDirectory.toString();
    }
}
