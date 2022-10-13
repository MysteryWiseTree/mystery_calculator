import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner In = new Scanner (System.in);
        int action = 1;
        while (action != 0) {
            action = action_selection();
            System.out.print("Введите a: ");
            float NumA = In.nextFloat();
            System.out.print("Введите b: ");
            float NumB = In.nextFloat();
            if (action==5) {
                System.out.print("Введите c: ");
                float NumC = In.nextFloat();
                print_quad_urav(NumA,NumB,NumC);
            }
            else {
                print_action(NumA, NumB, action);
            }
        }
    }
    public static int action_selection() {

        System.out.println("\n\nВыберите необходимое действие\n1)Сложение\n2)Вычитание\n3)Умножение\n4)Деление\n5)Вычисление квадратного уравнения");
        Scanner Input2 = new Scanner (System.in);
        int selected = Input2.nextInt();
        while (selected < 0 | selected > 5) {
            System.out.println("Выбрано несуществующее действие, повторите ввод\nДля выхода введите 0.");
            selected = Input2.nextInt();
        }
        return (selected);
    }
    public static void print_action(float a, float b, int act) {
        if(act==1){
            System.out.print(a + " + " + b + " = "  + (a + b) + ".");
        }
        else if(act==2){
            System.out.print(a + " - " + b + " = "  + (a - b) + ".");
        }
        else if(act==3){
            System.out.print(a + " * " + b + " = "  + (a * b) + ".");
        }
        else{
            System.out.print(a + " / " + b + " = "  + (a / b) + ".");
        }
    }
    public static void print_quad_urav(float a, float b, float c) {
        float D = (b * b) - (4 * a * c);
        if (D > 0){
            double x1 = ((-1 * b) - Math.sqrt(D)) / (2 * a);
            double x2 = ((-1 * b) + Math.sqrt(D)) / (2 * a);
            System.out.println("x1 = " + x1 + ".");
            System.out.println("x2 = " + x2 + ".");
        }
        else if (D == 0){
            double x = (-1 * b) / (2 * a);
            System.out.println("x = " + x + ".");
        }

        else {
            System.out.println("Корней нет.");
        }
    }
}