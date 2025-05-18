/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RiwayatPenghuniService {

    private final RiwayatPenghuniRepository riwayatPenghuniRepository;

    @Autowired
    public RiwayatPenghuniService(RiwayatPenghuniRepository riwayatPenghuniRepository) {
        this.riwayatPenghuniRepository = riwayatPenghuniRepository;
    }

    public void addNewRiwayatPenghuni(RiwayatPenghuni riwayatPenghuni) {
        riwayatPenghuniRepository.save(riwayatPenghuni);
    }

    public List<RiwayatPenghuni> getRiwayatPenghuni() {
        return riwayatPenghuniRepository.findAll();
    }
}
