package pg0;

/* loaded from: classes9.dex */
public final class j3 extends com.tencent.mm.sdk.event.n {
    public j3() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.WalletQueryHbStatusEvent event = (com.tencent.mm.autogen.events.WalletQueryHbStatusEvent) iEvent;
        kotlin.jvm.internal.o.g(event, "event");
        at4.k1 D0 = ((pg0.a3) i95.n0.c(pg0.a3.class)).Vi().D0(event.f54969g.f8253a);
        if (D0 == null) {
            return false;
        }
        int i17 = D0.field_hbType;
        am.x10 x10Var = event.f54970h;
        x10Var.f8335a = i17;
        x10Var.f8336b = D0.field_hbStatus;
        x10Var.f8337c = D0.field_receiveStatus;
        return false;
    }
}
