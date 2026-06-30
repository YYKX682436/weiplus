package m54;

/* loaded from: classes4.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public static final m54.c0 f324250a = new m54.c0();

    public final boolean a(android.content.Context context, java.lang.String canvasKey, m54.l pageParameter) {
        java.lang.String optString;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doDowngradeWithCanvasKey", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghDowngradeSupport");
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(canvasKey, "canvasKey");
        kotlin.jvm.internal.o.g(pageParameter, "pageParameter");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(com.tencent.rtmp.TXLiveConstants.PLAY_EVT_VOD_PLAY_PREPARED, 40);
        m54.y c17 = m54.j.f324282a.c(canvasKey);
        boolean z17 = false;
        if (!m54.j.h(c17)) {
            com.tencent.mars.xlog.Log.e("SnsAd.VangoghDowngrade", "there is no vangogh page with the canvas key, ".concat(canvasKey));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doDowngradeWithCanvasKey", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghDowngradeSupport");
            return false;
        }
        java.lang.String a17 = c17.a();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("analyzeVangoghData", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghDowngradeSupport");
        java.lang.String str = "";
        m54.b0 b0Var = new m54.b0(0, "");
        try {
            org.json.JSONObject optJSONObject = new org.json.JSONObject(a17).optJSONObject("fallback");
            if (optJSONObject != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parseDowngradeConfig", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghDowngradeSupport");
                int optInt = optJSONObject.optInt("type", 0);
                if (optInt == 1 && (optString = optJSONObject.optString("url")) != null) {
                    str = optString;
                }
                m54.b0 b0Var2 = new m54.b0(optInt, str);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseDowngradeConfig", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghDowngradeSupport");
                b0Var = b0Var2;
            }
        } catch (org.json.JSONException unused) {
            com.tencent.mars.xlog.Log.e("SnsAd.VangoghDowngrade", "the vangogh data is invalid json object, please check it!");
            if (ca4.m0.c0()) {
                com.tencent.mars.xlog.Log.i("SnsAd.VangoghDowngrade", "the vangogh data is " + a17);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("analyzeVangoghData", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghDowngradeSupport");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doDowngradeAction", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghDowngradeSupport");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getType", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghDowngradeSupport$VangoghDowngradeData");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getType", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghDowngradeSupport$VangoghDowngradeData");
        if (b0Var.f324248a == 1) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("downgradeToWeb", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghDowngradeSupport");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getValue", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghDowngradeSupport$VangoghDowngradeData");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getValue", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghDowngradeSupport$VangoghDowngradeData");
            java.lang.Object obj = b0Var.f324249b;
            if (obj instanceof java.lang.String) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getValue", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghDowngradeSupport$VangoghDowngradeData");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getValue", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghDowngradeSupport$VangoghDowngradeData");
                if (((java.lang.CharSequence) obj).length() > 0) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getValue", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghDowngradeSupport$VangoghDowngradeData");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getValue", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghDowngradeSupport$VangoghDowngradeData");
                    a84.a0.b(context, (java.lang.String) obj, pageParameter, pageParameter.l(), 0L, "", true);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("downgradeToWeb", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghDowngradeSupport");
                    z17 = true;
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("downgradeToWeb", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghDowngradeSupport");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doDowngradeAction", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghDowngradeSupport");
        if (z17) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(com.tencent.rtmp.TXLiveConstants.PLAY_EVT_VOD_PLAY_PREPARED, 41);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doDowngradeWithCanvasKey", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghDowngradeSupport");
        return z17;
    }

    public final void b(android.content.Context context, java.lang.String query, android.os.Bundle extraData) {
        java.lang.String str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doDowngradeWithQuery", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghDowngradeSupport");
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(query, "query");
        kotlin.jvm.internal.o.g(extraData, "extraData");
        try {
            str = new org.json.JSONObject(query).optString("canvasKey");
        } catch (org.json.JSONException unused) {
            com.tencent.mars.xlog.Log.e("SnsAd.VangoghDowngrade", "the query is invalid!!!");
            str = "";
        }
        kotlin.jvm.internal.o.d(str);
        if (str.length() == 0) {
            com.tencent.mars.xlog.Log.e("SnsAd.VangoghDowngrade", "the canvas key is empty!!!");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doDowngradeWithQuery", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghDowngradeSupport");
            return;
        }
        m54.l lVar = new m54.l();
        m54.i0.c(lVar, extraData);
        m54.i0.a(lVar);
        if (!a(context, str, lVar)) {
            com.tencent.mars.xlog.Log.w("SnsAd.VangoghDowngrade", "the canvasKey's downgrade don't be handled.");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doDowngradeWithQuery", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghDowngradeSupport");
    }
}
