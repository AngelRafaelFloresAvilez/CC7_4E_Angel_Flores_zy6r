package mx.edu.utez.zy6r_4E_Angel_Flores_CC7.repository;

import mx.edu.utez.zy6r_4E_Angel_Flores_CC7.model.videojuego.Prestamo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrestamoRepository extends JpaRepository<Prestamo, Long> {
}