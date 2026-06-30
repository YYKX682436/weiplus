package jq5;

/* loaded from: classes5.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final jq5.c f301257d = new jq5.c();

    public c() {
        super(0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
    
        if (r0.isWifiEnabled() == true) goto L14;
     */
    @Override // yz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke() {
        /*
            r3 = this;
            android.content.Context r0 = com.tencent.mm.sdk.platformtools.x2.f193071a     // Catch: java.lang.Exception -> L1e
            android.content.Context r0 = r0.getApplicationContext()     // Catch: java.lang.Exception -> L1e
            java.lang.String r1 = "wifi"
            java.lang.Object r0 = r0.getSystemService(r1)     // Catch: java.lang.Exception -> L1e
            boolean r1 = r0 instanceof android.net.wifi.WifiManager     // Catch: java.lang.Exception -> L1e
            if (r1 == 0) goto L13
            android.net.wifi.WifiManager r0 = (android.net.wifi.WifiManager) r0     // Catch: java.lang.Exception -> L1e
            goto L14
        L13:
            r0 = 0
        L14:
            if (r0 == 0) goto L32
            boolean r0 = r0.isWifiEnabled()     // Catch: java.lang.Exception -> L1e
            r1 = 1
            if (r0 != r1) goto L32
            goto L33
        L1e:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "[isWiFiEnable] error="
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "MicroMsg.WeDrop.WeDropPermissionManager"
            com.tencent.mars.xlog.Log.w(r1, r0)
        L32:
            r1 = 0
        L33:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: jq5.c.invoke():java.lang.Object");
    }
}
