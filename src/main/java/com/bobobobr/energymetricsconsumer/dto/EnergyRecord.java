package com.bobobobr.energymetricsconsumer.dto;

import java.time.LocalDateTime;

public record EnergyRecord(int voltage, LocalDateTime dateTime, String address) {
}
