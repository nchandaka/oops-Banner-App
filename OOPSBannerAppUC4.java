public class OOPSBannerAppUC4 {

    public static void main(String[] args) {

        // Creating banner lines using String.join() (same as UC3)
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

        // ✅ UC4 Improvement: Store lines inside array
        String[] bannerLines = { line1, line2, line3, line4, line5 };

        // ✅ UC4 Improvement: Loop instead of multiple println
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}