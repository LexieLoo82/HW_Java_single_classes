public class Printer {

    private int pages;

    public Printer(int pages){
        this.pages = pages;
    }


    public int getPages() {
        return this.pages;
    }

    public String print(int copies) {
        if (this.pages >= copies) {
            return "Can print, there are " + (this.pages - copies) + " pages left";
        } else {
            return "There are not enough sheets left to print";
        }
    }
}
