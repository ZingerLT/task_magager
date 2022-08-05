import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DB db = new DB_Inpl();
        boolean start = true;
        while (start == true){
            menu();
            Scanner scanner = new Scanner(System.in);
            int choose = scanner.nextInt();
            switch (choose){
                case 1:{
                    System.out.print("Enter name of the task:");
                    String name = scanner.next();
                    System.out.print("Enter description of the task:");
                    String description = scanner.next();
                    System.out.print("Enter day of the task:");
                    int day = scanner.nextInt();
                    System.out.print("Enter month of the task:");
                    int month = scanner.nextInt();
                    System.out.print("Enter year of the task:");
                    int year = scanner.nextInt();
                    boolean done = false;
                    Task task = new Task(name, description,
                            day, month, year, done);
                    db.add(task);
                    System.out.println("Complete!");
                    break;
                }
                case 2:{
                    System.out.print("Enter id of the task to delete:");
                    int id = scanner.nextInt();
                    db.delete(id);
                    System.out.println("Complete!");
                    break;
                }
                case 3:{
                    System.out.print("Enter id of the task to update:");
                    int id = scanner.nextInt();
                    System.out.println("Do you wanna compete(1) the task or update(2) it?");
                    int ch = scanner.nextInt();
                    switch (ch){
                        case 1:{
                            boolean done = true;
                            Task task = new Task(id,done);
                            db.update(task);
                            System.out.println("Complete!");
                            break;
                        }
                        case 2:{
                            /*Должен быть код для апгрейда одного поля*/
                            break;
                        }
                    }
                    break;
                }
                case 4:{
                    System.out.print("Enter id of the task to find:");
                    int id = scanner.nextInt();
                    System.out.println(db.findById(id));
                    break;
                }
                case 5:{
                    System.out.println(db.getAll());
                    break;
                }
                case 0:{
                    start = false;
                    System.out.println("Bye!");
                    break;
                }
            }
        }
    }

    public static void menu(){
        System.out.println("1 - add");
        System.out.println("2 - delete");
        System.out.println("3 - update");
        System.out.println("4 - find");
        System.out.println("5 - see all");
        System.out.println("0 - exit");
        System.out.print("Your choose:");
    }

}
