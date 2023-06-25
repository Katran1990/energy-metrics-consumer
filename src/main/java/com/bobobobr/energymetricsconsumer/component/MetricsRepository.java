package com.bobobobr.energymetricsconsumer.component;

import com.bobobobr.energymetricsconsumer.domain.Metric;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MetricsRepository extends MongoRepository<Metric, String> {
}
