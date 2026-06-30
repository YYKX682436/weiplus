package com.tencent.mm.plugin.location_soso;

/* loaded from: classes13.dex */
public class ViewManager implements ab3.i {
    private com.tencent.tencentmap.mapsdk.map.TencentMap mTencentMap;
    private java.util.Map<android.view.View, com.tencent.mapsdk.raster.model.Marker> mMarkerMap = new java.util.HashMap();
    private java.util.Map<com.tencent.mapsdk.raster.model.Marker, com.tencent.tencentmap.mapsdk.map.TencentMap.OnMarkerClickListener> mMarkerClickMap = new java.util.HashMap();
    private java.util.Map<com.tencent.mapsdk.raster.model.Marker, com.tencent.tencentmap.mapsdk.map.TencentMap.OnInfoWindowClickListener> mInfoWindowClickMap = new java.util.HashMap();

    public ViewManager(com.tencent.tencentmap.mapsdk.map.TencentMap tencentMap) {
        this.mTencentMap = tencentMap;
        this.mTencentMap.setOnMarkerClickListener(new com.tencent.tencentmap.mapsdk.map.TencentMap.OnMarkerClickListener() { // from class: com.tencent.mm.plugin.location_soso.ViewManager.1
            @Override // com.tencent.tencentmap.mapsdk.map.TencentMap.OnMarkerClickListener
            public boolean onMarkerClick(com.tencent.mapsdk.raster.model.Marker marker) {
                com.tencent.tencentmap.mapsdk.map.TencentMap.OnMarkerClickListener onMarkerClickListener = (com.tencent.tencentmap.mapsdk.map.TencentMap.OnMarkerClickListener) com.tencent.mm.plugin.location_soso.ViewManager.this.mMarkerClickMap.get(marker);
                if (onMarkerClickListener != null) {
                    return onMarkerClickListener.onMarkerClick(marker);
                }
                return false;
            }
        });
        this.mTencentMap.setOnInfoWindowClickListener(new com.tencent.tencentmap.mapsdk.map.TencentMap.OnInfoWindowClickListener() { // from class: com.tencent.mm.plugin.location_soso.ViewManager.2
            @Override // com.tencent.tencentmap.mapsdk.map.TencentMap.OnInfoWindowClickListener
            public void onInfoWindowClick(com.tencent.mapsdk.raster.model.Marker marker) {
                com.tencent.tencentmap.mapsdk.map.TencentMap.OnInfoWindowClickListener onInfoWindowClickListener = (com.tencent.tencentmap.mapsdk.map.TencentMap.OnInfoWindowClickListener) com.tencent.mm.plugin.location_soso.ViewManager.this.mInfoWindowClickMap.get(marker);
                if (onInfoWindowClickListener != null) {
                    onInfoWindowClickListener.onInfoWindowClick(marker);
                }
            }
        });
    }

    public void addPinView(android.view.View view, double d17, double d18) {
        com.tencent.tencentmap.mapsdk.map.TencentMap tencentMap = this.mTencentMap;
        if (tencentMap == null) {
            return;
        }
        this.mMarkerMap.put(view, tencentMap.addMarker(new com.tencent.mapsdk.raster.model.MarkerOptions().position(new com.tencent.mapsdk.raster.model.LatLng(d17, d18)).anchor(0.5f, 0.5f).markerView(view)));
    }

    public void addView(android.view.View view, double d17, double d18) {
        com.tencent.tencentmap.mapsdk.map.TencentMap tencentMap = this.mTencentMap;
        if (tencentMap == null) {
            return;
        }
        this.mMarkerMap.put(view, tencentMap.addMarker(new com.tencent.mapsdk.raster.model.MarkerOptions().position(new com.tencent.mapsdk.raster.model.LatLng(d17, d18)).markerView(view)));
    }

    public void animateCamera(com.tencent.tencentmap.mapsdk.map.CameraUpdate cameraUpdate) {
        com.tencent.tencentmap.mapsdk.map.TencentMap tencentMap = this.mTencentMap;
        if (tencentMap != null) {
            tencentMap.animateCamera(cameraUpdate);
        }
    }

    public void destroy() {
        java.util.Map<android.view.View, com.tencent.mapsdk.raster.model.Marker> map = this.mMarkerMap;
        if (map != null) {
            map.clear();
            this.mMarkerClickMap.clear();
            this.mInfoWindowClickMap.clear();
        }
    }

    public void disableDarkMode() {
        com.tencent.tencentmap.mapsdk.map.TencentMap tencentMap = this.mTencentMap;
        if (tencentMap != null) {
            tencentMap.setMapType(1000);
        }
    }

