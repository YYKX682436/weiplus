package gt;

/* loaded from: classes11.dex */
public class g5 extends com.tencent.mm.sdk.event.n {
    public g5() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.MsgInsertWithNewContactEvent msgInsertWithNewContactEvent = (com.tencent.mm.autogen.events.MsgInsertWithNewContactEvent) iEvent;
        if (gm0.j1.a()) {
            com.tencent.mm.storage.z3 z3Var = msgInsertWithNewContactEvent.f54500g.f8382a;
            if (com.tencent.mm.storage.z3.z3(z3Var.d1())) {
                z3Var.l3(0);
                com.tencent.mm.plugin.appbrand.config.q.o(z3Var.d1());
            }
        }
        return false;
    }
}
