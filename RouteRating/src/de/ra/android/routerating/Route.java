package de.ra.android.routerating;

import java.util.Date;

// This class represents a climbing route with all necessary information
public class Route {

    private String mName;

    private String mSetter;

    private String mColor;

    private int mDiff;

    private Date mDate;

    private boolean mDone;

    // TODO: mID... wird eine ID benötigt oder reicht der Name zur identifizierung?

    public Route()
    {
        // mName, mSetter, mColor, etc. werden durch den Controller aus dem View geholt
    }

    public String getName()
    {
        return mName;
    }

    public void setName(String name)
    {
        this.mName = name;
    }

    public String getSetter()
    {
        return mSetter;
    }

    public void setSetter(String setter)
    {
        this.mSetter = setter;
    }

    public String getColor()
    {
        return mColor;
    }

    public void setColor(String color)
    {
        this.mColor = color;
    }

    public int getDiff()
    {
        return mDiff;
    }

    public void setDiff(int diff)
    {
        this.mDiff = diff;
    }

    public Date getDate()
    {
        return mDate;
    }

    public void setDate(Date date)
    {
        this.mDate = date;
    }

    public boolean isDone()
    {
        return mDone;
    }

    public void setDone(boolean done)
    {
        mDone = done;
    }
}
