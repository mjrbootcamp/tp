package com.tpfinal.DAO;

import com.tpfinal.utils.HibernateUtil;
import com.tpfinal.modelo.Cliente;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class ClienteDAO {

    SessionFactory sesionFactory = HibernateUtil.getSessionFactory();

    public void saveCliente(Cliente cliente) throws HibernateException {
        try {
            Session sesion = sesionFactory.getCurrentSession();
            sesion.beginTransaction();
            sesion.save(cliente);
            sesion.getTransaction().commit();
        } catch (HibernateException he) {
            HibernateUtil.handleException(he);
        }  
    }

    public void updateCliente(Cliente cliente) throws HibernateException {
        try {
            Session sesion = sesionFactory.getCurrentSession();
            sesion.beginTransaction();
            sesion.update(cliente);
            sesion.getTransaction().commit();
        } catch (HibernateException he) {
            HibernateUtil.handleException(he);
        }
    }

    public void deleteCliente(Cliente cliente) throws HibernateException, IllegalStateException {
        try {
            Session sesion = sesionFactory.getCurrentSession();
            sesion.beginTransaction();
            sesion.delete(cliente);
            sesion.getTransaction().commit();
        } catch (HibernateException he) {
            HibernateUtil.handleException(he);
        }
    }

    public Cliente getCliente(String dni) throws HibernateException {
        Cliente cli = new Cliente();
        try {
            Session sesion = sesionFactory.getCurrentSession();
            sesion.beginTransaction();
            cli = (Cliente) sesion.createQuery("from Cliente where DNI="+dni).uniqueResult();
            sesion.close();
        }catch (HibernateException he) {
            HibernateUtil.handleException(he);
        }
        return cli;
    }

    @SuppressWarnings("unchecked")
    public ArrayList<Cliente> getListaCliente() throws HibernateException {
        ArrayList<Cliente> listaCliente = new ArrayList<Cliente>();
        try {
            Session sesion = sesionFactory.getCurrentSession();
            sesion.beginTransaction();
            listaCliente = (ArrayList<Cliente>) sesion.createQuery("from Cliente").list();
            sesion.close();
        }catch (HibernateException he){
            HibernateUtil.handleException(he);
        }
        return listaCliente;
    }

    public void deleteClienteByDNI(String dni) {
        try {
            Session sesion = sesionFactory.getCurrentSession();
            sesion.beginTransaction();
            Cliente cliente = (Cliente) sesion.createQuery("from Cliente where dni="+ dni).uniqueResult();
            sesion.delete(cliente);
            sesion.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Datos borrados correctamente");
        } catch (HibernateException he) {
            HibernateUtil.handleException(he);
        }
    }
}