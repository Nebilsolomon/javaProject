public class Bookshelf {





        int count = 0;
        private String name;
        Book[] bShelf = new Book[5];


        public Bookshelf(String name)
        {
            this.name = name;
        }


     // This method add new Book

    public void addBookToBookShelf(Book b) {

        for (int i = 0; i < bShelf.length; i++) {

            if (bShelf[i] != b && bShelf[i] != null) {
            } else {
                bShelf[i] = b;

                i = bShelf.length;


            }

        }
        System.out.println("you add new book" + b.getTitle());


    }








    // This method Check if book is duplicated
        public void isDuplicate(Book b) {

            for (int i = 0; i < bShelf.length; i++) {

                if (bShelf[i] != b && bShelf[i] != null) {
                    System.out.println("you can't Duplicate");
                } else {
                    bShelf[i] = b;


                }

            }


        }



        // this method remove Book from bShelf Array

        public void removesBook(Book x) {
            for (int i = 0; i < bShelf.length; i++) {

                if (x == bShelf[i] && bShelf[i] != null) {

                    System.out.println("you remove Book = " + bShelf[i].getTitle());
                    bShelf[i] = null;


                }



            }


        }


        // this method check if bShelf array is full or not

        public boolean isFull() {
            int count = 0;
            boolean trueOrFalse = false;
            for (int x = 0; x < bShelf.length; x++) {

                if (bShelf[x] != null) {
                    count++;

                }

                if(count == 5) {
                    trueOrFalse =true;
                }
                else {
                    trueOrFalse = trueOrFalse;
                }


            }

            return trueOrFalse;
        }


        // This method check if bShelf array is emtyp or not

        public boolean isEmpty() {
            int count = 0 ;
            boolean trueOrFalse = false;
            for(int x = 0; x < bShelf.length; x++) {
                if(bShelf[x] == null) {
                    count ++;
                }

                if(count == 5 ){

                    trueOrFalse = true;
                }
                else {
                    trueOrFalse =false;
                }


            }


            return trueOrFalse;
        }



// I add this method to search for Auther in bShelf Array

        public String findAutherr(String x) {

            String autherInformation = "";

            for(int i = 0; i< bShelf.length; i++) {

                if(bShelf[i] != null && bShelf[i].getAuthor().equals(x)){

                    autherInformation =  bShelf[i].toString();


                }

            }

            return   autherInformation;
        }

// this method do filter for price of book in bShelf Array

        public String priceFilter(int lowPrice, int heightPrice) {
            String out ="";
            for(int i = 0; i < bShelf.length; i++) {

                if (bShelf[i] != null) {

                    if (bShelf[i].getPrice() > lowPrice && bShelf[i].getPrice() < heightPrice && bShelf[i] != null) {

                        out = out + "Filter price found " + bShelf[i].getTitle() + "\n";

                    }

                }
            }

           // }
            return out;
        }



        @Override
        public String toString() {
            String out = "" ;

            for (int x = 0 ; x < bShelf.length; x++) {

                if(bShelf[x] !=null) {

                    out += "\n"+ bShelf[x].toString() + "\n" + "\n";


                }
            }
            return  out;








        }

    }


// This method add new Book
//
//        public void addBookToBookShelf(Book x) {
//
//
//            if (count < 5) {
//
//
//                bShelf[count] = x;
//                System.out.println("You add new Book  = " + bShelf[count].getTitle());
//                count = count + 1;
//
//
//            } else {
//                System.out.println("only you can have 5 book");
//            }
//
//
//        }

