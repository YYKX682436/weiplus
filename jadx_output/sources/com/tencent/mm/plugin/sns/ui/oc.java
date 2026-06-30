package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class oc implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f170093d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.pc f170094e;

    public oc(com.tencent.mm.plugin.sns.ui.pc pcVar, java.lang.Object obj) {
        this.f170094e = pcVar;
        this.f170093d = obj;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.Iterator<java.lang.String> it;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$5$1");
        com.tencent.mm.plugin.sns.ui.pc pcVar = this.f170094e;
        java.lang.String X6 = com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI.X6(pcVar.f170211a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2200", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI = pcVar.f170211a;
        java.lang.String str = snsAdNativeLandingPagesUI.D;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2200", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        java.lang.String str2 = (java.lang.String) this.f170093d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2300", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        java.lang.String str3 = snsAdNativeLandingPagesUI.f166755x1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2300", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2400", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        java.lang.String str4 = snsAdNativeLandingPagesUI.f166759y1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2400", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getADLandingPageInfosStrByDynamicDataUpdate", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
        java.lang.String str5 = new java.lang.String(X6);
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str2);
            com.tencent.mars.xlog.Log.i("AdLandingPagesParseHelper", "the jsonObject is " + jSONObject.toString());
            java.util.Iterator<java.lang.String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                java.lang.String next = keys.next();
                if (next != null && (next instanceof java.lang.String)) {
                    java.lang.String str6 = next;
                    java.lang.String string = jSONObject.getString(str6);
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(string)) {
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                        it = keys;
                        sb6.append("{{");
                        sb6.append(str6);
                        sb6.append("}}");
                        str5 = str5.replace(sb6.toString(), "<![CDATA[" + string + "]]>");
                        keys = it;
                    }
                }
                it = keys;
                keys = it;
            }
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.e("AdLandingPagesParseHelper", "the json is parsed error : " + X6);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getADLandingPageInfosStrByDynamicDataUpdate", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2200", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        java.lang.String str7 = snsAdNativeLandingPagesUI.D;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2200", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        za4.x0 x0Var = new za4.x0(str5, str7, snsAdNativeLandingPagesUI);
        snsAdNativeLandingPagesUI.f166709g = x0Var.f471214a;
        snsAdNativeLandingPagesUI.f166712h = x0Var.f471215b;
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.sns.ui.nc(this));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$5$1");
    }
}
