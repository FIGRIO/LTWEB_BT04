package vn.iotstar.entity;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "Categories")
public class Category implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CategoryId")
    private int categoryId;

    @Column(name = "Categoryname", columnDefinition = "nvarchar(200) NOT NULL")
    private String categoryName;

    @Column(name = "Categorycode", columnDefinition = "nvarchar(50) NOT NULL")
    private String categoryCode; // <-- Cần thêm cái này

    @Column(name = "Images", columnDefinition = "nvarchar(500)")
    private String images;       // <-- Cần thêm cái này

    @Column(name = "Status")
    private int status;          // <-- Cần thêm cái này (thường là 0: ẩn, 1: hiện)

    // --- Quan hệ 1-N: Một Category có nhiều Video (Yêu cầu số 3) ---
    @OneToMany(mappedBy = "category", fetch = FetchType.LAZY)
    private List<Video> videos;

    // Constructor rỗng
    public Category() { }

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getCategoryCode() {
		return categoryCode;
	}

	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}

	public String getImages() {
		return images;
	}

	public void setImages(String images) {
		this.images = images;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public List<Video> getVideos() {
		return videos;
	}

	public void setVideos(List<Video> videos) {
		this.videos = videos;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}