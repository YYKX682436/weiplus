package da4;

/* loaded from: classes4.dex */
public final class h {

    /* renamed from: e, reason: collision with root package name */
    public static da4.h f227783e;

    /* renamed from: b, reason: collision with root package name */
    public boolean f227785b = false;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Map f227786c = new java.util.HashMap();

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcher f227784a = new da4.f(this, null);

    /* renamed from: d, reason: collision with root package name */
    public final da4.g f227787d = new da4.g(this, null);

    public static boolean a(da4.h hVar) {
        boolean z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcherManager");
        hVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hasWatcherInfo", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcherManager");
        synchronized (hVar.f227786c) {
            try {
                z17 = !((java.util.HashMap) hVar.f227786c).isEmpty();
            } catch (java.lang.Throwable th6) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hasWatcherInfo", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcherManager");
                throw th6;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hasWatcherInfo", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcherManager");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcherManager");
        return z17;
    }

    public static void b(da4.h hVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcherManager");
        synchronized (hVar) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("unregisterWatcher", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcherManager");
            try {
                com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcher apkInstalledWatcher = hVar.f227784a;
                if (apkInstalledWatcher != null && hVar.f227785b) {
                    com.tencent.mm.sdk.platformtools.x2.f193071a.unregisterReceiver(apkInstalledWatcher);
                    hVar.f227785b = false;
                    com.tencent.mars.xlog.Log.i("ApkInstalledWatcherManager", "unregisterWatcher: the watcher is to be unregistered");
                }
            } catch (java.lang.Throwable unused) {
                com.tencent.mars.xlog.Log.e("ApkInstalledWatcherManager", "unregister ApkInstalledWatcher failed");
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("unregisterWatcher", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcherManager");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcherManager");
    }

    public static synchronized da4.h f() {
        da4.h hVar;
        synchronized (da4.h.class) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("instance", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcherManager");
            if (f227783e == null) {
                f227783e = new da4.h();
            }
            hVar = f227783e;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("instance", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcherManager");
        }
        return hVar;
    }

    public static synchronized void i(da4.i iVar) {
        synchronized (da4.h.class) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("watchStatic", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcherManager");
            try {
            } catch (java.lang.Throwable unused) {
                com.tencent.mars.xlog.Log.e("ApkInstalledWatcherManager", "watchStatic: watch info failed!");
            }
            if (za4.k.l()) {
                com.tencent.mars.xlog.Log.w("ApkInstalledWatcherManager", "watchStatic, but disable register installReceiver");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("watchStatic", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcherManager");
            } else {
                f().h(iVar);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("watchStatic", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcherManager");
            }
        }
    }

    public final void c(da4.i iVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addTargetPackage", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcherManager");
        synchronized (this.f227786c) {
            try {
                ((java.util.HashMap) this.f227786c).put(iVar.f227788a, iVar);
            } catch (java.lang.Throwable th6) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addTargetPackage", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcherManager");
                throw th6;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addTargetPackage", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcherManager");
    }

    public final boolean d(da4.i iVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkWatchInfo", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcherManager");
        if (iVar == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkWatchInfo", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcherManager");
            return false;
        }
        int i17 = iVar.f227797j;
        java.lang.String str = iVar.f227788a;
        if (i17 == 1 || i17 == 2) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkWatchInfo is called, the apkPackage is ");
            sb6.append(str);
            sb6.append(", uxInfo is ");
            java.lang.String str2 = iVar.f227790c;
            sb6.append(str2);
            com.tencent.mars.xlog.Log.i("ApkInstalledWatcherManager", sb6.toString());
            if (!com.tencent.mm.sdk.platformtools.t8.N0(str, str2)) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkWatchInfo", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcherManager");
                return true;
            }
        }
        if (!android.text.TextUtils.isEmpty(str) && !android.text.TextUtils.isEmpty(iVar.f227789b)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkWatchInfo", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcherManager");
            return true;
        }
        com.tencent.mars.xlog.Log.i("ApkInstalledWatcherManager", "checkWatchInfo is called, the input param is invalid");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkWatchInfo", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcherManager");
        return false;
    }

    public final void e() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("clearWatcherInfoExpired", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcherManager");
        synchronized (this.f227786c) {
            try {
                java.util.Iterator it = ((java.util.HashMap) this.f227786c).entrySet().iterator();
                if (it.hasNext()) {
                    java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                    if (entry.getValue() != null) {
                        if (((da4.i) entry.getValue()).f227793f + 300000 < android.os.SystemClock.elapsedRealtime()) {
                            it.remove();
                        }
                    } else {
                        it.remove();
                    }
                }
            } catch (java.lang.Throwable th6) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clearWatcherInfoExpired", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcherManager");
                throw th6;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clearWatcherInfoExpired", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcherManager");
    }

    public final synchronized void g() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("registerWatcher", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcherManager");
        try {
            if (this.f227784a == null) {
                this.f227784a = new da4.f(this, null);
            }
            if (!this.f227785b) {
                com.tencent.mars.xlog.Log.i("ApkInstalledWatcherManager", "registerWatcher: the watcher is to be registered");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getIntentFilter", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcherManager");
                android.content.IntentFilter intentFilter = new android.content.IntentFilter();
                intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
                intentFilter.addDataScheme("package");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getIntentFilter", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcherManager");
                com.tencent.mm.sdk.platformtools.x2.f193071a.registerReceiver(this.f227784a, intentFilter);
                this.f227785b = true;
            }
        } catch (java.lang.Throwable unused) {
            com.tencent.mars.xlog.Log.e("ApkInstalledWatcherManager", "register ApkInstalledWatcher failed");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("registerWatcher", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcherManager");
    }

    public final synchronized void h(da4.i iVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("watch", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcherManager");
        com.tencent.mars.xlog.Log.i("ApkInstalledWatcherManager", "watch is called");
        if (!d(iVar)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("watch", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcherManager");
            return;
        }
        g();
        c(iVar);
        e();
        da4.g gVar = this.f227787d;
        gVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startTimer", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcherManager$WatcherTimer");
        if (gVar.f227781d) {
            com.tencent.mars.xlog.Log.i("ApkInstalledWatcherManager", "startTimer is called, the timer is started!");
        } else {
            gVar.f227781d = true;
            com.tencent.mm.sdk.platformtools.u3.i(gVar, 300000L);
            com.tencent.mars.xlog.Log.i("ApkInstalledWatcherManager", "startTimer is called, the timer is to start.");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startTimer", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcherManager$WatcherTimer");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("watch", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcherManager");
    }
}
