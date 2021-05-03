package interfaceAbstractDemo;

import java.sql.Date;

import Adapter.MernisServiceAdapter;
import interfaceAbstractDemo.Abstract.BaseCustomerManager;
import interfaceAbstractDemo.Concrete.CustomerCheckManager;
import interfaceAbstractDemo.Concrete.NeroCustomerManager;
import interfaceAbstractDemo.Concrete.StarbucksCustomerManager;
import interfaceAbstractDemo.Entities.Customer;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager=new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.save(new Customer(new Date(1993,9,21),"Yunus","Yanýk","12345678901"));
		
	}

}
