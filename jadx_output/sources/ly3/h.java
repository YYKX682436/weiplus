package ly3;

/* loaded from: classes13.dex */
public final class h extends com.tencent.mm.sdk.event.n {

    /* renamed from: d, reason: collision with root package name */
    public long f322255d;

    public h() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.ActivateEvent event = (com.tencent.mm.autogen.events.ActivateEvent) iEvent;
        kotlin.jvm.internal.o.g(event, "event");
        if (!event.f53964g.f6412a) {
            if (gm0.j1.a()) {
                if (this.f322255d == 0) {
                    java.lang.Object m17 = gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINOF_WATCH_SO_RES_CHECK_LAST_TIME_LONG_SYNC, 0L);
                    kotlin.jvm.internal.o.e(m17, "null cannot be cast to non-null type kotlin.Long");
                    this.f322255d = ((java.lang.Long) m17).longValue();
                }
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                if (currentTimeMillis - this.f322255d >= 86400000) {
                    if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_rtos_auto_dowanload_so_enable_android, 0) == 1) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.SoResCheckListener", "rtos auto check so resource");
                        this.f322255d = currentTimeMillis;
                        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINOF_WATCH_SO_RES_CHECK_LAST_TIME_LONG_SYNC, java.lang.Long.valueOf(currentTimeMillis));
                        ly3.n nVar = ((my3.q) ((fy3.e) i95.n0.c(fy3.e.class))).f332829o;
                        nVar.getClass();
                        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.SoResMgr", "autoCheckSoRes");
                        nVar.f322276a.j(null);
                    } else {
                        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.SoResCheckListener", "rtos disable auto check so resource");
                    }
                }
            } else {
                com.tencent.mars.xlog.Log.w("MicroMsg.Rtos.SoResCheckListener", "acc no ready.");
            }
        }
        return false;
    }
}
