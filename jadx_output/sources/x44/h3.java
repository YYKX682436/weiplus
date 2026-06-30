package x44;

/* loaded from: classes4.dex */
public final class h3 extends w44.d {
    @Override // w44.d
    public void c(w44.b env, org.json.JSONObject data) {
        da4.a aVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.StartAppMarket");
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(data, "data");
        org.json.JSONArray optJSONArray = data.optJSONArray("marketTag");
        boolean optBoolean = data.optBoolean("prompt", false);
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            com.tencent.mars.xlog.Log.e("SnsAdJs.AppMarket", "the market info is empty!!!");
            b(g("the market object is empty"));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.StartAppMarket");
            return;
        }
        android.app.Activity a17 = env.a();
        if (a17 == null) {
            com.tencent.mars.xlog.Log.e("SnsAdJs.AppMarket", "the activity is null");
            b(g("the activity is null"));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.StartAppMarket");
            return;
        }
        int i17 = optBoolean ? 0 : 2;
        android.app.Activity a18 = env.a();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("newInstance", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketHelper");
        jz5.f0 f0Var = null;
        try {
            aVar = new da4.a(a18, optJSONArray);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("newInstance", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketHelper");
        } catch (java.lang.Throwable unused) {
            com.tencent.mars.xlog.Log.e("MICROMSG.AdAppMarketHelper", "create aAdAppMarketHelper failed, with json");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("newInstance", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketHelper");
            aVar = null;
        }
        android.content.Intent i18 = aVar != null ? aVar.i() : null;
        if (i18 != null) {
            if (da4.a.e(i18)) {
                java.lang.String l17 = com.tencent.mm.sdk.platformtools.c2.l(i18, "market_app_name");
                if (l17 == null) {
                    l17 = "";
                }
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.ka.d(a17, i18.getPackage(), "", i18, l17, x44.g3.f451832a, i17);
                b(l());
            } else {
                b(w44.d.k(this, -1, "there is not valid intent!!!", null, 4, null));
            }
            f0Var = jz5.f0.f302826a;
        }
        if (f0Var == null) {
            b(w44.d.k(this, -1, "there is not valid intent!!!", null, 4, null));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.StartAppMarket");
    }
}
