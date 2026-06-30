package com.tencent.mm.plugin.webview.core;

/* loaded from: classes8.dex */
public final class v2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f181996d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f181997e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f181998f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.core.e3 f181999g;

    public v2(java.lang.String str, int i17, java.lang.String str2, com.tencent.mm.plugin.webview.core.e3 e3Var) {
        this.f181996d = str;
        this.f181997e = i17;
        this.f181998f = str2;
        this.f181999g = e3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str;
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[4];
        objArr[0] = this.f181996d;
        objArr[1] = java.lang.Integer.valueOf(this.f181997e);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        objArr[2] = com.tencent.mars.comm.NetStatusUtil.isWifi(context) ? "wifi" : com.tencent.mars.comm.NetStatusUtil.is5G(context) ? "5g" : com.tencent.mars.comm.NetStatusUtil.is4G(context) ? "4g" : com.tencent.mars.comm.NetStatusUtil.is3G(context) ? "3g" : com.tencent.mars.comm.NetStatusUtil.is2G(context) ? "2g" : com.tencent.mm.plugin.lite.LiteAppCenter.FRAMEWORK_TYPE_NONE;
        java.lang.String str2 = this.f181998f;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        try {
            java.net.InetAddress[] allByName = java.net.InetAddress.getAllByName(str2);
            if (allByName != null && allByName.length > 0) {
                for (java.net.InetAddress inetAddress : allByName) {
                    sb6.append(inetAddress.getHostAddress());
                    sb6.append(";");
                }
            }
            str = sb6.toString();
        } catch (java.net.UnknownHostException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(this.f181999g.o1(), e17, "dnsIps", new java.lang.Object[0]);
            str = null;
        }
        objArr[3] = str;
        g0Var.d(17082, objArr);
    }
}
