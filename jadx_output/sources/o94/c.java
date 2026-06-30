package o94;

/* loaded from: classes4.dex */
public abstract class c {
    public static void a(int i17, java.lang.String str, android.widget.ImageView imageView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("loadImage", "com.tencent.mm.plugin.sns.adutils.HalfScreenSubscribeUtils");
        if (android.text.TextUtils.isEmpty(str) || imageView == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("loadImage", "com.tencent.mm.plugin.sns.adutils.HalfScreenSubscribeUtils");
            return;
        }
        imageView.hashCode();
        za4.t0.a(str, false, 41, 0, new o94.b(imageView, i17, str));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("loadImage", "com.tencent.mm.plugin.sns.adutils.HalfScreenSubscribeUtils");
    }

    public static void b(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, int i17, com.tencent.mm.plugin.sns.storage.x2 x2Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("subscribeReport", "com.tencent.mm.plugin.sns.adutils.HalfScreenSubscribeUtils");
        if (snsInfo == null || x2Var == null) {
            com.tencent.mars.xlog.Log.e("HalfScreenSubscribeUtils", "reportSubscribe snsInfo==null or reportInfo==null, scene = " + i17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("subscribeReport", "com.tencent.mm.plugin.sns.adutils.HalfScreenSubscribeUtils");
            return;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTempId", "com.tencent.mm.plugin.sns.storage.SubscribeReportInfo");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTempId", "com.tencent.mm.plugin.sns.storage.SubscribeReportInfo");
            jSONObject2.put("tempId", x2Var.f166167a);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getWeausername", "com.tencent.mm.plugin.sns.storage.SubscribeReportInfo");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getWeausername", "com.tencent.mm.plugin.sns.storage.SubscribeReportInfo");
            jSONObject2.put("weausername", x2Var.f166168b);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getClickSubmitBtn", "com.tencent.mm.plugin.sns.storage.SubscribeReportInfo");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getClickSubmitBtn", "com.tencent.mm.plugin.sns.storage.SubscribeReportInfo");
            jSONObject2.put("clickSubmitBtn", x2Var.f166169c);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSubscribeResult", "com.tencent.mm.plugin.sns.storage.SubscribeReportInfo");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSubscribeResult", "com.tencent.mm.plugin.sns.storage.SubscribeReportInfo");
            jSONObject2.put("subscribeResult", x2Var.f166170d);
            int i18 = i17 == 0 ? 1 : 2;
            java.lang.String uxinfo = snsInfo.getUxinfo();
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (uxinfo == null) {
                uxinfo = "";
            }
            jSONObject.put("extInfo", jSONObject2);
            jSONObject.put("uxinfo", uxinfo);
            jSONObject.put("snsid", snsInfo.field_snsId);
            jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, i18);
            java.lang.String jSONObject3 = jSONObject.toString();
            ca4.m0.a("timeline_subscription_message", jSONObject3);
            com.tencent.mars.xlog.Log.i("HalfScreenSubscribeUtils", "reportSubscribe timeline_subscription_message, content=" + jSONObject3);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("HalfScreenSubscribeUtils", "reportSubscribe exp:" + e17.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("subscribeReport", "com.tencent.mm.plugin.sns.adutils.HalfScreenSubscribeUtils");
    }
}
