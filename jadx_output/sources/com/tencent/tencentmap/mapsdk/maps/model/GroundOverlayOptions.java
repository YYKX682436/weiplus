package com.tencent.tencentmap.mapsdk.maps.model;

/* loaded from: classes13.dex */
public final class GroundOverlayOptions {
    public static android.graphics.Bitmap TRANSPARENT_PIXEL = android.graphics.Bitmap.createBitmap(new int[]{0}, 1, 1, android.graphics.Bitmap.Config.ARGB_8888);
    private com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds mLatLngBounds;
    private com.tencent.tencentmap.mapsdk.maps.model.LatLng mPosition;
    private int mZIndex;
    private com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor mBitmapDescriptor = com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptorFactory.fromBitmap(TRANSPARENT_PIXEL);
    private float mZoom = 18.0f;
    private float mAnchorU = 0.5f;
    private float mAnchorV = 0.5f;
    private float mAlpha = 1.0f;
    private boolean mVisibility = true;
    private int mLevel = 1;

    public final com.tencent.tencentmap.mapsdk.maps.model.GroundOverlayOptions alpha(float f17) {
        this.mAlpha = f17;
        return this;
    }

    public final com.tencent.tencentmap.mapsdk.maps.model.GroundOverlayOptions anchor(float f17, float f18) {
        this.mAnchorU = f17;
        this.mAnchorV = f18;
        return this;
    }

    public final com.tencent.tencentmap.mapsdk.maps.model.GroundOverlayOptions bitmap(com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor bitmapDescriptor) {
        this.mBitmapDescriptor = bitmapDescriptor;
        return this;
    }

    public final float getAlpha() {
        return this.mAlpha;
    }

    public final float getAnchorU() {
        return this.mAnchorU;
    }

    public final float getAnchorV() {
        return this.mAnchorV;
    }

    public final com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor getBitmap() {
        return this.mBitmapDescriptor;
    }

    public final com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds getLatLngBounds() {
        return this.mLatLngBounds;
    }

    public final int getLevel() {
        return this.mLevel;
    }

    public final com.tencent.tencentmap.mapsdk.maps.model.LatLng getPosition() {
        return this.mPosition;
    }

    public final int getZIndex() {
        return this.mZIndex;
    }

    public final float getZoom() {
        return this.mZoom;
    }

    public final boolean isVisible() {
        return this.mVisibility;
    }

    public final com.tencent.tencentmap.mapsdk.maps.model.GroundOverlayOptions latLngBounds(com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds latLngBounds) {
        this.mLatLngBounds = latLngBounds;
        return this;
    }

    public final com.tencent.tencentmap.mapsdk.maps.model.GroundOverlayOptions level(int i17) {
        if (i17 >= 0 && i17 <= 2) {
            this.mLevel = i17;
        }
        return this;
    }

    public final com.tencent.tencentmap.mapsdk.maps.model.GroundOverlayOptions position(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng) {
        this.mPosition = latLng;
        return this;
    }

    public final java.lang.String toString() {
        return "GroundOverlayOptions{mBitmapDescriptor=" + this.mBitmapDescriptor + ", mLatLngBounds=" + this.mLatLngBounds + ", mPosition=" + this.mPosition + ", mZoom=" + this.mZoom + ", mAnchorU=" + this.mAnchorU + ", mAnchorV=" + this.mAnchorV + ", mAlpha=" + this.mAlpha + ", mVisibility=" + this.mVisibility + ", mZIndex=" + this.mZIndex + ", mLevel=" + this.mLevel + '}';
    }

    public final com.tencent.tencentmap.mapsdk.maps.model.GroundOverlayOptions visible(boolean z17) {
        this.mVisibility = z17;
        return this;
    }

    public final com.tencent.tencentmap.mapsdk.maps.model.GroundOverlayOptions zIndex(int i17) {
        this.mZIndex = i17;
        return this;
    }

    public final com.tencent.tencentmap.mapsdk.maps.model.GroundOverlayOptions zoom(float f17) {
        this.mZoom = f17;
        return this;
    }
}
