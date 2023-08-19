package Servletdao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import ServletDto.EmployeDto;

public class EmployeDao {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();

	public void insertion(EmployeDto dto) {
		et.begin();
		em.persist(dto);
		et.commit();
	}

	public EmployeDto valid(String email) {
		EmployeDto d = em.find(EmployeDto.class, email);
		return d;
	}
}
