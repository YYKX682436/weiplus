package x44;

/* loaded from: classes4.dex */
public final class f3 extends w44.d {
    @Override // w44.d
    public void c(w44.b env, org.json.JSONObject data) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.StartApkWatcher");
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(data, "data");
        java.lang.String optString = data.optString("pkg", "");
        long optLong = data.optLong("duration", 0L);
        if (optString == null || r26.n0.N(optString)) {
            com.tencent.mars.xlog.Log.e("SnsAdJs.ApkWatcher", "the pkg is empty!!");
            b(g(": the pkg is empty"));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.StartApkWatcher");
            return;
        }
        y44.a aVar = y44.a.f459356d;
        kotlin.jvm.internal.o.d(optString);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getOnEvent", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.JsApiEnv");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getOnEvent", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.JsApiEnv");
        x44.s0 s0Var = new x44.s0(env.f442895e);
        synchronized (aVar) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("register", "com.tencent.mm.plugin.sns.ad.jsapi.helper.ApkWatcherManager");
            if (za4.k.l()) {
                com.tencent.mars.xlog.Log.w("SnsAd.ApkWatcherManager", "register, but disable register installReceiver");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("register", "com.tencent.mm.plugin.sns.ad.jsapi.helper.ApkWatcherManager");
            } else {
                com.tencent.mm.plugin.sns.ad.jsapi.helper.ApkWatcher apkWatcher = y44.a.f459358f;
                apkWatcher.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isRegistered", "com.tencent.mm.plugin.sns.ad.jsapi.helper.ApkWatcher");
                boolean z17 = apkWatcher.f162729b;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isRegistered", "com.tencent.mm.plugin.sns.ad.jsapi.helper.ApkWatcher");
                y44.a.f459357e.put(optString, new y44.c(optString, java.lang.System.currentTimeMillis(), optLong <= 0 ? 300000L : optLong, s0Var));
                if (!z17) {
                    apkWatcher.c();
                    com.tencent.mars.xlog.Log.i("SnsAd.ApkWatcherManager", "the watcher hasn't be registered, start a delay time");
                    y44.a.f459359g.postDelayed(aVar, 60000L);
                }
                com.tencent.mars.xlog.Log.i("SnsAd.ApkWatcherManager", "register one pkg to watcher, pkg is ".concat(optString));
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("register", "com.tencent.mm.plugin.sns.ad.jsapi.helper.ApkWatcherManager");
            }
        }
        b(l());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.StartApkWatcher");
    }
}
