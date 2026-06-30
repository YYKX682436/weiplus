package sg0;

/* loaded from: classes8.dex */
public final class o3 extends com.tencent.mm.sdk.event.n {
    public o3() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        java.lang.Object m521constructorimpl;
        com.tencent.mm.autogen.events.BypCommonBizWebSearchRedDotEvent event = (com.tencent.mm.autogen.events.BypCommonBizWebSearchRedDotEvent) iEvent;
        kotlin.jvm.internal.o.g(event, "event");
        byte[] bArr = event.f54018g.f6892a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Received a BypCommonBizWebSearchRedDotEvent, bufferCtxLength: ");
        sb6.append(bArr != null ? java.lang.Integer.valueOf(bArr.length) : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearchRedDotBYPEventListener", sb6.toString());
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            ((sg0.u3) ((tg0.w1) i95.n0.c(tg0.w1.class))).Zi(new tg0.q2(3001, 8, false, bArr));
            m521constructorimpl = kotlin.Result.m521constructorimpl(jz5.f0.f302826a);
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl);
        if (m524exceptionOrNullimpl == null) {
            return true;
        }
        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebSearchRedDotBYPEventListener", m524exceptionOrNullimpl, "", new java.lang.Object[0]);
        return true;
    }
}
