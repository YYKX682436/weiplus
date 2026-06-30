package ey5;

/* loaded from: classes13.dex */
public class f implements com.tencent.mapsdk.raster.model.Polyline {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.tencentmap.mapsdk.maps.model.Polyline f257649a;

    public f(com.tencent.tencentmap.mapsdk.maps.model.Polyline polyline) {
        this.f257649a = polyline;
    }

    @Override // com.tencent.mapsdk.raster.model.Polyline
    public void eraseTo(int i17, com.tencent.mapsdk.raster.model.LatLng latLng) {
        com.tencent.tencentmap.mapsdk.maps.model.Polyline polyline = this.f257649a;
        if (polyline == null) {
            return;
        }
        polyline.eraseTo(i17, ey5.x.f(latLng));
    }

    @Override // com.tencent.mapsdk.raster.model.Polyline
    public int getColor() {
        com.tencent.tencentmap.mapsdk.maps.model.Polyline polyline = this.f257649a;
        if (polyline != null) {
            return polyline.getColor();
        }
        return 0;
    }

    @Override // com.tencent.mapsdk.raster.model.Polyline, com.tencent.mapsdk.raster.model.IOverlay
    public java.lang.String getId() {
        com.tencent.tencentmap.mapsdk.maps.model.Polyline polyline = this.f257649a;
        if (polyline != null) {
            return polyline.getId();
        }
        return null;
    }

    @Override // com.tencent.mapsdk.raster.model.Polyline
    public int getLevel() {
        com.tencent.tencentmap.mapsdk.maps.model.Polyline polyline = this.f257649a;
        if (polyline != null) {
            return polyline.getLevel();
        }
        return 0;
    }

    @Override // com.tencent.mapsdk.raster.model.Polyline
    public java.util.List getPoints() {
        com.tencent.tencentmap.mapsdk.maps.model.Polyline polyline = this.f257649a;
        if (polyline != null) {
            return ey5.x.b(polyline.getPoints());
        }
        return null;
    }

    @Override // com.tencent.mapsdk.raster.model.Polyline
    public float getWidth() {
        com.tencent.tencentmap.mapsdk.maps.model.Polyline polyline = this.f257649a;
        if (polyline != null) {
            return polyline.getWidth();
        }
        return 0.0f;
    }

    @Override // com.tencent.mapsdk.raster.model.Polyline
    public float getZIndex() {
        if (this.f257649a != null) {
            return r0.getZIndex();
        }
        return 0.0f;
    }

    @Override // com.tencent.mapsdk.raster.model.Polyline
    public boolean isDottedLine() {
        com.tencent.tencentmap.mapsdk.maps.model.Polyline polyline = this.f257649a;
        return (polyline == null || polyline.getPattern() == null) ? false : true;
    }

    @Override // com.tencent.mapsdk.raster.model.Polyline
    public boolean isGeodesic() {
        return false;
    }

    @Override // com.tencent.mapsdk.raster.model.Polyline, com.tencent.mapsdk.raster.model.IOverlay
    public boolean isVisible() {
        com.tencent.tencentmap.mapsdk.maps.model.Polyline polyline = this.f257649a;
        if (polyline != null) {
            return polyline.isVisible();
        }
        return false;
    }

    @Override // com.tencent.mapsdk.raster.model.Polyline, com.tencent.mapsdk.raster.model.IOverlay
    public void remove() {
        com.tencent.tencentmap.mapsdk.maps.model.Polyline polyline = this.f257649a;
        if (polyline != null) {
            polyline.remove();
        }
    }

    @Override // com.tencent.mapsdk.raster.model.Polyline
    public void setColor(int i17) {
        com.tencent.tencentmap.mapsdk.maps.model.Polyline polyline = this.f257649a;
        if (polyline != null) {
            polyline.setColor(i17);
        }
    }

    @Override // com.tencent.mapsdk.raster.model.Polyline
    public void setColorTexture(com.tencent.mapsdk.raster.model.BitmapDescriptor bitmapDescriptor) {
        com.tencent.tencentmap.mapsdk.maps.model.Polyline polyline = this.f257649a;
        if (polyline == null) {
            return;
        }
        polyline.setColorTexture(com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptorFactory.fromBitmap(bitmapDescriptor.getBitmap()));
    }

    @Override // com.tencent.mapsdk.raster.model.Polyline
    public void setDottedLine(boolean z17) {
    }

    @Override // com.tencent.mapsdk.raster.model.Polyline
    public void setEraseable(boolean z17) {
        com.tencent.tencentmap.mapsdk.maps.model.Polyline polyline = this.f257649a;
        if (polyline == null) {
            return;
        }
        polyline.setEraseable(z17);
    }

    @Override // com.tencent.mapsdk.raster.model.Polyline
    public void setGeodesic(boolean z17) {
    }

    @Override // com.tencent.mapsdk.raster.model.Polyline
    public void setLevel(int i17) {
        com.tencent.tencentmap.mapsdk.maps.model.Polyline polyline = this.f257649a;
        if (polyline != null) {
            polyline.setLevel(i17);
        }
    }

    @Override // com.tencent.mapsdk.raster.model.Polyline
    public void setPoints(java.util.List list) {
        com.tencent.tencentmap.mapsdk.maps.model.Polyline polyline = this.f257649a;
        if (polyline != null) {
            polyline.setPoints(ey5.x.g(list));
        }
    }

    @Override // com.tencent.mapsdk.raster.model.Polyline, com.tencent.mapsdk.raster.model.IOverlay
    public void setVisible(boolean z17) {
        com.tencent.tencentmap.mapsdk.maps.model.Polyline polyline = this.f257649a;
        if (polyline != null) {
            polyline.setVisible(z17);
        }
    }

    @Override // com.tencent.mapsdk.raster.model.Polyline
    public void setWidth(float f17) {
        com.tencent.tencentmap.mapsdk.maps.model.Polyline polyline = this.f257649a;
        if (polyline != null) {
            if (f17 < 0.0f) {
                f17 = 0.0f;
            }
            polyline.setWidth(f17);
        }
    }

    @Override // com.tencent.mapsdk.raster.model.Polyline
    public void setZIndex(float f17) {
        com.tencent.tencentmap.mapsdk.maps.model.Polyline polyline = this.f257649a;
        if (polyline != null) {
            polyline.setZIndex((int) f17);
        }
    }
}
