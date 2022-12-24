package peaksoft.repository;

import org.springframework.stereotype.Repository;
import peaksoft.model.House;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class HouseRepository {
    @PersistenceContext
    private EntityManager entityManager;


    public List<House> getAllHouses() {
        return entityManager.createQuery("select h from House h", House.class).getResultList();
    }

    public House getHouseById(long id) {
        return entityManager.find(House.class, id);
    }

    public void saveHouse(House house) {
        entityManager.persist(house);

    }

    public void deleteById(Long id) {
        entityManager.remove(getHouseById(id));
    }

}
