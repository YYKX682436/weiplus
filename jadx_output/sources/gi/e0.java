package gi;

/* loaded from: classes12.dex */
public final class e0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f272022d;

    public e0(boolean z17) {
        this.f272022d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        gi.i0 i0Var = gi.i0.f272054a;
        synchronized (i0Var.a()) {
            if (this.f272022d) {
                if (!gi.i0.f272055b) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.BatteryLowerEnergyModeManager", "#onAppLowEnergy, AppDoze ON");
                    jx3.f.INSTANCE.idkeyStat(1540L, 63L, 1L, false);
                    java.util.Iterator it = i0Var.a().iterator();
                    while (it.hasNext()) {
                        ((com.tencent.mm.pluginsdk.res.downloader.checkresupdate.h0) ((ob0.p2) it.next())).g(true);
                    }
                    gi.i0.f272055b = true;
                    final gi.s0 s0Var = new gi.s0("DozeOn");
                    final ph.u e17 = gi.d.e();
                    if (e17 != null) {
                        e17.f354296h.f363337f.post(new java.lang.Runnable() { // from class: gi.s0$$a
                            @Override // java.lang.Runnable
                            public final void run() {
                                gi.s0.this.getClass();
                                com.tencent.mars.xlog.Log.i("MicroMsg.DataSamplingMonitor", "start, name = DozeOn");
                                ph.u e18 = gi.d.e();
                                final rh.c1 c1Var = e18 == null ? null : new gi.t0(e18.f354296h, "dataSampling", "DozeOn").f272021a;
                                if (c1Var != null) {
                                    c1Var.I();
                                    e17.f354296h.f363337f.postDelayed(new java.lang.Runnable() { // from class: gi.s0$$b
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            rh.c1 c1Var2 = rh.c1.this;
                                            c1Var2.l();
                                            c1Var2.b();
                                        }
                                    }, 12000L);
                                }
                            }
                        });
                    }
                }
            } else if (gi.i0.f272055b) {
                com.tencent.mars.xlog.Log.i("MicroMsg.BatteryLowerEnergyModeManager", "#onAppLowEnergy, AppDoze OFF");
                jx3.f.INSTANCE.idkeyStat(1540L, 64L, 1L, false);
                java.util.Iterator it6 = i0Var.a().iterator();
                while (it6.hasNext()) {
                    ((com.tencent.mm.pluginsdk.res.downloader.checkresupdate.h0) ((ob0.p2) it6.next())).g(false);
                }
                gi.i0.f272055b = false;
            }
        }
    }
}
