package fk5;

/* loaded from: classes12.dex */
public final class c0 extends com.tencent.mm.sdk.event.n {
    public c0() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        boolean contains;
        com.tencent.mm.autogen.events.UpdateForwardMsgIdEvent event = (com.tencent.mm.autogen.events.UpdateForwardMsgIdEvent) iEvent;
        kotlin.jvm.internal.o.g(event, "event");
        am.xz xzVar = event.f54918g;
        if (xzVar == null || xzVar.f8410b != 0) {
            return false;
        }
        fk5.y yVar = fk5.y.f263683d;
        java.lang.String talker = xzVar.f8411c;
        kotlin.jvm.internal.o.f(talker, "talker");
        long j17 = xzVar.f8409a;
        yVar.getClass();
        synchronized (yVar.f259871c) {
            contains = ((java.util.ArrayList) yVar.f259871c).contains(java.lang.Long.valueOf(j17));
        }
        if (contains || !fk5.y.f263684e) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ForwardChattingReporter", "forward msg insert receiver db");
        yVar.d(talker, j17);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).tj("page_out", new fk5.x(j17, talker));
        return false;
    }
}
