package com.tencent.tencentmap.mapsdk.maps;

/* loaded from: classes13.dex */
public interface TencentMap extends com.tencent.map.sdk.comps.indoor.IIndoor, com.tencent.map.sdk.comps.mylocation.IMyLocation {
    public static final int MAP_MODE_NAV = 12;
    public static final int MAP_MODE_NAV_NIGHT = 1013;
    public static final int MAP_MODE_NAV_TRAFFIC = 1009;
    public static final int MAP_MODE_NORMAL = 0;
    public static final int MAP_MODE_NORMAL_TRAFFIC = 5;
    public static final int MAP_TYPE_DARK = 1008;
    public static final int MAP_TYPE_NAVI = 1012;
    public static final int MAP_TYPE_NIGHT = 1013;
    public static final int MAP_TYPE_NONE = 0;
    public static final int MAP_TYPE_NORMAL = 1000;
    public static final int MAP_TYPE_SATELLITE = 1011;
    public static final int MAP_TYPE_TRAFFIC_NAVI = 1009;
    public static final int MAP_TYPE_TRAFFIC_NIGHT = 1010;

    /* loaded from: classes13.dex */
    public interface AsyncOperateCallback<T> {
        void onOperateFinished(T t17);
    }

    /* loaded from: classes13.dex */
    public interface CancelableCallback {
        void onCancel();

        void onFinish();
    }

    /* loaded from: classes13.dex */
    public interface IClickedObject {
        java.lang.String getIdentifier();

        java.lang.String getName();

        com.tencent.tencentmap.mapsdk.maps.model.LatLng getPosition();
    }

    /* loaded from: classes13.dex */
    public interface InfoWindowAdapter {
        android.view.View getInfoContents(com.tencent.tencentmap.mapsdk.maps.model.Marker marker);

        android.view.View getInfoWindow(com.tencent.tencentmap.mapsdk.maps.model.Marker marker);
    }

    /* loaded from: classes13.dex */
    public interface OnAuthResultCallback {
        void onAuthFail(int i17, java.lang.String str);

        void onAuthSuccess();
    }

    /* loaded from: classes13.dex */
    public interface OnCameraChangeListener {
        void onCameraChange(com.tencent.tencentmap.mapsdk.maps.model.CameraPosition cameraPosition);

        void onCameraChangeFinished(com.tencent.tencentmap.mapsdk.maps.model.CameraPosition cameraPosition);
    }

    /* loaded from: classes13.dex */
    public interface OnCompassClickedListener {
        void onCompassClicked();
    }

    /* loaded from: classes13.dex */
    public interface OnDismissCallback {
        void onDismiss();

        void onNotify();
    }

    /* loaded from: classes13.dex */
    public interface OnIndoorStateChangeListener {
        boolean onIndoorBuildingDeactivated();

        boolean onIndoorBuildingFocused();

        boolean onIndoorLevelActivated(com.tencent.tencentmap.mapsdk.maps.model.IndoorBuilding indoorBuilding);
    }

    /* loaded from: classes13.dex */
    public interface OnInfoWindowClickListener {
        void onInfoWindowClick(com.tencent.tencentmap.mapsdk.maps.model.Marker marker);

        void onInfoWindowClickLocation(int i17, int i18, int i19, int i27);
    }

    /* loaded from: classes13.dex */
    public interface OnMapClickListener {
        void onMapClick(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng);
    }

    /* loaded from: classes13.dex */
    public interface OnMapFrameFinishCallback {
        void onMapFrameFinished();

        void onMapFrameStart();
    }

    /* loaded from: classes13.dex */
    public interface OnMapLoadedCallback {
        void onMapLoaded();
    }

    /* loaded from: classes13.dex */
    public interface OnMapLongClickListener {
        void onMapLongClick(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng);
    }

    /* loaded from: classes13.dex */
    public interface OnMapPoiClickListener {
        void onClicked(com.tencent.tencentmap.mapsdk.maps.model.MapPoi mapPoi);
    }

    /* loaded from: classes13.dex */
    public interface OnMarkerClickListener {
        boolean onMarkerClick(com.tencent.tencentmap.mapsdk.maps.model.Marker marker);
    }

    /* loaded from: classes13.dex */
    public interface OnMarkerCollisionStatusListener {
        void onCollisionHidden(com.tencent.tencentmap.mapsdk.maps.model.Marker marker, java.util.List<com.tencent.tencentmap.mapsdk.maps.model.MarkerCollisionRelationUnit> list);

