package com.tencent.tencentmap.mapsdk.maps;

/* loaded from: classes13.dex */
public interface TencentMapNavi extends com.tencent.tencentmap.mapsdk.maps.TencentMap {
    com.tencent.tencentmap.mapsdk.maps.model.IntersectionOverlay addIntersectionEnlargeOverlay(com.tencent.tencentmap.mapsdk.maps.model.IntersectionOverlayOptions intersectionOverlayOptions);

    void addSegmentsWithRouteName(java.util.List<com.tencent.tencentmap.mapsdk.maps.model.MapRouteSection> list, java.util.List<com.tencent.tencentmap.mapsdk.maps.model.LatLng> list2);

    void animateToNaviPosition(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng, float f17, float f18);

    void animateToNaviPosition(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng, float f17, float f18, float f19);

    void animateToNaviPosition(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng, float f17, float f18, float f19, boolean z17);

    void animateToNaviPosition2(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng, float f17, float f18, float f19, boolean z17);

    float calNaviLevel(com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds latLngBounds, float f17, int i17, boolean z17);

    float calNaviLevel2(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng, com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng2, float f17, float f18, int i17, boolean z17);

    float calNaviLevel3(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng, com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng2, float f17, int i17, int i18, int i19, int i27, boolean z17);

    com.tencent.tencentmap.mapsdk.maps.model.CameraPosition calculateZoomToSpanLevelAsync(java.util.List<com.tencent.tencentmap.mapsdk.maps.model.IOverlay> list, java.util.List<com.tencent.tencentmap.mapsdk.maps.model.LatLng> list2, int i17, int i18, int i19, int i27, com.tencent.tencentmap.mapsdk.maps.TencentMap.AsyncOperateCallback<com.tencent.tencentmap.mapsdk.maps.model.CameraPosition> asyncOperateCallback);

    void clearRouteNameSegments();

    boolean isNaviStateEnabled();

    void moveToNavPosition(com.tencent.tencentmap.mapsdk.maps.CameraUpdate cameraUpdate, com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng);

    void setNavCenter(int i17, int i18);

    void setNaviFixingProportion(float f17, float f18);

    void setNaviFixingProportion2D(float f17, float f18);

    void setNaviStateEnabled(boolean z17);

    void setOptionalResourcePath(java.lang.String str);
}
