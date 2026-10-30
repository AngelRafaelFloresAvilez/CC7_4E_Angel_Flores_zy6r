package mx.edu.utez.zy6r_4E_Angel_Flores_CC7.controller.prestamo;

import jakarta.validation.Valid;
import mx.edu.utez.zy6r_4E_Angel_Flores_CC7.controller.prestamo.dto.RegistrarPrestamoDto;
import mx.edu.utez.zy6r_4E_Angel_Flores_CC7.model.prestamo.Videojuego;
import mx.edu.utez.zy6r_4E_Angel_Flores_CC7.model.videojuego.Prestamo;
import mx.edu.utez.zy6r_4E_Angel_Flores_CC7.service.prestamo.PrestamoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/prestamo")
@CrossOrigin("*")

public class PrestamoController {
    private final PrestamoService prestamoService;


    public PrestamoController(PrestamoService prestamoService) {
        this.prestamoService = prestamoService;
    }
    @GetMapping
    public void registrarPrestamo (@Valid RegistrarPrestamoDto payload) {
        prestamoService.Enviar(payload);
    }

}
