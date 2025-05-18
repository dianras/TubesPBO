/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClassDokumen;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/dokumen")
public class DokumenController {

    private final DokumenService dokumenService;

    @Autowired
    public DokumenController(DokumenService dokumenService) {
        this.dokumenService = dokumenService;
    }

    @GetMapping
    public List<Dokumen> getDokumen() {
        return dokumenService.getDokumen();
    }

    @PostMapping
    public void addNewDokumen(@RequestBody Dokumen dokumen) {
        dokumenService.addNewDokumen(dokumen);
    }
}