public class OOPSBannerAppUC5 {

    public static void main(String[] args) {

        // Array declaration + initialization using String.join()
        String[] banner = {
                String.join("   ", " ***** ", " ***** ", " ***** ", " ***** "),
                String.join("   ", "*     *", "*     *", "*     *", "*     *"),
                String.join("   ", "*     *", "*     *", "*     *", "*     *"),
                String.join("   ", " ***** ", " ***** ", " ***** ", " ***** "),
                String.join("   ", "*     *", "*     *", "*     *", "*     *"),
                String.join("   ", "*     *", "*     *", "*     *", "*     *"),
                String.join("   ", " ***** ", " ***** ", " ***** ", " ***** ")
        };

        // Enhanced for-loop to display banner
        for (String line : banner) {
            System.out.println(line);
        }
    }
}