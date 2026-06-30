package com.tencent.tencentmap.mapsdk.maps.model;

/* loaded from: classes13.dex */
public class BubbleOptions {
    private java.lang.String mContent;
    private android.view.View mContentView;
    private com.tencent.tencentmap.mapsdk.maps.model.Marker mMarker;
    private com.tencent.tencentmap.mapsdk.maps.model.LatLng mPosition;
    private int mMarkerWidth = 0;
    private int mMarkerHeight = 0;
    private float mMarkerAnchorU = 0.5f;
    private float mMarkerAnchorV = 0.5f;
    private int mDisplayLevel = 0;
    private android.graphics.drawable.Drawable[] mBackground = null;
    private boolean mOnTapHidden = false;

    public com.tencent.tencentmap.mapsdk.maps.model.BubbleOptions background(android.graphics.drawable.Drawable[] drawableArr) {
        this.mBackground = drawableArr;
        return this;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.BubbleOptions content(java.lang.String str) {
        this.mContent = str;
        return this;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.BubbleOptions contentView(android.view.View view) {
        this.mContentView = view;
        return this;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.BubbleOptions displayLevel(int i17) {
        if (i17 < 0) {
            i17 = 0;
        }
        this.mDisplayLevel = i17;
        return this;
    }

    public android.graphics.drawable.Drawable[] getBackground() {
        return this.mBackground;
    }

    public java.lang.String getContent() {
        return this.mContent;
    }

    public android.view.View getContentView() {
        return this.mContentView;
    }

    public int getDisplayLevel() {
        return this.mDisplayLevel;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.Marker getMarker() {
        return this.mMarker;
    }

    public float getMarkerAnchorU() {
        return this.mMarkerAnchorU;
    }

    public float getMarkerAnchorV() {
        return this.mMarkerAnchorV;
    }

    public int getMarkerHeight() {
        return this.mMarkerHeight;
    }

    public int getMarkerWidth() {
        return this.mMarkerWidth;
    }

    public boolean getOnTapHidden() {
        return this.mOnTapHidden;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.LatLng getPosition() {
        return this.mPosition;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.BubbleOptions marker(com.tencent.tencentmap.mapsdk.maps.model.Marker marker) {
        this.mMarker = marker;
        position(marker.getPosition());
        markerAnchor(marker.getAnchorU(), marker.getAnchorV());
        return this;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.BubbleOptions markerAnchor(float f17, float f18) {
        this.mMarkerAnchorU = f17;
        this.mMarkerAnchorV = f18;
        return this;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.BubbleOptions markerSize(int i17, int i18) {
        this.mMarkerWidth = i17;
        this.mMarkerHeight = i18;
        return this;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.BubbleOptions position(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng) {
        this.mPosition = latLng;
        return this;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.BubbleOptions setOnTapHidden(boolean z17) {
        this.mOnTapHidden = z17;
        return this;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.BubbleOptions background(android.graphics.Bitmap[] bitmapArr) {
        if (bitmapArr != null) {
            this.mBackground = new android.graphics.drawable.Drawable[4];
            int length = bitmapArr.length;
            for (int i17 = 0; i17 < length; i17++) {
                this.mBackground[i17] = new android.graphics.drawable.BitmapDrawable(bitmapArr[i17]);
            }
        }
        return this;
    }
}
