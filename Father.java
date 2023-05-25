package Helpers;

public class Father {
    private String name;

    public void setName(String name) {
            this.name = name;
    }

    public void getName() {
        System.out.println(name);
    }

    private void neme(String name ){
        System.out.println("Ім'я "+name);
    }
    public void age(int age){
        System.out.println("Років " + age);
    }
    public void wight(double waga){
        System.out.println("Вага "+waga);
    }

}
