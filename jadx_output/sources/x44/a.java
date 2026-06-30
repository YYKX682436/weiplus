package x44;

/* loaded from: classes4.dex */
public final class a extends w44.d {
    @Override // w44.d
    public void c(w44.b env, org.json.JSONObject data) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.AdGetRandomSelectCardDone");
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(data, "data");
        try {
            java.lang.String D = env.b().D();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getVangoghId", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghIdUtil");
            java.lang.String str = "";
            if (D.length() == 0) {
                com.tencent.mars.xlog.Log.w("SnsAd.PageParameter", "dynamic canvas info is empty, it can't obtain vangogh id!!!");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getVangoghId", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghIdUtil");
            } else {
                try {
                    java.lang.String optString = new org.json.JSONObject(D).optString("vangogh_id");
                    if (optString != null) {
                        str = optString;
                    }
                } catch (org.json.JSONException unused) {
                    com.tencent.mars.xlog.Log.w("SnsAd.PageParameter", "the dynamicCanvasInfo isn't a json string???");
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getVangoghId", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghIdUtil");
            }
            java.lang.String optString2 = data.optString("vangoghId");
            org.json.JSONArray optJSONArray = data.optJSONArray("selectedCards");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("vangoghId is ");
            sb6.append(str);
            sb6.append(", vangoghIdFromJson is ");
            sb6.append(optString2);
            sb6.append(", selectedCards is ");
            sb6.append(optJSONArray != null ? optJSONArray.toString() : null);
            com.tencent.mars.xlog.Log.i("SnsAdJs.AdGetRandomSelectCardDone", sb6.toString());
            y84.p3.f460192a.b(str, optJSONArray);
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("vangoghId", str);
            jSONObject.put("vangoghIdFromJson", optString2);
            jSONObject.put("selectedCards", optJSONArray);
            m(jSONObject);
            b(jSONObject);
        } catch (java.lang.Throwable th6) {
            ca4.q.c("SnsAdJs.AdGetRandomSelectCardDone", th6);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.AdGetRandomSelectCardDone");
    }
}
