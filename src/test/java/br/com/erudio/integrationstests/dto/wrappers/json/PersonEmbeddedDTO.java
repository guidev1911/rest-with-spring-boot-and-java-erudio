package br.com.erudio.integrationstests.dto.wrappers.json;

import br.com.erudio.integrationstests.dto.PersonDTO;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

public class PersonEmbeddedDTO implements Serializable {

    private static final long serialVersionUID = 1l;

    @JsonProperty("people")
    private List<PersonDTO> people;

    public PersonEmbeddedDTO(){
    }

    public List<PersonDTO> getPeople() {
        return people;
    }

    public void setPeople(List<PersonDTO> people) {
        this.people = people;
    }
}
