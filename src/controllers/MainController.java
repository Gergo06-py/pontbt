package controllers;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import models.Dolgozo;
import models.ReadFile;

public class MainController {
    ArrayList<Dolgozo> dolgozok;

    public MainController() {
        dolgozok = new ArrayList<>();
    }

    public void readFile() {
        try {
            this.dolgozok = tryReadFile();
        } catch (Exception e) {
            System.err.println("Hiba! A fájl nem található!");
            System.err.println(e.getMessage());
        }
    }

    public ArrayList<Dolgozo> tryReadFile() throws FileNotFoundException {
        return ReadFile.read(":", false);
    }

    public void printData() {
        System.out.printf("%20s|%20s|%20s|%20s|%20s|%20s\n", "ID", "Név", "Város", "Utca", "Fizetés",
                "Születési Dátum");
        for (int i = 0; i < 126; i++) {
            System.out.print("-");
        }
        System.out.println();
        for (Dolgozo dolgozo : dolgozok) {
            System.out.printf("%20d|%20s|%20s|%20s|%20d|%20s\n", dolgozo.getId(), dolgozo.getNev(), dolgozo.getVaros(), dolgozo.getUtca(), dolgozo.getFizetes(), dolgozo.getSzuletes());
        }
   }
}
