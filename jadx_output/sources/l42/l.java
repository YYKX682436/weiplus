package l42;

/* loaded from: classes15.dex */
public class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.SessionEdgeScriptChangeEvent f315995d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l42.n f315996e;

    public l(l42.n nVar, com.tencent.mm.autogen.events.SessionEdgeScriptChangeEvent sessionEdgeScriptChangeEvent) {
        this.f315996e = nVar;
        this.f315995d = sessionEdgeScriptChangeEvent;
    }

    @Override // java.lang.Runnable
    public void run() {
        am.tt ttVar;
        com.tencent.mm.autogen.events.SessionEdgeScriptChangeEvent sessionEdgeScriptChangeEvent = this.f315995d;
        if (sessionEdgeScriptChangeEvent == null || (ttVar = sessionEdgeScriptChangeEvent.f54759g) == null) {
            return;
        }
        long j17 = ttVar.f8034a;
        if (j17 == 0) {
            return;
        }
        java.lang.String valueOf = java.lang.String.valueOf(j17);
        com.tencent.mars.xlog.Log.i("EdgeComputingConfigService", "[EdgeComputingConfigService] mSessionPageConfigChangeEvent configID : " + valueOf + ", isDel : " + this.f315995d.f54759g.f8036c);
        if (this.f315995d.f54759g.f8036c.booleanValue()) {
            t42.a.b(valueOf, 2, 0L);
        } else {
            t42.a.b(valueOf, 1, 0L);
        }
        synchronized (this.f315996e.f315999d) {
            if (this.f315995d.f54759g.f8036c.booleanValue()) {
                if (!((java.util.HashMap) this.f315996e.f315999d).containsKey(valueOf)) {
                    return;
                }
                s42.b bVar = (s42.b) ((java.util.HashMap) this.f315996e.f315999d).remove(valueOf);
                if (bVar != null && this.f315996e.f316004i != null) {
                    fs.g.b(l42.z.class, new l42.d$$e(bVar));
                }
            } else {
                if (u46.l.e(this.f315995d.f54759g.f8035b)) {
                    return;
                }
                final s42.b bVar2 = (s42.b) ((java.util.HashMap) this.f315996e.f315999d).get(valueOf);
                if (bVar2 != null && u46.l.c(bVar2.f402943m, this.f315995d.f54759g.f8035b)) {
                    ((l42.d) this.f315996e.f316004i).getClass();
                    fs.g.b(l42.z.class, new fs.o() { // from class: l42.d$$b
                        @Override // fs.o
                        public final boolean a(fs.n nVar) {
                            ((p30.a) ((l42.z) nVar)).getClass();
                            g42.f Bi = g42.f.Bi();
                            Bi.getClass();
                            s42.b bVar3 = s42.b.this;
                            if (bVar3 == null) {
                                return false;
                            }
                            if (g42.i.g()) {
                                Bi.f268729o.post(new g42.e(Bi, bVar3));
                            }
                            com.tencent.mars.xlog.Log.i("EdgeComputingMgr", "[EdgeComputingMgr] onScriptConfigSame sameConfig : " + bVar3.f402931a);
                            return false;
                        }
                    });
                    return;
                }
                s42.b f17 = this.f315996e.f316003h.f(valueOf, this.f315995d.f54759g.f8035b);
                if (f17 == null) {
                    return;
                }
                ((java.util.HashMap) this.f315996e.f315999d).put(f17.f402931a, f17);
                if (this.f315996e.f316004i != null) {
                    fs.g.b(l42.z.class, new l42.d$$f(f17));
                }
            }
            this.f315996e.Ni();
            l42.n.wi(this.f315996e);
        }
    }
}
