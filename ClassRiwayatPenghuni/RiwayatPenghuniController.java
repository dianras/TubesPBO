/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClassRiwayatPenghuni;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/riwayatpenghuni")
public class RiwayatPenghuniController {

    private final RiwayatPenghuniService service;

    @Autowired
    public RiwayatPenghuniController(RiwayatPenghuniService service) {
        this.service = service;
    }

    @GetMapping
    public List<RiwayatPenghuni> getRiwayat() {
        return service.getRiwayat();
    }

    @PostMapping
    public void addNewRiwayat(@RequestBody RiwayatPenghuni riwayat) {
        service.addNewRiwayat(riwayat);
    }
}