        void onCollisionShown(com.tencent.tencentmap.mapsdk.maps.model.Marker marker, java.util.List<com.tencent.tencentmap.mapsdk.maps.model.MarkerCollisionRelationUnit> list);
    }

    /* loaded from: classes13.dex */
    public interface OnMarkerDragListener {
        void onMarkerDrag(com.tencent.tencentmap.mapsdk.maps.model.Marker marker);

        void onMarkerDragEnd(com.tencent.tencentmap.mapsdk.maps.model.Marker marker);

        void onMarkerDragStart(com.tencent.tencentmap.mapsdk.maps.model.Marker marker);
    }

    /* loaded from: classes13.dex */
    public interface OnMyLocationChangeListener {
        void onMyLocationChange(android.location.Location location);
    }

    /* loaded from: classes13.dex */
    public interface OnMyLocationClickListener {
        boolean onMyLocationClicked(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng);
    }

    /* loaded from: classes13.dex */
    public interface OnPolygonClickListener {
        void onPolygonClick(com.tencent.tencentmap.mapsdk.maps.model.Polygon polygon, com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng);
    }

    /* loaded from: classes13.dex */
    public interface OnPolylineClickListener {
        void onPolylineClick(com.tencent.tencentmap.mapsdk.maps.model.Polyline polyline, com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng);
    }

    /* loaded from: classes13.dex */
    public interface OnScaleViewChangedListener {
        void onScaleViewChanged(float f17);
    }

    /* loaded from: classes13.dex */
    public interface OnTrafficEventClickListener {
        void onTrafficEventClicked(com.tencent.tencentmap.mapsdk.maps.model.TrafficEvent trafficEvent);
    }

    /* loaded from: classes13.dex */
    public interface OnVectorOverlayClickListener {
        void onClicked(com.tencent.tencentmap.mapsdk.maps.model.VectorOverlay vectorOverlay, com.tencent.tencentmap.mapsdk.maps.TencentMap.IClickedObject iClickedObject);
    }

    /* loaded from: classes13.dex */
    public interface SnapshotReadyCallback {
        void onSnapshotReady(android.graphics.Bitmap bitmap);
    }

    com.tencent.tencentmap.mapsdk.maps.model.AoiLayer addAoiLayer(java.lang.String str, com.tencent.tencentmap.mapsdk.maps.model.AoiLayerOptions aoiLayerOptions, com.tencent.tencentmap.mapsdk.maps.model.AoiLayer.OnAoiLayerLoadListener onAoiLayerLoadListener);

    com.tencent.tencentmap.mapsdk.maps.model.Arc addArc(com.tencent.tencentmap.mapsdk.maps.model.ArcOptions arcOptions);

    com.tencent.tencentmap.mapsdk.maps.model.Circle addCircle(com.tencent.tencentmap.mapsdk.maps.model.CircleOptions circleOptions);

    com.tencent.tencentmap.mapsdk.maps.model.CustomLayer addCustomLayer(com.tencent.tencentmap.mapsdk.maps.model.CustomLayerOptions customLayerOptions);

    com.tencent.tencentmap.mapsdk.maps.model.GroundOverlay addGroundOverlay(com.tencent.tencentmap.mapsdk.maps.model.GroundOverlayOptions groundOverlayOptions);

    com.tencent.tencentmap.mapsdk.maps.model.Marker addMarker(com.tencent.tencentmap.mapsdk.maps.model.MarkerOptions markerOptions);

    void addOnMapLoadedCallback(com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMapLoadedCallback onMapLoadedCallback);

    com.tencent.tencentmap.mapsdk.maps.model.Polygon addPolygon(com.tencent.tencentmap.mapsdk.maps.model.PolygonOptions polygonOptions);

    com.tencent.tencentmap.mapsdk.maps.model.Polyline addPolyline(com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions polylineOptions);

    void addTencentMapGestureListener(com.tencent.tencentmap.mapsdk.maps.model.TencentMapGestureListener tencentMapGestureListener);

    com.tencent.tencentmap.mapsdk.maps.model.TileOverlay addTileOverlay(com.tencent.tencentmap.mapsdk.maps.model.TileOverlayOptions tileOverlayOptions);

    com.tencent.tencentmap.mapsdk.maps.model.VectorHeatOverlay addVectorHeatOverlay(com.tencent.tencentmap.mapsdk.maps.model.VectorHeatOverlayOptions vectorHeatOverlayOptions);

    <L extends com.tencent.tencentmap.mapsdk.maps.model.VectorOverlay> L addVectorOverlay(com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider vectorOverlayProvider);

