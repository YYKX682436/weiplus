package com.tencent.tencentmap.mapsdk.maps.interfaces;

/* loaded from: classes13.dex */
public interface Boundable<T extends com.tencent.tencentmap.mapsdk.maps.Projection> {
    android.graphics.Rect getBound(T t17);

    java.util.List<com.tencent.tencentmap.mapsdk.maps.interfaces.Boundable<T>> getGroupBounds();

    android.graphics.Rect getScreenBound(T t17);
}
