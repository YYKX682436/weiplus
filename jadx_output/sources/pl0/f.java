package pl0;

@j95.b
/* loaded from: classes13.dex */
public class f extends i95.w implements xs.b1 {
    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        boolean z17 = false;
        if ((com.tencent.mm.sdk.platformtools.z.f193115k || kl0.a.a()) && com.tencent.mm.sdk.platformtools.t8.P(j62.e.g().j("clicfg_plugin_kara_feature_open", "1", false, true), 0) != 0) {
            z17 = true;
        }
        if (!z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.KaraBusinessFeatureService", "expt 0");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.KaraBusinessFeatureService", "PluginKara execute");
        d95.b0 b0Var = nl0.e.f338164a;
        java.lang.String str = gm0.j1.u().h() + "KaraMM.db";
        com.tencent.mars.xlog.Log.i("MicroMsg.KaraBusinessFeatureService", "pluginKara cacheDbPath = %s", str);
        d95.b0 a17 = nl0.e.a();
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(-1137075586, new pl0.f$$a());
        hashMap.put(-512314412, new pl0.f$$b());
        hashMap.put(-174884489, new pl0.f$$c());
        hashMap.put(1180022710, new pl0.f$$d());
        if (!a17.S(str, hashMap, true, true)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.KaraBusinessFeatureService", "dataDB.initDb fail, cacheDbPath = %s", str);
            return;
        }
        tl0.b.f420194a = new ul0.a(nl0.e.a());
        tl0.b.f420195b = new ul0.d(nl0.e.a());
        tl0.b.f420196c = new ul0.c(nl0.e.a());
        tl0.b.f420197d = new ul0.b(nl0.e.a());
        ((ku5.t0) ku5.t0.f312615d).r(new tl0.a(), "KaraEvent");
        wl0.r rVar = wl0.r.f447032d;
        rVar.getClass();
        el0.i.f253720a = new wl0.o(rVar);
        el0.i.f253721b = new wl0.q(rVar);
        wl0.m mVar = wl0.m.f447017b;
        el0.i.f253722c = new wl0.b(mVar);
        el0.i.f253723d = new wl0.d(mVar);
        el0.i.f253724e = new wl0.f(mVar);
        el0.i.f253725f = new wl0.h(mVar);
        el0.i.f253726g = new wl0.j(mVar);
        el0.i.f253727h = new wl0.l(mVar);
        com.tencent.mm.kara.feature.bridge.a.a();
        ka4.m mVar2 = ka4.m.f306136a;
        rl0.a aVar = new rl0.a();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSnsInfoToFeatureGroupCallback", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsKaraOptionConfig", "setSnsInfoToFeatureGroupCallback");
        ka4.m.f306137b = aVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSnsInfoToFeatureGroupCallback", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
    }
}
