package com.tencent.tencentmap.mapsdk.maps.model;

/* loaded from: classes13.dex */
public interface VectorOverlayProvider {
    com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider displayLevel(int i17);

    void enableClick(boolean z17);

    int getDisplayLevel();

    int getMaxZoom();

    int getMinZoom();

    float getOpacity();

    int getZIndex();

    boolean isClickEnabled();

    boolean isVisibility();

    com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider maxZoom(int i17);

    com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider minZoom(int i17);

    com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider opacity(float f17);

    com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider setVectorOverlayLoadedListener(com.tencent.tencentmap.mapsdk.maps.model.VectorOverlay.OnVectorOverlayLoadListener onVectorOverlayLoadListener);

    com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider visibility(boolean z17);

    com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider zIndex(int i17);
}
