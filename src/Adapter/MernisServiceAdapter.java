package Adapter;

import java.rmi.RemoteException;

import interfaceAbstractDemo.Abstract.ICustomerCheckService;
import interfaceAbstractDemo.Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements ICustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		
		KPSPublicSoap client=new KPSPublicSoapProxy();
		boolean result=false;
		try {
			
			result=client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()), customer.getFirstName(), customer.getLastName(), customer.getDateOfBirth().getYear());
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return result;
	}

}
