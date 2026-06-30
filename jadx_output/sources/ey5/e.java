package ey5;

/* loaded from: classes13.dex */
public class e implements com.tencent.mapsdk.raster.model.Marker {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.tencentmap.mapsdk.maps.model.Marker f257646a;

    /* renamed from: b, reason: collision with root package name */
    public final ey5.r f257647b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.tencentmap.mapsdk.maps.model.MarkerCollisionRelationUnit f257648c;

    public e(ey5.r rVar, com.tencent.tencentmap.mapsdk.maps.model.Marker marker) {
        this.f257647b = rVar;
        this.f257646a = marker;
        if (rVar == null || rVar.f257664f == null) {
            return;
        }
        synchronized (ey5.e.class) {
            ((java.util.ArrayList) rVar.f257664f).add(marker);
        }
    }

    @Override // com.tencent.mapsdk.raster.model.Marker
    public com.tencent.tencentmap.mapsdk.maps.model.MarkerCollisionRelationUnit addCollisionUnit(com.tencent.tencentmap.mapsdk.maps.model.MarkerOptions markerOptions) {
        com.tencent.tencentmap.mapsdk.maps.model.Marker marker = this.f257646a;
        if (marker != null) {
            return marker.addCollisionUnit(markerOptions);
        }
        return null;
    }

    @Override // com.tencent.mapsdk.raster.model.Marker
    public float getAlpha() {
        com.tencent.tencentmap.mapsdk.maps.model.Marker marker = this.f257646a;
        if (marker != null) {
            return marker.getAlpha();
        }
        return 0.0f;
    }

    @Override // com.tencent.mapsdk.raster.model.Marker
    public java.lang.String getContentDescription() {
        com.tencent.tencentmap.mapsdk.maps.model.Marker marker = this.f257646a;
        if (marker != null) {
            return marker.getContentDescription();
        }
        return null;
    }

    @Override // com.tencent.mapsdk.raster.model.Marker, com.tencent.mapsdk.raster.model.IOverlay
    public java.lang.String getId() {
        com.tencent.tencentmap.mapsdk.maps.model.Marker marker = this.f257646a;
        return marker != null ? marker.getId() : "";
    }

    @Override // com.tencent.mapsdk.raster.model.Marker
    public int getLevel() {
        com.tencent.tencentmap.mapsdk.maps.model.Marker marker = this.f257646a;
        if (marker != null) {
            return marker.getLevel();
        }
        return 0;
    }

    @Override // com.tencent.mapsdk.raster.model.Marker
    public android.view.View getMarkerView() {
        return null;
    }

    @Override // com.tencent.mapsdk.raster.model.Marker
    public com.tencent.mapsdk.raster.model.LatLng getPosition() {
        com.tencent.tencentmap.mapsdk.maps.model.Marker marker = this.f257646a;
        if (marker != null) {
            return ey5.x.a(marker.getPosition());
        }
        return null;
    }

    @Override // com.tencent.mapsdk.raster.model.Marker
    public float getRotation() {
        com.tencent.tencentmap.mapsdk.maps.model.Marker marker = this.f257646a;
        if (marker != null) {
            return marker.getRotation();
        }
        return 0.0f;
    }

    @Override // com.tencent.mapsdk.raster.model.Marker
    public java.lang.String getSnippet() {
        com.tencent.tencentmap.mapsdk.maps.model.Marker marker = this.f257646a;
        if (marker != null) {
            return marker.getSnippet();
        }
        return null;
    }

    @Override // com.tencent.mapsdk.raster.model.Marker
    public java.lang.Object getTag() {
        com.tencent.tencentmap.mapsdk.maps.model.Marker marker = this.f257646a;
        if (marker != null) {
            return marker.getTag();
        }
        return null;
    }

    @Override // com.tencent.mapsdk.raster.model.Marker
    public java.lang.String getTitle() {
        com.tencent.tencentmap.mapsdk.maps.model.Marker marker = this.f257646a;
        if (marker != null) {
            return marker.getTitle();
        }
        return null;
    }

    @Override // com.tencent.mapsdk.raster.model.Marker
    public float getZIndex() {
        if (this.f257646a != null) {
            return r0.getZIndex();
        }
        return 0.0f;
    }

    @Override // com.tencent.mapsdk.raster.model.Marker
    public void hideInfoWindow() {
        com.tencent.tencentmap.mapsdk.maps.model.Marker marker = this.f257646a;
        if (marker != null) {
            marker.hideInfoWindow();
        }
    }

    @Override // com.tencent.mapsdk.raster.model.Marker
    public boolean isDraggable() {
        com.tencent.tencentmap.mapsdk.maps.model.Marker marker = this.f257646a;
        if (marker != null) {
            return marker.isDraggable();
        }
        return false;
    }

