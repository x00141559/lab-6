package models.shopping;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

import java.util.Calendar;

import models.products.*;
import models.users.*;
import java.text.*;

// ShopOrder entity managed by Ebean
@Entity
public class ShopOrder extends Model {

    @Id
    private Long id;
    
    private Calendar OrderDate;
    
    // Order contains may items.
    // mappedBy makes this side of the mapping the owner
    // so foreign key will be placed in resulting OrderItem table
    // All changes, including deletes will be cascaded
    @OneToMany(mappedBy="order", cascade = CascadeType.ALL)
    private List<OrderItem> items;
    
    @ManyToOne
    private Customer customer;

    // Default constructor
    public  ShopOrder() {
        OrderDate = Calendar.getInstance();
    }
    public double getOrderTotal() {
        
        double total = 0;
        
        for (OrderItem i: items) {
            total += i.getItemTotal();
        }
        return total;
    }
    
 

    
	//Generic query helper
    public static Finder<Long,ShopOrder> find = new Finder<Long,ShopOrder>(ShopOrder.class);

    //Find all Products in the database
    public static List<ShopOrder> findAll() {
        return ShopOrder.find.all();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Calendar getOrderDate() {
        return OrderDate;
    }

    public void setOrderDate(Calendar orderDate) {
        OrderDate = orderDate;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public void setItems(List<OrderItem> items) {
        this.items = items;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    } 
    public String getOrderDateToString(){
        if(getOrderDate() == null){
            return "no date available";
        }
        String s = new SimpleDateFormat("dd-MM-yyyy").format(OrderDate.getTime());
            return s;
        
    
    }
    public Boolean shouldCancel(){
        Calendar calendar1 = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        calendar1.set(2012, 2, 12, 02, 15, 02);
        calendar2.set(2012, 2, 12, 03, 15, 02);
        long miliSecondForDate1 = calendar1.getTimeInMillis();
        long miliSecondForDate2 = calendar2.getTimeInMillis();
        long diffInMilis = miliSecondForDate2 - miliSecondForDate1;
        long diffInSecond = diffInMilis / 1000;
        long diffInMinute = diffInMilis / (60 * 1000);
boolean b = false;
   if(diffInSecond>60){

    b  = false;

    //    return redirect(controllers.AdminProductCtrl.index());
    //    flash("error"," sorry it is to late to cancel this order");
   }
   if (diffInSecond<= 60) {
   b= true;
    //    flash("success", " your order has been cancelled");
    //    return redirect(controllers.AdminProductCtrl.index());
   }
   return b;
} 
}