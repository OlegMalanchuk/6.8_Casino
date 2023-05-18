import Helpers.Helper;

public class Bar {


    private int sum = 0;
    private String nameBar; // назва бару
    public Bar(String nameBar){
        this.nameBar=nameBar;
    }
    private String whiskey, cola, brandy, rum, beer, snacks, meat;
    private String[]  products = new String[]{"whiskey", "cola", "brandy", "rum", "beer", "snacks", "meat"}; // масив продуктів
    private int [] prices = new int[]{40,5,35,40,20,10,20} ; // масив цін

    // метод для отримання назви бару
    public void  getNameBar() {
        Helper.Out(nameBar);
        Helper.Out1();

    }

    public void showMenu() {
        Helper.Out("menu");
        Helper.Out2();
        for (int i = 0; i < products.length; i++) {
            System.out.println((i + 1) + ". " + products[i] + " - " + prices[i] + " грн."); //цикл для естетичного виводу
        }
        Helper.Out1();
    }

    // метод для замовлення продукту за номером
    public void order(Wallet wallet, int number) {
        Helper.Out("your order");

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
                System.out.println("Не стача грошей" + product);
            }


        } else {
            System.out.println("Неправильний номер продукту. Спробуйте ще раз.");
        }

        Helper.Out1();
    }


























}