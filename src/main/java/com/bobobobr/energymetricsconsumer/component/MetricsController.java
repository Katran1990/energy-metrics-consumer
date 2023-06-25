package com.bobobobr.energymetricsconsumer.component;

import com.bobobobr.energymetricsconsumer.component.mapper.MetricsMapper;
import com.bobobobr.energymetricsconsumer.dto.EnergyRecordCollection;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class MetricsController {

    private final MetricsRepository repository;
    private final MetricsMapper mapper;

    @GetMapping("/metrics")
    public ResponseEntity<EnergyRecordCollection> getAllMetrics() {
        return ResponseEntity.ok(new EnergyRecordCollection(mapper.toDto(repository.findAll())));
    }
}
