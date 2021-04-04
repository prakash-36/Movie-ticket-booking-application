/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movieticket;

import javafx.beans.property.SimpleFloatProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author ELCOT
 */
public class Show
{
    private final SimpleFloatProperty rating;
    private final SimpleStringProperty datecol,timecol,movienamecol,thetercol,typecol;

    public Show(String datecol, String timecol, String movienamecol, String thetercol, String typecol,float rating) {
        super();
    this.datecol = new SimpleStringProperty(datecol);
    this.timecol = new SimpleStringProperty(timecol);
    this.movienamecol = new SimpleStringProperty(movienamecol);
    this.thetercol = new SimpleStringProperty(thetercol);
    this.typecol = new SimpleStringProperty(typecol);
    this.rating = new SimpleFloatProperty(rating);
    }   

    public float getRating() {
        return rating.get();
    }

    public String getDatecol() {
        return datecol.get();
    }

    public String getTimecol() {
        return timecol.get();
    }

    public String getMovienamecol() {
        return movienamecol.get();
    }

    public String getThetercol() {
        return thetercol.get();
    }

    public String getTypecol() {
        return typecol.get();
    }
    
        
 }
