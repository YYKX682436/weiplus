package com.tencent.tencentmap.mapsdk.map;

/* loaded from: classes13.dex */
public final class CameraUpdateFactory {
    public static com.tencent.tencentmap.mapsdk.map.CameraUpdate newCameraPosition(com.tencent.mapsdk.raster.model.CameraPosition cameraPosition) {
        com.tencent.tencentmap.mapsdk.map.CameraParameter cameraParameter = new com.tencent.tencentmap.mapsdk.map.CameraParameter();
        cameraParameter.cameraUpdate_type = 6;
        cameraParameter.newCameraPosition = cameraPosition;
        return new com.tencent.tencentmap.mapsdk.map.CameraUpdate(cameraParameter);
    }

    public static com.tencent.tencentmap.mapsdk.map.CameraUpdate newLatLng(com.tencent.mapsdk.raster.model.LatLng latLng) {
        com.tencent.tencentmap.mapsdk.map.CameraParameter cameraParameter = new com.tencent.tencentmap.mapsdk.map.CameraParameter();
        cameraParameter.cameraUpdate_type = 7;
        cameraParameter.newLatLng = latLng;
        return new com.tencent.tencentmap.mapsdk.map.CameraUpdate(cameraParameter);
    }

    public static com.tencent.tencentmap.mapsdk.map.CameraUpdate newLatLngBounds(com.tencent.mapsdk.raster.model.LatLngBounds latLngBounds, int i17) {
        com.tencent.tencentmap.mapsdk.map.CameraParameter cameraParameter = new com.tencent.tencentmap.mapsdk.map.CameraParameter();
        cameraParameter.cameraUpdate_type = 9;
        cameraParameter.newLatLngBounds_bounds = latLngBounds;
        cameraParameter.newLatLngBounds_padding = i17;
        return new com.tencent.tencentmap.mapsdk.map.CameraUpdate(cameraParameter);
    }

    public static com.tencent.tencentmap.mapsdk.map.CameraUpdate newLatLngBoundsWithMapCenter(com.tencent.mapsdk.raster.model.LatLngBounds latLngBounds, com.tencent.mapsdk.raster.model.LatLng latLng, int i17) {
        com.tencent.tencentmap.mapsdk.map.CameraParameter cameraParameter = new com.tencent.tencentmap.mapsdk.map.CameraParameter();
        cameraParameter.cameraUpdate_type = 11;
        cameraParameter.newLatLngBounds_bounds = latLngBounds;
        cameraParameter.newLatLng = latLng;
        cameraParameter.newLatLngBounds_padding = i17;
        return new com.tencent.tencentmap.mapsdk.map.CameraUpdate(cameraParameter);
    }

    public static com.tencent.tencentmap.mapsdk.map.CameraUpdate newLatLngZoom(com.tencent.mapsdk.raster.model.LatLng latLng, float f17) {
        com.tencent.tencentmap.mapsdk.map.CameraParameter cameraParameter = new com.tencent.tencentmap.mapsdk.map.CameraParameter();
        cameraParameter.cameraUpdate_type = 8;
        cameraParameter.newLatLngZoom_latlng = latLng;
        cameraParameter.newLatLngZoom_zoom = f17;
        return new com.tencent.tencentmap.mapsdk.map.CameraUpdate(cameraParameter);
    }

    public static com.tencent.tencentmap.mapsdk.map.CameraUpdate rotateTo(com.tencent.mapsdk.raster.model.CameraPosition cameraPosition) {
        com.tencent.tencentmap.mapsdk.map.CameraParameter cameraParameter = new com.tencent.tencentmap.mapsdk.map.CameraParameter();
        cameraParameter.cameraUpdate_type = 13;
        cameraParameter.newCameraPosition = cameraPosition;
        return new com.tencent.tencentmap.mapsdk.map.CameraUpdate(cameraParameter);
    }

    public static com.tencent.tencentmap.mapsdk.map.CameraUpdate scrollBy(float f17, float f18) {
        com.tencent.tencentmap.mapsdk.map.CameraParameter cameraParameter = new com.tencent.tencentmap.mapsdk.map.CameraParameter();
        cameraParameter.cameraUpdate_type = 2;
        cameraParameter.scrollBy_xPixel = f17;
        cameraParameter.scrollBy_yPixel = f18;
        return new com.tencent.tencentmap.mapsdk.map.CameraUpdate(cameraParameter);
    }

