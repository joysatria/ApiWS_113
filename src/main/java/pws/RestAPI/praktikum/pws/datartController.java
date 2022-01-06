/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pws.RestAPI.praktikum.pws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author fajar
 */
@CrossOrigin
@RestController
@RequestMapping("/datapenduduk")

public class datartController {

    @Autowired
    private datartRepo dataerte;

    @GetMapping("/penduduk")
    public List<datart> getAllDatart() {
        return dataerte.findAll();
    }

    @GetMapping("/penduduk/{id}")
    public datart getErialbById(@PathVariable String id) {
        return dataerte.findById(id).get();
    }

    @PostMapping("/penduduk")
    public datart saveDatartDetails(@RequestBody datart c) {
        return dataerte.save(c);
    }

    @PutMapping("/penduduk")
    public datart updateDatart(@RequestBody datart c) {
        return dataerte.save(c);
    }

    @DeleteMapping("/penduduk/{id}")
    public ResponseEntity<HttpStatus> deleteDatartById(@PathVariable String id) {
        dataerte.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
