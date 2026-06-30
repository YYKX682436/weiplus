package com.tencent.mm.plugin.sns.ad.jsapi.helper;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/sns/ad/jsapi/helper/ApkWatcher;", "Lcom/tencent/mm/plugin/sns/device/appstore/ApkInstalledWatcher;", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class ApkWatcher extends com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcher {

    /* renamed from: a, reason: collision with root package name */
    public final y44.d f162728a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f162729b;

    public ApkWatcher(y44.d action) {
        kotlin.jvm.internal.o.g(action, "action");
        this.f162728a = action;
    }

    @Override // com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcher
    public boolean a(android.content.Context context, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAppInstalled", "com.tencent.mm.plugin.sns.ad.jsapi.helper.ApkWatcher");
        if (str == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAppInstalled", "com.tencent.mm.plugin.sns.ad.jsapi.helper.ApkWatcher");
            return false;
        }
        synchronized (((y44.a) this.f162728a)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onApkInstalled", "com.tencent.mm.plugin.sns.ad.jsapi.helper.ApkWatcherManager");
            try {
                com.tencent.mars.xlog.Log.i("SnsAd.ApkWatcherManager", "the " + str + " is installed");
                y44.c cVar = (y44.c) ((java.util.LinkedHashMap) y44.a.f459357e).get(str);
                if (cVar != null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAction", "com.tencent.mm.plugin.sns.ad.jsapi.helper.InstallPkgData");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAction", "com.tencent.mm.plugin.sns.ad.jsapi.helper.InstallPkgData");
                    y44.b bVar = cVar.f459363d;
                    if (bVar != null) {
                        ((x44.s0) bVar).a(str);
                    }
                }
                y44.a.f459356d.a(str);
            } catch (java.lang.Throwable th6) {
                ca4.q.c("SnsAd.ApkWatcherManager", th6);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onApkInstalled", "com.tencent.mm.plugin.sns.ad.jsapi.helper.ApkWatcherManager");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAppInstalled", "com.tencent.mm.plugin.sns.ad.jsapi.helper.ApkWatcher");
        return true;
    }

    @Override // com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcher
    public boolean b(android.content.Context context, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAppUninstalled", "com.tencent.mm.plugin.sns.ad.jsapi.helper.ApkWatcher");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAppUninstalled", "com.tencent.mm.plugin.sns.ad.jsapi.helper.ApkWatcher");
        return false;
    }

    public final void c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("register", "com.tencent.mm.plugin.sns.ad.jsapi.helper.ApkWatcher");
        try {
            if (!this.f162729b) {
                android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                android.content.IntentFilter intentFilter = new android.content.IntentFilter();
                intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
                intentFilter.addDataScheme("package");
                context.registerReceiver(this, intentFilter);
                this.f162729b = true;
            }
        } catch (java.lang.Throwable th6) {
            ca4.q.c("ApkWatcher", th6);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("register", "com.tencent.mm.plugin.sns.ad.jsapi.helper.ApkWatcher");
    }

    public final void d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("unregister", "com.tencent.mm.plugin.sns.ad.jsapi.helper.ApkWatcher");
        try {
            if (this.f162729b) {
                com.tencent.mm.sdk.platformtools.x2.f193071a.unregisterReceiver(this);
                this.f162729b = false;
            }
        } catch (java.lang.Throwable th6) {
            ca4.q.c("ApkWatcher", th6);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("unregister", "com.tencent.mm.plugin.sns.ad.jsapi.helper.ApkWatcher");
    }
}
