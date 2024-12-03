import java.util.Scanner;
class Library{
    public int no_Of_Books;
    public String[] book;
    Library(){
        this.book = new String[100];
        this.no_Of_Books = 0;
    }
    void addBooks(){
        Scanner n = new Scanner(System.in);
        System.out.print("Enter Book Name Which One To Add : ");
        String name = n.nextLine();
        this.book[no_Of_Books] = name;
        no_Of_Books++;
        System.out.println("books added succefuly "+ name);
        
    }
    void showBooks(){
        System.out.println("Available Books are : ");
       for(String n : book ){
           if(n == null){
               break;
           }
           System.out.println("*" + n);
           
       }
    }
    void issueBook(){
        System.out.println("Enter Issue Book Name : ");
        Scanner t = new Scanner(System.in);
        String b = t.nextLine();
        for(int i =0; i < this.book.length; i++){
            if(this.book[i].equals(b)){
                System.out.println("Book has been issued!");
                this.book[i] = null;
                return;
                
            }
            System.out.println(" book not Available ...!   Thank You .....!");
        }
         
    }
    void returnBook(){
        System.out.println("Enter book name to return ......!");
        Scanner b = new Scanner(System.in);
        String na = b.nextLine();
        for(int i=0; i<this.book.length; i++){
            if(this.book[i].equals(na)){
                this.book[i] = na;
            }
            System.out.println("Books are return!");
        }
    }
    
}
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		Library e = new Library();
		int m = 9;
		while(m != 0){
		    Scanner o = new Scanner(System.in);
		    System.out.println("Enter Your Choice : ");
		    int n = o.nextInt();
	   switch(n){
	        case 1: 
	        System.out.println("Enter count how many books to add in Library....!");
	        Scanner q = new Scanner(System.in);
	        int w = q.nextInt();
	        for(int i =0; i<w; i++){
		        e.addBooks();
	            };
	            break;
		    case 2:
		        e.showBooks();
		        break;
		    case 3:
		        e.issueBook();
		        break;
		    case 4:
		        e.returnBook();
		        break;
		  default:
		  System.out.println("Thank You......!");
		}
	}
	}
}
