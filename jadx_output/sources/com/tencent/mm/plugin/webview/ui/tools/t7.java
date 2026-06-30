package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class t7 {

    /* renamed from: i, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.ui.tools.t7 f186896i = new com.tencent.mm.plugin.webview.ui.tools.t7();

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f186897a;

    /* renamed from: b, reason: collision with root package name */
    public int f186898b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f186899c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f186900d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f186901e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f186902f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f186903g = false;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.webview.stub.v0 f186904h = null;

    public void a() {
        java.lang.String str = this.f186897a;
        this.f186903g = true;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        c(4, "", 0);
        this.f186897a = null;
    }

    public java.lang.String b() {
        return this.f186897a;
    }

    public final void c(int i17, java.lang.String str, int i18) {
        m21.x xVar = new m21.x();
        xVar.a("20adInfo", this.f186897a + ",");
        xVar.a("21optype", i17 + ",");
        xVar.a("22sessionId", this.f186899c + ",");
        xVar.a("23currURL", this.f186902f + ",");
        xVar.a("24referURL", str + ",");
        xVar.a("25errCode", i18 + ",");
        xVar.a("26networkType", this.f186898b + ",");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        sb6.append(java.lang.System.currentTimeMillis());
        sb6.append(",");
        xVar.a("27timeStamp", sb6.toString());
        xVar.a("28ssid", this.f186900d + ",");
        xVar.a("29bssid", this.f186901e + ",");
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewReportUtil", "report logbuffer adPageOp(13791): optype:%d, sessionId:%s, currUrl:%s, referUrl:%s, errCode:%d, networkType:%d", java.lang.Integer.valueOf(i17), this.f186899c, this.f186902f, str, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(this.f186898b));
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13791, xVar);
        if (this.f186904h == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebViewReportUtil", "report invoker null");
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("ad_report_data_str", xVar.toString());
        try {
            this.f186904h.F4(1295, bundle);
        } catch (android.os.RemoteException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebViewReportUtil", "report: exp:%s", e17);
        }
    }

    public void d(java.lang.String str, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewReportUtil", "setting traceid " + str + ",usename " + str2);
        this.f186897a = str;
        this.f186898b = com.tencent.mm.plugin.webview.model.b6.e();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(str2);
        sb6.append("");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        sb6.append(java.lang.System.currentTimeMillis());
        this.f186899c = com.tencent.mm.sdk.platformtools.w2.a(sb6.toString());
        this.f186900d = "";
        this.f186901e = "";
        this.f186903g = false;
    }
}
