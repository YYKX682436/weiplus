package com.tencent.tencentmap.mapsdk.map;

/* loaded from: classes13.dex */
public interface TencentMap extends com.tencent.tencentmap.mapsdk.map.MapController {

    @java.lang.Deprecated
    public static final int MAP_STYLE_ID_NIGHT = 8;
    public static final int MAP_STYLE_ID_NORMAL = 0;
    public static final int MAP_TYPE_DARK = 1008;
    public static final int MAP_TYPE_NORMAL = 1000;
    public static final int MAP_TYPE_SATELLITE = 1011;

    /* loaded from: classes13.dex */
    public interface InfoWindowAdapter {
        android.view.View getInfoWindow(com.tencent.mapsdk.raster.model.Marker marker);

        void onInfoWindowDettached(com.tencent.mapsdk.raster.model.Marker marker, android.view.View view);
    }

    /* loaded from: classes13.dex */
    public interface OnErrorListener {
        void collectErrorInfo(java.lang.String str);
    }

    /* loaded from: classes13.dex */
    public interface OnIndoorStateChangeListener {
        boolean onIndoorBuildingDeactivated();

        boolean onIndoorBuildingFocused();

        boolean onIndoorLevelActivated(com.tencent.mapsdk.raster.model.IndoorBuilding indoorBuilding);
    }

    /* loaded from: classes13.dex */
    public interface OnInfoWindowClickListener {
        void onInfoWindowClick(com.tencent.mapsdk.raster.model.Marker marker);
    }

    /* loaded from: classes13.dex */
    public interface OnMapCameraChangeListener {
        void onCameraChange(com.tencent.mapsdk.raster.model.CameraPosition cameraPosition);

        void onCameraChangeFinish(com.tencent.mapsdk.raster.model.CameraPosition cameraPosition);
    }

    /* loaded from: classes13.dex */
    public interface OnMapClickListener {
        void onMapClick(com.tencent.mapsdk.raster.model.LatLng latLng);
    }

    /* loaded from: classes13.dex */
    public interface OnMapLoadedListener {
        void onMapLoaded();
    }

    /* loaded from: classes13.dex */
    public interface OnMapLongClickListener {
        void onMapLongClick(com.tencent.mapsdk.raster.model.LatLng latLng);
    }

    /* loaded from: classes13.dex */
    public interface OnMapPoiClickListener {
        void onClicked(com.tencent.mapsdk.raster.model.MapPoi mapPoi);
    }

    /* loaded from: classes13.dex */
    public interface OnMarkerClickListener {
        boolean onMarkerClick(com.tencent.mapsdk.raster.model.Marker marker);
    }

    /* loaded from: classes13.dex */
    public interface OnMarkerDraggedListener {
        void onMarkerDrag(com.tencent.mapsdk.raster.model.Marker marker);

        void onMarkerDragEnd(com.tencent.mapsdk.raster.model.Marker marker);

        void onMarkerDragStart(com.tencent.mapsdk.raster.model.Marker marker);
    }

    /* loaded from: classes13.dex */
    public interface OnScreenShotListener {
        void onMapScreenShot(android.graphics.Bitmap bitmap);
    }

    /* loaded from: classes13.dex */
    public interface TencentMapGestureListener {
        boolean onDoubleTap(float f17, float f18);

        boolean onDown(float f17, float f18);

        boolean onFling(float f17, float f18);

        boolean onLongPress(float f17, float f18);

        void onMapStable();

        boolean onScroll(float f17, float f18);

        boolean onSingleTap(float f17, float f18);

        boolean onTwoFingerMoveAgainst(com.tencent.tencentmap.mapsdk.maps.model.TencentMapGestureListener.TwoFingerMoveAgainstStatus twoFingerMoveAgainstStatus, com.tencent.tencentmap.mapsdk.maps.model.CameraPosition cameraPosition);

        boolean onUp(float f17, float f18);
    }

    com.tencent.tencentmap.mapsdk.maps.model.Arc addArc(com.tencent.tencentmap.mapsdk.maps.model.ArcOptions arcOptions);

    com.tencent.mapsdk.raster.model.Circle addCircle(com.tencent.mapsdk.raster.model.CircleOptions circleOptions);

    com.tencent.mapsdk.raster.model.CustomLayer addCustomLayer(com.tencent.mapsdk.raster.model.CustomLayerOptions customLayerOptions);

    com.tencent.tencentmap.mapsdk.maps.model.GroundOverlay addGroundOverlay(com.tencent.tencentmap.mapsdk.maps.model.GroundOverlayOptions groundOverlayOptions);

