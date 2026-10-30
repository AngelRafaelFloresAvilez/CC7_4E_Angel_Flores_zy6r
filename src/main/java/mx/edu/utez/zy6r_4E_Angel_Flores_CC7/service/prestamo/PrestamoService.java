package mx.edu.utez.zy6r_4E_Angel_Flores_CC7.service.prestamo;

import jdk.jfr.SettingDefinition;
import mx.edu.utez.zy6r_4E_Angel_Flores_CC7.controller.prestamo.dto.RegistrarPrestamoDto;
import mx.edu.utez.zy6r_4E_Angel_Flores_CC7.exception.CustomException;
import mx.edu.utez.zy6r_4E_Angel_Flores_CC7.model.prestamo.Videojuego;
import mx.edu.utez.zy6r_4E_Angel_Flores_CC7.model.videojuego.Estado;
import mx.edu.utez.zy6r_4E_Angel_Flores_CC7.model.videojuego.Prestamo;
import mx.edu.utez.zy6r_4E_Angel_Flores_CC7.repository.PrestamoRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

@Service
public class PrestamoService {
    private final PrestamoRepository prestamoRepository;

    public PrestamoService(PrestamoRepository prestamoRepository) {
        this.prestamoRepository = prestamoRepository;
    }


    public ResponseEntity<Prestamo> Enviar(RegistrarPrestamoDto payload){
        Prestamo prestamo = new Prestamo();
        prestamo.setNombreSolicitante("Pepe");
        prestamo.setEstado(Estado.ACTIVO);
        prestamo.setFechaDevolucion("HOY");

        prestamoRepository.save(prestamo);

        return ResponseEntity.status(200).body(prestamo);
    }



}
