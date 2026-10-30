package mx.edu.utez.zy6r_4E_Angel_Flores_CC7.model.videojuego;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import mx.edu.utez.zy6r_4E_Angel_Flores_CC7.model.prestamo.Videojuego;

import static mx.edu.utez.zy6r_4E_Angel_Flores_CC7.model.videojuego.Estado.ACTIVO;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Prestamo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombreSolicitante;
    private String fechaPrestamo;
    private String fechaDevolucion = null;

    private Estado estado = ACTIVO;

    private Videojuego videojuego;

}
