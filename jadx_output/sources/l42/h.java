package l42;

/* loaded from: classes15.dex */
public class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.NewEdgeScriptUpdateEvent f315987d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l42.n f315988e;

    public h(l42.n nVar, com.tencent.mm.autogen.events.NewEdgeScriptUpdateEvent newEdgeScriptUpdateEvent) {
        this.f315988e = nVar;
        this.f315987d = newEdgeScriptUpdateEvent;
    }

    @Override // java.lang.Runnable
    public void run() {
        am.bl blVar;
        com.tencent.mm.autogen.events.NewEdgeScriptUpdateEvent newEdgeScriptUpdateEvent = this.f315987d;
        if (newEdgeScriptUpdateEvent == null || (blVar = newEdgeScriptUpdateEvent.f54530g) == null) {
            return;
        }
        long j17 = blVar.f6260a;
        if (j17 <= 0 || blVar.f6261b == null) {
            return;
        }
        java.lang.String valueOf = java.lang.String.valueOf(j17);
        com.tencent.mars.xlog.Log.i("EdgeComputingConfigService", "[EdgeComputingConfigService] mNewEdgeScriptUpdateEvent configID : " + valueOf);
        t42.a.b(valueOf, 1, 0L);
        synchronized (this.f315988e.f315999d) {
            s42.b b17 = this.f315988e.f316003h.b(valueOf, this.f315987d.f54530g.f6261b);
            if (b17 == null) {
                return;
            }
            ((java.util.HashMap) this.f315988e.f315999d).put(b17.f402931a, b17);
            if (this.f315988e.f316004i != null) {
                fs.g.b(l42.z.class, new l42.d$$f(b17));
            }
            this.f315988e.Ni();
            l42.n.wi(this.f315988e);
            l42.n nVar = this.f315988e;
            nVar.f316002g.post(new l42.e(nVar));
        }
    }
}
