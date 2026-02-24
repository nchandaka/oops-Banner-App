public class OOPSBannerAppUC3 {

    public static void main(String[] args) {

        // Creating each line using String.join() instead of + operator

        String line1 = String.join("   ",
                " ***** ",
                " ***** ",
                " ***** ",
                " ***** ");

        String line2 = String.join("   ",
                "*     *",
                "*     *",
                "*     *",
                "*     *");

        String line3 = String.join("   ",
                "*     *",
                " ***** ",
                " ***** ",
                "*     *");

        String line4 = String.join("   ",
                "*     *",
                "*      ",
                "*      ",
                "*     *");

        String line5 = String.join("   ",
                " ***** ",
                "*      ",
                " ***** ",
                " ***** ");

        // Printing the banner
        System.out.println(line1);
        System.out.println(line2);
        System.out.println(line3);
        System.out.println(line4);
        System.out.println(line5);
    }
}