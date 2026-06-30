package x44;

/* loaded from: classes4.dex */
public final class h extends w44.d {
    @Override // w44.d
    public void c(w44.b env, org.json.JSONObject data) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.BackToThirdApp");
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(data, "data");
        java.lang.String optString = data.optString("appId");
        if (optString == null || optString.length() == 0) {
            b(g("the app id is empty!!!"));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.BackToThirdApp");
            return;
        }
        com.tencent.mars.xlog.Log.i("SnsAdJs.BackToThirdApp", "it is going to back to " + optString);
        if (((kt.s0) ((lt.r0) i95.n0.c(lt.r0.class))).Ai("nativeOpenAdCanvas", "", optString, 0, "")) {
            b(l());
        } else {
            b(w44.d.k(this, -1, "launchBackApp failed!!", null, 4, null));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.BackToThirdApp");
    }
}