    @Override // com.tencent.mapsdk.raster.model.Marker
    public boolean isInfoWindowShown() {
        com.tencent.tencentmap.mapsdk.maps.model.Marker marker = this.f257646a;
        if (marker != null) {
            return marker.isInfoWindowShown();
        }
        return false;
    }

    @Override // com.tencent.mapsdk.raster.model.Marker, com.tencent.mapsdk.raster.model.IOverlay
    public boolean isVisible() {
        com.tencent.tencentmap.mapsdk.maps.model.Marker marker = this.f257646a;
        if (marker != null) {
            return marker.isVisible();
        }
        return false;
    }

    @Override // com.tencent.mapsdk.raster.model.Marker
    public void refreshInfoWindow() {
        com.tencent.tencentmap.mapsdk.maps.model.Marker marker = this.f257646a;
        if (marker != null) {
            marker.refreshInfoWindow();
        }
    }

    @Override // com.tencent.mapsdk.raster.model.Marker, com.tencent.mapsdk.raster.model.IOverlay
    public void remove() {
        java.util.List list;
        if (this.f257646a != null) {
            synchronized (ey5.e.class) {
                ey5.r rVar = this.f257647b;
                if (rVar != null && (list = rVar.f257664f) != null) {
                    ((java.util.ArrayList) list).remove(this.f257646a);
                }
            }
            removeCollisionUnit();
            this.f257646a.remove();
        }
    }

    @Override // com.tencent.mapsdk.raster.model.Marker
    public void removeCollisionUnit(com.tencent.tencentmap.mapsdk.maps.model.MarkerCollisionRelationUnit markerCollisionRelationUnit) {
        com.tencent.tencentmap.mapsdk.maps.model.Marker marker = this.f257646a;
        if (marker != null) {
            marker.removeCollisionUnit(markerCollisionRelationUnit);
        }
    }

