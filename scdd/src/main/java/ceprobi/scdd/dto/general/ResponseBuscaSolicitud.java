package ceprobi.scdd.dto.general;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import ceprobi.scdd.dto.soltransporte.RequestSolTransporte;
import ceprobi.scdd.model.ScddCatOperadores;
import ceprobi.scdd.model.ScddCatVehiculos;
import lombok.Data;
import lombok.experimental.PackagePrivate;

@Data
@PackagePrivate
@JsonIgnoreProperties
public class ResponseBuscaSolicitud extends ResponseGral {
	
	List<RequestSolTransporte> solicitud;
	
	@JsonProperty("operadores")
	List<ScddCatOperadores> operadores;
	
	@JsonProperty("vehiculos")
	List<ScddCatVehiculos> vehiculos;

}
