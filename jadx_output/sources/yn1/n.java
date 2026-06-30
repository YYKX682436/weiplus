package yn1;

/* loaded from: classes11.dex */
public final class n extends com.tencent.mm.sdk.event.n {
    public n() {
        super(1000);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.AccountExpiredEvent event = (com.tencent.mm.autogen.events.AccountExpiredEvent) iEvent;
        kotlin.jvm.internal.o.g(event, "event");
        am.c cVar = event.f53963g;
        com.tencent.mars.xlog.Log.i("MM.Mig.AccountExpiredListener", "[AccountExpired] " + cVar.f6296c + ", " + cVar.f6294a + ", " + cVar.f6295b);
        yn1.z0 z0Var = yn1.z0.f463933a;
        synchronized (z0Var) {
            if (!z0Var.n()) {
                com.tencent.mars.xlog.Log.i("MM.Mig.MigrationGlobalHolder", "[onLogoutEvent] Migration is not initialized, ignore event");
                return false;
            }
            com.tencent.mars.xlog.Log.i("MM.Mig.MigrationGlobalHolder", "[onLogoutEvent] event=" + event);
            yn1.z0.f463943k = event;
            return false;
        }
    }
}
