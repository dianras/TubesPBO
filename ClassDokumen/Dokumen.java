/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClassDokumen;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "dokumen")
public class Dokumen {
    @Id
    private String id;
    
    private String jenis;
    private String namaFile;
    private String tanggalUpload;

    public Dokumen(String id, String jenis, String namaFile, String tanggalUpload) {
        this.id = id;
        this.jenis = jenis;
        this.namaFile = namaFile;
        this.tanggalUpload = tanggalUpload;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getNamaFile() {
        return namaFile;
    }

    public void setNamaFile(String namaFile) {
        this.namaFile = namaFile;
    }

    public String getTanggalUpload() {
        return tanggalUpload;
    }

    public void setTanggalUpload(String tanggalUpload) {
        this.tanggalUpload = tanggalUpload;
    }
    
    @Override
    public String toString(){
        return "Dokumen{" +
                "id=" + id + '\'' +
                ", jenis='" + jenis + '\'' +
                ", tanggalUpload='" + tanggalUpload + '\'' +
                '}';
    }
}
