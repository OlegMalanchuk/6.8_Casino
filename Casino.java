import Helpers.Helper;

public class Casino  {//  внаслідував клас гаманець для того що б норально фуричило казино і можна було динамічний гаманець мати
    public Casino(String nameCasino){
        this.nameCasino=nameCasino;
    }
    private  String nameCasino ;

    public  void  getNameCasino() { //  гетер для виводу  імені казино без
        Helper.Out(nameCasino);
        Helper.Out("___Ви в -"+ nameCasino +"- тут ви можете : ___");
        Helper.Out("______Грати в різні ігри та відвідувати бар______");
        Helper.Out1();
    }


    public void playBlackjack(Wallet wallet, double bet) {// гра в блек джек

        Helper.Out("Black--jack");
        Helper.Out2();

        // Якщо ставка більша за кількість грошей в гаманці, то повертаємо помилку
        if ((bet< wallet.getMoney())&(bet >0)){
            // Генеруємо дві карти для гравця та дилера
            int playerCard1 = (int) (Math.random() * 10) + 1;
            int playerCard2 = (int) (Math.random() * 10) + 1;
            int dealerCard1 = (int) (Math.random() * 10) + 1;
            int dealerCard2 = (int) (Math.random() * 10) + 1;
            // Обчислюємо суму карт для гравця та дилера
            int playerSum = playerCard1 + playerCard2;
            int dealerSum = dealerCard1 + dealerCard2;
            System.out.println("Сума яку набрав гравець : "+playerSum);
            System.out.println("Сума яку набрав диллер : "+dealerSum);
            if (playerSum < dealerSum){
                double lose = wallet.getMoney() - bet;
                wallet.setMoney((int) lose);
                System.out.println("Диллер виграв "+ lose);
                System.out.println(wallet.getMoney());
            }
            if (playerSum > dealerSum){
                double win = wallet.getMoney() + bet;
                wallet.setNewMoney((int) win);
                System.out.println("Гравець виграв " + win);
                System.out.println(wallet.getMoney());

            }
            if (dealerSum == playerSum)
            {
                System.out.println("Нічия ");
            }
        }
        else {
            System.out.println("Фінанси пают раманси");

        }
        Helper.Out1();

    }


    public void playRoulette(Wallet wallet, double bet){ // гра в рулетку

        Helper.Out("Roulette");
        Helper.Out2();
        Helper.Out("Правила якщо парне 2х якщо не парне програш");
        Helper.Out("0 програш 2х. Удачі )))");
        Helper.Out2();

        int number = (int) (Math.random() * 37);//генерація чисоа яке випало на рулетці
        System.out.println("Випало число : "+number);

        if (bet < wallet.getMoney()&(bet >0)) {

            if (number == 0) {
                System.out.println("Випав 0. Ви програли свою ставку :" + bet);
                wallet.setMoney((int) (wallet.getMoney() - (bet * 2)));
                System.out.println("Ваш баланс : " + wallet.getMoney());
            }
            if (number % 2 == 0) {
                System.out.println("Ви виграли ))");
                wallet.setMoney((int) (wallet.getMoney() + (bet * 2)));
                System.out.println("Ваш баланс : " + wallet.getMoney());
            }
            if (number % 2 != 0) {
                System.out.println("Ви не виграли ");
                wallet.setMoney((int) (wallet.getMoney() - (bet * 2)));
                System.out.println("Ваш баланс : " + wallet.getMoney());
            }
        }
        else {
            System.out.println("Фінанси пают раманси");
        }
        Helper.Out1();
    }






}