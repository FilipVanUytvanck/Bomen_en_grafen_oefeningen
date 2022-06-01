import java.util.ArrayList;
import java.util.List;

public class Recursie {


    // Oefening 1: n-de Fibonacci-getal
    public static int fibonacci(int getal) {
        if (getal <= 0) {
            throw new IllegalArgumentException("parameter moet groter dan 0 zijn");
        } else if (getal == 1) {
            return 1;
        } else if (getal == 2) {
            return 1;
        } else {
            return fibonacci(getal - 1) + fibonacci(getal - 2);
        }
    }

    // Oefening 2 : som van cijfers
    // Todo: Fix
    public static int somVanCijfers(int getal) {
        int som = 0;
        int cijfer;

        if (getal == 0) {
            return som;
        } else {
            cijfer = getal % 10;
            som = som + cijfer;
            getal = getal / 10;
        }
        return som + somVanCijfers(getal);
    }

    // Oefening 3: keer een string om
    public static String keerOm(String s) {
        if (s == null) {
            throw new IllegalArgumentException();
        } else if (s.length() == 0 || s.length() == 1) {
            return s;
        } else {
            return keerOm(s.substring(1)) + s.charAt(0);
        }
    }

    //oefening 4: countX
    public static int countX(String s) {
        int count = 0;

        if (s == null) {
            throw new IllegalArgumentException("Er moet een string meegegeven worden");
        } else if (s.length() == 0) {
            return count;
        } else if (s.charAt(0) == 'x') {
            count++;
            return count + countX(s.substring(1));
        }
        return countX(s.substring(1));
    }

    //oefening 5 : countHi
    public static int countHi(String s) {
        int count = 0;

        if (s == null) {
            throw new IllegalArgumentException("Er moet een string meegegeven worden");
        } else if (s.length() == 0) {
            return count;
        } else if (s.charAt(0) == 'H' && s.charAt(1) == 'i') {
            count++;
            return count + countHi(s.substring(1));
        }
        return countHi(s.substring(1));
    }

    // oefening 6
    // Todo: Fix output
    public static String changeXY(String s) {
        if (s == null) {
            throw new IllegalArgumentException("Er moet een string meegegeven worden");
        } else if (s.charAt(0) == 'x') {
            return "";
        }
        return changeXY("");
    }

    // oefening 7
    //Todo: Copy-paste oef 6
    public static String changePi(String s) {
        if (s == null) {
            throw new IllegalArgumentException("Er moet een string meegegeven worden");
        } else if (s.charAt(0) == 'P' && s.charAt(1) == 'i') {
            return "";
        }
        return changePi("");
    }

    // oefening 8:
    public static int tweelog(int getal) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    // oefening 9;
    public static double findMaximum(List<Double> lijst) {
        double maximum = 0;

        if (lijst == null || lijst.size() == 0) {
            throw new IllegalArgumentException("Lijst bestaat niet & mag ook niet leeg zijn");
        } else if (lijst.size() == 1) {
            return lijst.get(0);
        } else if (lijst.get(0) < lijst.get(1)) {
            maximum = lijst.get(1);
        }
        lijst.remove(0);
        return maximum + findMaximum(lijst);
    }

    // oefening 10;
    public static ArrayList<String> findSubstrings(String string) {
        ArrayList<String> array = new ArrayList<>();
        if (string == null) {
            throw new IllegalArgumentException("string moet bestaan");
        } else if (string.isEmpty()) {
            return array;
        } else if (string.length() == 1) {
            array.add(string);
            return array;
        } else {
            array.add(string);
            return findSubstrings(string.substring(1));
        }
    }

    // oefening 11;
    // Todo: Formule uitwerken n*2 + som voorgaande verdieping + kaarten
    public static int aantalKaarten(int n) {
        int count = 0;
        if (n == 0) {
            throw new IllegalArgumentException("n mag niet leeg zijn");
        } else if (n < 0) {
            throw new IllegalArgumentException("n moet positief zijn");
        } else {
            //return count = (n*2) + (count(n-1));
            return 0;
        }
    }
}