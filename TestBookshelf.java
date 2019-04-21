//Nebil Gokdemir
//Project3


public class TestBookshelf {

    public static void main(String[] args) {
        // write your code here




        Bookshelf bookShelfObject = new Bookshelf("SMC book store");
        Book b1 = new Book("Do Androids Dream of Electric Sheep","Philip","LABook",30,1989);
        Book b2 = new Book("The Hitchhiker's Guide to the Galaxy ","Douglas","sanDEigoBook",30,1930);
        Book b3 = new Book("Something Wicked This Way Comes ","Ray","theBESt",90,2019);
        Book b4 = new Book("Pride and Prejudice and Zombies","Seth","newYorkBook",40,2016);
        Book b5 = new Book("I Was Told There'd Be Cake ","david","BookHOSE",26,2014);



        // add 5 Book to BookShelter

bookShelfObject.addBookToBookShelf(b1);
bookShelfObject.addBookToBookShelf(b2);
bookShelfObject.addBookToBookShelf(b3);
bookShelfObject.addBookToBookShelf(b4);
bookShelfObject.addBookToBookShelf(b5);
        System.out.println("============");
        //Remove 3 book
bookShelfObject.removesBook(b1);
bookShelfObject.removesBook(b2);
bookShelfObject.removesBook(b3);




     // Check Book shelter if it is emtpy or full
        System.out.println("==============");
        System.out.println("is BookShelf empty =" + bookShelfObject.isEmpty());
        System.out.println("is BookShelf empty ="+bookShelfObject.isFull());
        System.out.println("==============");

        System.out.println(bookShelfObject.toString());

        // Check if it is Duplicate
       bookShelfObject.isDuplicate(b1);



      //Find book by auther name in BookShelter


        bookShelfObject.findAutherr("Douglas");


       //       filter Book by price

        bookShelfObject.priceFilter(40,90);






  }


}
