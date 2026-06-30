package i64;

/* loaded from: classes4.dex */
public final class u extends i64.a0 {

    /* renamed from: d, reason: collision with root package name */
    public static final i64.u f289322d = new i64.u();

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String f289323e = "AdDynamicUpdateModelManager";

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f289324f = new java.util.concurrent.ConcurrentHashMap();

    @Override // i64.a0
    public java.lang.String d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTAG", "com.tencent.mm.plugin.sns.ad.model.AdDynamicUpdateModelManager");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTAG", "com.tencent.mm.plugin.sns.ad.model.AdDynamicUpdateModelManager");
        return f289323e;
    }

    public void g() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("clear", "com.tencent.mm.plugin.sns.ad.model.AdDynamicUpdateModelManager");
        ((java.util.LinkedHashMap) c()).clear();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMutexes", "com.tencent.mm.plugin.sns.ad.model.AdModelManager");
        java.util.Map map = this.f289063b;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMutexes", "com.tencent.mm.plugin.sns.ad.model.AdModelManager");
        ((java.util.LinkedHashMap) map).clear();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clear", "com.tencent.mm.plugin.sns.ad.model.AdDynamicUpdateModelManager");
    }

    public final void h(s74.f3 f3Var, org.json.JSONArray jSONArray) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateViewNode", "com.tencent.mm.plugin.sns.ad.model.AdDynamicUpdateModelManager");
        int length = jSONArray.length();
        for (int i17 = 0; i17 < length; i17++) {
            org.json.JSONObject optJSONObject = jSONArray.optJSONObject(i17);
            if (optJSONObject != null) {
                java.lang.String optString = optJSONObject.optString(dm.i4.COL_ID);
                if (optString == null || optString.length() == 0) {
                    com.tencent.mars.xlog.Log.e(d(), "updateViewNode, id empty");
                } else {
                    s74.j3 a17 = f3Var.a(optString);
                    if (a17 == null) {
                        com.tencent.mars.xlog.Log.e(d(), "updateViewNode, findViewNodeById==null, id=" + optString);
                    } else {
                        s74.y2 y2Var = s74.y2.f404609a;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getObj", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$ViewNode");
                        org.json.JSONObject jSONObject = a17.f404368c;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getObj", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$ViewNode");
                        y2Var.d(jSONObject, optJSONObject);
                        f3Var.v(a17);
                    }
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateViewNode", "com.tencent.mm.plugin.sns.ad.model.AdDynamicUpdateModelManager");
    }
}
