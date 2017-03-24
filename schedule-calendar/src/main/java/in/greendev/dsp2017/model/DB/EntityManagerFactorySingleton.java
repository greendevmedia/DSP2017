package in.greendev.dsp2017.model.DB;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerFactorySingleton {
	private static EntityManagerFactorySingleton entityManagerFactorySingleton = new EntityManagerFactorySingleton();
	
	private EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("scheduleConfDB");
	
	private EntityManagerFactorySingleton(){		
	};
	
	public static EntityManagerFactorySingleton getEntityManagerFactorySingleton(){
		return entityManagerFactorySingleton;
	}
	
	public EntityManagerFactory getEntityManagerFactory(){
		return entityManagerFactory;
	};

}
