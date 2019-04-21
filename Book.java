public class Book {



    private  String title;
    private String author;
    private String publisher;
    private int price ;
    private int copyright ;

    public Book(String title, String author, String publisher, int price , int copyright ) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.price = price;
        this.copyright = copyright;
    }


    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor()
    {
        return author;
    }

    public void setAuthor(String author)
    {
        this.author = author;
    }

    public void setPublisher(String publisher)
    {
        this.publisher = publisher;
    }

    public String getPublisher()
    {
        return publisher;
    }

    public int getPrice()
    {
        return price;
    }

    public void setPrice(int price)
    {
        this.price = price;
    }

    public int getCopyright ()
    {
        return copyright ;
    }

    public  String  toString(){




        return  "Book title is " + getTitle() + "" +"\nauthername is " + getAuthor() + "\npublisher is " + getPublisher() +
                "\nprice is " + getPrice() + " \ncopyright date " + getCopyright();

    }








}
