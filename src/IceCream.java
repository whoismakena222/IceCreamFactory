public class IceCream {

    public String color;
    public String taste;
    public int nScoops;
    public boolean isSmooth;

    public boolean isCone;

    public IceCream(String paramColor, boolean paramisSmooth, boolean paramisCone, String paramTaste) {
        color = paramColor;
        isSmooth = paramisSmooth;
        isCone = paramisCone;
        nScoops = (int) (Math.random() * 3);
        taste = paramTaste;
    }

    public void printIceCream() {
        System.out.println("the Ice Cream is Vanilla flavored ");
        System.out.println("it has a " + color + "color");
        if (isSmooth) {
            System.out.println("it is smooth");
        }
        if (!isSmooth) {
            System.out.println("it is crunchy");
        }
        if (isCone) {
            System.out.println("you asked for a cone ");
        }
        if (!isCone) {
            System.out.println("you asked for a cup ");
        }
        if (nScoops == 1) {
            System.out.println("you asked for " + nScoops + " scoop");
        } else {System.out.println("you asked for " + nScoops + " scoops");
        }
        System.out.println("it tastes " + taste);


    }

    public void printIceCream2() {
        System.out.println("the Ice Cream is Mint Chocolate Chip flavored ");
        System.out.println("it has a " + color + "color");
        if (isSmooth) {
            System.out.println("it is smooth");
        }
        if (!isSmooth) {
            System.out.println("it is crunchy");
        }
        if (isCone) {
            System.out.println("you asked for a cone ");
        }
        if (!isCone) {
            System.out.println("you asked for a cup ");
        }
        if (nScoops == 1) {
            System.out.println("you asked for " + nScoops + " scoop");
        } else {System.out.println("you asked for " + nScoops + " scoops");
        }
        System.out.println("it tastes " + taste);
    }

    public void printIceCream3() {
        System.out.println("the Ice Cream is Cookie Dough flavored ");
        System.out.println("it has a " + color + "color");
        if (isSmooth) { System.out.println("it is smooth");
        }
        if (!isSmooth) { System.out.println("it is crunchy");
        }
        if (isCone) { System.out.println("you asked for a cone ");
        }
        if (!isCone) { System.out.println("you asked for a cup ");
        }
        if (nScoops == 1) {
            System.out.println("you asked for " + nScoops + " scoop");
        } else {System.out.println("you asked for " + nScoops + " scoops");
        }
        System.out.println("it tastes " + taste);
    }
}

