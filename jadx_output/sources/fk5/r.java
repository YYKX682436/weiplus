package fk5;

/* loaded from: classes12.dex */
public final class r extends com.tencent.mm.sdk.event.n {
    public r() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.storage.f9 f9Var;
        com.tencent.mm.autogen.events.ReportForwardCdnEvent event = (com.tencent.mm.autogen.events.ReportForwardCdnEvent) iEvent;
        kotlin.jvm.internal.o.g(event, "event");
        am.ar arVar = event.f54685g;
        if (arVar == null || (f9Var = arVar.f6184a) == null) {
            return false;
        }
        fk5.y yVar = fk5.y.f263683d;
        java.lang.String Q0 = f9Var.Q0();
        kotlin.jvm.internal.o.f(Q0, "getTalker(...)");
        yVar.d(Q0, f9Var.getMsgId());
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).tj("page_out", new fk5.q(f9Var));
        return false;
    }
}
