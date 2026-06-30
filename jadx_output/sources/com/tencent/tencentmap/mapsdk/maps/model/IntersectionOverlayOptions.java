package com.tencent.tencentmap.mapsdk.maps.model;

/* loaded from: classes13.dex */
public final class IntersectionOverlayOptions {
    private android.graphics.Rect mBounds;
    private byte[] mData;
    private java.lang.String mDayStyleFilePath;
    private int mDistance;
    private java.lang.String mNightStyleFilePath;
    private boolean mVisibility = true;
    private boolean mDarkMode = false;
    private boolean mRoundedCorner = false;

    public final com.tencent.tencentmap.mapsdk.maps.model.IntersectionOverlayOptions bounds(android.graphics.Rect rect) {
        this.mBounds = rect;
        return this;
    }

    public final com.tencent.tencentmap.mapsdk.maps.model.IntersectionOverlayOptions darkMode(boolean z17) {
        this.mDarkMode = z17;
        return this;
    }

    public final com.tencent.tencentmap.mapsdk.maps.model.IntersectionOverlayOptions data(byte[] bArr) {
        this.mData = bArr;
        return this;
    }

    public final com.tencent.tencentmap.mapsdk.maps.model.IntersectionOverlayOptions distance(int i17) {
        this.mDistance = i17;
        return this;
    }

    public final android.graphics.Rect getBounds() {
        return this.mBounds;
    }

    public final byte[] getData() {
        return this.mData;
    }

    public final java.lang.String getDayStyleFilePath() {
        return this.mDayStyleFilePath;
    }

    public final int getDistance() {
        return this.mDistance;
    }

    public final java.lang.String getNightStyleFilePath() {
        return this.mNightStyleFilePath;
    }

    public final boolean isDarkMode() {
        return this.mDarkMode;
    }

    public final boolean isRoundedCorner() {
        return this.mRoundedCorner;
    }

    public final boolean isVisibility() {
        return this.mVisibility;
    }

    public final com.tencent.tencentmap.mapsdk.maps.model.IntersectionOverlayOptions roundedCorner(boolean z17) {
        this.mRoundedCorner = z17;
        return this;
    }

    public final com.tencent.tencentmap.mapsdk.maps.model.IntersectionOverlayOptions setDayStyleFilePath(java.lang.String str) {
        this.mDayStyleFilePath = str;
        return this;
    }

    public final com.tencent.tencentmap.mapsdk.maps.model.IntersectionOverlayOptions setNightStyleFilePath(java.lang.String str) {
        this.mNightStyleFilePath = str;
        return this;
    }

    public final com.tencent.tencentmap.mapsdk.maps.model.IntersectionOverlayOptions visibility(boolean z17) {
        this.mVisibility = z17;
        return this;
    }
}
