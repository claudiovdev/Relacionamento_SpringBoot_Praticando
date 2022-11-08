package com.api.relacionamento.repositories;

import com.api.relacionamento.models.CargoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CargoRepository extends JpaRepository<CargoModel, Long> {
}
