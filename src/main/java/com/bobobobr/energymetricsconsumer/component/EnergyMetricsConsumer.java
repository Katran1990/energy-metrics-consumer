package com.bobobobr.energymetricsconsumer.component;

import com.bobobobr.energymetricsconsumer.domain.Metric;
import com.bobobobr.energymetricsconsumer.dto.EnergyRecord;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
public class EnergyMetricsConsumer {

    private final MetricsRepository repository;

    @RabbitListener(queues = "detector-queue")
    public void receiveMessage(EnergyRecord record) {
        repository.save(Metric.builder()
                .voltage(record.voltage())
                .dateTime(record.dateTime())
                .address(record.address())
                .build());
        log.info("{}",record);
    }
}
