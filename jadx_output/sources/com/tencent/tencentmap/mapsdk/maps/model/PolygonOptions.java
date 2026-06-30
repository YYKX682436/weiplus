package com.tencent.tencentmap.mapsdk.maps.model;

/* loaded from: classes13.dex */
public class PolygonOptions {
    private static final int COLOR_DEFAULT_POLYGON = android.graphics.Color.argb(200, 0, 163, 255);
    private java.util.List<java.lang.Integer> pattern;
    private com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor texture;
    private int textureSpacing;
    private int iLevel = 2;
    private float fStrokeWidth = 1.0f;
    private int iStrokeColor = -16777216;
    private boolean mClickable = true;
    private int iFillColor = COLOR_DEFAULT_POLYGON;
    private int iZindex = 0;
    private boolean boIsVisble = true;
    private final java.util.List<com.tencent.tencentmap.mapsdk.maps.model.LatLng> listPts = new java.util.ArrayList();
    private final java.util.List<java.util.List<com.tencent.tencentmap.mapsdk.maps.model.LatLng>> holePts = new java.util.ArrayList();

    public com.tencent.tencentmap.mapsdk.maps.model.PolygonOptions add(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng) {
        if (latLng != null) {
            this.listPts.add(latLng);
        }
        return this;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.PolygonOptions addAll(java.lang.Iterable<com.tencent.tencentmap.mapsdk.maps.model.LatLng> iterable) {
        if (iterable != null) {
            java.util.Iterator<com.tencent.tencentmap.mapsdk.maps.model.LatLng> it = iterable.iterator();
            while (it.hasNext()) {
                this.listPts.add(it.next());
            }
        }
        return this;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.PolygonOptions clickable(boolean z17) {
        this.mClickable = z17;
        return this;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.PolygonOptions fillColor(int i17) {
        this.iFillColor = i17;
        return this;
    }

    public int getFillColor() {
        return this.iFillColor;
    }

    public java.util.List<java.util.List<com.tencent.tencentmap.mapsdk.maps.model.LatLng>> getHolePoints() {
        return this.holePts;
    }

    public int getLevel() {
        return this.iLevel;
    }

    public java.util.List<java.lang.Integer> getPattern() {
        return this.pattern;
    }

    public java.util.List<com.tencent.tencentmap.mapsdk.maps.model.LatLng> getPoints() {
        return this.listPts;
    }

    public int getStrokeColor() {
        return this.iStrokeColor;
    }

    public float getStrokeWidth() {
        return this.fStrokeWidth;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor getTexture() {
        return this.texture;
    }

    public int getTextureSpacing() {
        return this.textureSpacing;
    }

    public float getZIndex() {
        return this.iZindex;
    }

    public boolean isClickable() {
        return this.mClickable;
    }

    public boolean isValid() {
        java.util.List<com.tencent.tencentmap.mapsdk.maps.model.LatLng> list = this.listPts;
        return list != null && list.size() > 2;
    }

    public boolean isVisible() {
        return this.boIsVisble;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.PolygonOptions level(int i17) {
        if (i17 >= 0 && i17 <= 2) {
            this.iLevel = i17;
        }
        return this;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.PolygonOptions pattern(java.util.List<java.lang.Integer> list) {
        this.pattern = list;
        this.texture = null;
        return this;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.PolygonOptions setHolePoints(java.util.List<java.util.List<com.tencent.tencentmap.mapsdk.maps.model.LatLng>> list) {
        this.holePts.clear();
        if (list == null) {
            return this;
        }
        this.holePts.addAll(list);
        return this;
    }

    public void setPoints(java.lang.Iterable<com.tencent.tencentmap.mapsdk.maps.model.LatLng> iterable) {
        this.listPts.clear();
        if (iterable == null) {
            return;
        }
        addAll(iterable);
    }

    public com.tencent.tencentmap.mapsdk.maps.model.PolygonOptions strokeColor(int i17) {
        this.iStrokeColor = i17;
        this.texture = null;
        return this;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.PolygonOptions strokeWidth(float f17) {
        if (f17 < 0.0f) {
            this.fStrokeWidth = 1.0f;
        } else {
            this.fStrokeWidth = f17;
        }
        return this;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.PolygonOptions texture(com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor bitmapDescriptor) {
        this.texture = bitmapDescriptor;
        return this;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.PolygonOptions textureSpacing(int i17) {
        this.textureSpacing = i17;
        return this;
    }

    public java.lang.String toString() {
        return "PolygonOptions{listPts=" + this.listPts + ", iFillColor=" + this.iFillColor + ", iZindex=" + this.iZindex + ", boIsVisble=" + this.boIsVisble + ", mClickable=" + this.mClickable + ", holePts=" + this.holePts + ", fStrokeWidth=" + this.fStrokeWidth + ", iStrokeColor=" + this.iStrokeColor + ", pattern=" + this.pattern + ", texture=" + this.texture + ", textureSpacing=" + this.textureSpacing + ", iLevel=" + this.iLevel + '}';
    }

    public com.tencent.tencentmap.mapsdk.maps.model.PolygonOptions visible(boolean z17) {
        this.boIsVisble = z17;
        return this;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.PolygonOptions zIndex(int i17) {
        this.iZindex = i17;
        return this;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.PolygonOptions add(com.tencent.tencentmap.mapsdk.maps.model.LatLng... latLngArr) {
        if (latLngArr != null) {
            this.listPts.addAll(java.util.Arrays.asList(latLngArr));
        }
        return this;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.PolygonOptions add(java.util.List<com.tencent.tencentmap.mapsdk.maps.model.LatLng> list) {
        if (list != null) {
            this.listPts.addAll(list);
        }
        return this;
    }
}