    public static com.tencent.tencentmap.mapsdk.map.CameraUpdate zoomBy(float f17) {
        com.tencent.tencentmap.mapsdk.map.CameraParameter cameraParameter = new com.tencent.tencentmap.mapsdk.map.CameraParameter();
        cameraParameter.cameraUpdate_type = 4;
        cameraParameter.zoomBy_amount = f17;
        return new com.tencent.tencentmap.mapsdk.map.CameraUpdate(cameraParameter);
    }

    public static com.tencent.tencentmap.mapsdk.map.CameraUpdate zoomIn() {
        com.tencent.tencentmap.mapsdk.map.CameraParameter cameraParameter = new com.tencent.tencentmap.mapsdk.map.CameraParameter();
        cameraParameter.cameraUpdate_type = 0;
        return new com.tencent.tencentmap.mapsdk.map.CameraUpdate(cameraParameter);
    }

    public static com.tencent.tencentmap.mapsdk.map.CameraUpdate zoomOut() {
        com.tencent.tencentmap.mapsdk.map.CameraParameter cameraParameter = new com.tencent.tencentmap.mapsdk.map.CameraParameter();
        cameraParameter.cameraUpdate_type = 1;
        return new com.tencent.tencentmap.mapsdk.map.CameraUpdate(cameraParameter);
    }

    public static com.tencent.tencentmap.mapsdk.map.CameraUpdate zoomTo(float f17) {
        com.tencent.tencentmap.mapsdk.map.CameraParameter cameraParameter = new com.tencent.tencentmap.mapsdk.map.CameraParameter();
        cameraParameter.cameraUpdate_type = 3;
        cameraParameter.zoomTo_zoom = f17;
        return new com.tencent.tencentmap.mapsdk.map.CameraUpdate(cameraParameter);
    }

    public static com.tencent.tencentmap.mapsdk.map.CameraUpdate zoomBy(float f17, android.graphics.Point point) {
        com.tencent.tencentmap.mapsdk.map.CameraParameter cameraParameter = new com.tencent.tencentmap.mapsdk.map.CameraParameter();
        cameraParameter.cameraUpdate_type = 5;
        cameraParameter.zoomBy_Point_amount = f17;
        cameraParameter.zoomBy_Point_focus = point;
        return new com.tencent.tencentmap.mapsdk.map.CameraUpdate(cameraParameter);
    }

    public static com.tencent.tencentmap.mapsdk.map.CameraUpdate newLatLngBounds(com.tencent.mapsdk.raster.model.LatLngBounds latLngBounds, int i17, int i18, int i19) {
        com.tencent.tencentmap.mapsdk.map.CameraParameter cameraParameter = new com.tencent.tencentmap.mapsdk.map.CameraParameter();
        cameraParameter.cameraUpdate_type = 10;
        cameraParameter.newLatLngBounds_dimension_bounds = latLngBounds;
        cameraParameter.newLatLngBounds_dimension_width = i17;
        cameraParameter.newLatLngBounds_dimension_height = i18;
        cameraParameter.newLatLngBounds_dimension_padding = i19;
        return new com.tencent.tencentmap.mapsdk.map.CameraUpdate(cameraParameter);
    }

    public static com.tencent.tencentmap.mapsdk.map.CameraUpdate newLatLngBounds(com.tencent.mapsdk.raster.model.LatLngBounds latLngBounds, int i17, int i18, int i19, int i27) {
        com.tencent.tencentmap.mapsdk.map.CameraParameter cameraParameter = new com.tencent.tencentmap.mapsdk.map.CameraParameter();
        cameraParameter.cameraUpdate_type = 12;
        cameraParameter.newLatLngBounds_dimension_bounds = latLngBounds;
        cameraParameter.newLatLngBoundsRects_padLeft = i17;
        cameraParameter.newLatLngBoundsRects_padRight = i18;
        cameraParameter.newLatLngBoundsRects_padTop = i19;
        cameraParameter.newLatLngBoundsRects_padBom = i27;
        return new com.tencent.tencentmap.mapsdk.map.CameraUpdate(cameraParameter);
    }
}
