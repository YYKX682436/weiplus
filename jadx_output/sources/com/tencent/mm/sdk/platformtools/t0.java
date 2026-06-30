package com.tencent.mm.sdk.platformtools;

/* loaded from: classes13.dex */
public final class t0 {

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.mm.sdk.platformtools.n0 f192978f = new com.tencent.mm.sdk.platformtools.n0(null);

    /* renamed from: g, reason: collision with root package name */
    public static com.tencent.mm.sdk.platformtools.t0 f192979g;

    /* renamed from: a, reason: collision with root package name */
    public final android.net.wifi.WifiInfo f192980a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.o4 f192981b;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f192982c;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f192983d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f192984e;

    public t0(android.net.wifi.WifiInfo wifiInfo) {
        android.net.wifi.WifiInfo wifiInfo2;
        this.f192980a = wifiInfo;
        com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("connectivity_compat");
        this.f192981b = M;
        jz5.h.b(new com.tencent.mm.sdk.platformtools.r0(this));
        this.f192982c = jz5.h.b(new com.tencent.mm.sdk.platformtools.o0(this));
        this.f192983d = jz5.h.b(new com.tencent.mm.sdk.platformtools.s0(this));
        jz5.h.b(new com.tencent.mm.sdk.platformtools.q0(this));
        this.f192984e = jz5.h.b(new com.tencent.mm.sdk.platformtools.p0(this));
        if (wifiInfo == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ConnectivityCompat", "wifiInfo is null");
            f192979g = null;
            M.D("connectivity_compat_key_wifi_ssid", "<unknown ssid>");
            return;
        }
        com.tencent.mm.sdk.platformtools.t0 t0Var = f192979g;
        if (t0Var != null) {
            boolean equals = java.util.Objects.equals((t0Var == null || (wifiInfo2 = t0Var.f192980a) == null) ? null : java.lang.Integer.valueOf(wifiInfo2.getIpAddress()), wifiInfo != null ? java.lang.Integer.valueOf(wifiInfo.getIpAddress()) : null);
            com.tencent.mars.xlog.Log.i("MicroMsg.ConnectivityCompat", "wifiNotChange: " + equals);
            if (equals) {
                return;
            }
        }
        f192979g = null;
        M.D("connectivity_compat_key_wifi_ssid", "<unknown ssid>");
        com.tencent.mars.xlog.Log.i("MicroMsg.ConnectivityCompat", "init wifiInfo");
    }
}
