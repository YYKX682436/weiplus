package n74;

/* loaded from: classes4.dex */
public abstract class s {
    public static void a(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, java.lang.String str, int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportFollowResult", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdFinderFollowReportHelper");
        try {
            b(ca4.z0.t0(snsInfo.field_snsId), snsInfo.getUxinfo(), snsInfo.getAdXml().adExtInfo, str, i17, i18);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("FinderFollowReportHelper", "reportFollowResult, exp=" + e17.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportFollowResult", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdFinderFollowReportHelper");
    }

    public static void b(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportFollowResult", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdFinderFollowReportHelper");
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("snsid", str);
            jSONObject.put("uxinfo", str2);
            jSONObject.put("adExtInfo", str3);
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("finderUsername", str4);
            jSONObject2.put("result", i17);
            jSONObject2.put(ya.b.SOURCE, i18);
            jSONObject.put("extInfo", jSONObject2);
            ca4.m0.a("sns_ad_finder_follow_result", jSONObject.toString());
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("FinderFollowReportHelper", "reportFollowResult, exp=" + e17.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportFollowResult", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdFinderFollowReportHelper");
    }
}
