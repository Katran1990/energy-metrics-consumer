package com.bobobobr.energymetricsconsumer.component.mapper;

import com.bobobobr.energymetricsconsumer.domain.Metric;
import com.bobobobr.energymetricsconsumer.dto.EnergyRecord;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING,
        unmappedTargetPolicy = ReportingPolicy.ERROR)
public interface MetricsMapper {


    EnergyRecord toDto(Metric metric);

    List<EnergyRecord> toDto(List<Metric> metrics);

}
