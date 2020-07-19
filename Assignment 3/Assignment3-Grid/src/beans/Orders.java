package beans;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class Orders {

	private List<Order> orders = new ArrayList<Order>();
	private Random r = new Random();
	
	public Orders() {
		for (int i = 1; i <= 10; i++) {
			orders.add(new Order(String.format("%06d", r.nextInt(i * 100000)), "Product-" + i, (float) ((float) r.nextInt(50) + .99), r.nextInt(10) + 1));
		}
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}
	
	
	
}
