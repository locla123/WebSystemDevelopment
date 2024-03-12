/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.lhl.hibernatedemo;

import com.lhl.pojo.Category;
import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;

/**
 *
 * @author lahon
 */
public class HibernateDemo {

    public static void main(String[] args) {
        try (Session s = HibernateUtils.getFactory().openSession()) {
            Query q = s.createQuery("FROM Category");
            List<Category> cates = q.getResultList();
            cates.forEach(c -> System.out.printf("%d - %s\n", c.getId(), c.getName()));
        }
    }
}
