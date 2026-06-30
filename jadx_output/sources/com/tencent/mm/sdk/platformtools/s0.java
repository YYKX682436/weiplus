package com.tencent.mm.sdk.platformtools;

/* loaded from: classes13.dex */
public final class s0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sdk.platformtools.t0 f192965d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(com.tencent.mm.sdk.platformtools.t0 t0Var) {
        super(0);
        this.f192965d = t0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String str;
        com.tencent.mm.sdk.platformtools.t0 t0Var = this.f192965d;
        android.net.wifi.WifiInfo wifiInfo = t0Var.f192980a;
        com.tencent.mm.sdk.platformtools.o4 o4Var = t0Var.f192981b;
        if (wifiInfo == null) {
            str = null;
        } else if (o4Var.u("connectivity_compat_key_wifi_ssid", "<unknown ssid>").equals("<unknown ssid>")) {
            str = wifiInfo.getSSID();
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.ConnectivityCompat", "getSsid from cache");
            str = o4Var.u("connectivity_compat_key_wifi_ssid", "<unknown ssid>");
        }
        if (str == null) {
            str = "<unknown ssid>";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getSsid ");
        sb6.append(str);
        sb6.append(' ');
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        sb6.append(new com.tencent.mm.sdk.platformtools.z3());
        com.tencent.mars.xlog.Log.i("MicroMsg.ConnectivityCompat", sb6.toString());
        if (!str.equals("<unknown ssid>")) {
            o4Var.D("connectivity_compat_key_wifi_ssid", str);
            com.tencent.mm.sdk.platformtools.t0.f192979g = t0Var;
        }
        return str;
    }
}
