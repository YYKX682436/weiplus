package com.tencent.mm.plugin.location.ui.impl;

/* loaded from: classes13.dex */
public class c1 implements com.tencent.tencentmap.mapsdk.maps.CustomLocationProvider.MyLocationSource {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.location.ui.impl.x1 f144771a;

    public c1(com.tencent.mm.plugin.location.ui.impl.x1 x1Var) {
        this.f144771a = x1Var;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.CustomLocationProvider.MyLocationSource
    public android.location.Location getMyLocation() {
        com.tencent.mm.plugin.location.ui.impl.x1 x1Var = this.f144771a;
        android.location.Location location = x1Var.M1;
        if (location == null) {
            return null;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MMPoiMapUI", "get MyLocation latit:%f, longtitude:%f", java.lang.Double.valueOf(location.getLatitude()), java.lang.Double.valueOf(x1Var.M1.getLongitude()));
        return x1Var.M1;
    }
}
