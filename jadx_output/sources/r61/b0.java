package r61;

/* loaded from: classes11.dex */
public class b0 extends com.tencent.mm.sdk.event.n {
    public b0() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.FMsgGetNameEvent fMsgGetNameEvent = (com.tencent.mm.autogen.events.FMsgGetNameEvent) iEvent;
        am.m9 m9Var = fMsgGetNameEvent.f54230h;
        am.l9 l9Var = fMsgGetNameEvent.f54229g;
        m9Var.f7330a = r61.q0.f(l9Var.f7230a);
        am.m9 m9Var2 = fMsgGetNameEvent.f54230h;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(m9Var2.f7330a)) {
            return false;
        }
        m9Var2.f7330a = r61.q0.f(l9Var.f7231b);
        return false;
    }
}
