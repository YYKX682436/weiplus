package com.tencent.mm.sdk.platformtools;

/* loaded from: classes13.dex */
public final class r0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sdk.platformtools.t0 f192945d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(com.tencent.mm.sdk.platformtools.t0 t0Var) {
        super(0);
        this.f192945d = t0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.net.wifi.WifiInfo wifiInfo = this.f192945d.f192980a;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(wifiInfo != null ? wifiInfo.getRssi() : 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.ConnectivityCompat", "getRssi " + valueOf.intValue());
        return valueOf;
    }
}