    com.tencent.map.sdk.comps.vis.VisualLayer addVisualLayer(com.tencent.map.sdk.comps.vis.VisualLayerOptions visualLayerOptions);

    void animateCamera(com.tencent.tencentmap.mapsdk.maps.CameraUpdate cameraUpdate);

    void animateCamera(com.tencent.tencentmap.mapsdk.maps.CameraUpdate cameraUpdate, long j17, com.tencent.tencentmap.mapsdk.maps.TencentMap.CancelableCallback cancelableCallback);

    void animateCamera(com.tencent.tencentmap.mapsdk.maps.CameraUpdate cameraUpdate, com.tencent.tencentmap.mapsdk.maps.TencentMap.CancelableCallback cancelableCallback);

    com.tencent.tencentmap.mapsdk.maps.model.CameraPosition calculateMapOverLook(com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds latLngBounds, android.graphics.RectF rectF, float f17, float f18, int i17, int i18, int i19, int i27);

    com.tencent.tencentmap.mapsdk.maps.model.CameraPosition calculateZoomToSpanLevel(java.util.List<com.tencent.tencentmap.mapsdk.maps.model.IOverlay> list, java.util.List<com.tencent.tencentmap.mapsdk.maps.model.LatLng> list2, int i17, int i18, int i19, int i27);

    void clear();

    void clearAllOverlays();

    void clearCache();

    void enableAutoMaxSkew(boolean z17);

    void enableMultipleInfowindow(boolean z17);

    java.lang.String executeVisualLayerCommand(com.tencent.map.sdk.comps.vis.VisualLayer visualLayer, java.lang.String str);

    java.util.List<com.tencent.tencentmap.mapsdk.maps.model.LatLng> getBounderPoints(com.tencent.tencentmap.mapsdk.maps.model.Marker marker);

    com.tencent.tencentmap.mapsdk.maps.model.CameraPosition getCameraPosition();

    java.lang.String getCityName(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng);

    java.lang.String getDebugError();

    com.tencent.tencentmap.mapsdk.maps.model.Language getLanguage();

    <T extends com.tencent.tencentmap.mapsdk.maps.TencentMapComponent.Component> T getMapComponent(java.lang.Class<T> cls);

    com.tencent.tencentmap.mapsdk.maps.TencentMapContext getMapContext();

    int getMapHeight();

    android.graphics.Rect getMapPadding();

    int getMapStyle();

    int getMapType();

    int getMapWidth();

    float getMaxZoomLevel();

    float getMinZoomLevel();

    com.tencent.tencentmap.mapsdk.maps.Projection getProjection();

    java.util.List<com.tencent.tencentmap.mapsdk.maps.model.Marker> getScreenMarkers();

    com.tencent.tencentmap.mapsdk.maps.UiSettings getUiSettings();

    java.lang.String getVersion();

    com.tencent.tencentmap.mapsdk.maps.VisualSettings getVisualSettings();

    float getZoomToSpanLevel(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng, com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng2);

    boolean isBlockRouteEnabled();

    boolean isDestroyed();

    boolean isHandDrawMapEnable();

    boolean isSateLiteEnable();

    boolean isTrafficEnabled();

    void loadKMLFile(java.lang.String str);

    void moveCamera(com.tencent.tencentmap.mapsdk.maps.CameraUpdate cameraUpdate);

    void removeOnMapLoadedCallback(com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMapLoadedCallback onMapLoadedCallback);

    void removeTencentMapGestureListener(com.tencent.tencentmap.mapsdk.maps.model.TencentMapGestureListener tencentMapGestureListener);

    void setBaseMapEnabled(boolean z17);

    void setBlockRouteEnabled(boolean z17);

    void setBuilding3dEffectEnable(boolean z17);

    void setBuildingBlackList(java.util.List<com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds> list);

    void setBuildingEnable(boolean z17);

    void setCameraCenterProportion(float f17, float f18);

    void setCameraCenterProportion(float f17, float f18, boolean z17);

    void setCustomRender(com.tencent.tencentmap.mapsdk.maps.CustomRender customRender);

    void setDrawPillarWith2DStyle(boolean z17);

    void setForeignLanguage(com.tencent.tencentmap.mapsdk.maps.model.Language language);

    void setHandDrawMapEnable(boolean z17);

    void setInfoWindowAdapter(com.tencent.tencentmap.mapsdk.maps.TencentMap.InfoWindowAdapter infoWindowAdapter);

