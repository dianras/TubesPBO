/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClassRiwayatPenghuni;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 *
 * @author Rilda Dwi Febrianda
 */
@RestController
@RequestMapping("/riwayat")
public class RiwayatPenghuniController {

    @Autowired
    private RiwayatPenghuniRepository riwayatRepo;

    @GetMapping
    public List<RiwayatPenghuni> getAll() {
        return riwayatRepo.findAll();
    }

    @PostMapping
    public RiwayatPenghuni create(@RequestBody RiwayatPenghuni r) {
        return riwayatRepo.save(r);
    }

    @GetMapping("/{id}")
    public ResponseEntity<RiwayatPenghuni> getById(@PathVariable String id) {
        return riwayatRepo.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        riwayatRepo.deleteById(id);
    }
}
