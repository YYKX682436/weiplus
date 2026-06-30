package ln3;

/* loaded from: classes4.dex */
public final class a extends com.tencent.mm.sdk.event.n {
    public a() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        java.lang.Object m521constructorimpl;
        j75.f Ai;
        j75.f Ai2;
        com.tencent.mm.autogen.events.BypNotifyActionEvent event = (com.tencent.mm.autogen.events.BypNotifyActionEvent) iEvent;
        kotlin.jvm.internal.o.g(event, "event");
        am.j1 j1Var = event.f54019g;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            if (j1Var.f6992a == 7) {
                r45.pq pqVar = new r45.pq();
                pqVar.parseFrom(j1Var.f6993b);
                com.tencent.mars.xlog.Log.i("MicroMsg.NewLife.BypRedDotNotifyEventListener", "notify from bypNewLife, cmdId: " + pqVar.f383297d + " cmd_id_set: " + pqVar.f383299f + ", bufLen: " + pqVar.f383298e.f192156a.length);
                if ((pqVar.f383297d & 2) > 0 || (pqVar.f383299f & 2) > 0) {
                    r45.oq oqVar = new r45.oq();
                    oqVar.parseFrom(pqVar.f383298e.g());
                    int i17 = ra0.y.f393481g1;
                    ra0.y Di = ((en3.v) ((ra0.v) i95.n0.c(ra0.v.class))).Di();
                    if (Di != null && (Ai = ((en3.l0) Di).Ai()) != null) {
                        Ai.B3(new sa0.k(oqVar.f382437d, 1001, 4, 3));
                    }
                }
                if ((pqVar.f383299f & 8) > 0) {
                    int i18 = ra0.y.f393481g1;
                    ra0.y Di2 = ((en3.v) ((ra0.v) i95.n0.c(ra0.v.class))).Di();
                    if (Di2 != null && (Ai2 = ((en3.l0) Di2).Ai()) != null) {
                        Ai2.B3(new sa0.n());
                    }
                }
            }
            m521constructorimpl = kotlin.Result.m521constructorimpl(jz5.f0.f302826a);
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl);
        if (m524exceptionOrNullimpl == null) {
            return true;
        }
        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NewLife.BypRedDotNotifyEventListener", m524exceptionOrNullimpl, "", new java.lang.Object[0]);
        return true;
    }
}
