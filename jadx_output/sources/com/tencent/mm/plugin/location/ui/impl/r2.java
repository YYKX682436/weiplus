package com.tencent.mm.plugin.location.ui.impl;

/* loaded from: classes13.dex */
public class r2 implements com.tencent.tencentmap.mapsdk.maps.CustomLocationProvider.MyLocationSource {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.location.ui.impl.q2 f144892a;

    public r2(com.tencent.mm.plugin.location.ui.impl.q2 q2Var) {
        this.f144892a = q2Var;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.CustomLocationProvider.MyLocationSource
    public android.location.Location getMyLocation() {
        com.tencent.mm.plugin.location.ui.impl.q2 q2Var = this.f144892a;
        android.location.Location location = q2Var.G;
        if (location == null) {
            return null;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ViewMapUI", "get MyLocation latit:%f, longtitude:%f", java.lang.Double.valueOf(location.getLatitude()), java.lang.Double.valueOf(q2Var.G.getLongitude()));
        return q2Var.G;
    }
}
