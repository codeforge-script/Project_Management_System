import java.util.*;
import java.util.ArrayList;

public class PMS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> projects = new ArrayList<>();

        while (true) {
            System.out.println("\n1.Insert");
            System.out.println("2.Update");
            System.out.println("3.Delete");
            System.out.println("4.Display");
            System.out.println("5.Exit");
            System.out.print("Enter choice: ");

            int ch = sc.nextInt();
            sc.nextLine();

            switch (ch) {
                case 1:
                    System.out.print("Enter project name: ");
                    projects.add(sc.nextLine());
                    System.out.println("Project Added");
                    break;

                case 2:
                    System.out.print("Enter project index: ");
                    int u = sc.nextInt();
                    sc.nextLine();

                    if (u >= 0 && u < projects.size()) {
                        System.out.print("Enter new project name: ");
                        projects.set(u, sc.nextLine());
                        System.out.println("Project Updated");
                    } else {
                        System.out.println("Invalid Index");
                    }
                    break;

                case 3:
                    System.out.print("Enter project index: ");
                    int d = sc.nextInt();

                    if (d >= 0 && d < projects.size()) {
                        projects.remove(d);
                        System.out.println("Project Deleted");
                    } else {
                        System.out.println("Invalid Index");
                    }
                    break;

                case 4:
                    System.out.println("Projects:");
                    for (int i = 0; i < projects.size(); i++) {
                        System.out.println(i + " : " + projects.get(i));
                    }
                    break;

                case 5:
                    sc.close();
                    System.out.println("Thank You");
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}