    @Override // com.tencent.mapsdk.raster.model.Marker
    public void set2Top() {
        ey5.r rVar = this.f257647b;
        if (rVar == null || rVar.f257664f == null) {
            return;
        }
        synchronized (ey5.e.class) {
            int size = ((java.util.ArrayList) this.f257647b.f257664f).size();
            java.util.Iterator it = ((java.util.ArrayList) this.f257647b.f257664f).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                com.tencent.tencentmap.mapsdk.maps.model.Marker marker = (com.tencent.tencentmap.mapsdk.maps.model.Marker) it.next();
                if (marker.getZIndex() != Integer.MAX_VALUE && marker.getZIndex() > size) {
                    size = marker.getZIndex();
                }
            }
            this.f257646a.setZIndex(size < Integer.MAX_VALUE ? size + 1 : Integer.MAX_VALUE);
        }
    }

    @Override // com.tencent.mapsdk.raster.model.Marker
    public void setAlpha(float f17) {
        com.tencent.tencentmap.mapsdk.maps.model.Marker marker = this.f257646a;
        if (marker != null) {
            marker.setAlpha(f17);
        }
    }

    @Override // com.tencent.mapsdk.raster.model.Marker
    public void setAnchor(float f17, float f18) {
        com.tencent.tencentmap.mapsdk.maps.model.Marker marker = this.f257646a;
        if (marker != null) {
            marker.setAnchor(f17, f18);
        }
    }

    @Override // com.tencent.mapsdk.raster.model.Marker
    public void setCollisions(com.tencent.tencentmap.mapsdk.maps.interfaces.Collision... collisionArr) {
        com.tencent.tencentmap.mapsdk.maps.model.Marker marker = this.f257646a;
        if (marker != null) {
            marker.setCollisions(collisionArr);
        }
    }

    @Override // com.tencent.mapsdk.raster.model.Marker
    public void setContentDescription(java.lang.String str) {
        com.tencent.tencentmap.mapsdk.maps.model.Marker marker = this.f257646a;
        if (marker != null) {
            marker.setContentDescription(str);
        }
    }

    @Override // com.tencent.mapsdk.raster.model.Marker
    public void setDraggable(boolean z17) {
        com.tencent.tencentmap.mapsdk.maps.model.Marker marker = this.f257646a;
        if (marker != null) {
            marker.setDraggable(z17);
        }
    }

    @Override // com.tencent.mapsdk.raster.model.Marker
    public void setGifIcon(android.graphics.Bitmap[] bitmapArr, boolean z17, int i17) {
        com.tencent.tencentmap.mapsdk.maps.model.Marker marker = this.f257646a;
        if (marker == null || bitmapArr == null) {
            return;
        }
        marker.setIconLooper(com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptorFactory.fromBitmaps(bitmapArr), z17, i17);
    }

    @Override // com.tencent.mapsdk.raster.model.Marker
    public void setIcon(com.tencent.mapsdk.raster.model.BitmapDescriptor bitmapDescriptor) {
        com.tencent.tencentmap.mapsdk.maps.model.Marker marker = this.f257646a;
        if (marker == null || bitmapDescriptor == null) {
            return;
        }
        com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor fromBitmap = com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptorFactory.fromBitmap(bitmapDescriptor.getBitmap());
        fromBitmap.getFormater().setScale(2);
        marker.setIcon(fromBitmap);
    }

    @Override // com.tencent.mapsdk.raster.model.Marker
    public void setInfoWindowHideAnimation(android.view.animation.Animation animation) {
    }

    @Override // com.tencent.mapsdk.raster.model.Marker
    public void setInfoWindowOffset(int i17, int i18) {
        com.tencent.tencentmap.mapsdk.maps.model.Marker marker = this.f257646a;
        if (marker != null) {
            marker.setInfoWindowOffset(i17, i18);
        }
    }

    @Override // com.tencent.mapsdk.raster.model.Marker
    public void setInfoWindowShowAnimation(android.view.animation.Animation animation) {
    }

    @Override // com.tencent.mapsdk.raster.model.Marker
    public void setLevel(int i17) {
        com.tencent.tencentmap.mapsdk.maps.model.Marker marker = this.f257646a;
        if (marker != null) {
            marker.setLevel(i17);
        }
    }

    @Override // com.tencent.mapsdk.raster.model.Marker
    public void setMarkerView(android.view.View view) {
        com.tencent.tencentmap.mapsdk.maps.model.Marker marker = this.f257646a;
        if (marker != null) {
            marker.setIcon(com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptorFactory.fromView(view));
        }
    }

    @Override // com.tencent.mapsdk.raster.model.Marker
    public void setPosition(com.tencent.mapsdk.raster.model.LatLng latLng) {
        com.tencent.tencentmap.mapsdk.maps.model.Marker marker = this.f257646a;
        if (marker != null) {
            marker.setPosition(ey5.x.f(latLng));
        }
    }

    @Override // com.tencent.mapsdk.raster.model.Marker
    public void setRotation(float f17) {
        com.tencent.tencentmap.mapsdk.maps.model.Marker marker = this.f257646a;
        if (marker != null) {
            marker.setRotation(f17);
        }
    }

    @Override // com.tencent.mapsdk.raster.model.Marker
    public void setSnippet(java.lang.String str) {
        com.tencent.tencentmap.mapsdk.maps.model.Marker marker = this.f257646a;
        if (marker != null) {
            marker.setSnippet(str);
        }
    }

    @Override // com.tencent.mapsdk.raster.model.Marker
    public void setTag(java.lang.Object obj) {
        com.tencent.tencentmap.mapsdk.maps.model.Marker marker = this.f257646a;
        if (marker != null) {
            marker.setTag(obj);
        }
    }

    @Override // com.tencent.mapsdk.raster.model.Marker
    public void setTitle(java.lang.String str) {
        com.tencent.tencentmap.mapsdk.maps.model.Marker marker = this.f257646a;
        if (marker != null) {
            marker.setTitle(str);
        }
    }

    @Override // com.tencent.mapsdk.raster.model.Marker, com.tencent.mapsdk.raster.model.IOverlay
    public void setVisible(boolean z17) {
        com.tencent.tencentmap.mapsdk.maps.model.Marker marker = this.f257646a;
        if (marker != null) {
            marker.setVisible(z17);
        }
    }

    @Override // com.tencent.mapsdk.raster.model.Marker
    public void setZIndex(float f17) {
        com.tencent.tencentmap.mapsdk.maps.model.Marker marker = this.f257646a;
        if (marker != null) {
            marker.setZIndex(f17);
        }
    }

    @Override // com.tencent.mapsdk.raster.model.Marker
    public void showInfoWindow() {
        com.tencent.tencentmap.mapsdk.maps.model.Marker marker = this.f257646a;
        if (marker != null) {
            marker.showInfoWindow();
        }
    }

    @Override // com.tencent.mapsdk.raster.model.Marker
    public void addCollisionUnit() {
        com.tencent.tencentmap.mapsdk.maps.model.Marker marker = this.f257646a;
        if (marker != null) {
            this.f257648c = marker.addCollisionUnit(marker.getOptions());
        }
    }

    @Override // com.tencent.mapsdk.raster.model.Marker
    public void removeCollisionUnit() {
        com.tencent.tencentmap.mapsdk.maps.model.MarkerCollisionRelationUnit markerCollisionRelationUnit;
        com.tencent.tencentmap.mapsdk.maps.model.Marker marker = this.f257646a;
        if (marker == null || (markerCollisionRelationUnit = this.f257648c) == null) {
            return;
        }
        marker.removeCollisionUnit(markerCollisionRelationUnit);
    }
}
