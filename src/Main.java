public class Main {
    public static void main(String[] args){
        Main myFactory = new Main();
    }

    public Main() {

        System.out.println("----------------");
        IceCream Vanilla;
        Vanilla = new IceCream("soft white ", true, true, "warm and delicious");
        Vanilla.printIceCream();

        System.out.println("----------------");
        IceCream MintChocChip;
        MintChocChip = new IceCream("light green ", false, false, "refreshing and addictive");
        MintChocChip.printIceCream2();

        System.out.println("----------------");
        IceCream CookieDough;
        CookieDough = new IceCream("beige and light brown", false, true, "sweet and filling" );
        CookieDough.printIceCream3();
    }
}