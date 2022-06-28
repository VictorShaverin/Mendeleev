import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println(" v = ");
        double V = scanner.nextInt();
        System.out.println("p =");
        double P = scanner.nextInt();
        System.out.println("m =");
        double m = scanner.nextInt();
        System.out.println("M =");
        double M = scanner.nextInt();
        System.out.println(" T =");
        double T = scanner.nextInt();
        double R = 8.31;
        double P1 = Pressure(V, m, M, R, T);
        System.out.println(" DAVLENIE = " + P1);
        double V1 = Volume(P, m, M, R, T);
        System.out.println("OBEM = "+V1);
        double m1 = Weight(V, P, M, R, T);
        System.out.println("MACCA = "+m1);
        double M1 = Molar(V, P, m, R, T);
        System.out.println("MOLARHAI MACCA ="+M1);
        double R1 = Universals(V, P, m, M, T);
        System.out.println("Y.G.P ="+R1);
        double T1 = Temperature(V, P, m, R, M);
        System.out.println("TEMPERATURA ="+T1);
    }

    /**
     * Вычисление давления ,ПА
     *
     * @param V Объем ,м^3
     * @param m Масса,кг
     * @param M Молярная масса,кг/моль
     * @param R Универсальная газовая постоянная
     * @param T Температура ,К
     * @return Возращает значение давления ,ПА
     */
    public static double Pressure(double V, double m, double M, double R, double T) {
        return m / V * M * R * T;
    }

    /**
     * Вычисление объема
     *
     * @param P Давление ,ПА
     * @param m Масса,кг
     * @param M Молярная масса,кг/моль
     * @param R Универсальная газовая постоянная
     * @param T Температура ,К
     * @return Возращает значение объема ,м^3
     */
    public static double Volume(double P, double m, double M, double R, double T) {
        return m / P * M * R * T;
    }

    /**
     * Вычисление масссы
     *
     * @param V Объем ,м^3
     * @param P Давление ,ПА
     * @param M Молярная масса,кг/моль
     * @param R Универсальная газовая постоянная
     * @param T Температура ,К
     * @return Возращает значение массы
     */
    public static double Weight(double V, double P, double M, double R, double T) {
        return P * V * M * R * T;
    }

    /**
     * Вычисление молярной массы
     *
     * @param V Объем ,м^3
     * @param P Давление ,ПА
     * @param m Масса,кг
     * @param R Универсальная газовая постоянная
     * @param T Температура ,К
     * @return Возращает значение молярной массы
     */
    public static double Molar(double V, double P, double m, double R, double T) {
        return m / P * V * R * T;
    }

    /**
     * Вычисление универсального газа
     *
     * @param V Объем ,м^3
     * @param P Давление ,ПА
     * @param m Масса,кг
     * @param M Молярная масса,кг/моль
     * @param T Температура ,К
     * @return Возращает значение универсального газа
     */
    public static double Universals(double V, double P, double m, double M, double T) {
        return m / P * V * M * T;
    }

    /**
     * Вычисление температуры
     *
     * @param V Объем ,м^3
     * @param P Давление ,ПА
     * @param m Масса,кг
     * @param R Универсальная газовая постоянная
     * @param M Молярная масса,кг/моль
     * @return Возращает значение температуры
     */
    public static double Temperature(double V, double P, double m, double R, double M) {
        return P * V / (m * R * M);
    }
}