    void setLanguage(com.tencent.tencentmap.mapsdk.maps.model.Language language);

    void setLocationCompassHidden(boolean z17);

    void setLocationNavigationGravityLineHidden(boolean z17);

    void setMapCenterAndScale(float f17, float f18, float f19);

    void setMapFontSize(com.tencent.tencentmap.mapsdk.maps.model.MapFontSize mapFontSize);

    void setMapFrameRate(float f17);

    void setMapStyle(int i17);

    void setMapType(int i17);

    void setMaxZoomLevel(int i17);

    void setMinZoomLevel(int i17);

    void setMyLocationStyle(com.tencent.tencentmap.mapsdk.maps.model.MyLocationStyle myLocationStyle);

    void setOnCameraChangeListener(com.tencent.tencentmap.mapsdk.maps.TencentMap.OnCameraChangeListener onCameraChangeListener);

    void setOnCompassClickedListener(com.tencent.tencentmap.mapsdk.maps.TencentMap.OnCompassClickedListener onCompassClickedListener);

    void setOnInfoWindowClickListener(com.tencent.tencentmap.mapsdk.maps.TencentMap.OnInfoWindowClickListener onInfoWindowClickListener);

    void setOnMapClickListener(com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMapClickListener onMapClickListener);

    void setOnMapFrameFinished(com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMapFrameFinishCallback onMapFrameFinishCallback);

    void setOnMapLoadedCallback(com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMapLoadedCallback onMapLoadedCallback);

    void setOnMapLongClickListener(com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMapLongClickListener onMapLongClickListener);

    void setOnMapPoiClickListener(com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMapPoiClickListener onMapPoiClickListener);

    void setOnMarkerClickListener(com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMarkerClickListener onMarkerClickListener);

    void setOnMarkerCollisionStatusListener(com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMarkerCollisionStatusListener onMarkerCollisionStatusListener);

    void setOnMarkerDragListener(com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMarkerDragListener onMarkerDragListener);

    void setOnPolygonClickListener(com.tencent.tencentmap.mapsdk.maps.TencentMap.OnPolygonClickListener onPolygonClickListener);

    void setOnPolylineClickListener(com.tencent.tencentmap.mapsdk.maps.TencentMap.OnPolylineClickListener onPolylineClickListener);

    void setOnScaleViewChangedListener(com.tencent.tencentmap.mapsdk.maps.TencentMap.OnScaleViewChangedListener onScaleViewChangedListener);

    void setOnTapMapViewInfoWindowHidden(boolean z17);

    void setOnTrafficEventClickListener(com.tencent.tencentmap.mapsdk.maps.TencentMap.OnTrafficEventClickListener onTrafficEventClickListener);

    void setOnVectorOverlayClickListener(com.tencent.tencentmap.mapsdk.maps.TencentMap.OnVectorOverlayClickListener onVectorOverlayClickListener);

    void setOverSeaEnable(boolean z17);

    void setOverSeaTileProvider(com.tencent.tencentmap.mapsdk.maps.model.OverSeaTileProvider overSeaTileProvider);

    void setPadding(int i17, int i18, int i19, int i27);

    void setPadding(int i17, int i18, int i19, int i27, boolean z17);

    void setPointToCenter(int i17, int i18);

    void setPoisEnabled(boolean z17);

    void setRestrictBounds(com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds latLngBounds, com.tencent.tencentmap.mapsdk.maps.model.RestrictBoundsFitMode restrictBoundsFitMode);

    void setSatelliteEnabled(boolean z17);

    void setSceneByTag(java.lang.String str);

    void setTencentMapGestureListener(com.tencent.tencentmap.mapsdk.maps.model.TencentMapGestureListener tencentMapGestureListener);

    void setTrafficEnabled(boolean z17);

    void setTrafficMode(int i17, int i18);

    void showBuilding(boolean z17);

    void snapshot(com.tencent.tencentmap.mapsdk.maps.TencentMap.SnapshotReadyCallback snapshotReadyCallback);

    void snapshot(com.tencent.tencentmap.mapsdk.maps.TencentMap.SnapshotReadyCallback snapshotReadyCallback, android.graphics.Bitmap.Config config);

    void snapshot(com.tencent.tencentmap.mapsdk.maps.TencentMap.SnapshotReadyCallback snapshotReadyCallback, android.graphics.Bitmap.Config config, int i17);

    void stopAnimation();

    void updateVectorOverlay(com.tencent.tencentmap.mapsdk.maps.model.VectorOverlay vectorOverlay, com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider vectorOverlayProvider);
}
