package com.tencent.tencentmap.mapsdk.maps;

/* loaded from: classes13.dex */
public final class CameraUpdateFactory {
    private CameraUpdateFactory() {
    }

    private static com.tencent.tencentmap.mapsdk.maps.model.LatLng getSymmetricPoint(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng, com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng2) {
        return new com.tencent.tencentmap.mapsdk.maps.model.LatLng((latLng.latitude * 2.0d) - latLng2.latitude, (latLng.longitude * 2.0d) - latLng2.longitude);
    }

    public static com.tencent.tencentmap.mapsdk.maps.CameraUpdate newCameraPosition(com.tencent.tencentmap.mapsdk.maps.model.CameraPosition cameraPosition) {
        com.tencent.tencentmap.mapsdk.maps.model.CamerParameter camerParameter = new com.tencent.tencentmap.mapsdk.maps.model.CamerParameter();
        camerParameter.iCamerType = com.tencent.tencentmap.mapsdk.maps.model.CamerParameter.NEWCAMER_POSITION;
        camerParameter.newCameraPosition_cameraPosition = cameraPosition;
        return new com.tencent.tencentmap.mapsdk.maps.CameraUpdate(camerParameter);
    }

    public static com.tencent.tencentmap.mapsdk.maps.CameraUpdate newLatLng(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng) {
        com.tencent.tencentmap.mapsdk.maps.model.CamerParameter camerParameter = new com.tencent.tencentmap.mapsdk.maps.model.CamerParameter();
        camerParameter.iCamerType = com.tencent.tencentmap.mapsdk.maps.model.CamerParameter.NEWLATLNG;
        camerParameter.newLatLng_latLng = latLng;
        return new com.tencent.tencentmap.mapsdk.maps.CameraUpdate(camerParameter);
    }

    public static com.tencent.tencentmap.mapsdk.maps.CameraUpdate newLatLngBounds(com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds latLngBounds, int i17) {
        com.tencent.tencentmap.mapsdk.maps.model.CamerParameter camerParameter = new com.tencent.tencentmap.mapsdk.maps.model.CamerParameter();
        camerParameter.iCamerType = com.tencent.tencentmap.mapsdk.maps.model.CamerParameter.NEWLATLNG_BOUNDS;
        camerParameter.newLatLngBounds_bounds = latLngBounds;
        camerParameter.newLatLngBounds_padding = i17;
        return new com.tencent.tencentmap.mapsdk.maps.CameraUpdate(camerParameter);
    }

    public static com.tencent.tencentmap.mapsdk.maps.CameraUpdate newLatLngBoundsRect(com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds latLngBounds, int i17, int i18, int i19, int i27) {
        com.tencent.tencentmap.mapsdk.maps.model.CamerParameter camerParameter = new com.tencent.tencentmap.mapsdk.maps.model.CamerParameter();
        camerParameter.iCamerType = com.tencent.tencentmap.mapsdk.maps.model.CamerParameter.NEWLATLNG_BOUNDS_RECT;
        camerParameter.newLatLngBounds_dimension_bounds = latLngBounds;
        camerParameter.newLatLngBoundsRects_padLeft = i17;
        camerParameter.newLatLngBoundsRects_padRight = i18;
        camerParameter.newLatLngBoundsRects_padTop = i19;
        camerParameter.newLatLngBoundsRects_padBom = i27;
        return new com.tencent.tencentmap.mapsdk.maps.CameraUpdate(camerParameter);
    }

    public static com.tencent.tencentmap.mapsdk.maps.CameraUpdate newLatLngBoundsWithMapCenter(com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds latLngBounds, com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng, int i17) {
        if (latLngBounds == null) {
            return null;
        }
        com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng2 = latLngBounds.northeast;
        com.tencent.tencentmap.mapsdk.maps.model.LatLng symmetricPoint = getSymmetricPoint(latLng, latLng2);
        com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng3 = latLngBounds.southwest;
        com.tencent.tencentmap.mapsdk.maps.model.LatLng symmetricPoint2 = getSymmetricPoint(latLng, latLng3);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(latLng2);
        arrayList.add(symmetricPoint);
        arrayList.add(latLng3);
        arrayList.add(symmetricPoint2);
        return newLatLngBounds(new com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds.Builder().include(arrayList).build(), i17);
    }

