package com.example.tarsbir.tourguide;

public class ListItem {
    private int mImageId;
    private String mNameId;

    public ListItem(int mImageId, String mNameId) {
        this.mImageId = mImageId;
        this.mNameId = mNameId;
    }

    public int getImageRes() {
        return mImageId;
    }


    public String getNameRes() {
        return mNameId;
    }

}
