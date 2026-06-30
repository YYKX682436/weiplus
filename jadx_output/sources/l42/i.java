package l42;

/* loaded from: classes15.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.NewEdgeScriptDeleteEvent f315989d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l42.n f315990e;

    public i(l42.n nVar, com.tencent.mm.autogen.events.NewEdgeScriptDeleteEvent newEdgeScriptDeleteEvent) {
        this.f315990e = nVar;
        this.f315989d = newEdgeScriptDeleteEvent;
    }

    @Override // java.lang.Runnable
    public void run() {
        am.al alVar;
        com.tencent.mm.autogen.events.NewEdgeScriptDeleteEvent newEdgeScriptDeleteEvent = this.f315989d;
        if (newEdgeScriptDeleteEvent == null || (alVar = newEdgeScriptDeleteEvent.f54529g) == null) {
            return;
        }
        long j17 = alVar.f6162a;
        if (j17 <= 0) {
            return;
        }
        java.lang.String valueOf = java.lang.String.valueOf(j17);
        com.tencent.mars.xlog.Log.i("EdgeComputingConfigService", "[EdgeComputingConfigService] mNewEdgeScriptDeleteEvent configID : " + valueOf);
        t42.a.b(valueOf, 2, 0L);
        synchronized (this.f315990e.f315999d) {
            if (((java.util.HashMap) this.f315990e.f315999d).containsKey(valueOf)) {
                s42.b bVar = (s42.b) ((java.util.HashMap) this.f315990e.f315999d).remove(valueOf);
                if (bVar != null && this.f315990e.f316004i != null) {
                    fs.g.b(l42.z.class, new l42.d$$e(bVar));
                }
                this.f315990e.Ni();
                l42.n.wi(this.f315990e);
            }
        }
    }
}
