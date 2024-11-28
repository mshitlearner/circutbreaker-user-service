package in.mshitlearner.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseDTO {
	
	private Integer responseCode;
	private String responseMsg;
	private String errorMsg;
}
