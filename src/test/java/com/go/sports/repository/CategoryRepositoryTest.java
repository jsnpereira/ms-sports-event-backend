package com.go.sports.repository;

import com.go.sports.entity.Event;
import com.go.sports.enums.EventType;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@ActiveProfiles("test")
public class CategoryRepositoryTest {

    @Autowired
    private EntityManager entityManager;

    @Test
    public void shouldLoadTheCategoriesByEventId() {
        Event event = new Event();
        event.setTitle("Desafio em POA");
        event.setDescription("Vai ter desafio em poa localizado zona sul");
        event.setEventType(EventType.BIKE_MTB);
        entityManager.persist(event);
    }
}
