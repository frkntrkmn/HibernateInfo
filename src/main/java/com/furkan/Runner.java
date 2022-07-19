package com.furkan;


import com.furkan.repository.CustomerRepository;
import com.furkan.repository.entity.Customer;
import com.furkan.utility.HibernateUtility;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Runner {
    public static void main(String[] args) {
        CustomerRepository customerRepository = new CustomerRepository();
        /*customerRepository.save(new Customer("aşkın","gazili","trabzon"));
        customerRepository.save(new Customer("dolunay","kamel","ankara"));
        customerRepository.save(new Customer("malik","cansever","çorum"));
        customerRepository.save(new Customer("ali","karakum","izmir")); */

        /**
         * createCriteria için new customer diyorum çünkü
         * T dedigim şey bir nesne ve ben List ile nesne .çevirmiyorum
         * findall metoduna boş bir müşteri nesnesi vermek.
         */
        for (Customer cstmr: customerRepository.findAll(new Customer())){
            System.out.println("musteri id...:"+cstmr.getId());
            System.out.println("musteri ad...:"+cstmr.getName());
            System.out.println("musteri syad...:"+cstmr.getSurname());
            System.out.println("musteri adres...:"+cstmr.getAdress());
            System.out.println("musteriii:"+cstmr.getClass());
            System.out.println("********************");
            System.out.println("********************");


        }


    }


   /* public static void saveHibernate(){
        repository de method içlerinde session ve transaction işlemleri yapıldı.
        Session session= HibernateUtility.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Customer customer = new Customer("furkan","turkmen","ankara");
        session.save(customer);
        transaction.commit();
        session.close();
    }*/
}
