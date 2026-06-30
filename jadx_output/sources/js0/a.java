package js0;

/* loaded from: classes10.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ js0.c f301457d;

    public a(js0.c cVar) {
        this.f301457d = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        while (this.f301457d.f301468j) {
            try {
                js0.c cVar = this.f301457d;
                synchronized (cVar.f301471m) {
                    cVar.f301471m.wait();
                }
                com.tencent.mars.xlog.Log.i(this.f301457d.f301470l, "mixBackground:" + this.f301457d.f301459a + ", mixMusic:" + this.f301457d.f301460b + ", music:" + this.f301457d.f301465g.size() + ", background:" + this.f301457d.f301464f.size());
                js0.c cVar2 = this.f301457d;
                synchronized (cVar2.f301472n) {
                    do {
                        try {
                            if (cVar2.f301464f.size() < 1 && cVar2.f301465g.size() < 1) {
                                break;
                            }
                            boolean z17 = cVar2.f301459a;
                            if (!z17 || !cVar2.f301460b) {
                                if (z17 || cVar2.f301460b) {
                                    cVar2.f301461c.invoke();
                                    js0.c.a(cVar2);
                                    js0.c.b(cVar2);
                                    if (cVar2.f301460b) {
                                        if (cVar2.f301465g.size() < 1) {
                                            break;
                                        }
                                    }
                                    if (cVar2.f301459a && cVar2.f301464f.size() < 1) {
                                        break;
                                    }
                                }
                            } else {
                                if (cVar2.f301464f.size() < 1 || cVar2.f301465g.size() < 1) {
                                    break;
                                }
                                cVar2.f301461c.invoke();
                                js0.c.a(cVar2);
                                js0.c.b(cVar2);
                            }
                        } finally {
                        }
                    } while (cVar2.f301469k);
                    if (cVar2.f301469k) {
                        com.tencent.mars.xlog.Log.i(cVar2.f301470l, "flush data finish");
                        cVar2.f301468j = false;
                        cVar2.f301467i = true;
                        cVar2.f301472n.notifyAll();
                    }
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace(this.f301457d.f301470l, e17, "", new java.lang.Object[0]);
                com.tencent.mars.xlog.Log.i("MicroMsg.MediaEditorIDKeyStat", "markRemuxPcmFrameMixFailed");
                com.tencent.mm.plugin.report.service.g0.INSTANCE.C(986L, 24L, 1L);
            }
        }
        com.tencent.mars.xlog.Log.i(this.f301457d.f301470l, "finish mix");
    }
}
