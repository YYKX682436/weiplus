package x44;

/* loaded from: classes4.dex */
public final class v1 extends w44.d {
    @Override // w44.d
    public void c(w44.b env, org.json.JSONObject data) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.QueryFinderLivingState");
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(data, "data");
        java.lang.String optString = data.optString("finderUsername");
        if (optString == null) {
            optString = "";
        }
        java.lang.String optString2 = data.optString("finderLiveId");
        java.lang.String str = optString2 != null ? optString2 : "";
        if (!(optString.length() == 0)) {
            if (!(str.length() == 0)) {
                java.lang.String j17 = env.b().j();
                if (j17 == null) {
                    j17 = "0";
                }
                d44.h.d(j17, optString, str, new x44.u1(this));
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.QueryFinderLivingState");
                return;
            }
        }
        com.tencent.mars.xlog.Log.e("SnsAdJs.QueryFinderLivingState", "finderUsername or finderLiveId is empty!!!");
        b(g("finderUsername or finderLiveId is empty!!!"));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.QueryFinderLivingState");
    }
}
