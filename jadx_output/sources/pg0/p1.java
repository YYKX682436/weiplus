package pg0;

/* loaded from: classes.dex */
public final class p1 extends com.tencent.mm.sdk.event.n {
    public p1() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.RequestEnterWalletEvent event = (com.tencent.mm.autogen.events.RequestEnterWalletEvent) iEvent;
        kotlin.jvm.internal.o.g(event, "event");
        pg0.a3 a3Var = (pg0.a3) i95.n0.c(pg0.a3.class);
        am.ir irVar = event.f54693g;
        a3Var.Di(irVar.f6968a, irVar.f6969b);
        return true;
    }
}
