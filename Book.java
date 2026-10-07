class Book{
int BookID;
double price;
String title;
String author;
static int  c=0;
Book(int BookID,double price,String author,String title){
this.title=title;
this.price=price;
this.author=author;
this.BookID=BookID;
c++;
}
void display(){
System.out.println("Book id:"+BookID);
System.out.println("Book title:"+title);
System.out.println("Book author:"+author);
System.out.println("Book price:"+price);
}
void search(int i){
if(i==BookID){
display();
}
}
void search(String title){
if(this.title.equalsIgnoreCase(title)){
System.out.println("Book found");
display();
}}
Book costlier(Book b){
if(this.price > b.price){
return this;
}
else{
return b;
}
}

public class Main{
public static void main(String[] args){
Book b1=new Book(101,300,"java","author");
Book b2=new Book(102,200,"c","xxxxxx");
b1.display();
b2.display();
b1.search("java");
b2.search(102);
Book costly=b1.costlier(b2);
costly.display();
}}}


