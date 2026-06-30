package ey5;

/* loaded from: classes13.dex */
public class g implements com.tencent.mapsdk.raster.model.Polygon {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.tencentmap.mapsdk.maps.model.Polygon f257650a;

    public g(com.tencent.tencentmap.mapsdk.maps.model.Polygon polygon) {
        this.f257650a = polygon;
    }

    @Override // com.tencent.mapsdk.raster.model.Polygon
    public boolean contains(com.tencent.mapsdk.raster.model.LatLng latLng) {
        com.tencent.tencentmap.mapsdk.maps.model.Polygon polygon = this.f257650a;
        if (polygon != null) {
            return polygon.contains(ey5.x.f(latLng));
        }
        return false;
    }

    @Override // com.tencent.mapsdk.raster.model.Polygon
    public int getFillColor() {
        com.tencent.tencentmap.mapsdk.maps.model.Polygon polygon = this.f257650a;
        if (polygon != null) {
            return polygon.getFillColor();
        }
        return 0;
    }

    @Override // com.tencent.mapsdk.raster.model.Polygon, com.tencent.mapsdk.raster.model.IOverlay
    public java.lang.String getId() {
        com.tencent.tencentmap.mapsdk.maps.model.Polygon polygon = this.f257650a;
        if (polygon != null) {
            return polygon.getId();
        }
        return null;
    }

    @Override // com.tencent.mapsdk.raster.model.Polygon
    public int getLevel() {
        com.tencent.tencentmap.mapsdk.maps.model.Polygon polygon = this.f257650a;
        if (polygon != null) {
            return polygon.getLevel();
        }
        return 0;
    }

    @Override // com.tencent.mapsdk.raster.model.Polygon
    public java.util.List getPoints() {
        com.tencent.tencentmap.mapsdk.maps.model.Polygon polygon = this.f257650a;
        if (polygon != null) {
            return ey5.x.b(polygon.getPoints());
        }
        return null;
    }

    @Override // com.tencent.mapsdk.raster.model.Polygon
    public int getStrokeColor() {
        com.tencent.tencentmap.mapsdk.maps.model.Polygon polygon = this.f257650a;
        if (polygon != null) {
            return polygon.getStrokeColor();
        }
        return 0;
    }

    @Override // com.tencent.mapsdk.raster.model.Polygon
    public float getStrokeWidth() {
        com.tencent.tencentmap.mapsdk.maps.model.Polygon polygon = this.f257650a;
        if (polygon != null) {
            return polygon.getStrokeWidth();
        }
        return 0.0f;
    }

    @Override // com.tencent.mapsdk.raster.model.Polygon
    public float getZIndex() {
        if (this.f257650a != null) {
            return r0.getZIndex();
        }
        return 0.0f;
    }

    @Override // com.tencent.mapsdk.raster.model.Polygon, com.tencent.mapsdk.raster.model.IOverlay
    public boolean isVisible() {
        com.tencent.tencentmap.mapsdk.maps.model.Polygon polygon = this.f257650a;
        if (polygon != null) {
            return polygon.isVisible();
        }
        return false;
    }

    @Override // com.tencent.mapsdk.raster.model.Polygon, com.tencent.mapsdk.raster.model.IOverlay
    public void remove() {
        com.tencent.tencentmap.mapsdk.maps.model.Polygon polygon = this.f257650a;
        if (polygon != null) {
            polygon.remove();
        }
    }

    @Override // com.tencent.mapsdk.raster.model.Polygon
    public void setFillColor(int i17) {
        com.tencent.tencentmap.mapsdk.maps.model.Polygon polygon = this.f257650a;
        if (polygon != null) {
            polygon.setFillColor(i17);
        }
    }

    @Override // com.tencent.mapsdk.raster.model.Polygon
    public void setLevel(int i17) {
        com.tencent.tencentmap.mapsdk.maps.model.Polygon polygon = this.f257650a;
        if (polygon != null) {
            polygon.setLevel(i17);
        }
    }

    @Override // com.tencent.mapsdk.raster.model.Polygon
    public void setPoints(java.util.List list) {
        com.tencent.tencentmap.mapsdk.maps.model.Polygon polygon = this.f257650a;
        if (polygon != null) {
            polygon.setPoints(ey5.x.g(list));
        }
    }

    @Override // com.tencent.mapsdk.raster.model.Polygon
    public void setStrokeColor(int i17) {
        com.tencent.tencentmap.mapsdk.maps.model.Polygon polygon = this.f257650a;
        if (polygon != null) {
            polygon.setStrokeColor(i17);
        }
    }

    @Override // com.tencent.mapsdk.raster.model.Polygon
    public void setStrokeWidth(float f17) {
        com.tencent.tencentmap.mapsdk.maps.model.Polygon polygon = this.f257650a;
        if (polygon != null) {
            if (f17 < 0.0f) {
                f17 = 0.0f;
            }
            polygon.setStrokeWidth(f17);
        }
    }

    @Override // com.tencent.mapsdk.raster.model.Polygon, com.tencent.mapsdk.raster.model.IOverlay
    public void setVisible(boolean z17) {
        com.tencent.tencentmap.mapsdk.maps.model.Polygon polygon = this.f257650a;
        if (polygon != null) {
            polygon.setVisible(z17);
        }
    }

    @Override // com.tencent.mapsdk.raster.model.Polygon
    public void setZIndex(float f17) {
        com.tencent.tencentmap.mapsdk.maps.model.Polygon polygon = this.f257650a;
        if (polygon != null) {
            polygon.setZIndex((int) f17);
        }
    }
}
