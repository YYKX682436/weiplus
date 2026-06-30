package com.tencent.mm.ui.feature.api.screenshot;

/* loaded from: classes8.dex */
public final class u0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.feature.api.screenshot.j1 f208557d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f208558e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f208559f;

    public u0(com.tencent.mm.ui.feature.api.screenshot.j1 j1Var, java.lang.String str, long j17, boolean z17) {
        this.f208557d = j1Var;
        this.f208558e = str;
        this.f208559f = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Object m521constructorimpl;
        com.tencent.mm.ui.feature.api.screenshot.j1 j1Var = this.f208557d;
        j1Var.getClass();
        android.app.Activity a17 = com.tencent.mm.ui.feature.api.screenshot.v.f208560a.a();
        if (a17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ScreenShotShareService", "onScreenShot, getTopActivity failed");
            return;
        }
        if (a17.isInMultiWindowMode()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ScreenShotShareService", "onScreenShot, activity is in multi window mode, skip");
            return;
        }
        java.lang.Object systemService = a17.getSystemService("window");
        android.view.WindowManager windowManager = systemService instanceof android.view.WindowManager ? (android.view.WindowManager) systemService : null;
        if (windowManager == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ScreenShotShareService", "onScreenShot, getWindowManager failed");
            return;
        }
        java.lang.String str = this.f208558e;
        if (str != null) {
            com.tencent.mm.vfs.z7 a18 = com.tencent.mm.vfs.z7.a(str);
            java.lang.String str2 = a18.f213279f;
            if (str2 != null) {
                java.lang.String l17 = com.tencent.mm.vfs.e8.l(str2, false, false);
                if (!str2.equals(l17)) {
                    a18 = new com.tencent.mm.vfs.z7(a18.f213277d, a18.f213278e, l17, a18.f213280g, a18.f213281h);
                }
            }
            com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a18, null);
            if (!m17.a() ? false : m17.f213266a.F(m17.f213267b)) {
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                boolean z17 = this.f208559f;
                if (z17) {
                    j1Var.f208498d = currentTimeMillis;
                } else if (!j1Var.f208505n) {
                    android.view.View wi6 = j1Var.wi();
                    if (!(wi6 != null && wi6.isAttachedToWindow()) && currentTimeMillis - j1Var.f208498d <= 5000) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.ScreenShotShareService", "onScreenShot, user cancelled, skip");
                        return;
                    }
                }
                qj5.n nVar = j1Var.f208500f;
                if (nVar != null) {
                    if (nVar.i()) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.ScreenShotShareService", "onScreenShot, screenShotShare showing, skip");
                        return;
                    }
                    qj5.n nVar2 = j1Var.f208500f;
                    if (nVar2 != null) {
                        nVar2.u();
                    }
                    j1Var.f208500f = null;
                }
                if (j1Var.f208505n && z17) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.ScreenShotShareService", "onScreenShot, old screenshot is loading, ignore new screenshot");
                    return;
                }
                java.lang.ref.WeakReference weakReference = j1Var.f208502h;
                android.app.Activity activity = weakReference != null ? (android.app.Activity) weakReference.get() : null;
                if (activity != null && activity != a17 && !activity.isDestroyed()) {
                    j1Var.Di(activity);
                }
                if (activity != a17 || j1Var.f208501g == null) {
                    com.tencent.mm.ui.feature.api.screenshot.x xVar = j1Var.f208501g;
                    if (xVar != null) {
                        xVar.b();
                    }
                    j1Var.f208501g = null;
                    android.app.Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = j1Var.f208503i;
                    if (activityLifecycleCallbacks != null) {
                        try {
                            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                            a17.getApplication().unregisterActivityLifecycleCallbacks(activityLifecycleCallbacks);
                            m521constructorimpl = kotlin.Result.m521constructorimpl(jz5.f0.f302826a);
                        } catch (java.lang.Throwable th6) {
                            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
                        }
                        kotlin.Result.m520boximpl(m521constructorimpl);
                    }
                    j1Var.f208503i = null;
                    j1Var.f208502h = null;
                    j1Var.f208501g = new com.tencent.mm.ui.feature.api.screenshot.x(windowManager);
                    j1Var.f208502h = new java.lang.ref.WeakReference(a17);
                    com.tencent.mm.ui.feature.api.screenshot.b0 b0Var = new com.tencent.mm.ui.feature.api.screenshot.b0(j1Var);
                    j1Var.f208503i = b0Var;
                    a17.getApplication().registerActivityLifecycleCallbacks(b0Var);
                }
                j1Var.f208506o = str;
                android.view.View decorView = a17.getWindow().getDecorView();
                kotlin.jvm.internal.o.f(decorView, "getDecorView(...)");
                if (decorView.getTag(com.tencent.mm.R.id.v1_) == null) {
                    android.view.Window.Callback callback = a17.getWindow().getCallback();
                    decorView.setTag(com.tencent.mm.R.id.v1_, callback);
                    a17.getWindow().setCallback(new com.tencent.mm.ui.feature.api.screenshot.s0(callback, j1Var));
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.ScreenShotShareService", "onScreenShot, isLoading: " + j1Var.f208505n + ", isPending: " + z17);
                if (j1Var.f208505n) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.ScreenShotShareService", "onScreenShot, screenshot end pending, show");
                    j1Var.Ai();
                    j1Var.f208505n = false;
                    ct.e3.j2(j1Var, null, 1, null);
                    return;
                }
                if (z17) {
                    j1Var.Ri(a17, new com.tencent.mm.ui.feature.api.screenshot.e0(j1Var, a17));
                    return;
                } else {
                    j1Var.Ri(a17, new com.tencent.mm.ui.feature.api.screenshot.d0(j1Var));
                    return;
                }
            }
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.ScreenShotShareService", "onScreenShot, file not exists");
    }
}
