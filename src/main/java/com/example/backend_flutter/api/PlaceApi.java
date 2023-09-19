package com.example.backend_flutter.api;

import com.example.backend_flutter.dto.PlaceDto;
import com.example.backend_flutter.entity.Place;
import com.example.backend_flutter.service.PlaceService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class PlaceApi {
    final PlaceService placeService;

    @GetMapping("/getAllPlace")
    public ResponseEntity<List<Place>> getList() {
        return ResponseEntity.ok(placeService.findAll());
    }

}