    void addInfoWindowAdapter(com.tencent.tencentmap.mapsdk.map.TencentMap.InfoWindowAdapter infoWindowAdapter);

    com.tencent.mapsdk.raster.model.Marker addMarker(com.tencent.mapsdk.raster.model.MarkerOptions markerOptions);

    void addOnInfoWindowClickListener(com.tencent.tencentmap.mapsdk.map.TencentMap.OnInfoWindowClickListener onInfoWindowClickListener);

    void addOnMapCameraChangeListener(com.tencent.tencentmap.mapsdk.map.TencentMap.OnMapCameraChangeListener onMapCameraChangeListener);

    void addOnMapClickListener(com.tencent.tencentmap.mapsdk.map.TencentMap.OnMapClickListener onMapClickListener);

    void addOnMapLoadedListener(com.tencent.tencentmap.mapsdk.map.TencentMap.OnMapLoadedListener onMapLoadedListener);

    void addOnMapLongClickListener(com.tencent.tencentmap.mapsdk.map.TencentMap.OnMapLongClickListener onMapLongClickListener);

    void addOnMarkerClickListener(com.tencent.tencentmap.mapsdk.map.TencentMap.OnMarkerClickListener onMarkerClickListener);

    void addOnMarkerDraggedListener(com.tencent.tencentmap.mapsdk.map.TencentMap.OnMarkerDraggedListener onMarkerDraggedListener);

    com.tencent.mapsdk.raster.model.Polygon addPolygon(com.tencent.mapsdk.raster.model.PolygonOptions polygonOptions);

    com.tencent.mapsdk.raster.model.Polyline addPolyline(com.tencent.mapsdk.raster.model.PolylineOptions polylineOptions);

    com.tencent.mapsdk.raster.model.TileOverlay addTileOverlay(com.tencent.mapsdk.raster.model.TileOverlayOptions tileOverlayOptions);

    com.tencent.map.sdk.comps.vis.VisualLayer addVisualLayer(com.tencent.map.sdk.comps.vis.VisualLayerOptions visualLayerOptions);

    void animateCamera(com.tencent.tencentmap.mapsdk.map.CameraUpdate cameraUpdate);

    void animateCamera(com.tencent.tencentmap.mapsdk.map.CameraUpdate cameraUpdate, long j17, com.tencent.tencentmap.mapsdk.map.CancelableCallback cancelableCallback);

    void clearAllOverlays();

    boolean clearCache();

    void enableAutoMaxOverlooking(boolean z17);

    void enableMultipleInfowindow(boolean z17);

    java.lang.String executeMapVisualLayerCommand(com.tencent.map.sdk.comps.vis.VisualLayer visualLayer, java.lang.String str);

    java.lang.String getActivedIndoorBuilding(com.tencent.mapsdk.raster.model.LatLng latLng);

    java.lang.String[] getActivedIndoorFloorNames();

    com.tencent.mapsdk.raster.model.CameraPosition getCameraPosition();

    java.lang.String getDebugError();

    int getIndoorFloorId();

    com.tencent.mapsdk.raster.model.LatLng getMapCenter();

    int getMapType();

    int getMaxZoomLevel();

    int getMinZoomLevel();

    com.tencent.tencentmap.mapsdk.map.Projection getProjection();

    void getScreenShot(com.tencent.tencentmap.mapsdk.map.TencentMap.OnScreenShotListener onScreenShotListener);

    void getScreenShot(com.tencent.tencentmap.mapsdk.map.TencentMap.OnScreenShotListener onScreenShotListener, android.graphics.Rect rect);

    java.lang.String getVersion();

    int getZoomLevel();

    boolean isAppKeyAvailable();

    boolean isHandDrawMapEnable();

    boolean isSatelliteEnabled();

    boolean isTrafficEnabled();

    void moveCamera(com.tencent.tencentmap.mapsdk.map.CameraUpdate cameraUpdate);

    void remmoveOnInfoWindowClickListener(com.tencent.tencentmap.mapsdk.map.TencentMap.OnInfoWindowClickListener onInfoWindowClickListener);

    void removeInfoWindowAdapter(com.tencent.tencentmap.mapsdk.map.TencentMap.InfoWindowAdapter infoWindowAdapter);

    void removeOnMapCameraChangeListener(com.tencent.tencentmap.mapsdk.map.TencentMap.OnMapCameraChangeListener onMapCameraChangeListener);

    void removeOnMapClickListener(com.tencent.tencentmap.mapsdk.map.TencentMap.OnMapClickListener onMapClickListener);

    void removeOnMapLoadedListener(com.tencent.tencentmap.mapsdk.map.TencentMap.OnMapLoadedListener onMapLoadedListener);

