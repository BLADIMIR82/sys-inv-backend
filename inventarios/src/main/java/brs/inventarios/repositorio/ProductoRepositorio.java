package brs.inventarios.repositorio;

import brs.inventarios.modelo.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepositorio extends JpaRepository<Producto, Integer> {

}
