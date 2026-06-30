package com.tencent.tencentmap.mapsdk.maps;

/* loaded from: classes13.dex */
public interface LocationSource {

    /* loaded from: classes13.dex */
    public interface OnLocationChangedListener {
        void onLocationChanged(android.location.Location location);
    }

    void activate(com.tencent.tencentmap.mapsdk.maps.LocationSource.OnLocationChangedListener onLocationChangedListener);

    void deactivate();
}
