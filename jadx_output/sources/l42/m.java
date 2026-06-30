package l42;

/* loaded from: classes15.dex */
public class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.SessionEdgeSqlChangeEvent f315997d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l42.n f315998e;

    public m(l42.n nVar, com.tencent.mm.autogen.events.SessionEdgeSqlChangeEvent sessionEdgeSqlChangeEvent) {
        this.f315998e = nVar;
        this.f315997d = sessionEdgeSqlChangeEvent;
    }

    @Override // java.lang.Runnable
    public void run() {
        am.ut utVar;
        com.tencent.mm.autogen.events.SessionEdgeSqlChangeEvent sessionEdgeSqlChangeEvent = this.f315997d;
        if (sessionEdgeSqlChangeEvent == null || (utVar = sessionEdgeSqlChangeEvent.f54760g) == null) {
            return;
        }
        long j17 = utVar.f8135a;
        if (j17 == 0) {
            return;
        }
        java.lang.String valueOf = java.lang.String.valueOf(j17);
        com.tencent.mars.xlog.Log.i("EdgeComputingConfigService", "[EdgeComputingConfigService] mSessionEdgeSqlChangeEvent configID : " + valueOf + ", isDel : " + this.f315997d.f54760g.f8137c);
        if (this.f315997d.f54760g.f8137c.booleanValue()) {
            t42.a.b(valueOf, 9, 0L);
        } else {
            t42.a.b(valueOf, 8, 0L);
        }
        synchronized (this.f315998e.f316000e) {
            if (this.f315997d.f54760g.f8137c.booleanValue()) {
                if (!((java.util.HashMap) this.f315998e.f316000e).containsKey(valueOf)) {
                    return;
                }
                s42.c cVar = (s42.c) ((java.util.HashMap) this.f315998e.f316000e).remove(valueOf);
                if (cVar != null && this.f315998e.f316004i != null) {
                    fs.g.b(l42.z.class, new l42.d$$d(cVar));
                }
            } else {
                if (u46.l.e(this.f315997d.f54760g.f8136b)) {
                    return;
                }
                final s42.c cVar2 = (s42.c) ((java.util.HashMap) this.f315998e.f316000e).get(valueOf);
                if (cVar2 != null && u46.l.c(cVar2.f402951g, this.f315997d.f54760g.f8136b)) {
                    ((l42.d) this.f315998e.f316004i).getClass();
                    fs.g.b(l42.z.class, new fs.o() { // from class: l42.d$$c
                        @Override // fs.o
                        public final boolean a(fs.n nVar) {
                            ((p30.a) ((l42.z) nVar)).getClass();
                            g42.f.Bi().getClass();
                            s42.c cVar3 = s42.c.this;
                            if (cVar3 == null) {
                                return false;
                            }
                            com.tencent.mars.xlog.Log.i("EdgeComputingMgr", "[EdgeComputingMgr] onSqlConfigSame sameConfig : " + cVar3.f402945a);
                            return false;
                        }
                    });
                    return;
                }
                s42.c g17 = this.f315998e.f316003h.g(valueOf, this.f315997d.f54760g.f8136b);
                if (g17 == null) {
                    return;
                }
                ((java.util.HashMap) this.f315998e.f316000e).put(g17.f402945a, g17);
                if (this.f315998e.f316004i != null) {
                    fs.g.b(l42.z.class, new l42.d$$a(g17));
                }
            }
            this.f315998e.Ri();
        }
    }
}
