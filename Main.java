public class Main {
    public static void main(String[] args) {

        Casino casino =new Casino();
        Wallet wallet = new Wallet();
        Bar bar = new Bar();
        wallet.setMoney(500);// ти задаєш суму з якою ти прийшов в казино

        casino.setNameCasino("Крути поки не здохнеш");// назва казино
        casino.getNameCasino();

        casino.playBlackjack(wallet,30);// граєш в гру енну кількість разів
        casino.playBlackjack(wallet,50);

        casino.playRoulette(wallet,90);//далі гражєш

        bar.setNameBar("BAR");// назва бару
        bar.getNameBar();

        bar.showMenu();// меню
        bar.order(wallet,1);// вибір позицій
        bar.order(wallet,2);
        bar.order(wallet,7);

















































































    }
}
