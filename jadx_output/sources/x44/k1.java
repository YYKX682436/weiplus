package x44;

/* loaded from: classes4.dex */
public final class k1 extends w44.d {
    @Override // w44.d
    public void c(w44.b env, org.json.JSONObject data) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OpenWebView");
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(data, "data");
        java.lang.String optString = data.optString("url", "");
        int optInt = data.optInt("jumpAnimationType", 0);
        boolean optBoolean = data.optBoolean("openInHalfScreen", false);
        if (optString == null || optString.length() == 0) {
            com.tencent.mars.xlog.Log.e("SnsAdJs.OpenWebView", "the web view url is empty!!!");
            b(g("the url is empty!!"));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OpenWebView");
            return;
        }
        if (env.a() == null) {
            com.tencent.mars.xlog.Log.e("SnsAdJs.OpenWebView", "the activity is null");
            b(g("the activity is null!!"));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OpenWebView");
            return;
        }
        long F1 = com.tencent.mm.sdk.platformtools.t8.F1(env.b().j(), 0L);
        if (optBoolean && env.b().s()) {
            ((ku5.t0) ku5.t0.f312615d).B(new x44.j1(env, optString, F1));
        } else {
            a84.a0.b(env.a(), optString, env.b(), env.b().l(), F1, "", !data.optBoolean("notAppendParamsToActionLink", false));
            if (optInt == 1) {
                env.a().overridePendingTransition(com.tencent.mm.R.anim.f477857df, com.tencent.mm.R.anim.f477728p);
            } else {
                env.a().overridePendingTransition(com.tencent.mm.R.anim.f477886ea, com.tencent.mm.R.anim.f477882e6);
            }
        }
        b(l());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OpenWebView");
    }
}
