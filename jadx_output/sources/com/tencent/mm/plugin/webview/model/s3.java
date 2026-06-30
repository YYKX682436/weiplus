package com.tencent.mm.plugin.webview.model;

/* loaded from: classes.dex */
public final class s3 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.model.s3 f183104a = new com.tencent.mm.plugin.webview.model.s3();

    /* renamed from: b, reason: collision with root package name */
    public static final kk.j f183105b = new kk.l(10);

    public final java.lang.String a(long j17) {
        com.tencent.mm.plugin.webview.model.t3 t3Var = (com.tencent.mm.plugin.webview.model.t3) ((com.tencent.mm.sdk.platformtools.r2) f183105b).get(java.lang.Long.valueOf(j17));
        if (t3Var == null) {
            return null;
        }
        return b(t3Var.f183121a, t3Var.f183122b);
    }

    public final java.lang.String b(java.lang.String str, java.lang.String str2) {
        if (str == null || r26.n0.N(str)) {
            if (str2 == null || r26.n0.N(str2)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WebViewAdReportHelper", "getAdReportParams null");
                return null;
            }
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("bizInfo", str);
        jSONObject.put("sourceInfo", str2);
        return jSONObject.toString();
    }

    public final void c(long j17, boolean z17) {
        java.lang.String a17 = a(j17);
        if (a17 == null) {
            return;
        }
        ((ee0.c) ((fe0.k3) i95.n0.c(fe0.k3.class))).getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportAddDownloadTaskStraightComplete", "com.tencent.mm.feature.sns.AdConversionOnlineReportService");
        l44.z.b(4001009, a17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportAddDownloadTaskStraightComplete", "com.tencent.mm.feature.sns.AdConversionOnlineReportService");
        if (z17) {
            ((ee0.c) ((fe0.k3) i95.n0.c(fe0.k3.class))).getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportAddDownloadTaskStraightInstallStart", "com.tencent.mm.feature.sns.AdConversionOnlineReportService");
            l44.z.b(4001010, a17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportAddDownloadTaskStraightInstallStart", "com.tencent.mm.feature.sns.AdConversionOnlineReportService");
        }
    }
}
