package com.tencent.tencentmap.mapsdk.maps.model;

/* loaded from: classes13.dex */
public interface Marker extends com.tencent.tencentmap.mapsdk.maps.interfaces.Accessible, com.tencent.tencentmap.mapsdk.maps.interfaces.Alphable, com.tencent.tencentmap.mapsdk.maps.interfaces.Anchorable, com.tencent.tencentmap.mapsdk.maps.interfaces.Animationable, com.tencent.tencentmap.mapsdk.maps.interfaces.Clickable, com.tencent.tencentmap.mapsdk.maps.interfaces.Collisionable, com.tencent.tencentmap.mapsdk.maps.interfaces.Draggable, com.tencent.tencentmap.mapsdk.maps.interfaces.Levelable, com.tencent.tencentmap.mapsdk.maps.interfaces.Removable, com.tencent.tencentmap.mapsdk.maps.interfaces.Rotatable, com.tencent.tencentmap.mapsdk.maps.interfaces.Scalable, com.tencent.tencentmap.mapsdk.maps.interfaces.Tagable<java.lang.Object>, com.tencent.tencentmap.mapsdk.maps.interfaces.Visible, com.tencent.tencentmap.mapsdk.maps.model.IOverlay {
    com.tencent.tencentmap.mapsdk.maps.model.MarkerCollisionRelationUnit addCollisionUnit(com.tencent.tencentmap.mapsdk.maps.model.MarkerOptions markerOptions);

    int getHeight(android.content.Context context);

    com.tencent.tencentmap.mapsdk.maps.model.MarkerType getMarkerType();

    com.tencent.tencentmap.mapsdk.maps.model.MarkerOptions getOptions();

    com.tencent.tencentmap.mapsdk.maps.model.LatLng getPosition();

    java.lang.String getSnippet();

    java.lang.String getText();

    com.tencent.tencentmap.mapsdk.maps.model.MarkerTextStyle getTextStyle();

    java.lang.String getTitle();

    int getWidth(android.content.Context context);

    void hideInfoWindow();

    boolean isFastLoad();

    boolean isInfoWindowEnable();

    boolean isInfoWindowShown();

    void refreshInfoWindow();

    void removeCollisionUnit(com.tencent.tencentmap.mapsdk.maps.model.MarkerCollisionRelationUnit markerCollisionRelationUnit);

    void setFastLoad(boolean z17);

    void setFixingPoint(int i17, int i18);

    void setFixingPointEnable(boolean z17);

    void setIcon(com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor bitmapDescriptor);

    void setIconLooper(com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor bitmapDescriptor, boolean z17, int i17);

    void setInfoWindowAnchor(float f17, float f18);

    void setInfoWindowEnable(boolean z17);

    void setInfoWindowOffset(int i17, int i18);

    void setOnTop();

    void setPosition(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng);

    void setSnippet(java.lang.String str);

    void setText(java.lang.String str);

    void setTextStyle(com.tencent.tencentmap.mapsdk.maps.model.MarkerTextStyle markerTextStyle);

    void setTitle(java.lang.String str);

    void showInfoWindow();
}
