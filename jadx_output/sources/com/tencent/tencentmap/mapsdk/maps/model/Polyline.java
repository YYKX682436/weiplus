package com.tencent.tencentmap.mapsdk.maps.model;

/* loaded from: classes13.dex */
public interface Polyline extends com.tencent.tencentmap.mapsdk.maps.interfaces.Animationable, com.tencent.tencentmap.mapsdk.maps.interfaces.Clickable, com.tencent.tencentmap.mapsdk.maps.interfaces.Levelable, com.tencent.tencentmap.mapsdk.maps.interfaces.Removable, com.tencent.tencentmap.mapsdk.maps.interfaces.Tagable<java.lang.Object>, com.tencent.tencentmap.mapsdk.maps.interfaces.Visible, com.tencent.tencentmap.mapsdk.maps.model.IOverlay {

    @java.lang.Deprecated
    public static final int DARK_BLUE = 6;

    @java.lang.Deprecated
    public static final int DASHED = 33;

    @java.lang.Deprecated
    public static final int GREEN = 4;

    @java.lang.Deprecated
    public static final int GREY = 0;

    @java.lang.Deprecated
    public static final int LIGHT_BLUE = 1;

    @java.lang.Deprecated
    public static final int RED = 2;

    @java.lang.Deprecated
    public static final int WHITE_BLUE = 19;

    @java.lang.Deprecated
    public static final int YELLOW = 3;

    void addTurnArrow(int i17, int i18);

    void appendPoint(com.tencent.tencentmap.mapsdk.maps.model.LatLng... latLngArr);

    void appendPoints(java.util.List<com.tencent.tencentmap.mapsdk.maps.model.LatLng> list);

    void arrowSpacing(int i17);

    void cleanTurnArrow();

    void eraseColor(int i17);

    void eraseTo(int i17, com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng);

    int getColor();

    int[][] getColors();

    java.util.List<java.lang.Integer> getPattern();

    java.util.List<com.tencent.tencentmap.mapsdk.maps.model.LatLng> getPoints();

    com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions getPolylineOptions();

    com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions.Text getText();

    android.graphics.Rect getVisibleRect();

    float getWidth();

    boolean isAboveMaskLayer();

    boolean isGradientEnable();

    void pattern(java.util.List<java.lang.Integer> list);

    void setAboveMaskLayer(boolean z17);

    void setArrow(boolean z17);

    void setBorderColors(int[] iArr);

    void setColor(int i17);

    void setColorTexture(com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor bitmapDescriptor);

    void setColorTexture(java.lang.String str);

    void setColors(int[] iArr, int[] iArr2);

    void setEraseable(boolean z17);

    void setGradientEnable(boolean z17);

    void setPoints(java.util.List<com.tencent.tencentmap.mapsdk.maps.model.LatLng> list);

    void setPolylineOptions(com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions polylineOptions);

    void setText(com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions.Text text);

    void setWidth(float f17);

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Animationable
    void startAnimation(com.tencent.tencentmap.mapsdk.maps.model.Animation animation);
}
