package br.com.erudio.services;

import br.com.erudio.data.dto.v2.PersonDTOV2;
import br.com.erudio.mapper.ObjectMapperV2;
import br.com.erudio.respository.PersonRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.concurrent.atomic.AtomicLong;


@Service
public class PersonServicesV2 {

    private final AtomicLong counter = new AtomicLong();
    private Logger logger = LoggerFactory.getLogger(PersonServices.class.getName());

    @Autowired
    PersonRepository repository;
    @Autowired
    ObjectMapperV2 converter;

    public PersonDTOV2 createV2(PersonDTOV2 person) {

        logger.info("Creating one Person V2!");
        var entity = converter.convertDTOtoEntity(person);

        return converter.convertEntityToDTO(repository.save(entity));
    }
}