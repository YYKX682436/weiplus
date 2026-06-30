package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes.dex */
public final class fa {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.ui.tools.fa f184180a = new com.tencent.mm.plugin.webview.ui.tools.fa();

    /* renamed from: b, reason: collision with root package name */
    public static int f184181b;

    public final void a(android.content.Intent intent, java.lang.String url, boolean z17) {
        android.os.Bundle bundle;
        java.lang.String str;
        kotlin.jvm.internal.o.g(url, "url");
        if (intent == null || (bundle = (android.os.Bundle) intent.getParcelableExtra("ad_report_bundle")) == null || !bundle.getBoolean("ad_need_report", false)) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewThirdAdReporter", "adReportArgs is not null and isADReport is true, ad h5");
        java.lang.String string = bundle.getString("ad_report_ux_info");
        int i17 = bundle.getInt("ad_report_scene", 0);
        int i18 = bundle.getInt("ad_report_source", 0);
        java.lang.String string2 = android.text.TextUtils.isEmpty(bundle.getString("ad_report_sns_id")) ? bundle.getString("ad_report_sns_id") : "";
        try {
            java.lang.String b17 = fp.s0.b(url, com.tencent.mapsdk.internal.rv.f51270c);
            kotlin.jvm.internal.o.f(b17, "encode(...)");
            str = b17;
        } catch (java.io.UnsupportedEncodingException unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebViewThirdAdReporter", "url encode error url = %s", url);
            str = "";
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.String str2 = str;
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(16972, string2, java.lang.Integer.valueOf(i17), string, java.lang.Integer.valueOf(i18), "", str2, java.lang.Integer.valueOf(z17 ? 1 : 0), java.lang.Integer.valueOf(f184181b), java.lang.Long.valueOf(currentTimeMillis));
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewThirdAdReporter", "%s,%s,%s,%s,%s,%s,%s,%s,%s", string2, java.lang.Integer.valueOf(i17), string, java.lang.Integer.valueOf(i18), "", str2, java.lang.Integer.valueOf(z17 ? 1 : 0), java.lang.Integer.valueOf(f184181b), java.lang.Long.valueOf(currentTimeMillis));
    }
}
