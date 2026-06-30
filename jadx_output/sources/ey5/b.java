package ey5;

/* loaded from: classes13.dex */
public class b implements com.tencent.mapsdk.raster.model.Circle {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.tencentmap.mapsdk.maps.model.Circle f257641a;

    public b(com.tencent.tencentmap.mapsdk.maps.model.Circle circle) {
        this.f257641a = circle;
    }

    @Override // com.tencent.mapsdk.raster.model.Circle
    public boolean contains(com.tencent.mapsdk.raster.model.LatLng latLng) {
        com.tencent.tencentmap.mapsdk.maps.model.Circle circle = this.f257641a;
        if (circle != null) {
            return circle.contains(ey5.x.f(latLng));
        }
        return false;
    }

    @Override // com.tencent.mapsdk.raster.model.Circle
    public com.tencent.mapsdk.raster.model.LatLng getCenter() {
        com.tencent.tencentmap.mapsdk.maps.model.Circle circle = this.f257641a;
        if (circle != null) {
            return ey5.x.a(circle.getCenter());
        }
        return null;
    }

    @Override // com.tencent.mapsdk.raster.model.Circle
    public int getFillColor() {
        com.tencent.tencentmap.mapsdk.maps.model.Circle circle = this.f257641a;
        if (circle != null) {
            return circle.getFillColor();
        }
        return 0;
    }

    @Override // com.tencent.mapsdk.raster.model.Circle, com.tencent.mapsdk.raster.model.IOverlay
    public java.lang.String getId() {
        com.tencent.tencentmap.mapsdk.maps.model.Circle circle = this.f257641a;
        if (circle != null) {
            return circle.getId();
        }
        return null;
    }

    @Override // com.tencent.mapsdk.raster.model.Circle
    public int getLevel() {
        com.tencent.tencentmap.mapsdk.maps.model.Circle circle = this.f257641a;
        if (circle != null) {
            return circle.getLevel();
        }
        return 0;
    }

    @Override // com.tencent.mapsdk.raster.model.Circle
    public double getRadius() {
        com.tencent.tencentmap.mapsdk.maps.model.Circle circle = this.f257641a;
        if (circle != null) {
            return circle.getRadius();
        }
        return 0.0d;
    }

    @Override // com.tencent.mapsdk.raster.model.Circle
    public int getStrokeColor() {
        com.tencent.tencentmap.mapsdk.maps.model.Circle circle = this.f257641a;
        if (circle != null) {
            return circle.getStrokeColor();
        }
        return 0;
    }

    @Override // com.tencent.mapsdk.raster.model.Circle
    public boolean getStrokeDash() {
        return false;
    }

    @Override // com.tencent.mapsdk.raster.model.Circle
    public android.graphics.DashPathEffect getStrokeDashPathEffect() {
        return null;
    }

    @Override // com.tencent.mapsdk.raster.model.Circle
    public float getStrokeWidth() {
        com.tencent.tencentmap.mapsdk.maps.model.Circle circle = this.f257641a;
        if (circle != null) {
            return circle.getStrokeWidth();
        }
        return 0.0f;
    }

    @Override // com.tencent.mapsdk.raster.model.Circle
    public float getZIndex() {
        if (this.f257641a != null) {
            return r0.getZIndex();
        }
        return 0.0f;
    }

    @Override // com.tencent.mapsdk.raster.model.Circle, com.tencent.mapsdk.raster.model.IOverlay
    public boolean isVisible() {
        com.tencent.tencentmap.mapsdk.maps.model.Circle circle = this.f257641a;
        if (circle != null) {
            return circle.isVisible();
        }
        return false;
    }

    @Override // com.tencent.mapsdk.raster.model.Circle, com.tencent.mapsdk.raster.model.IOverlay
    public void remove() {
        com.tencent.tencentmap.mapsdk.maps.model.Circle circle = this.f257641a;
        if (circle != null) {
            circle.remove();
        }
    }

    @Override // com.tencent.mapsdk.raster.model.Circle
    public void setCenter(com.tencent.mapsdk.raster.model.LatLng latLng) {
        com.tencent.tencentmap.mapsdk.maps.model.Circle circle = this.f257641a;
        if (circle != null) {
            circle.setCenter(ey5.x.f(latLng));
        }
    }

    @Override // com.tencent.mapsdk.raster.model.Circle
    public void setFillColor(int i17) {
        com.tencent.tencentmap.mapsdk.maps.model.Circle circle = this.f257641a;
        if (circle != null) {
            circle.setFillColor(i17);
        }
    }

    @Override // com.tencent.mapsdk.raster.model.Circle
    public void setLevel(int i17) {
        com.tencent.tencentmap.mapsdk.maps.model.Circle circle = this.f257641a;
        if (circle != null) {
            circle.setLevel(i17);
        }
    }

    @Override // com.tencent.mapsdk.raster.model.Circle
    public void setRadius(double d17) {
        com.tencent.tencentmap.mapsdk.maps.model.Circle circle = this.f257641a;
        if (circle != null) {
            circle.setRadius(d17);
        }
    }

    @Override // com.tencent.mapsdk.raster.model.Circle
    public void setStrokeColor(int i17) {
        com.tencent.tencentmap.mapsdk.maps.model.Circle circle = this.f257641a;
        if (circle != null) {
            circle.setStrokeColor(i17);
        }
    }

    @Override // com.tencent.mapsdk.raster.model.Circle
    public void setStrokeDash(boolean z17) {
    }

    @Override // com.tencent.mapsdk.raster.model.Circle
    public void setStrokeWidth(float f17) {
        com.tencent.tencentmap.mapsdk.maps.model.Circle circle = this.f257641a;
        if (circle != null) {
            if (f17 < 0.0f) {
                f17 = 0.0f;
            }
            circle.setStrokeWidth(f17);
        }
    }

    @Override // com.tencent.mapsdk.raster.model.Circle, com.tencent.mapsdk.raster.model.IOverlay
    public void setVisible(boolean z17) {
        com.tencent.tencentmap.mapsdk.maps.model.Circle circle = this.f257641a;
        if (circle != null) {
            circle.setVisible(z17);
        }
    }

    @Override // com.tencent.mapsdk.raster.model.Circle
    public void setZIndex(float f17) {
        com.tencent.tencentmap.mapsdk.maps.model.Circle circle = this.f257641a;
        if (circle != null) {
            circle.setZIndex((int) f17);
        }
    }

    @Override // com.tencent.mapsdk.raster.model.Circle
    public void strokeDashPathEffect(android.graphics.DashPathEffect dashPathEffect) {
    }
}
