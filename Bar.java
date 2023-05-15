public class Bar extends  Wallet {


    public Bar(){}
    private int sum = 0;
    private String bar; // назва бару
    private String whiskey, cola, brandy, rum, beer, snacks, meat;
    private String[]  products = new String[]{"whiskey", "cola", "brandy", "rum", "beer", "snacks", "meat"}; // масив продуктів
    private int [] prices = new int[]{40,5,35,40,20,10,20} ; // масив цін

    // конструктор класу Bar
    public void setNameBar(String nameBar) {
        this.bar = nameBar;
    }

    // метод для отримання назви бару
    public String getNameBar() {
        System.out.println("_______________"+bar+"________________");
        return bar;
    }

    // метод для виводу меню бару
    public void showMenu() {
        System.out.println("_______________menu________________");

        System.out.println();
        for (int i = 0; i < products.length; i++) {
            System.out.println((i + 1) + ". " + products[i] + " - " + prices[i] + " грн."); //цикл для естетичного виводу
        }
        System.out.println(" ");;
        System.out.println("____________________________________");
        System.out.println(" ");
    }

    // метод для замовлення продукту за номером
    public void order(Wallet wallet, int number) {
        System.out.println("____________________________________");
        if (number > 0 && number <= products.length) {
            String product = products[number - 1];// тут -1 бо рахує ідє з 0
            int price = prices[number - 1];
            if (wallet.getMoney() >= price) { // перевіряємо, чи достатньо грошей в гаманці
               wallet.setNewMoney((int)(wallet.getMoney() - price)); // зменшуємо баланс на ціну продукту
                System.out.println("Ви замовили -" + product + "- за -" + price + "- грн.");
                System.out.println("Ваш баланс: " + wallet.getMoney() + " грн.");
                sum = (int) (sum+price);
                System.out.println("Сума замовлення = " + sum);
            }
            else {
                System.out.println("Фінанси пают раманси " + product);
            }


        } else {
            System.out.println("Неправильний номер продукту. Спробуйте ще раз.");
        }

        System.out.println("____________________________________");
    }


























}
