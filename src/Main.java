import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("Выберите необходимое действие\n1)Сложение\n2)Вычитание\n3)Умножение\n4)Деление\n5)Вычисление квадратного уравнения");
        Scanner In = new Scanner (System.in);
        int action = In.nextInt();

        System.out.print("Введите a: ");
        float NumA = In.nextFloat();
        System.out.print("Введите b: ");
        float NumB = In.nextFloat();
        float NumC = 0;
        if (action==5) {
            System.out.print("Введите c: ");
            NumC = In.nextFloat();
        }


        if(action==1){
            System.out.print(NumA + " + " + NumB + " = "  + (NumA + NumB) + ".");
        }

        else if(action==2){
            System.out.print(NumA + " - " + NumB + " = "  + (NumA - NumB) + ".");
        }

        else if(action==3){
            System.out.print(NumA + " * " + NumB + " = "  + (NumA * NumB) + ".");
        }

        else if(action==4){
            System.out.print(NumA + " / " + NumB + " = "  + (NumA / NumB) + ".");
        }

        else if(action==5){
            float D = (NumB * NumB) - (4 * NumA * NumC);
            if (D > 0){
                double x1 = ((-1 * NumB) - Math.sqrt(D)) / (2 * NumA);
                double x2 = ((-1 * NumB) + Math.sqrt(D)) / (2 * NumA);
                System.out.println("x1 = " + x1 + ".");
                System.out.println("x2 = " + x2 + ".");
            }
            else if (D == 0){
                double x = (-1 * NumB) / (2 * NumA);
                System.out.println("x = " + x + ".");
            }

            else {
                System.out.println("Корней нет.");
            }
        }

        else {
            System.out.println("Неверное действие");
        }
    }
}