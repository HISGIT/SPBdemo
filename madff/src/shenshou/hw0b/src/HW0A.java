package hw0b.src;

import java.util.Collections;

public class HW0A {
    public static void startTriangle() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(String.join("", Collections.nCopies(i, "*")));
        }
    }

    public static void printIndexed(String inputString) {
        StringBuilder result = new StringBuilder();
        for (int l = inputString.length(); l > 0; l--) {
            result.append(inputString.charAt(l - 1));
            result.append(l - 1);
        }
        System.out.println(result);
    }

    public static void stutter(String inputString) {
        StringBuilder result = new StringBuilder();
        for (int l = 0; l < inputString.length(); l++) {
            result.append(inputString.charAt(l));
            result.append(inputString.charAt(l));
        }
        System.out.println(result);
    }

    public static int quadrant(double x, double y) {
        if (x == 0 || y == 0) {
            return 0;
        }

        if (x > 0) {
            if (y > 0) {
                return 1;
            } else {
                return 4;
            }
        } else {
            if (y > 0) {
                return 2;
            } else {
                return 3;
            }
        }
    }

    public static void main(String[] args) {
        startTriangle();
        printIndexed("ZELDA");
        stutter("Hello!");

        System.out.println(quadrant(12.4, 17.8) == 1);
        System.out.println(quadrant(-2.3, 3.5) == 2);
        System.out.println(quadrant(-15.2, -3.1) == 3);
        System.out.println(quadrant(4.5, -42.0) == 4);
        System.out.println(quadrant(0.0, 3.14) == 0);
    }
}
