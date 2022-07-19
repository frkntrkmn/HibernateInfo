package com.furkan.utility;

import com.furkan.repository.entity.Customer;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import java.util.List;

// java Generic types
public class VTIsletimcisi<T> {
    private Session session;
    private Transaction transaction;
    private void openCommit(){
        session= HibernateUtility.getSessionFactory().openSession();
        transaction=session.beginTransaction();
    }
    private void closeCommit(){
        transaction.commit();
        session.close();
    }
    private void closeRollBack(){
        transaction.rollback();
        session.close();

    }

    public void save (T t){
        try {
            openCommit();
            session.save(t);
            closeCommit();
        }
        catch (Exception exception){
            closeRollBack();
        }
    }
    public void update (T t){
        try {
            openCommit();
            session.update(t);
            closeCommit();
        } catch (Exception exception){
            closeRollBack();
        }
    }
    public void delete (T t){
        try {
            openCommit();
            session.delete(t);
            closeCommit();
        } catch (Exception exception){
            closeRollBack();
        }

    }
    public List<T> findAll(T t){
        List<T> findall=null;
        openCommit();
        Criteria cr=session.createCriteria(t.getClass());
        findall=cr.list();
        closeCommit();
        return findall;
    }

    public T findById(long id, T t){
        T result=null;
        openCommit();
        Criteria cr =session.createCriteria(t.getClass());
        cr.add(Restrictions.eq("id",id));
        if(cr.list().size()>0){
            result=(T) cr.list().get(0);
        }
        else {
            System.out.println("yanlis");
        }
        return result;
    }
}
