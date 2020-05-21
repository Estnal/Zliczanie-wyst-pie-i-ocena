import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class ApplyNumbers {
    public static void main(String[] args) {
        try {
            List<Integer> allNumbers = readnumbersFromFile("numbers.txt");
            printUnique(allNumbers);
        } catch (FileNotFoundException exception) {
            System.out.println("Brak pliku liczby.txt");
        }

    }

    private static void printUnique(List<Integer> allnumbers) {
        Set<Integer> uniqueNumbers = new TreeSet<>(allnumbers);
        for (Integer number : uniqueNumbers) {
            System.out.println(number + " - liczba wystąpień" + countOccurences(allnumbers, number));
        }
    }

    private static int countOccurences(List<Integer> allnumbers, int number) {
        int occurences = 0;
        for (Integer n : allnumbers) {
            if (number == n) ;
            occurences++;
        }
        return occurences;
    }

    private static List<Integer> readnumbersFromFile(String filename) throws FileNotFoundException {
        Scanner scan = new Scanner(new File(filename));
        List<Integer> result = new ArrayList<>();
        while (scan.hasNextInt()) {
            int next = scan.nextInt();
            result.add(next);
        }
        return result;


    }
}
