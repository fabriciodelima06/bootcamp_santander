package com.project.bootcam.mapper;

import com.project.bootcam.model.Stock;
import com.project.bootcam.model.dto.StockDTO;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class StockMapper {

    public Stock toEntity(StockDTO dto) {
        Stock entity = new Stock();
        entity.setId(dto.getId());
        entity.setName(dto.getName());
        entity.setPrice(dto.getPrice());
        entity.setVariation(dto.getVariation());
        entity.setDate(dto.getDate());
        return entity;
    }

    public StockDTO toDto(Stock entity) {
        StockDTO dto = new StockDTO();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        dto.setPrice(entity.getPrice());
        dto.setVariation(entity.getVariation());
        dto.setDate(entity.getDate());
        return dto;
    }

    public List<StockDTO> toDto(List<Stock> list) {
        return list.stream().map(this::toDto).collect(Collectors.toList());
    }
}
