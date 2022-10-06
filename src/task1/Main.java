package task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Comparate comparate = new Comparate();
        System.out.println("Введите -calories для того чтобы узнать общую калорийность");
        String all = scanner.nextLine();
        System.out.println("Введите -sort для того чтобы отсортировать продукты");
        String sort = scanner.nextLine();
        Food[] burgers = new Burger[10];{
            for (int i = 0; i < burgers.length; i++){
                if(i < 4){
                    burgers[i] = new Burger("Средний");
                } else if (i > 3 && i < 7) {
                    burgers[i] = new Burger("Маленький");
                }else{
                    burgers[i] = new Burger("Большой");
                }
            }
        }
        if(all.equals("-calories")){
            for(int i = 0; i < burgers.length; i++){
                ((Burger)burgers[i]).allCalories(((Burger)burgers[i]).getSize());
                if(i == burgers.length - 1){
                    System.out.println("Общее число калориев " + ((Burger)burgers[i]).getAllcalories());
                    System.out.println();
                }
            }
        }else{
            System.out.println("Не правильно введено -calories");
        }

        if(sort.equals("-sort")){
            burgers = comparate.sort(burgers);
            for(int i = 0; i < burgers.length; i++){
                System.out.println(((Burger)burgers[i]).getSize());
            }
        }else{
            System.out.println("-sort введенно неправильно");
        }

    }
}