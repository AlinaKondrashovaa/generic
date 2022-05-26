public class Main{
      
    public static void main(String[] args) {
          
        Account acc1 = new Account(1991, 5000);
        int acc1Id = (int)acc1.getId();
        System.out.println(acc1Id);
         
        Account acc2 = new Account("sid91", 5000);
        System.out.println(acc2.getId());
    
        Printer printer = new Printer();
        String[] friends = {"Tom ", "Alice ", "Sam ", "Kate ", "Bob ", "Helen "};
        Integer[] age = {23, 41, 29, 27, 23, 45, 37};
        printer.<String>print(friends);
        printer.<Integer>print(age);
    }
}
class Account{
     
    private Object id;
    private int sum;
     
    Account(Object id, int sum){
        this.id = id;
        this.sum = sum;
    }
     
    public Object getId() { return id; }
    public int getSum() { return sum; }
    public void setSum(int sum) { this.sum = sum; }
}
 
 
class Printer{
     
    public <T> void print(T[] items){
        for(T item: items){
            System.out.println(item);
        }
    }
}
