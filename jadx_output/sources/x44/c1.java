package x44;

/* loaded from: classes4.dex */
public final class c1 extends w44.d {
    @Override // w44.d
    public void c(w44.b env, org.json.JSONObject data) {
        com.tencent.mm.plugin.sns.storage.ADInfo adInfo;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OpenFinderDetailUI");
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(data, "data");
        java.lang.String optString = data.optString("finderUsername");
        java.lang.String optString2 = data.optString("finderExportId");
        java.lang.String optString3 = data.optString("finderObjectNonceId");
        boolean z17 = false;
        if (!(optString == null || r26.n0.N(optString))) {
            if (!(optString2 == null || r26.n0.N(optString2))) {
                if (!(optString3 == null || r26.n0.N(optString3))) {
                    if (env.a() == null) {
                        b(g("activity is null"));
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OpenFinderDetailUI");
                        return;
                    }
                    java.lang.String a17 = a54.h.a(env.b());
                    java.lang.String k17 = env.b().k();
                    int l17 = env.b().l();
                    if (f()) {
                        com.tencent.mm.plugin.sns.storage.SnsInfo b17 = com.tencent.mm.plugin.sns.model.l4.Fj().b1(k17);
                        if (b17 != null && (adInfo = b17.getAdInfo()) != null) {
                            z17 = adInfo.preloadFinderFeed;
                        }
                        if (l44.s4.f(env.a(), a17, optString, optString3, optString2, ca4.m0.D0(k17), z17, 5)) {
                            com.tencent.mars.xlog.Log.i("SnsAdJs.FinderDetail", "open finder feed detail ui successfully!");
                            b(l());
                        } else {
                            com.tencent.mars.xlog.Log.e("SnsAdJs.FinderDetail", ":open finder feed detail ui failed!");
                            b(w44.d.k(this, 600009, "open finder feed detail ui failed", null, 4, null));
                        }
                    } else {
                        com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.getInstance().doJumpToFinderFeedsDetailUI(optString, optString3, optString2, a17, k17, l17, 5);
                        b(l());
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OpenFinderDetailUI");
                    return;
                }
            }
        }
        com.tencent.mars.xlog.Log.e("SnsAdJs.FinderDetail", "input param is invalid!");
        b(w44.d.h(this, null, 1, null));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OpenFinderDetailUI");
    }
}
