package vn.iotstar.entity;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import vn.iotstar.configs.JPAConfig;

public class TestDB {
    public static void main(String[] args) {
        // 1. Lấy kết nối
        EntityManager enma = JPAConfig.getEntityManager();
        EntityTransaction trans = enma.getTransaction();
        
        try {
            trans.begin(); // Bắt đầu
            
         // 2. Tạo data giả
            Category cat = new Category();
            cat.setCategoryName("Iphone 15"); // Tên danh mục
            cat.setCategoryCode("IP15");      // Mã danh mục (Bắt buộc theo đề bài mới)
            cat.setImages("iphone.jpg");      // Hình ảnh
            cat.setStatus(1);                 // Trạng thái (1 là hoạt động)
            
            // 3. Lưu xuống DB
            enma.persist(cat); 
            
            trans.commit(); // Chốt đơn
            System.out.println(">>> Đã thêm thành công! Kiểm tra DB đi bạn.");
            
        } catch (Exception e) {
            e.printStackTrace();
            trans.rollback();
            throw e;
        } finally {
            enma.close();
        }
    }
}