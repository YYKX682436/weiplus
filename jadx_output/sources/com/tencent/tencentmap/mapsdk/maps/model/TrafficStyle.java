package com.tencent.tencentmap.mapsdk.maps.model;

/* loaded from: classes3.dex */
public class TrafficStyle {
    private int mWidth = 3;
    private int mStrokeWidth = 0;
    private int mSmoothColor = -16722688;
    private int mSlowColor = -16128;
    private int mCongestedColor = -46250;
    private int mSeriousCongestedColor = -7300827;
    private int mSmoothStrokeColor = -16722688;
    private int mSlowStrokeColor = -16128;
    private int mCongestedStrokeColor = -46250;
    private int mSeriousCongestedStrokeColor = -7300827;

    public com.tencent.tencentmap.mapsdk.maps.model.TrafficStyle setCongestedColor(int i17) {
        this.mCongestedColor = i17;
        return this;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.TrafficStyle setCongestedStrokeColor(int i17) {
        this.mCongestedStrokeColor = i17;
        return this;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.TrafficStyle setSeriousCongestedColor(int i17) {
        this.mSeriousCongestedColor = i17;
        return this;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.TrafficStyle setSeriousCongestedStrokeColor(int i17) {
        this.mSeriousCongestedStrokeColor = i17;
        return this;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.TrafficStyle setSlowColor(int i17) {
        this.mSlowColor = i17;
        return this;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.TrafficStyle setSlowStrokeColor(int i17) {
        this.mSlowStrokeColor = i17;
        return this;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.TrafficStyle setSmoothColor(int i17) {
        this.mSmoothColor = i17;
        return this;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.TrafficStyle setSmoothStrokeColor(int i17) {
        this.mSmoothStrokeColor = i17;
        return this;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.TrafficStyle setStrokeWidth(int i17) {
        this.mStrokeWidth = i17;
        return this;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.TrafficStyle setWidth(int i17) {
        this.mWidth = i17;
        return this;
    }

    public java.lang.String toString() {
        return "TrafficStyle{mWidth=" + this.mWidth + ", mStrokeWidth=" + this.mStrokeWidth + ", mSmoothColor=" + this.mSmoothColor + ", mSlowColor=" + this.mSlowColor + ", mCongestedColor=" + this.mCongestedColor + ", mSeriousCongestedColor=" + this.mSeriousCongestedColor + ", mSmoothStrokeColor=" + this.mSmoothStrokeColor + ", mSlowStrokeColor=" + this.mSlowStrokeColor + ", mCongestedStrokeColor=" + this.mCongestedStrokeColor + ", mSeriousCongestedStrokeColor=" + this.mSeriousCongestedStrokeColor + '}';
    }
}
