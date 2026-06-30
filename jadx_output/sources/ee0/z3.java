package ee0;

@j95.b
/* loaded from: classes4.dex */
public class z3 extends i95.w implements fe0.y3 {
    public void Ai(java.lang.String str, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportOpenCanvas", "com.tencent.mm.feature.sns.OpenSdkAdHelperFeatureService");
        l64.a.d(str, i17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportOpenCanvas", "com.tencent.mm.feature.sns.OpenSdkAdHelperFeatureService");
    }

    public java.lang.String wi(long j17, java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getOpenCanvasAdExtraInfo", "com.tencent.mm.feature.sns.OpenSdkAdHelperFeatureService");
        java.lang.String str3 = "";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getOpenCanvasAdExtraInfo", "com.tencent.mm.plugin.sns.ad.opensdk.OpenSdkAdHelper");
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (str == null) {
                str = "";
            }
            jSONObject.put("appId", str);
            jSONObject.put("canvasId", j17 == 0 ? "" : java.lang.String.valueOf(j17));
            if (str2 == null) {
                str2 = "";
            }
            jSONObject.put("uxInfo", str2);
            str3 = jSONObject.toString();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getOpenCanvasAdExtraInfo", "com.tencent.mm.plugin.sns.ad.opensdk.OpenSdkAdHelper");
        } catch (java.lang.Exception unused) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getOpenCanvasAdExtraInfo", "com.tencent.mm.plugin.sns.ad.opensdk.OpenSdkAdHelper");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getOpenCanvasAdExtraInfo", "com.tencent.mm.feature.sns.OpenSdkAdHelperFeatureService");
        return str3;
    }
}
