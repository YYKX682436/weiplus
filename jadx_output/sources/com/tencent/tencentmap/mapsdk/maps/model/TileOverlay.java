package com.tencent.tencentmap.mapsdk.maps.model;

/* loaded from: classes13.dex */
public interface TileOverlay extends com.tencent.tencentmap.mapsdk.maps.model.IOverlay {
    void clearTileCache();

    @Override // com.tencent.tencentmap.mapsdk.maps.model.IOverlay
    java.lang.String getId();

    void reload();

    void remove();

    void setDiskCacheDir(java.lang.String str);

    void setZindex(int i17);
}