    void removeOnMapLongClickListener(com.tencent.tencentmap.mapsdk.map.TencentMap.OnMapLongClickListener onMapLongClickListener);

    void removeOnMarkerClickListener(com.tencent.tencentmap.mapsdk.map.TencentMap.OnMarkerClickListener onMarkerClickListener);

    void removeOnMarkerDraggedListener(com.tencent.tencentmap.mapsdk.map.TencentMap.OnMarkerDraggedListener onMarkerDraggedListener);

    void removeTencentMapGestureListener(com.tencent.tencentmap.mapsdk.map.TencentMap.TencentMapGestureListener tencentMapGestureListener);

    void scrollBy(float f17, float f18);

    void scrollBy(float f17, float f18, long j17, com.tencent.tencentmap.mapsdk.map.CancelableCallback cancelableCallback);

    void set3DEnable(boolean z17);

    void setBuilding3dEffectEnable(boolean z17);

    void setErrorListener(com.tencent.tencentmap.mapsdk.map.TencentMap.OnErrorListener onErrorListener);

    void setForeignLanguage(com.tencent.mapsdk.raster.model.Language language);

    void setHandDrawMapEnable(boolean z17);

    void setIndoorEnabled(boolean z17);

    void setIndoorFloor(int i17);

    void setIndoorFloor(java.lang.String str, java.lang.String str2);

    void setIndoorMaskColor(int i17);

    void setInfoWindowAdapter(com.tencent.tencentmap.mapsdk.map.TencentMap.InfoWindowAdapter infoWindowAdapter);

    void setMapAnchor(float f17, float f18);

    void setMapBoundary(com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds latLngBounds);

    void setMapStyle(int i17);

    void setMapType(int i17);

    void setMaxZoomLevel(int i17);

    void setMinZoomLevel(int i17);

    void setOnIndoorStateChangeListener(com.tencent.tencentmap.mapsdk.map.TencentMap.OnIndoorStateChangeListener onIndoorStateChangeListener);

    void setOnInfoWindowClickListener(com.tencent.tencentmap.mapsdk.map.TencentMap.OnInfoWindowClickListener onInfoWindowClickListener);

    void setOnMapCameraChangeListener(com.tencent.tencentmap.mapsdk.map.TencentMap.OnMapCameraChangeListener onMapCameraChangeListener);

    void setOnMapClickListener(com.tencent.tencentmap.mapsdk.map.TencentMap.OnMapClickListener onMapClickListener);

    void setOnMapLoadedListener(com.tencent.tencentmap.mapsdk.map.TencentMap.OnMapLoadedListener onMapLoadedListener);

    void setOnMapLongClickListener(com.tencent.tencentmap.mapsdk.map.TencentMap.OnMapLongClickListener onMapLongClickListener);

    void setOnMapPoiClickListener(com.tencent.tencentmap.mapsdk.map.TencentMap.OnMapPoiClickListener onMapPoiClickListener);

    void setOnMarkerClickListener(com.tencent.tencentmap.mapsdk.map.TencentMap.OnMarkerClickListener onMarkerClickListener);

    void setOnMarkerCollisionStatusListener(com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMarkerCollisionStatusListener onMarkerCollisionStatusListener);

    void setOnMarkerDraggedListener(com.tencent.tencentmap.mapsdk.map.TencentMap.OnMarkerDraggedListener onMarkerDraggedListener);

    void setOnPolylineClickListener(com.tencent.tencentmap.mapsdk.maps.TencentMap.OnPolylineClickListener onPolylineClickListener);

    void setOnScaleViewChangedListener(com.tencent.tencentmap.mapsdk.maps.TencentMap.OnScaleViewChangedListener onScaleViewChangedListener);

    void setPoisEnabled(boolean z17);

    void setSatelliteEnabled(boolean z17);

    void setTencentMapGestureListener(com.tencent.tencentmap.mapsdk.map.TencentMap.TencentMapGestureListener tencentMapGestureListener);

    void setTrafficEnabled(boolean z17);

    void showBuilding(boolean z17);

    void stopAnimation();

    void zoomIn();

    void zoomInFixing(int i17, int i18);

    void zoomOut();

    void zoomOutFixing(int i17, int i18);

    @Override // com.tencent.tencentmap.mapsdk.map.MapController
    void zoomToSpan(double d17, double d18);

    @Override // com.tencent.tencentmap.mapsdk.map.MapController
    void zoomToSpan(com.tencent.mapsdk.raster.model.LatLng latLng, com.tencent.mapsdk.raster.model.LatLng latLng2);
}
