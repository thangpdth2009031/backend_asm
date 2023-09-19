package com.example.backend_flutter.dto;


import com.example.backend_flutter.entity.Place;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PlaceDto {
    private long id;
    private String thumbnail;
    private String name;
    private Integer star;

    public PlaceDto(Place place) {
        BeanUtils.copyProperties(place, this);
    }
}
