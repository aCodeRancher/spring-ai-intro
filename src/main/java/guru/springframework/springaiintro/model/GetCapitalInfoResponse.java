package guru.springframework.springaiintro.model;

import com.fasterxml.jackson.annotation.JsonPropertyDescription;


public record GetCapitalInfoResponse(
        @JsonPropertyDescription("This is the city name") String city,
        @JsonPropertyDescription("This is the currency")String currency,
        @JsonPropertyDescription("This is the language") String language,
        @JsonPropertyDescription("This is the population") Integer population,
        @JsonPropertyDescription("This is the region") String region
      )
{
}
