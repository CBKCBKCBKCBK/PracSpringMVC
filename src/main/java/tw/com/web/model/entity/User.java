package tw.com.web.model.entity;

import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "user")
public class User {
	@Id
	@GeneratedValue
	private Long id;
	@Column(length = 20,nullable = false)
	private String username;
	@Column(length = 20,nullable = false)
	private String pass;
	@Column(length = 50)
	private String address;
	@Column	(length = 20)
	private String phone;
	@Column
	@Temporal(TemporalType.DATE)
	private Date birthday;
	@OneToMany(mappedBy = "user",cascade = {CascadeType.PERSIST,CascadeType.REMOVE})
	private Set<UserOrder> userOrders=new LinkedHashSet<UserOrder>();
	public User() {
		super();
	}
	public User(String username, String pass, String address, String phone, Date birthday, Set<UserOrder> userOrders) {
		super();
		this.username = username;
		this.pass = pass;
		this.address = address;
		this.phone = phone;
		this.birthday = birthday;
		this.userOrders = userOrders;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public Set<UserOrder> getUserOrders() {
		return userOrders;
	}
	public void setUserOrders(Set<UserOrder> userOrders) {
		this.userOrders = userOrders;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", pass=" + pass + ", address=" + address + ", phone="
				+ phone + ", birthday=" + birthday + "]";
	}
}
