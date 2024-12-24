package main.java.com.boarding.abstracts;

import java.util.ArrayList;
import java.util.List;

import main.java.com.boarding.interfaces.BoardingPass;

public abstract class AbstractBoardingPass implements BoardingPass {
    protected List<String> boardingPassList = new ArrayList<>();

    @Override
    public void displayBoarding() {
        if (boardingPassList.isEmpty()) {
            System.out.println("Belum ada boarding pass yang disimpan.");
        } else {
            System.out.println("Daftar Boarding Pass:");
            for (String boardingPass : boardingPassList) {
                System.out.println("- " + boardingPass);
            }
        }
    }

    @Override
    public void archiveBoarding() {
        if (boardingPassList.isEmpty()) {
            System.out.println("Belum ada boarding pass yang disimpan.");
        } else {
            System.out.println("Boarding Pass Berhasil Diarsipkan");
        }
    }

    @Override
    public void addBoarding() {
        
    }

    @Override
    public void findBoarding() {
        
    }

    @Override
    public void sortBoarding() {
        
    }
}
