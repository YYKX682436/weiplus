package com.tencent.mm.plugin.taskbar.ui;

/* loaded from: classes15.dex */
public class c0 extends wu5.b {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.taskbar.ui.z f172578e;

    public c0(com.tencent.mm.plugin.taskbar.ui.z zVar) {
        this.f172578e = zVar;
    }

    @Override // wu5.g
    public java.lang.String getKey() {
        return "MicroMsg.TaskBarAnimController#stopMonitorRunnable";
    }

    @Override // java.lang.Runnable
    public void run() {
        kh4.a aVar;
        android.content.SharedPreferences.Editor edit;
        android.content.SharedPreferences.Editor putInt;
        android.content.SharedPreferences.Editor edit2;
        android.content.SharedPreferences.Editor putInt2;
        kh4.d dVar = kh4.d.INSTANCE;
        if (dVar.f308055h) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarAnimController", "doStop performanceMonitor");
            dVar.f308052e = 0L;
            dVar.f308053f = 0;
            dVar.f308055h = false;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.i("MicroMsg.Metronome", "[stop] stack:%s", new com.tencent.mm.sdk.platformtools.z3());
            dVar.h().removeFrameCallback(dVar);
            kh4.f fVar = kh4.f.INSTANCE;
            synchronized (fVar.f308063g) {
                if (fVar.f308061e) {
                    wu5.c cVar = fVar.f308062f;
                    if (cVar != null) {
                        cVar.cancel(false);
                    }
                    fVar.f308061e = false;
                }
            }
            kh4.b bVar = (kh4.b) fVar.f308060d.get(1);
            if (bVar instanceof kh4.a) {
                kh4.a aVar2 = (kh4.a) bVar;
                java.util.List list = aVar2.f308044a;
                if (list != null) {
                    java.util.ArrayList arrayList = (java.util.ArrayList) list;
                    if (arrayList.size() <= 10000 && arrayList.size() != 0) {
                        java.util.Iterator it = arrayList.iterator();
                        double d17 = 0.0d;
                        while (it.hasNext()) {
                            double doubleValue = ((java.lang.Double) it.next()).doubleValue();
                            d17 += doubleValue;
                            aVar2.f308046c = java.lang.Math.min(aVar2.f308046c, doubleValue);
                            aVar2.f308047d = java.lang.Math.max(aVar2.f308047d, doubleValue);
                        }
                        aVar2.f308045b = d17 / arrayList.size();
                    }
                }
                aVar = (kh4.a) bVar;
            } else {
                aVar = null;
            }
            if (aVar != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarAnimController", "doStop performanceMonitor dump fps, max: %f, min: %f, average: %f", java.lang.Double.valueOf(aVar.f308047d), java.lang.Double.valueOf(aVar.f308046c), java.lang.Double.valueOf(aVar.f308045b));
                jh4.c cVar2 = jh4.c.f299846a;
                double d18 = aVar.f308045b;
                com.tencent.mars.xlog.Log.i("MicroMsg.DynamicBackgroundConfig", "adjustDynamicBackgroundDrawFps currentDrawFps: %d, appFps: %f", java.lang.Integer.valueOf(jh4.c.f299847b), java.lang.Double.valueOf(d18));
                if (d18 >= 45.0d) {
                    gh4.j0.c(true);
                    if (d18 >= 55.0d) {
                        jh4.c.f299847b = 20;
                    } else if (d18 >= 50.0d) {
                        jh4.c.f299847b = 15;
                    } else if (d18 >= 45.0d) {
                        jh4.c.f299847b = 5;
                    }
                } else if (jh4.c.f299847b == 2) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.DynamicBackgroundConfig", "adjustDynamicBackgroundDrawFps disable DynamicBackground");
                    gh4.j0.c(false);
                } else {
                    jh4.c.f299847b = 2;
                    gh4.j0.c(true);
                }
                int i17 = (int) d18;
                jh4.c.f299849d = i17;
                android.content.SharedPreferences d19 = com.tencent.mm.sdk.platformtools.x2.d();
                if (d19 != null && (edit2 = d19.edit()) != null && (putInt2 = edit2.putInt("current_draw_fps", jh4.c.f299847b)) != null) {
                    putInt2.apply();
                }
                if (d19 != null && (edit = d19.edit()) != null && (putInt = edit.putInt("current_app_fps", i17)) != null) {
                    putInt.apply();
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.DynamicBackgroundConfig", "adjustDynamicBackgroundDrawFps appFps: %f, FRAME_PER_SECOND: %d", java.lang.Double.valueOf(d18), java.lang.Integer.valueOf(jh4.c.f299847b));
                cVar2.a();
            }
            kh4.f fVar2 = kh4.f.INSTANCE;
            fVar2.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.PerformanceMonitor", "PerformanceMonitor release");
            java.util.HashMap hashMap = fVar2.f308060d;
            if (hashMap != null) {
                hashMap.clear();
            }
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.taskbar.ui.b0(this));
        }
    }
}
