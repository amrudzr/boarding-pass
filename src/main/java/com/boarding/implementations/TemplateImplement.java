package main.java.com.boarding.implementations;

import java.util.HashMap;

import main.java.com.boarding.model.Template;

public class TemplateImplement {
    private HashMap<String, Template> dataStore = new HashMap<>();

    // Tambah data
    public void addBoardingPass(String id, String passengerName, String flightNumber) {
        if (dataStore.containsKey(id)) {
            System.out.println("Boarding pass dengan ID ini sudah ada.");
        } else {
            Template pass = new Template(id, passengerName, flightNumber);
            dataStore.put(id, pass);
            System.out.println("Boarding pass berhasil ditambahkan.");
        }
    }

    // Hapus data
    public void deleteBoardingPass(String id) {
        if (dataStore.containsKey(id)) {
            dataStore.remove(id);
            System.out.println("Boarding pass berhasil dihapus.");
        } else {
            System.out.println("Boarding pass dengan ID ini tidak ditemukan.");
        }
    }

    // Tampilkan semua data
    public void displayAllBoardingPasses() {
        if (dataStore.isEmpty()) {
            System.out.println("Tidak ada boarding pass yang tersedia.");
        } else {
            System.out.println("=== Daftar Boarding Pass ===");
            for (Template pass : dataStore.values()) {
                System.out.println(pass);
            }
        }
    }

    // Cari data berdasarkan ID
    public Template searchBoardingPass(String id) {
        return dataStore.get(id); // Mengembalikan null jika tidak ditemukan
    }
}

