package com.segundoexamen.segundoexamen.clientRest;

import com.segundoexamen.segundoexamen.modelo.Alumno;
import lombok.Getter;
import lombok.Setter;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Base64;
import java.util.List;

@Getter
@Setter
public class ClienteRest {

    private String url;

    public List<Alumno> obtenerPersonas(){
        RestTemplate restTemplate = new RestTemplate();
        String url = this.url;
        HttpHeaders headers = new HttpHeaders();
        String strAuth = "test:test";
        String base64Creds = Base64.getEncoder().encodeToString(strAuth.getBytes());

        headers.add("Authorization", "Basic " + base64Creds);
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<String>(headers);
        ResponseEntity<List<Alumno>> response = restTemplate.exchange(url,
                HttpMethod.GET, entity, new ParameterizedTypeReference<List<Alumno>>() {
                });

        return response.getBody();
    }
}
