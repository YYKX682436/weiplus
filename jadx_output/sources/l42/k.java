package l42;

/* loaded from: classes15.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.NewEdgeSqlDeleteEvent f315993d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l42.n f315994e;

    public k(l42.n nVar, com.tencent.mm.autogen.events.NewEdgeSqlDeleteEvent newEdgeSqlDeleteEvent) {
        this.f315994e = nVar;
        this.f315993d = newEdgeSqlDeleteEvent;
    }

    @Override // java.lang.Runnable
    public void run() {
        am.cl clVar;
        com.tencent.mm.autogen.events.NewEdgeSqlDeleteEvent newEdgeSqlDeleteEvent = this.f315993d;
        if (newEdgeSqlDeleteEvent == null || (clVar = newEdgeSqlDeleteEvent.f54531g) == null) {
            return;
        }
        long j17 = clVar.f6360a;
        if (j17 <= 0) {
            return;
        }
        java.lang.String valueOf = java.lang.String.valueOf(j17);
        com.tencent.mars.xlog.Log.i("EdgeComputingConfigService", "[EdgeComputingConfigService] mNewEdgeSqlDeleteEvent configID : " + valueOf);
        t42.a.b(valueOf, 9, 0L);
        synchronized (this.f315994e.f316000e) {
            if (((java.util.HashMap) this.f315994e.f316000e).containsKey(valueOf)) {
                s42.c cVar = (s42.c) ((java.util.HashMap) this.f315994e.f316000e).remove(valueOf);
                if (cVar != null && this.f315994e.f316004i != null) {
                    fs.g.b(l42.z.class, new l42.d$$d(cVar));
                }
                this.f315994e.Ri();
            }
        }
    }
}
