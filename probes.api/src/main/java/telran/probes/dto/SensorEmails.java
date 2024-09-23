package telran.probes.dto;

import static telran.probes.messages.ErrorMessages.*;

import jakarta.validation.constraints.NotNull;

public record SensorEmails(@NotNull(message = MISSING_SENSOR_ID) long id,
		@NotNull(message = MISSING_EMAILS) String[] mails) {

}
