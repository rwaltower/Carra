/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scheduler;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Ayomitunde
 */
public class Event implements Serializable{
    
    private String _eventName;
    private Date _eventDate;
    private String _eventTime;
    private User _eventCreator;
    private boolean _rescheduled;
    
    public Event(String eventName, Date date, String time, User user){
        this._eventName = eventName;
        this._eventDate = date;
        this._eventTime = time;
        this._eventCreator = user;
        this._rescheduled = false;
    }
    
    public void setDate(Date date){
        this._eventDate = date;
    }
    
    public void setTime(String time){
        this._eventTime = time;
    }
    
    public void setCreator(User user){
        this._eventCreator = user;
    }
    
    public void setEventName(String name){
        this._eventName = name;
    }
    public void setRescheduled(){
        this._rescheduled = true;
    }
    public Date getEventDate(){
        return this._eventDate;
    }
    
    public String getEventTime(){
        return this._eventTime;
    }
    
    public String getEventName(){
        return this._eventName;
    }
    
    public User getEventCreator(){
        return this._eventCreator;
    }
    
    public boolean isRescheduled(){
        return this._rescheduled;
    }
}
