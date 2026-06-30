package tx3;

/* loaded from: classes10.dex */
public final class a extends com.tencent.mm.sdk.event.n {
    public a() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.ChattingUIStatusEvent event = (com.tencent.mm.autogen.events.ChattingUIStatusEvent) iEvent;
        kotlin.jvm.internal.o.g(event, "event");
        mx3.b0 b0Var = mx3.b0.f332528a;
        boolean z17 = event.f54046g.f7124a;
        mx3.b0.f332529b = z17;
        if (z17) {
            return false;
        }
        java.util.Iterator it = ((java.util.ArrayList) mx3.b0.f332531d).iterator();
        while (it.hasNext()) {
            com.tencent.mm.storage.f9 f9Var = (com.tencent.mm.storage.f9) it.next();
            f9Var.l1(f9Var.F | 16384);
            c01.w9.C(f9Var);
        }
        ((java.util.ArrayList) mx3.b0.f332531d).clear();
        mx3.b0.f332530c.clear();
        return false;
    }
}
