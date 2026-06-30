package com.tencent.mm.plugin.taskbar.ui;

/* loaded from: classes15.dex */
public class a0 extends wu5.b {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.taskbar.ui.z f172556e;

    public a0(com.tencent.mm.plugin.taskbar.ui.z zVar) {
        this.f172556e = zVar;
    }

    @Override // wu5.g
    public java.lang.String getKey() {
        return "MicroMsg.TaskBarAnimController#startMonitorRunnable";
    }

    @Override // java.lang.Runnable
    public void run() {
        kh4.d dVar = kh4.d.INSTANCE;
        if (dVar.f308055h) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarAnimController", "doStart performanceMonitor");
        if (!dVar.f308055h) {
            dVar.f308055h = true;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.i("MicroMsg.Metronome", "[start] stack:%s", new com.tencent.mm.sdk.platformtools.z3());
            dVar.h().postFrameCallback(dVar);
        }
        kh4.f fVar = kh4.f.INSTANCE;
        synchronized (fVar.f308063g) {
            if (fVar.f308061e) {
                com.tencent.mars.xlog.Log.w("MicroMsg.PerformanceMonitor", "already running and ignore this requestStartMonitor. If you want run a new one, stop first.");
            } else {
                wu5.c cVar = fVar.f308062f;
                if (cVar != null) {
                    cVar.cancel(false);
                }
                java.lang.System.gc();
                fVar.f308060d.clear();
                fVar.f308060d.put(1, new kh4.a());
                fVar.f308062f = ((ku5.t0) ku5.t0.f312615d).d(new kh4.e(fVar), 0L, 5L);
                fVar.f308061e = true;
            }
        }
        com.tencent.mm.plugin.taskbar.ui.z zVar = this.f172556e;
        com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarAnimController", "delayStopMonitor hasStartMonitor: %b, hasDelayStopMonitor: %b, delay: %d", java.lang.Boolean.valueOf(zVar.D), java.lang.Boolean.valueOf(zVar.E), java.lang.Long.valueOf(com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT));
        if (!zVar.D || zVar.E) {
            return;
        }
        wu5.b bVar = zVar.C;
        if (bVar != null) {
            bVar.b();
        }
        zVar.C = new com.tencent.mm.plugin.taskbar.ui.c0(zVar);
        com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarAnimController", "execute stopMonitorRunnable");
        zVar.E = true;
        ((ku5.t0) ku5.t0.f312615d).l(zVar.C, com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT, "AppBrandDesktopPerformanceMonitor");
    }
}
