package com.tencent.tencentmap.mapsdk.maps.model;

/* loaded from: classes13.dex */
public interface IAnimatorModel {

    /* loaded from: classes13.dex */
    public interface IAnimatorEndListener {
        void onAnimatorEnd();
    }

    float getRotation();

    void setPosition(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng);

    void setRotation(float f17);
}
