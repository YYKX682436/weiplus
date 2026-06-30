package com.tencent.mm.sdk.platformtools;

/* loaded from: classes13.dex */
public final class o0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sdk.platformtools.t0 f192890d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(com.tencent.mm.sdk.platformtools.t0 t0Var) {
        super(0);
        this.f192890d = t0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.sdk.platformtools.t0 t0Var = this.f192890d;
        if (((java.lang.String) ((jz5.n) t0Var.f192983d).getValue()).equals("<unknown ssid>")) {
            return "02:00:00:00:00:00";
        }
        java.lang.String str = "connectivity_compat_key_wifi_bssid" + ((java.lang.String) ((jz5.n) t0Var.f192983d).getValue()).hashCode();
        com.tencent.mm.sdk.platformtools.o4 o4Var = t0Var.f192981b;
        java.lang.String u17 = o4Var.u(str, null);
        if (u17 != null) {
            com.tencent.mm.sdk.platformtools.m0 a17 = com.tencent.mm.sdk.platformtools.m0.f192844c.a(u17);
            long H1 = com.tencent.mm.sdk.platformtools.t8.H1(a17.f192846b);
            java.lang.String str2 = a17.f192845a;
            if (H1 < 86400 && !str2.equals("02:00:00:00:00:00")) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ConnectivityCompat", "getBssid from cache:" + str2 + ' ' + new com.tencent.mm.sdk.platformtools.z3());
                return str2;
            }
        }
        android.net.wifi.WifiInfo wifiInfo = t0Var.f192980a;
        java.lang.String bssid = wifiInfo != null ? wifiInfo.getBSSID() : null;
        if (bssid == null) {
            bssid = "02:00:00:00:00:00";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getBssid:");
        sb6.append(bssid);
        sb6.append(' ');
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        sb6.append(new com.tencent.mm.sdk.platformtools.z3());
        com.tencent.mars.xlog.Log.i("MicroMsg.ConnectivityCompat", sb6.toString());
        if (!bssid.equals("02:00:00:00:00:00")) {
            com.tencent.mm.sdk.platformtools.t0.f192979g = t0Var;
            o4Var.D(str, bssid + ',' + com.tencent.mm.sdk.platformtools.t8.i1());
        }
        return bssid;
    }
}
