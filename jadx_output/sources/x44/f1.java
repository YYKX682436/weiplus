package x44;

/* loaded from: classes4.dex */
public final class f1 extends w44.d {
    @Override // w44.d
    public void c(w44.b env, org.json.JSONObject data) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OpenFinderProfileUI");
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(data, "data");
        java.lang.String optString = data.optString("finderUsername");
        int optInt = data.optInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 9);
        java.lang.String a17 = a54.h.a(env.b());
        java.lang.String j17 = env.b().j();
        if (env.a() == null) {
            com.tencent.mars.xlog.Log.e("SnsAdJs.FinderProfile", "activity is null");
            b(g("activity is null!!"));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OpenFinderProfileUI");
            return;
        }
        if (optString == null || r26.n0.N(optString)) {
            com.tencent.mars.xlog.Log.e("SnsAdJs.FinderProfile", "username is empty!!");
            b(g("username is empty!!"));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OpenFinderProfileUI");
        } else {
            if (com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.getInstance().doJumpToFinderProfileUI(env.a(), optString, a17, j17, optInt)) {
                b(l());
            } else {
                b(w44.d.k(this, 600003, "fail: jump finder profile ui", null, 4, null));
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OpenFinderProfileUI");
        }
    }
}
