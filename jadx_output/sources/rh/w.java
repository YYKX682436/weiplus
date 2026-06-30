package rh;

/* loaded from: classes12.dex */
public final class w extends rh.a {

    /* renamed from: b, reason: collision with root package name */
    public int f395525b = 1024;

    /* renamed from: c, reason: collision with root package name */
    public int f395526c = 1024;

    /* renamed from: d, reason: collision with root package name */
    public int f395527d = 100;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f395528e = java.util.Collections.emptyList();

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f395529f = java.util.Collections.emptyList();

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Runnable f395530g = new rh.n(this);

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.matrix.lifecycle.k f395531h = new rh.o(this);

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.matrix.lifecycle.k f395532i = new rh.p(this);

    @Override // rh.a, rh.e3
    public void a(boolean z17) {
        super.a(z17);
        int e17 = wh.m.e(this.f395294a.d(), z17);
        wh.k kVar = (wh.k) wh.m.t();
        synchronized (kVar) {
            kVar.f445818c = new wh.h(java.lang.Integer.valueOf(e17), 5000);
        }
        m(e17);
        oj.j.c("Matrix.battery.AppStatMonitorFeature", "updateAppImportance when app ".concat(z17 ? "foreground" : "background"), new java.lang.Object[0]);
        n();
    }

    @Override // rh.e3
    public int b() {
        return Integer.MAX_VALUE;
    }

    @Override // rh.a, rh.e3
    public void c() {
        java.lang.String str;
        super.c();
        wh.f2 f2Var = new wh.f2(java.lang.String.valueOf(1));
        qh.f0 f0Var = this.f395294a;
        f0Var.getClass();
        try {
            str = (java.lang.String) f0Var.f363340i.call();
        } catch (java.lang.Exception unused) {
            str = com.eclipsesource.mmv8.Platform.UNKNOWN;
        }
        wh.f2 f2Var2 = new wh.f2(str);
        synchronized ("Matrix.battery.AppStatMonitorFeature") {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            this.f395528e = arrayList;
            arrayList.add(0, f2Var);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            this.f395529f = arrayList2;
            arrayList2.add(0, f2Var2);
        }
        com.tencent.matrix.lifecycle.owners.ForegroundServiceLifecycleOwner.INSTANCE.observeForever(this.f395531h);
        com.tencent.matrix.lifecycle.owners.OverlayWindowLifecycleOwner.INSTANCE.observeForever(this.f395532i);
    }

    @Override // rh.a, rh.e3
    public void e() {
        super.e();
        com.tencent.matrix.lifecycle.owners.ForegroundServiceLifecycleOwner.INSTANCE.removeObserver(this.f395531h);
        com.tencent.matrix.lifecycle.owners.OverlayWindowLifecycleOwner.INSTANCE.removeObserver(this.f395532i);
        synchronized ("Matrix.battery.AppStatMonitorFeature") {
            this.f395528e.clear();
            this.f395529f.clear();
        }
    }

