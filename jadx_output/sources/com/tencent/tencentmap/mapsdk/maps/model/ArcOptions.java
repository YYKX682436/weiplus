package com.tencent.tencentmap.mapsdk.maps.model;

/* loaded from: classes13.dex */
public final class ArcOptions {
    com.tencent.tencentmap.mapsdk.maps.model.LatLng mEndLatLng;
    com.tencent.tencentmap.mapsdk.maps.model.LatLng mPassLatLng;
    boolean mShowArrow;
    com.tencent.tencentmap.mapsdk.maps.model.LatLng mStartLatLng;
    int mStrokeColor;
    float mAngle = 0.0f;
    float mWidth = 5.0f;
    float mStrokeWidth = 0.0f;
    int mColor = -16777216;

    public final com.tencent.tencentmap.mapsdk.maps.model.ArcOptions angle(float f17) {
        this.mAngle = f17;
        return this;
    }

    public final com.tencent.tencentmap.mapsdk.maps.model.ArcOptions color(int i17) {
        this.mColor = i17;
        return this;
    }

    public final float getAngle() {
        return this.mAngle;
    }

    public final int getColor() {
        return this.mColor;
    }

    public final com.tencent.tencentmap.mapsdk.maps.model.LatLng getEndLatLng() {
        return this.mEndLatLng;
    }

    public final com.tencent.tencentmap.mapsdk.maps.model.LatLng getPassLatLng() {
        return this.mPassLatLng;
    }

    public final com.tencent.tencentmap.mapsdk.maps.model.LatLng getStartLatLng() {
        return this.mStartLatLng;
    }

    public final int getStrokeColor() {
        return this.mStrokeColor;
    }

    public final float getStrokeWidth() {
        return this.mStrokeWidth;
    }

    public final float getWidth() {
        return this.mWidth;
    }

    public final boolean isShowArrow() {
        return this.mShowArrow;
    }

    public final com.tencent.tencentmap.mapsdk.maps.model.ArcOptions pass(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng) {
        this.mPassLatLng = latLng;
        return this;
    }

    public final com.tencent.tencentmap.mapsdk.maps.model.ArcOptions points(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng, com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng2) {
        this.mStartLatLng = latLng;
        this.mEndLatLng = latLng2;
        return this;
    }

    public final com.tencent.tencentmap.mapsdk.maps.model.ArcOptions showArrow(boolean z17) {
        this.mShowArrow = z17;
        return this;
    }

    public final com.tencent.tencentmap.mapsdk.maps.model.ArcOptions strokeColor(int i17) {
        this.mStrokeColor = i17;
        return this;
    }

    public final com.tencent.tencentmap.mapsdk.maps.model.ArcOptions strokeWidth(float f17) {
        this.mStrokeWidth = f17;
        return this;
    }

    public final java.lang.String toString() {
        return "ArcOptions{mStartLatLng=" + this.mStartLatLng + ", mPassLatLng=" + this.mPassLatLng + ", mEndLatLng=" + this.mEndLatLng + ", mAngle=" + this.mAngle + ", mWidth=" + this.mWidth + ", mStrokeWidth=" + this.mStrokeWidth + ", mStrokeColor=" + this.mStrokeColor + ", mColor=" + this.mColor + ", mShowArrow=" + this.mShowArrow + '}';
    }

    public final com.tencent.tencentmap.mapsdk.maps.model.ArcOptions width(float f17) {
        this.mWidth = f17;
        return this;
    }
}
