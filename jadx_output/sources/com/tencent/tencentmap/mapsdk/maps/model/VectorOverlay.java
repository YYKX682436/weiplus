package com.tencent.tencentmap.mapsdk.maps.model;

/* loaded from: classes13.dex */
public interface VectorOverlay extends com.tencent.tencentmap.mapsdk.maps.model.IOverlay {

    /* loaded from: classes13.dex */
    public interface OnVectorOverlayClickListener {
        void onClicked(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng, java.lang.String str, java.lang.String str2);
    }

    /* loaded from: classes13.dex */
    public interface OnVectorOverlayLoadListener {
        void onVectorOverlayLoaded(boolean z17);
    }

    void enableClick(boolean z17);

    com.tencent.map.lib.models.ReturnInfoModelClass.ReturnStatus executeCommandFunction(com.tencent.map.lib.models.CommandFunctionModelClass.BaseCommandFunction baseCommandFunction);

    java.lang.String getType();

    boolean isClickEnabled();

    void remove();

    void setLevel(int i17);

    void setOpacity(float f17);

    void setVisibility(boolean z17);

    void setZIndex(int i17);
}
