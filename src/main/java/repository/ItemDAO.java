package repository;

import model.Item;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


/**
 * Created by oleg on 03.06.2019.
 */
public class ItemDAO {

    private SessionFactory sessionFactory;

    private SessionFactory createSessionFactory() {
//todo

            if (sessionFactory == null) {
                sessionFactory = new Configuration().configure().buildSessionFactory();
            }
            return sessionFactory;
        }


    public Item save(Item item) {
        Session session = null;
        Transaction tr = null;
        try {
            session = createSessionFactory().openSession();
            tr = session.getTransaction();
            tr.begin();

            session.save(item);

            tr.commit();
            System.out.println("Item saved");
        } catch (HibernateException e) {
            if (tr != null) {
                tr.rollback();
            }
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return null;
    }
}
