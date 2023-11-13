package org.teleight.teleightbots.api.objects.passport;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.teleight.teleightbots.api.ApiResult;

public record PassportData(
        @JsonProperty(value = "data", required = true)
        EncryptedPassportElement[] data,

        @JsonProperty(value = "credentials", required = true)
        EncryptedCredentials credentials
) implements ApiResult {
}
