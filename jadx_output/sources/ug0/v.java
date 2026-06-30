package ug0;

/* loaded from: classes8.dex */
public final class v extends com.tencent.mm.sdk.event.n {
    public v() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        java.lang.Object m521constructorimpl;
        com.tencent.mm.autogen.events.FinderRedDotExpirationEvent event = (com.tencent.mm.autogen.events.FinderRedDotExpirationEvent) iEvent;
        kotlin.jvm.internal.o.g(event, "event");
        am.yc ycVar = event.f54319g;
        int i17 = ycVar.f8453a.field_ctrType;
        if (i17 < 500000 || i17 >= 599999) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearchRedDotExpirationEventListener", "Received a FinderRedDotExpirationEvent, but not WebSearch-type.");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearchRedDotExpirationEventListener", "Received a FinderRedDotExpirationEvent, and it's WebSearch-type.");
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                ((sg0.u3) ((tg0.w1) i95.n0.c(tg0.w1.class))).Zi(new tg0.l2(ycVar.f8453a));
                m521constructorimpl = kotlin.Result.m521constructorimpl(jz5.f0.f302826a);
            } catch (java.lang.Throwable th6) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
            }
            java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl);
            if (m524exceptionOrNullimpl != null) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebSearchRedDotExpirationEventListener", m524exceptionOrNullimpl, "", new java.lang.Object[0]);
            }
        }
        return false;
    }
}
