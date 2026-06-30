package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f164435d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f164436e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.model.AdLandingPagesProxy f164437f;

    public m(com.tencent.mm.plugin.sns.model.AdLandingPagesProxy adLandingPagesProxy, java.lang.String str, long j17) {
        this.f164437f = adLandingPagesProxy;
        this.f164435d = str;
        this.f164436e = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str = this.f164435d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$9");
        java.lang.String str2 = "";
        try {
            ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).getClass();
            com.tencent.mm.pluginsdk.model.app.m h17 = com.tencent.mm.pluginsdk.model.app.w.h(str);
            if (h17 == null) {
                com.tencent.mars.xlog.Log.i("AdLandingPagesProxy", "getOpenSdkAppInfoMM, no cahcer, appId=" + str);
                ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).getClass();
                h17 = com.tencent.mm.pluginsdk.model.app.w.k(str, true);
            } else {
                com.tencent.mars.xlog.Log.i("AdLandingPagesProxy", "getOpenSdkAppInfoMM, hit cache, appId=" + str);
            }
            if (h17 != null) {
                try {
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    java.lang.String str3 = h17.field_appIconUrl;
                    boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    if (str3 == null) {
                        str3 = "";
                    }
                    jSONObject.put("icon", str3);
                    java.lang.String str4 = h17.field_appName;
                    if (str4 == null) {
                        str4 = "";
                    }
                    jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, str4);
                    java.lang.String str5 = h17.field_packageName;
                    if (str5 == null) {
                        str5 = "";
                    }
                    jSONObject.put("pkg", str5);
                    str2 = jSONObject.toString();
                } catch (java.lang.Exception unused) {
                }
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("AdLandingPagesProxy", "getOpenSdkAppInfoMM, exp=" + th6.toString());
        }
        this.f164437f.CLIENT_CALL("onGetOpenSdkAppInfo", str2, java.lang.Long.valueOf(this.f164436e));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$9");
    }
}
