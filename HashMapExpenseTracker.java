import java.util.HashMap;
import java.util.Scanner;

class HashMapExpenseTracker {
  public static void main(String[] args) {
    HashMap<String, Integer> expenses=new HashMap<>();
    Scanner sc=new Scanner(System.in);
    while(true) {
      System.out.print("\n1. Add Category\n2. Add Expense\n3. Show List\n4. Exit\n\nEnter Choice: ");
      int choice=sc.nextInt();
      sc.nextLine();
      switch (choice) {
        case 1: 
          System.out.print("Enter category: ");
          String category=sc.nextLine();
          expenses.put(category, 0);
          System.out.println("Category added.");
          break;
        case 2:
          if(expenses.isEmpty()) {
            System.out.print("Enter Category first: ");
            break;
          }
          int i=1;
          for(String key:expenses.keySet()) {
            System.out.println(i+". "+key);
            i++;
          }
          System.out.print("Select Category(words): ");
          String category1=sc.nextLine();
          int oldValue=expenses.get(category1);
          System.out.print("Enter amount: ₹");
          int newValue=sc.nextInt();
          sc.nextLine();
          expenses.put(category1, oldValue+newValue);
          System.out.print("Expense Upgraded.");
          break;
        case 3:
          i=1;
          for(HashMap.Entry<String, Integer> entry : expenses.entrySet()) {
            System.out.println(i+". "+entry.getKey()+": "+entry.getValue());
            i++;
          }
          break;
        case 4:
          System.out.println("Exiting...");
          sc.close();
          return;
        default:
          System.out.println("Invalid Input!");
      }
    }
  }
}
