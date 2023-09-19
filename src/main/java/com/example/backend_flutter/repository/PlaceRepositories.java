package com.example.backend_flutter.repository;

import com.example.backend_flutter.entity.Place;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlaceRepositories extends JpaRepository<Place, Long> {
}
