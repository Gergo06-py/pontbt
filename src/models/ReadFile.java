package models;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadFile {
    public static ArrayList<Dolgozo> read(String separator, boolean hasFirstLine) throws FileNotFoundException {
        File file = new File("dolgozok.txt");
        Scanner scanner = new Scanner(file);
        ArrayList<Dolgozo> dolgozok = new ArrayList<>();

        if (hasFirstLine)
            scanner.nextLine();
        
        while (scanner.hasNextLine()) {
            Dolgozo dolgozo = new Dolgozo(scanner.nextLine(), separator);
            dolgozok.add(dolgozo);
        }
        
        scanner.close();
        return dolgozok;
    }
}