    @Override // rh.a, rh.e3
    public void g(long j17) {
        java.util.List<android.app.ActivityManager.RunningServiceInfo> runningServices;
        super.g(j17);
        oj.j.c("Matrix.battery.AppStatMonitorFeature", "#onBackgroundCheck, during = " + j17, new java.lang.Object[0]);
        int i17 = this.f395526c;
        int i18 = this.f395527d;
        if (i17 > i18 || this.f395525b > i18) {
            android.content.Context d17 = this.f395294a.d();
            android.app.ActivityManager activityManager = (android.app.ActivityManager) d17.getSystemService(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            if (activityManager == null || (runningServices = activityManager.getRunningServices(Integer.MAX_VALUE)) == null) {
                return;
            }
            for (android.app.ActivityManager.RunningServiceInfo runningServiceInfo : runningServices) {
                if (!android.text.TextUtils.isEmpty(runningServiceInfo.process) && runningServiceInfo.process.startsWith(d17.getPackageName()) && runningServiceInfo.foreground) {
                    oj.j.c("Matrix.battery.AppStatMonitorFeature", "checkForegroundService whether app importance is low, during = " + j17, new java.lang.Object[0]);
                    if (this.f395526c > this.f395527d) {
                        oj.j.f("Matrix.battery.AppStatMonitorFeature", "foreground service detected with low global importance: " + this.f395525b + ", " + this.f395526c + ", " + runningServiceInfo.service, new java.lang.Object[0]);
                        this.f395294a.e(false, this.f395525b, this.f395526c, runningServiceInfo.service, j17);
                    }
                    if (this.f395525b > this.f395527d && runningServiceInfo.process.equals(d17.getPackageName())) {
                        oj.j.f("Matrix.battery.AppStatMonitorFeature", "foreground service detected with low app importance: " + this.f395525b + ", " + this.f395526c + ", " + runningServiceInfo.service, new java.lang.Object[0]);
                        this.f395294a.e(true, this.f395525b, this.f395526c, runningServiceInfo.service, j17);
                    }
                }
            }
        }
    }

    @Override // rh.a, rh.e3
    public void h(qh.f0 f0Var) {
        super.h(f0Var);
        this.f395527d = java.lang.Math.max(f0Var.f363335d.f363290i, 100);
    }

    @Override // rh.a
    public java.lang.String i() {
        return "Matrix.battery.AppStatMonitorFeature";
    }

    public rh.v k(long j17) {
        try {
            wh.i2 a17 = wh.j2.a(this.f395528e, j17, 10L, new rh.r(this));
            rh.v vVar = new rh.v();
            vVar.f395365c = a17.f445804c;
            vVar.f395518d = rh.x2.b(java.lang.Long.valueOf(a17.f445802a));
            vVar.f395519e = rh.x2.b(java.lang.Long.valueOf(a17.a(java.lang.String.valueOf(1))));
            vVar.f395520f = rh.x2.b(java.lang.Long.valueOf(a17.a(java.lang.String.valueOf(2))));
            vVar.f395521g = rh.x2.b(java.lang.Long.valueOf(a17.a(java.lang.String.valueOf(3))));
            vVar.f395522h = rh.x2.b(java.lang.Long.valueOf(a17.a(java.lang.String.valueOf(4))));
            return vVar;
        } catch (java.lang.Throwable th6) {
            oj.j.f("Matrix.battery.AppStatMonitorFeature", "configureSnapshot fail: " + th6.getMessage(), new java.lang.Object[0]);
            rh.v vVar2 = new rh.v();
            vVar2.f395365c = false;
            return vVar2;
        }
    }

    public wh.i2 l(long j17) {
        try {
            return wh.j2.a(this.f395529f, j17, 10L, new rh.s(this));
        } catch (java.lang.Throwable th6) {
            oj.j.f("Matrix.battery.AppStatMonitorFeature", "currentSceneSnapshot fail: " + th6.getMessage(), new java.lang.Object[0]);
            wh.i2 i2Var = new wh.i2();
            i2Var.f445804c = false;
            return i2Var;
        }
    }

    public void m(int i17) {
        synchronized ("Matrix.battery.AppStatMonitorFeature") {
            if (this.f395528e != java.util.Collections.EMPTY_LIST) {
                java.lang.Integer num = wh.m.f445830a;
                oj.j.c("Matrix.battery.LifeCycle", "onStat >> ".concat(i17 != 1 ? i17 != 2 ? i17 != 3 ? i17 != 4 ? com.eclipsesource.mmv8.Platform.UNKNOWN : "float" : "fgSrv" : "bg" : "fg"), new java.lang.Object[0]);
                this.f395528e.add(0, new wh.f2(java.lang.String.valueOf(i17)));
                android.os.Handler handler = this.f395294a.f363337f;
                java.lang.Runnable runnable = this.f395530g;
                handler.removeCallbacks(runnable);
                this.f395294a.f363337f.postDelayed(runnable, 1000L);
            }
        }
    }

    public final void n() {
        int i17 = this.f395525b;
        int i18 = this.f395527d;
        if (i17 > i18 || this.f395526c > i18) {
            rh.q qVar = new rh.q(this);
            if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
                this.f395294a.f363337f.post(qVar);
            } else {
                qVar.run();
            }
        }
    }
}
