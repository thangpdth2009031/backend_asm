package com.example.backend_flutter.service;

import com.example.backend_flutter.dto.PlaceDto;
import com.example.backend_flutter.entity.Place;
import com.example.backend_flutter.repository.PlaceRepositories;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PlaceService {
    final PlaceRepositories placeRepositories;

    public List<Place> findAll() {
        return placeRepositories.findAll();
    }

    public Place create(PlaceDto placeDto) {
        Place place = new Place(placeDto);
        BeanUtils.copyProperties(placeDto, place);
        return placeRepositories.save(place);
    }
}
