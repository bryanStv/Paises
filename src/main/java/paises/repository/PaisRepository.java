package paises.repository;

import org.springframework.data.repository.CrudRepository;
import paises.entity.Pais;

import javax.swing.*;

public interface PaisRepository extends CrudRepository<Pais,Long> {
    public Pais findFirstByOrderByIdAsc();

    public JTextField findByPoblacion();
}
