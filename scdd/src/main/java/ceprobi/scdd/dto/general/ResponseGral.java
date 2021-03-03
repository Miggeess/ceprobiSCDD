package ceprobi.scdd.dto.general;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;
import lombok.experimental.PackagePrivate;

@Data
@PackagePrivate
@JsonIgnoreProperties(ignoreUnknown = true)
public class ResponseGral {

	String status;
	String mensaje;
	
}
