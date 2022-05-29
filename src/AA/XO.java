package AA;

import java.util.Arrays;
import java.util.Scanner;

public class XO {
    public static void main(String[] args) {
        initMap();
        printMap();
        humanTurn();
        printMap();
        humanTurn();
        printMap();
    }

    //поле
    public static char[][] map;
    //Размер поля
    public static final int SIZE = 3;
    //точек для победы
    public static final int DOTS_TO_WIN = 3;

    //Описание точчек
    public static final char DOT_EMPTY = '*';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';
    //Сканер
    public static final Scanner SCANNER = new Scanner(System.in);


    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < map.length; i++) {
            Arrays.fill(map[i], DOT_EMPTY);
        }
    }

    public static void printMap() {

        for (int i = 0; i <= map.length; i++) {
            System.out.print(i + " ");
        }
        System.out.println();


        for (int i = 0; i < map.length; i++) {
            System.out.print((i + 1) + " ");

            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();

        }
    }


    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Ввкдите координаты  X  Y");
            x = SCANNER.nextInt() - 1;
            y = SCANNER.nextInt() - 1;
        } while (!isCellValid(x, y));
        map[y][x] = DOT_X;
    }


    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) {
            return false;
        }
        if (map[y][x] != DOT_EMPTY) {
            return false;
        }
        return true;
    }
}
