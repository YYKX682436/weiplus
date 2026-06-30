package l93;

/* loaded from: classes4.dex */
public final class c extends com.tencent.mm.sdk.event.n {
    public c() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        java.lang.Object m521constructorimpl;
        com.tencent.mm.autogen.events.BypNotifyActionEvent event = (com.tencent.mm.autogen.events.BypNotifyActionEvent) iEvent;
        kotlin.jvm.internal.o.g(event, "event");
        am.j1 j1Var = event.f54019g;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            if (j1Var.f6992a == 4) {
                com.tencent.mars.xlog.Log.i("MicroMsg.BypRedDotNotifyEventListener", "notify from bypFinder");
                r45.pq pqVar = new r45.pq();
                pqVar.parseFrom(j1Var.f6993b);
                if (pqVar.f383297d == 1) {
                    r45.nq nqVar = new r45.nq();
                    nqVar.parseFrom(pqVar.f383298e.g());
                    ((c61.l7) i95.n0.c(c61.l7.class)).P.e((int) nqVar.f381588d, 11);
                }
            }
            m521constructorimpl = kotlin.Result.m521constructorimpl(jz5.f0.f302826a);
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl);
        if (m524exceptionOrNullimpl != null) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BypRedDotNotifyEventListener", m524exceptionOrNullimpl, "", new java.lang.Object[0]);
        }
        return true;
    }
}
