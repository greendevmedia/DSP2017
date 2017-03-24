package in.greendev.dsp2017.model.DB;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

public class EntityManagerAccess <T> {

	private EntityManager entityManager = EntityManagerFactorySingleton.getEntityManagerFactorySingleton()
			.getEntityManagerFactory().createEntityManager();
	
	public void saveInDB(T t){
		this.entityManager.getTransaction().begin();
		this.entityManager.persist(t);
		this.entityManager.getTransaction().commit();
		this.entityManager.close();
	}
	
	public List<T> queryForDB(String queryPsql, Class<T> result){
		TypedQuery<T> query = this.entityManager.createQuery(queryPsql, result);
		List<T> list = query.getResultList();
		return list;
	}
}
