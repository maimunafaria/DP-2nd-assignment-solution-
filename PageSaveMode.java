public class PageSaveMode extends PrintMode{
    public int NumberOfPage = getNumberOfPages();

    public PageSaveMode() {
    }


    public void savePage() {
        if(getPageSize().equals("A5") && getOrientation()>10)
        {
            System.out.println("Required number of pages are: "+NumberOfPage--);
        }
        else {
            System.out.println("Required number of pages are: " + NumberOfPage);
        }
    }


    public void renderPreview() {
        System.out.println("The updated document is showed");
    }

}
