import Helpers.Helper;

public class Main {
    public static void main(String[] args) {

        Casino casino =new Casino("Casinosososos");
        Wallet wallet = new Wallet(100);
        Bar bar = new Bar("Bar");
        casino.getNameCasino();
        casino.playBlackjack(wallet,30);
        casino.playRoulette(wallet,50);
        bar.showMenu();
        bar.order(wallet,7);


























































































    }
}
