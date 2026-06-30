package com.tencent.tencentmap.mapsdk.maps;

/* loaded from: classes13.dex */
public interface TencentMapComponent {

    /* loaded from: classes13.dex */
    public interface Component {
        com.tencent.tencentmap.mapsdk.maps.TencentMapContext getMapContext();
    }

    com.tencent.tencentmap.mapsdk.maps.model.IAlphaAnimation createAlphaAnimation(float f17, float f18);

    com.tencent.tencentmap.mapsdk.maps.model.IAnimationSet createAnimationSet(boolean z17);

    com.tencent.tencentmap.mapsdk.maps.model.IEmergeAnimation createEmergeAnimation(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng);

    com.tencent.map.sdk.utilities.heatmap.HeatMapTileProvider createHeatMapTileProvider(com.tencent.map.sdk.utilities.heatmap.HeatMapTileProvider.Builder builder);

    com.tencent.tencentmap.mapsdk.maps.model.IRotateAnimation createRotateAnimation(float f17, float f18, float f19, float f27, float f28);

    com.tencent.tencentmap.mapsdk.maps.model.IScaleAnimation createScaleAnimation(float f17, float f18, float f19, float f27);

    com.tencent.tencentmap.mapsdk.maps.model.ITranslateAnimation createTranslateAnimation(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng);

    <T extends com.tencent.tencentmap.mapsdk.maps.TencentMapComponent.Component> T getMapComponent(java.lang.Class<T> cls);

    com.tencent.tencentmap.mapsdk.maps.TencentMapServiceProtocol getMapServiceProtocol();
}
