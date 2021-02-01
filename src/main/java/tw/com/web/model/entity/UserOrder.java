package tw.com.web.model.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "userorder")
public class UserOrder {
	@Id
	@GeneratedValue
	private Long id;
	@Column
	private String orderName;
	@Column
	private Date orderDate;
	@ManyToOne
	@JoinColumn(name = "user_id",referencedColumnName = "id")
	private User user;
	public UserOrder() {
		super();
	}
	public UserOrder(String orderName, Date orderDate, User user) {
		super();
		this.orderName = orderName;
		this.orderDate = orderDate;
		this.user = user;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getOrderName() {
		return orderName;
	}
	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "UserOrder [id=" + id + ", orderName=" + orderName + ", orderDate=" + orderDate + ", user=" + user + "]";
	}
}
