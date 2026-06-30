package com.tencent.tencentmap.mapsdk.maps.model;

/* loaded from: classes6.dex */
public interface MaskLayer {
    java.lang.String getId();

    com.tencent.tencentmap.mapsdk.maps.model.MaskLayerOptions getOptions();

    int getZIndex();

    boolean isClickable();

    boolean isVisible();

    void remove();

    void remove(long j17);

    void setOptions(com.tencent.tencentmap.mapsdk.maps.model.MaskLayerOptions maskLayerOptions);

    void setVisible(boolean z17);

    void setZIndex(int i17);
}
