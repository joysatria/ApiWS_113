/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pws.RestAPI.praktikum.pws;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author fajar
 */
@Entity
@Table(name = "penduduk")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class datart {

    @Id
    private String id;
    private String nama;
    private String alamat;
    private String gender;
}
