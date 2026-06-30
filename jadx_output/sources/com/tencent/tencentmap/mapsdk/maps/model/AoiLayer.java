package com.tencent.tencentmap.mapsdk.maps.model;

/* loaded from: classes13.dex */
public interface AoiLayer extends com.tencent.tencentmap.mapsdk.maps.model.IOverlay {

    /* loaded from: classes13.dex */
    public interface OnAoiLayerLoadListener {
        void onAoiLayerLoaded(boolean z17, com.tencent.tencentmap.mapsdk.maps.model.AoiLayer aoiLayer);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.IOverlay
    java.lang.String getId();

    com.tencent.tencentmap.mapsdk.maps.model.LatLng location();

    java.lang.String name();

    boolean remove();

    void showSubPois(boolean z17);
}
