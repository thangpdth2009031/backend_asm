package com.example.backend_flutter.entity;

import com.example.backend_flutter.dto.PlaceDto;
import lombok.*;
import org.springframework.beans.BeanUtils;

import javax.persistence.*;

@Entity
@Getter
@ToString
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "places")
public class Place {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String thumbnail;
    private String name;
    private Integer star;
    public Place(PlaceDto placeDto) {
        BeanUtils.copyProperties(placeDto, this);
    }
}
