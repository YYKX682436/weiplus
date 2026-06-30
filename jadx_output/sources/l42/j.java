package l42;

/* loaded from: classes15.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.NewEdgeSqlUpdateEvent f315991d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l42.n f315992e;

    public j(l42.n nVar, com.tencent.mm.autogen.events.NewEdgeSqlUpdateEvent newEdgeSqlUpdateEvent) {
        this.f315992e = nVar;
        this.f315991d = newEdgeSqlUpdateEvent;
    }

    @Override // java.lang.Runnable
    public void run() {
        am.dl dlVar;
        com.tencent.mm.autogen.events.NewEdgeSqlUpdateEvent newEdgeSqlUpdateEvent = this.f315991d;
        if (newEdgeSqlUpdateEvent == null || (dlVar = newEdgeSqlUpdateEvent.f54532g) == null) {
            return;
        }
        long j17 = dlVar.f6475a;
        if (j17 <= 0 || dlVar.f6476b == null) {
            return;
        }
        java.lang.String valueOf = java.lang.String.valueOf(j17);
        com.tencent.mars.xlog.Log.i("EdgeComputingConfigService", "[EdgeComputingConfigService] mNewEdgeSqlUpdateEvent configID : " + valueOf);
        t42.a.b(valueOf, 8, 0L);
        synchronized (this.f315992e.f316000e) {
            s42.c d17 = this.f315992e.f316003h.d(valueOf, this.f315991d.f54532g.f6476b);
            if (d17 == null) {
                return;
            }
            ((java.util.HashMap) this.f315992e.f316000e).put(d17.f402945a, d17);
            if (this.f315992e.f316004i != null) {
                fs.g.b(l42.z.class, new l42.d$$a(d17));
            }
            this.f315992e.Ri();
            l42.n nVar = this.f315992e;
            nVar.f316002g.post(new l42.e(nVar));
        }
    }
}
