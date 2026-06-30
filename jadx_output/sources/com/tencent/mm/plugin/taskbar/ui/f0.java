package com.tencent.mm.plugin.taskbar.ui;

/* loaded from: classes11.dex */
public class f0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f172608d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f172609e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.taskbar.ui.z f172610f;

    public f0(com.tencent.mm.plugin.taskbar.ui.z zVar, boolean z17, int i17) {
        this.f172610f = zVar;
        this.f172608d = z17;
        this.f172609e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarAnimController", "openHeader isVisibleHeader: %b, headerOpen: %b", java.lang.Boolean.valueOf(this.f172610f.h()), java.lang.Boolean.valueOf(this.f172610f.N));
        if (this.f172608d || this.f172610f.h()) {
            boolean z17 = false;
            if (this.f172608d) {
                this.f172610f.Z = false;
                com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarAnimController", "openHeader checkCloseHeaderWhenScrollingByAnim set false");
            }
            com.tencent.mm.plugin.taskbar.ui.z zVar = this.f172610f;
            if (zVar.G1) {
                zVar.getClass();
            }
            com.tencent.mm.plugin.taskbar.ui.z zVar2 = this.f172610f;
            zVar2.f172773p0 = true;
            zVar2.H = false;
            zVar2.f172763e.removeCallbacks(zVar2.f172786y0);
            com.tencent.mm.plugin.taskbar.ui.z zVar3 = this.f172610f;
            android.widget.ListView listView = zVar3.f172763e;
            com.tencent.mm.plugin.taskbar.ui.e0 e0Var = new com.tencent.mm.plugin.taskbar.ui.e0(this);
            zVar3.f172786y0 = e0Var;
            listView.post(e0Var);
            com.tencent.mm.plugin.taskbar.ui.z zVar4 = this.f172610f;
            if (!zVar4.M) {
                com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarAnimController", "checkAndStartPerformanceMonitor not enableNativeBackground not need to monitor");
                return;
            }
            android.content.SharedPreferences d17 = com.tencent.mm.sdk.platformtools.x2.d();
            if (d17 != null) {
                long j17 = d17.getLong("monitory_last_check_time", -1L);
                if (jh4.c.f299849d == 0) {
                    jh4.c.f299849d = d17.getInt("current_app_fps", 0);
                }
                if (j17 == -1 || jh4.c.f299849d <= 45 || java.lang.System.currentTimeMillis() - j17 > 3600000) {
                    d17.edit().putLong("monitory_last_check_time", java.lang.System.currentTimeMillis()).apply();
                    z17 = true;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.DynamicBackgroundConfig", "needMonitorFps needCheck: %b", java.lang.Boolean.valueOf(z17));
            }
            if (!z17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarAnimController", "checkAndStartPerformanceMonitor no need to check");
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarAnimController", "checkAndStartPerformanceMonitor hasStartMonitor: %b, hasDelayStopMonitor: %b", java.lang.Boolean.valueOf(zVar4.D), java.lang.Boolean.valueOf(zVar4.E));
            if (zVar4.D || zVar4.E) {
                return;
            }
            zVar4.D = true;
            wu5.b bVar = zVar4.B;
            if (bVar != null) {
                bVar.b();
            }
            zVar4.B = new com.tencent.mm.plugin.taskbar.ui.a0(zVar4);
            com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarAnimController", "execute startMonitorRunnable");
            ((ku5.t0) ku5.t0.f312615d).h(zVar4.B, "AppBrandDesktopPerformanceMonitor");
        }
    }
}
