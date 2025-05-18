/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClassDokumen;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DokumenService {

    private final DokumenRepository dokumenRepository;

    @Autowired
    public DokumenService(DokumenRepository dokumenRepository) {
        this.dokumenRepository = dokumenRepository;
    }

    public List<Dokumen> getDokumen() {
        return dokumenRepository.findAll();
    }

    public void addNewDokumen(Dokumen dokumen) {
        dokumenRepository.save(dokumen);
    }
}