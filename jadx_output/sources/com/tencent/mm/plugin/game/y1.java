package com.tencent.mm.plugin.game;

@j95.b
/* loaded from: classes8.dex */
public class y1 extends i95.w {
    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        jz5.f0 f0Var;
        com.tencent.mm.modelbase.r1 r1Var;
        com.tencent.mm.network.s sVar;
        super.onAccountInitialized(context);
        com.tencent.mars.xlog.Log.i("MicroMsg.PluginGame", "onAccountInitialized");
        j53.i iVar = com.tencent.mm.plugin.game.n0.E;
        g53.i iVar2 = g53.i.f268912a;
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            gm0.y n17 = gm0.j1.n();
            if (n17 == null || (r1Var = n17.f273288b) == null || (sVar = r1Var.f70764d) == null) {
                f0Var = null;
            } else {
                sVar.h1(g53.i.f268913b);
                f0Var = f0Var2;
            }
            kotlin.Result.m521constructorimpl(f0Var);
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        try {
            gm0.y n18 = gm0.j1.n();
            if (n18 != null) {
                n18.a(g53.i.f268914c);
            } else {
                f0Var2 = null;
            }
            kotlin.Result.m521constructorimpl(f0Var2);
        } catch (java.lang.Throwable th7) {
            kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
            kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th7));
        }
        try {
            if (com.tencent.mm.plugin.game.model.silent_download.s.f140457d == null) {
                com.tencent.mm.plugin.game.model.silent_download.s.f140457d = new com.tencent.mm.plugin.game.model.silent_download.r(null);
            }
            android.content.IntentFilter intentFilter = new android.content.IntentFilter();
            intentFilter.addAction("android.net.wifi.STATE_CHANGE");
            intentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
            intentFilter.addAction(io.flutter.plugins.connectivity.patched.PatchedConnectivityBroadcastReceiver.CONNECTIVITY_ACTION);
            com.tencent.mm.sdk.platformtools.x2.f193071a.registerReceiver(com.tencent.mm.plugin.game.model.silent_download.s.f140457d, intentFilter);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.GameSilentDownloadListener", "registerNetChange err:%s", e17.getMessage());
        }
        try {
            if (com.tencent.mm.plugin.game.model.silent_download.s.f140458e == null) {
                com.tencent.mm.plugin.game.model.silent_download.s.f140458e = new com.tencent.mm.plugin.game.model.silent_download.p(null);
            }
            android.content.IntentFilter intentFilter2 = new android.content.IntentFilter();
            intentFilter2.addAction("android.intent.action.BATTERY_OKAY");
            intentFilter2.addAction("android.intent.action.BATTERY_LOW");
            com.tencent.mm.sdk.platformtools.x2.f193071a.registerReceiver(com.tencent.mm.plugin.game.model.silent_download.s.f140458e, intentFilter2);
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.i("MicroMsg.GameSilentDownloadListener", "registerBatteryChange err:%s", e18.getMessage());
        }
        com.tencent.mm.plugin.game.model.silent_download.s.f140460g.alive();
        com.tencent.mm.plugin.game.n0.G.alive();
        qc0.x0 x0Var = (qc0.x0) i95.n0.c(qc0.x0.class);
        j53.i iVar3 = com.tencent.mm.plugin.game.n0.E;
        ((pc0.c) x0Var).getClass();
        lt3.e eVar = lt3.e.f321209a;
        android.util.SparseArray sparseArray = lt3.e.f321210b;
        java.util.Set set = (java.util.Set) sparseArray.get(5);
        if (set == null) {
            set = new java.util.LinkedHashSet();
            sparseArray.put(5, set);
        }
        set.add(iVar3);
        ((ku5.t0) ku5.t0.f312615d).k(new com.tencent.mm.plugin.game.a2(this), 500L);
        m43.c.b().a("game_resource_check", new com.tencent.mm.plugin.game.z1(this));
        ((ku5.t0) ku5.t0.f312615d).k(new com.tencent.mm.plugin.game.y1$$a(), 1000L);
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        super.onAccountReleased(context);
        com.tencent.mars.xlog.Log.i("MicroMsg.PluginGame", "onAccountRelease");
        if (r53.f.f392654b == null) {
            return;
        }
        synchronized (r53.f.f392655c) {
            if (r53.f.f392654b != null) {
                ((java.util.concurrent.ConcurrentHashMap) lm5.i.f319609a).remove("SubCoreGameCenter#WorkThread".toUpperCase(java.util.Locale.ENGLISH));
                r53.f.f392654b.quit();
                r53.f.f392654b = null;
            }
        }
    }

    @Override // i95.w
    public void onCreate(android.content.Context context) {
        super.onCreate(context);
        if (com.tencent.mm.sdk.platformtools.x2.s()) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(939L, 1L, 1L);
        }
    }
}
