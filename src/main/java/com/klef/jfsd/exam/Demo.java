package com.klef.jfsd.exam;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class Demo {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        // Insert Device
        Device device = new Device();
        device.setBrand("Generic Brand");
        device.setModel("Device123");
        device.setPrice(1000);
        session.save(device);

        // Insert Smartphone
        Smartphone smartphone = new Smartphone();
        smartphone.setBrand("Apple");
        smartphone.setModel("iPhone 14");
        smartphone.setPrice(1200);
        smartphone.setOperatingSystem("iOS");
        smartphone.setCameraResolution("48 MP");
        session.save(smartphone);

        // Insert Tablet
        Tablet tablet = new Tablet();
        tablet.setBrand("Samsung");
        tablet.setModel("Galaxy Tab S8");
        tablet.setPrice(900);
        tablet.setScreenSize("11 inches");
        tablet.setBatteryLife(12);
        session.save(tablet);

        transaction.commit();
        session.close();

        System.out.println("Records inserted successfully!");
    }
}
