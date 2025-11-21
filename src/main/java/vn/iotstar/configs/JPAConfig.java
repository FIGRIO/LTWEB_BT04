package vn.iotstar.configs;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JPAConfig {
    
    // Tạo ra EntityManagerFactory từ tên cấu hình trong persistence.xml
    public static EntityManager getEntityManager() {
        // Lưu ý: "jpa-hibernate-sql" phải giống hệt cái tên trong file xml ở Bước 2
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("jpa-hibernate-sql");
        return factory.createEntityManager();
    }
}