package com.tencent.mm.plugin.webview.model;

/* loaded from: classes8.dex */
public class a6 {

    /* renamed from: a, reason: collision with root package name */
    public long f182769a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f182770b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f182771c = true;

    /* renamed from: d, reason: collision with root package name */
    public int f182772d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f182773e;

    public a6(com.tencent.mm.plugin.webview.model.b6 b6Var) {
    }

    public void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebviewReporter", "WebviewPreGetDNSReporter, netType = %d, costTime = %d, url = %s, isSuccess = %s", java.lang.Integer.valueOf(com.tencent.mm.plugin.webview.model.b6.e()), java.lang.Long.valueOf(this.f182769a), this.f182770b, java.lang.Boolean.valueOf(this.f182771c));
        java.lang.String str = this.f182773e;
        java.lang.Object[] objArr = new java.lang.Object[11];
        objArr[0] = 1;
        objArr[1] = java.lang.Long.valueOf(this.f182769a);
        objArr[2] = java.lang.Integer.valueOf(com.tencent.mars.comm.NetStatusUtil.getNetType(com.tencent.mm.sdk.platformtools.x2.f193071a));
        java.lang.String str2 = this.f182770b;
        if (str2 != null) {
            str2 = str2.replace(",", "!");
        }
        objArr[3] = str2;
        objArr[4] = 0;
        objArr[5] = 0;
        objArr[6] = 0;
        objArr[7] = java.lang.Integer.valueOf(com.tencent.mm.plugin.webview.model.b6.f182796p);
        objArr[8] = java.lang.Integer.valueOf(com.tencent.mm.plugin.webview.model.b6.f182797q);
        objArr[9] = java.lang.Integer.valueOf(this.f182772d);
        objArr[10] = this.f182773e;
        com.tencent.mm.plugin.webview.model.b6.a(str, objArr);
        if (!this.f182771c) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(32L, 12L, 1L, true);
        }
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.idkeyStat(32L, 1L, 1L, true);
        g0Var.idkeyStat(32L, 5L, this.f182769a, true);
    }
}
