package org.example;

import database.Connexion;
import entities.*;
import services.*;

import java.sql.*;
import java.sql.Date;
import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
    Connexion cnx = new Connexion();
        System.out.println(cnx);

        ClubDAO clubService = new ClubDAO();
        StadiumDAO sDAO = new StadiumDAO();
        ReservationDAO rDAO = new ReservationDAO();

        int userId = 4; // Assuming user ID 1 is the owner
        Date currentDate = new Date(Calendar.getInstance().getTime().getTime());

        // Create a new club
       Club newClub = new Club();
        User u1 = new User();
        u1.setId(userId);
        newClub.setUser(u1); // Set the user ID
        //newClub.setLocation("Location");
        newClub.setName("Clyubyj");
        newClub.setStartTime(new Time(10,00,00));
        newClub.setEndTime(new Time(15,00,00));
        newClub.setDescription("sdfsvssv");
        newClub.setStadiumNbr(0);
        newClub.setHeight(14f);
        newClub.setWidth(12f);

        Stadium newStadium = new Stadium();
        newStadium.setReference("CLY317");
        newStadium.setHeight(15.5f);
        newStadium.setWidth(2.3f);
        newStadium.setPrice(10);
        newStadium.setRate(1);
        Club club = new Club(); // Assuming you have a Club class
        club.setId(12);
        club.setName("Clyubyj");// Assuming the ID of the club is 1
        newStadium.setClub(club);
        //System.out.println(clubService.save(newClub));
        //sDAO.save(newStadium);


        //System.out.println(clubService.findByRef("CLU18"));

        List<Stadium> c = new ArrayList<Stadium>();
        //System.out.println(clubService.findByUser(5));
        System.out.println(clubService.findById(18));

        ImageDAO id = new ImageDAO();
        ImageStadiumDAO is = new ImageStadiumDAO();

       //System.out.println(id.findByObjectId(17,"club"));
        c=sDAO.findAllByClub(18);
        Stadium s1 = sDAO.findById("CSS135");
        System.out.println(s1);
        s1.setRate(6);
        //sDAO.update(s1);
        //System.out.println(s1);

        //System.out.println(c);
       // System.out.println(is.findByIDStadium("CSS135","stadium"));

        Reservation r = new Reservation(u1,newStadium,Date.valueOf("2001-04-04"),new Time(14,30,00),new Time(15,30,00),"assigned");

        //rDAO.delete(1);
       // System.out.println(rDAO.findAllByDate(Date.valueOf("2001-04-04")));








    }
}