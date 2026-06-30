package com.tencent.tencentmap.mapsdk.maps.model;

/* loaded from: classes13.dex */
public class CircleOptions {
    private boolean boVisible;
    private com.tencent.tencentmap.mapsdk.maps.model.CircleOptions.CircleBorderType borderType;
    private double dRadius;
    private float fStrokeWidth;
    private int iFillColor;
    private int iLevel;
    private int iStrokeColor;
    private int iZindex;
    private com.tencent.tencentmap.mapsdk.maps.model.LatLng latlngCenter;
    private boolean mClickable;
    private java.util.List<java.lang.Integer> pattern;

    /* loaded from: classes6.dex */
    public enum CircleBorderType {
        REALLINE_DEFAULT,
        DOTTEDLINE_SQUARE,
        DOTTEDLINE_CIRCLE
    }

    public CircleOptions() {
        this.iLevel = 2;
        this.latlngCenter = new com.tencent.tencentmap.mapsdk.maps.model.LatLng(39.984253d, 116.307439d);
        this.dRadius = 1.0d;
        this.fStrokeWidth = 1.0f;
        this.iStrokeColor = -16777216;
        this.iFillColor = 0;
        this.iZindex = 0;
        this.boVisible = true;
        this.borderType = com.tencent.tencentmap.mapsdk.maps.model.CircleOptions.CircleBorderType.REALLINE_DEFAULT;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.CircleOptions borderType(com.tencent.tencentmap.mapsdk.maps.model.CircleOptions.CircleBorderType circleBorderType) {
        this.borderType = circleBorderType;
        return this;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.CircleOptions center(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng) {
        this.latlngCenter = latLng;
        return this;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.CircleOptions clickable(boolean z17) {
        this.mClickable = z17;
        return this;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.CircleOptions fillColor(int i17) {
        this.iFillColor = i17;
        return this;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.CircleOptions.CircleBorderType getBorderType() {
        return this.borderType;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.LatLng getCenter() {
        return this.latlngCenter;
    }

    public int getFillColor() {
        return this.iFillColor;
    }

    public int getLevel() {
        return this.iLevel;
    }

    public java.util.List<java.lang.Integer> getPattern() {
        return this.pattern;
    }

    public double getRadius() {
        return this.dRadius;
    }

    public int getStrokeColor() {
        return this.iStrokeColor;
    }

    public float getStrokeWidth() {
        return this.fStrokeWidth;
    }

    public int getZIndex() {
        return this.iZindex;
    }

    public boolean isClickable() {
        return this.mClickable;
    }

    public boolean isVisible() {
        return this.boVisible;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.CircleOptions level(int i17) {
        if (i17 >= 0 && i17 <= 2) {
            this.iLevel = i17;
        }
        return this;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.CircleOptions pattern(java.util.List<java.lang.Integer> list) {
        if (list != null && list.size() == 2) {
            this.pattern = list;
        }
        return this;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.CircleOptions radius(double d17) {
        this.dRadius = d17;
        return this;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.CircleOptions strokeColor(int i17) {
        this.iStrokeColor = i17;
        return this;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.CircleOptions strokeWidth(float f17) {
        if (f17 < 0.0f) {
            this.fStrokeWidth = 1.0f;
        } else {
            this.fStrokeWidth = f17;
        }
        return this;
    }

    public java.lang.String toString() {
        return "CircleOptions{latlngCenter=" + this.latlngCenter + ", dRadius=" + this.dRadius + ", fStrokeWidth=" + this.fStrokeWidth + ", iStrokeColor=" + this.iStrokeColor + ", iFillColor=" + this.iFillColor + ", iZindex=" + this.iZindex + ", boVisible=" + this.boVisible + ", mClickable=" + this.mClickable + ", pattern=" + this.pattern + ", borderType=" + this.borderType + ", iLevel=" + this.iLevel + '}';
    }

    public com.tencent.tencentmap.mapsdk.maps.model.CircleOptions visible(boolean z17) {
        this.boVisible = z17;
        return this;
    }

    public void writeToParcel(android.os.Parcel parcel, int i17) {
        if (parcel == null) {
            return;
        }
        parcel.writeDouble(this.dRadius);
    }

    public com.tencent.tencentmap.mapsdk.maps.model.CircleOptions zIndex(int i17) {
        this.iZindex = i17;
        return this;
    }

    public CircleOptions(int i17, com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng, double d17, float f17, int i18, int i19, int i27, boolean z17) {
        this.iLevel = 2;
        new com.tencent.tencentmap.mapsdk.maps.model.LatLng(39.984253d, 116.307439d);
        this.latlngCenter = latLng;
        this.dRadius = d17;
        this.fStrokeWidth = f17;
        this.iStrokeColor = i18;
        this.iFillColor = i19;
        this.iZindex = i27;
        this.boVisible = z17;
    }
}
