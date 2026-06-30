package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class sd implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.SnsInfo f170451d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f170452e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f170453f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f170454g;

    public sd(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, int i17, int i18, int i19) {
        this.f170451d = snsInfo;
        this.f170452e = i17;
        this.f170453f = i18;
        this.f170454g = i19;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.StringBuilder sb6;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl$4");
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f170451d;
        int i17 = this.f170452e;
        int i18 = this.f170453f;
        int i19 = this.f170454g;
        java.lang.String str5 = "";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doReportVideoPlay", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl");
        try {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            str = "run";
            try {
                sb6 = new java.lang.StringBuilder();
                str2 = "doReportVideoPlay";
                str3 = "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl";
            } catch (java.lang.Exception e17) {
                e = e17;
                str2 = "doReportVideoPlay";
                str3 = "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl";
                com.tencent.mars.xlog.Log.i("SnsAdPressGestureCtrl", "reportVideoPlay, exp=" + e.toString());
                str4 = str2;
                ca4.q.c(str4, e);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str4, str3);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str, "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl$4");
            }
            try {
                sb6.append(snsInfo.field_snsId);
                sb6.append("");
                jSONObject.put("snsid", sb6.toString());
                java.lang.String str6 = snsInfo.getAdInfo().uxInfo;
                if (str6 != null) {
                    str5 = str6;
                }
                jSONObject.put("uxinfo", str5);
                jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, i19);
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                jSONObject2.put("playCount", i17);
                jSONObject2.put("playTotalTime", i18);
                jSONObject.put("extInfo", jSONObject2);
                java.lang.String jSONObject3 = jSONObject.toString();
                ca4.m0.a("timeline_fullcard_longpress_exposure", jSONObject3);
                com.tencent.mars.xlog.Log.i("SnsAdPressGestureCtrl", "reportVideoPlay, content=" + jSONObject3 + ", channel=timeline_fullcard_longpress_exposure, cost=" + (android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
                str4 = str2;
            } catch (java.lang.Exception e18) {
                e = e18;
                com.tencent.mars.xlog.Log.i("SnsAdPressGestureCtrl", "reportVideoPlay, exp=" + e.toString());
                str4 = str2;
                ca4.q.c(str4, e);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str4, str3);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str, "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl$4");
            }
        } catch (java.lang.Exception e19) {
            e = e19;
            str = "run";
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str4, str3);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str, "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl$4");
    }
}