    public com.tencent.mapsdk.raster.model.Circle drawAccuracyCircle(double d17, double d18, double d19) {
        if (this.mTencentMap == null) {
            return null;
        }
        com.tencent.mapsdk.raster.model.CircleOptions circleOptions = new com.tencent.mapsdk.raster.model.CircleOptions();
        circleOptions.center(new com.tencent.mapsdk.raster.model.LatLng(d17, d18));
        circleOptions.radius(d19);
        circleOptions.strokeColor(android.graphics.Color.parseColor("#00FFFFFF"));
        circleOptions.strokeWidth(0.0f);
        circleOptions.fillColor(android.graphics.Color.parseColor("#4D1485EE"));
        return this.mTencentMap.addCircle(circleOptions);
    }

    public void enableDarkMode() {
        com.tencent.tencentmap.mapsdk.map.TencentMap tencentMap = this.mTencentMap;
        if (tencentMap != null) {
            tencentMap.setMapType(1008);
        }
    }

    @Override // ab3.i
    public com.tencent.tencentmap.mapsdk.map.TencentMap getTencentMap() {
        return this.mTencentMap;
    }

    public void removeView(android.view.View view) {
        com.tencent.mapsdk.raster.model.Marker marker;
        if (this.mTencentMap == null || (marker = this.mMarkerMap.get(view)) == null) {
            return;
        }
        marker.remove();
        this.mMarkerClickMap.remove(marker);
        this.mInfoWindowClickMap.remove(marker);
    }

    public void setInfoWindowAdapter(com.tencent.tencentmap.mapsdk.map.TencentMap.InfoWindowAdapter infoWindowAdapter) {
        this.mTencentMap.setInfoWindowAdapter(infoWindowAdapter);
    }

    public void setInfoWindowClick(android.view.View view, com.tencent.tencentmap.mapsdk.map.TencentMap.OnInfoWindowClickListener onInfoWindowClickListener) {
        com.tencent.mapsdk.raster.model.Marker marker;
        if (this.mTencentMap == null || (marker = this.mMarkerMap.get(view)) == null) {
            return;
        }
        this.mInfoWindowClickMap.put(marker, onInfoWindowClickListener);
    }

    public void setMarker2Top(android.view.View view) {
        if (this.mTencentMap == null) {
            return;
        }
        this.mMarkerMap.get(view).set2Top();
    }

    public void setMarkerClick(android.view.View view, com.tencent.tencentmap.mapsdk.map.TencentMap.OnMarkerClickListener onMarkerClickListener) {
        com.tencent.mapsdk.raster.model.Marker marker;
        if (this.mTencentMap == null || (marker = this.mMarkerMap.get(view)) == null) {
            return;
        }
        this.mMarkerClickMap.put(marker, onMarkerClickListener);
    }

    public void setMarkerTag(android.view.View view, java.lang.String str) {
        if (this.mTencentMap == null) {
            return;
        }
        this.mMarkerMap.get(view).setTag(str);
    }

    public void showInfoWindowByView(android.view.View view) {
        if (this.mTencentMap == null) {
            return;
        }
        this.mMarkerMap.get(view).showInfoWindow();
    }

    public void toggleViewVisible(android.view.View view) {
        if (this.mTencentMap == null) {
            return;
        }
        this.mMarkerMap.get(view).setVisible(view.getVisibility() == 0);
    }

    public void updateLocationPinLayout(android.view.View view, double d17, double d18, boolean z17) {
        com.tencent.mapsdk.raster.model.Marker marker;
        if (this.mTencentMap == null || (marker = this.mMarkerMap.get(view)) == null) {
            return;
        }
        marker.setVisible(view.getVisibility() == 0);
        marker.setPosition(new com.tencent.mapsdk.raster.model.LatLng(d17, d18));
        if (z17) {
            marker.setMarkerView(view);
        }
        marker.setAnchor(0.5f, 0.5f);
    }

    public void updateMarkerView(android.view.View view) {
        com.tencent.mapsdk.raster.model.Marker marker;
        if (this.mTencentMap == null || (marker = this.mMarkerMap.get(view)) == null) {
            return;
        }
        marker.setMarkerView(view);
    }

    public void updateRotation(android.view.View view, float f17) {
        com.tencent.mapsdk.raster.model.Marker marker;
        if (this.mTencentMap == null || (marker = this.mMarkerMap.get(view)) == null) {
            return;
        }
        marker.setRotation(f17);
    }

    public void updateViewLayout(android.view.View view, double d17, double d18, boolean z17) {
        if (this.mTencentMap == null) {
            return;
        }
        com.tencent.mapsdk.raster.model.Marker marker = this.mMarkerMap.get(view);
        marker.setVisible(view.getVisibility() == 0);
        marker.setPosition(new com.tencent.mapsdk.raster.model.LatLng(d17, d18));
        if (z17) {
            marker.setMarkerView(view);
        }
        marker.setAnchor(0.5f, 1.0f);
    }
}