    public static com.tencent.tencentmap.mapsdk.maps.CameraUpdate newLatLngZoom(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng, float f17) {
        com.tencent.tencentmap.mapsdk.maps.model.CamerParameter camerParameter = new com.tencent.tencentmap.mapsdk.maps.model.CamerParameter();
        camerParameter.iCamerType = com.tencent.tencentmap.mapsdk.maps.model.CamerParameter.NEWLATLNG_ZOOM;
        camerParameter.newLatLngZoom_latLng = latLng;
        camerParameter.newLatLngZoom_zoom = f17;
        return new com.tencent.tencentmap.mapsdk.maps.CameraUpdate(camerParameter);
    }

    public static com.tencent.tencentmap.mapsdk.maps.CameraUpdate rotateTo(float f17, float f18) {
        com.tencent.tencentmap.mapsdk.maps.model.CamerParameter camerParameter = new com.tencent.tencentmap.mapsdk.maps.model.CamerParameter();
        camerParameter.iCamerType = com.tencent.tencentmap.mapsdk.maps.model.CamerParameter.ROTATETO;
        camerParameter.rotateto_rotate = f17;
        camerParameter.rotateto_skew = f18;
        return new com.tencent.tencentmap.mapsdk.maps.CameraUpdate(camerParameter);
    }

    public static com.tencent.tencentmap.mapsdk.maps.CameraUpdate scrollBy(float f17, float f18) {
        com.tencent.tencentmap.mapsdk.maps.model.CamerParameter camerParameter = new com.tencent.tencentmap.mapsdk.maps.model.CamerParameter();
        camerParameter.iCamerType = com.tencent.tencentmap.mapsdk.maps.model.CamerParameter.SCROLLBY;
        camerParameter.scrollBy_xPixel = f17;
        camerParameter.scrollBy_yPixel = f18;
        return new com.tencent.tencentmap.mapsdk.maps.CameraUpdate(camerParameter);
    }

    public static com.tencent.tencentmap.mapsdk.maps.CameraUpdate zoomBy(float f17) {
        com.tencent.tencentmap.mapsdk.maps.model.CamerParameter camerParameter = new com.tencent.tencentmap.mapsdk.maps.model.CamerParameter();
        camerParameter.iCamerType = com.tencent.tencentmap.mapsdk.maps.model.CamerParameter.ZOOMBY;
        camerParameter.zoomBy_amount = f17;
        return new com.tencent.tencentmap.mapsdk.maps.CameraUpdate(camerParameter);
    }

    public static com.tencent.tencentmap.mapsdk.maps.CameraUpdate zoomIn() {
        com.tencent.tencentmap.mapsdk.maps.model.CamerParameter camerParameter = new com.tencent.tencentmap.mapsdk.maps.model.CamerParameter();
        camerParameter.iCamerType = com.tencent.tencentmap.mapsdk.maps.model.CamerParameter.ZOOMIN;
        return new com.tencent.tencentmap.mapsdk.maps.CameraUpdate(camerParameter);
    }

    public static com.tencent.tencentmap.mapsdk.maps.CameraUpdate zoomOut() {
        com.tencent.tencentmap.mapsdk.maps.model.CamerParameter camerParameter = new com.tencent.tencentmap.mapsdk.maps.model.CamerParameter();
        camerParameter.iCamerType = com.tencent.tencentmap.mapsdk.maps.model.CamerParameter.ZOOMOUT;
        return new com.tencent.tencentmap.mapsdk.maps.CameraUpdate(camerParameter);
    }

    public static com.tencent.tencentmap.mapsdk.maps.CameraUpdate zoomTo(float f17) {
        com.tencent.tencentmap.mapsdk.maps.model.CamerParameter camerParameter = new com.tencent.tencentmap.mapsdk.maps.model.CamerParameter();
        camerParameter.iCamerType = com.tencent.tencentmap.mapsdk.maps.model.CamerParameter.ZOOMTO;
        camerParameter.zoomTo_zoom = f17;
        return new com.tencent.tencentmap.mapsdk.maps.CameraUpdate(camerParameter);
    }

    public static com.tencent.tencentmap.mapsdk.maps.CameraUpdate zoomBy(float f17, android.graphics.Point point) {
        com.tencent.tencentmap.mapsdk.maps.model.CamerParameter camerParameter = new com.tencent.tencentmap.mapsdk.maps.model.CamerParameter();
        camerParameter.iCamerType = com.tencent.tencentmap.mapsdk.maps.model.CamerParameter.ZOOMBY_POINT;
        camerParameter.zoomBy_Point_amount = f17;
        camerParameter.zoomBy_Point_focus = point;
        return new com.tencent.tencentmap.mapsdk.maps.CameraUpdate(camerParameter);
    }
}
