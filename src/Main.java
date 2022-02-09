import java.io.*;
import java.util.Scanner;

public class Main {
    static String basePath = "/Users/arsalan/Desktop/Project/Files/";
    public static void main(String[] args) {
//        createFile();
        createDirectory();
    }

    public static void createDirectory() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the folder you want to create: ");
        String fileName = sc.nextLine();
        File theDir = new File(basePath + fileName);
        if (!theDir.exists()){
            theDir.mkdirs();
            System.out.println("The directory created at :" + basePath);
        } else{
            System.out.println("Directory with this name already exists!");
        }
    }
    public static void createFile() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the file: ");
        String fileName = sc.nextLine();
        File file = new File(basePath + fileName + ".txt");
        try {
            if (file.createNewFile()) {
                System.out.println("file created at " + file.getCanonicalPath());
            } else {
                System.out.println("File already exist at location: " + file.getCanonicalPath());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        sc.close();
    }
}
