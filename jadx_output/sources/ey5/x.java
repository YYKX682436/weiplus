package ey5;

/* loaded from: classes13.dex */
public abstract class x {
    public static com.tencent.mapsdk.raster.model.LatLng a(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng) {
        if (latLng == null) {
            return null;
        }
        return new com.tencent.mapsdk.raster.model.LatLng(latLng.latitude, latLng.longitude);
    }

    public static java.util.List b(java.util.List list) {
        if (list == null) {
            return null;
        }
        com.tencent.tencentmap.mapsdk.maps.model.LatLng[] latLngArr = (com.tencent.tencentmap.mapsdk.maps.model.LatLng[]) list.toArray(new com.tencent.tencentmap.mapsdk.maps.model.LatLng[list.size()]);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng : latLngArr) {
            arrayList.add(a(latLng));
        }
        return arrayList;
    }

    public static com.tencent.mapsdk.raster.model.CameraPosition c(com.tencent.tencentmap.mapsdk.maps.model.CameraPosition cameraPosition) {
        if (cameraPosition == null) {
            return null;
        }
        return new com.tencent.mapsdk.raster.model.CameraPosition(a(cameraPosition.target), cameraPosition.zoom, cameraPosition.tilt, cameraPosition.bearing);
    }

    public static com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds d(com.tencent.mapsdk.raster.model.LatLngBounds latLngBounds) {
        if (latLngBounds == null || latLngBounds.getNortheast() == null || latLngBounds.getSouthwest() == null) {
            return null;
        }
        return new com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds(new com.tencent.tencentmap.mapsdk.maps.model.LatLng(latLngBounds.getSouthwest().getLatitude(), latLngBounds.getSouthwest().getLongitude()), new com.tencent.tencentmap.mapsdk.maps.model.LatLng(latLngBounds.getNortheast().getLatitude(), latLngBounds.getNortheast().getLongitude()));
    }

    public static com.tencent.tencentmap.mapsdk.maps.CameraUpdate e(com.tencent.tencentmap.mapsdk.map.CameraUpdate cameraUpdate, com.tencent.tencentmap.mapsdk.maps.TencentMap tencentMap) {
        int i17;
        int i18;
        int i19;
        if (cameraUpdate == null || cameraUpdate.getParams() == null) {
            return null;
        }
        com.tencent.tencentmap.mapsdk.map.CameraParameter params = cameraUpdate.getParams();
        switch (cameraUpdate.getParams().cameraUpdate_type) {
            case 0:
                return com.tencent.tencentmap.mapsdk.maps.CameraUpdateFactory.zoomIn();
            case 1:
                return com.tencent.tencentmap.mapsdk.maps.CameraUpdateFactory.zoomOut();
            case 2:
                return com.tencent.tencentmap.mapsdk.maps.CameraUpdateFactory.scrollBy(params.scrollBy_xPixel, params.scrollBy_yPixel);
            case 3:
                return com.tencent.tencentmap.mapsdk.maps.CameraUpdateFactory.zoomTo(params.zoomTo_zoom < tencentMap.getMinZoomLevel() ? tencentMap.getMinZoomLevel() : params.zoomTo_zoom > tencentMap.getMaxZoomLevel() ? tencentMap.getMaxZoomLevel() : params.zoomTo_zoom);
            case 4:
                return com.tencent.tencentmap.mapsdk.maps.CameraUpdateFactory.zoomBy(params.zoomBy_amount);
            case 5:
                return com.tencent.tencentmap.mapsdk.maps.CameraUpdateFactory.zoomBy(params.zoomBy_Point_amount, params.zoomBy_Point_focus);
            case 6:
                com.tencent.mapsdk.raster.model.CameraPosition cameraPosition = params.newCameraPosition;
                return com.tencent.tencentmap.mapsdk.maps.CameraUpdateFactory.newCameraPosition(cameraPosition != null ? new com.tencent.tencentmap.mapsdk.maps.model.CameraPosition(f(cameraPosition.getTarget()), cameraPosition.getZoom(), cameraPosition.getSkew(), cameraPosition.getBearing()) : null);
            case 7:
                return com.tencent.tencentmap.mapsdk.maps.CameraUpdateFactory.newLatLng(f(params.newLatLng));
            case 8:
                return com.tencent.tencentmap.mapsdk.maps.CameraUpdateFactory.newLatLngZoom(f(params.newLatLngZoom_latlng), params.newLatLngZoom_zoom);
            case 9:
                return com.tencent.tencentmap.mapsdk.maps.CameraUpdateFactory.newLatLngBounds(d(params.newLatLngBounds_bounds), params.newLatLngBounds_padding);
            case 10:
                if (tencentMap == null || tencentMap.getMapWidth() == 0 || tencentMap.getMapWidth() == 0) {
                    i17 = 0;
                    i18 = 0;
                    i19 = 0;
                } else {
                    i18 = params.newLatLngBounds_dimension_width < tencentMap.getMapWidth() ? (tencentMap.getMapWidth() / 2) - ((params.newLatLngBounds_dimension_width / 2) - params.newLatLngBounds_dimension_padding) : 0;
                    int i27 = i18;
                    i17 = params.newLatLngBounds_dimension_height < tencentMap.getMapHeight() ? (tencentMap.getMapHeight() / 2) - ((params.newLatLngBounds_dimension_height / 2) - params.newLatLngBounds_dimension_padding) : 0;
                    r5 = i27;
                    i19 = i17;
                }
                return com.tencent.tencentmap.mapsdk.maps.CameraUpdateFactory.newLatLngBoundsRect(d(params.newLatLngBounds_dimension_bounds), r5, i18, i17, i19);
            case 11:
                return com.tencent.tencentmap.mapsdk.maps.CameraUpdateFactory.newLatLngBoundsWithMapCenter(d(params.newLatLngBounds_bounds), f(params.newLatLng), params.newLatLngBounds_padding);
            case 12:
                return com.tencent.tencentmap.mapsdk.maps.CameraUpdateFactory.newLatLngBoundsRect(d(params.newLatLngBounds_dimension_bounds), params.newLatLngBoundsRects_padLeft, params.newLatLngBoundsRects_padRight, params.newLatLngBoundsRects_padTop, params.newLatLngBoundsRects_padBom);
            case 13:
                return com.tencent.tencentmap.mapsdk.maps.CameraUpdateFactory.rotateTo(params.newCameraPosition.getBearing(), params.newCameraPosition.getSkew());
            default:
                return null;
        }
    }

    public static com.tencent.tencentmap.mapsdk.maps.model.LatLng f(com.tencent.mapsdk.raster.model.LatLng latLng) {
        if (latLng == null) {
            return null;
        }
        return new com.tencent.tencentmap.mapsdk.maps.model.LatLng(latLng.getLatitude(), latLng.getLongitude());
    }

    public static java.util.List g(java.util.List list) {
        if (list == null) {
            return null;
        }
        com.tencent.mapsdk.raster.model.LatLng[] latLngArr = (com.tencent.mapsdk.raster.model.LatLng[]) list.toArray(new com.tencent.mapsdk.raster.model.LatLng[list.size()]);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.tencent.mapsdk.raster.model.LatLng latLng : latLngArr) {
            arrayList.add(f(latLng));
        }
        return arrayList;
    }

    public static com.tencent.tencentmap.mapsdk.maps.model.MarkerOptions h(com.tencent.mapsdk.raster.model.MarkerOptions markerOptions) {
        com.tencent.tencentmap.mapsdk.maps.model.LatLng f17;
        if (markerOptions == null || (f17 = f(markerOptions.getPosition())) == null) {
            return null;
        }
        com.tencent.tencentmap.mapsdk.maps.model.MarkerOptions markerOptions2 = new com.tencent.tencentmap.mapsdk.maps.model.MarkerOptions(f17);
        com.tencent.tencentmap.mapsdk.maps.model.MarkerOptions rotation = markerOptions2.alpha(markerOptions.getAlpha()).visible(markerOptions.isVisible()).draggable(markerOptions.isDraggable()).anchor(markerOptions.getAnchorU(), markerOptions.getAnchorV()).rotation(markerOptions.getRotation());
        com.tencent.mapsdk.raster.model.IndoorInfo indoorInfo = markerOptions.getIndoorInfo();
        rotation.indoorInfo(indoorInfo != null ? new com.tencent.tencentmap.mapsdk.maps.model.IndoorInfo(indoorInfo.getBuildingId(), indoorInfo.getFloorName()) : null).zIndex(markerOptions.getZIndex()).level(markerOptions.getLevel()).flat(markerOptions.isFlat()).clockwise(markerOptions.isFlat() != markerOptions.isClockwise()).infoWindowOffset(markerOptions.getInfoWindowOffsetX(), markerOptions.getInfowindowOffsetY()).contentDescription(markerOptions.getContentDescription());
        if (markerOptions.getIcon() != null) {
            markerOptions2.icon(com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptorFactory.fromBitmap(markerOptions.getIcon().getBitmap()));
        }
        if (markerOptions.getMarkerView() != null) {
            markerOptions2.icon(com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptorFactory.fromView(markerOptions.getMarkerView()));
        }
        if (markerOptions.getSnippet() != null) {
            markerOptions2.snippet(markerOptions.getSnippet());
        }
        if (markerOptions.getTitle() != null) {
            markerOptions2.title(markerOptions.getTitle());
        }
        if (markerOptions.getTag() != null) {
            markerOptions2.tag(markerOptions.getTag());
        }
        if (markerOptions.getCollisions() != null) {
            markerOptions2.collisionBy(markerOptions.getCollisions());
        }
        if (markerOptions.getCollisionRelation() != null) {
            markerOptions2.setCollisionRelation(markerOptions.getCollisionRelation());
        }
        return markerOptions2;
    }
}
