package lc5;

/* loaded from: classes9.dex */
public final class y extends com.tencent.mm.sdk.event.n {
    public y() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.RevokeMsgEvent event = (com.tencent.mm.autogen.events.RevokeMsgEvent) iEvent;
        kotlin.jvm.internal.o.g(event, "event");
        am.cs csVar = event.f54713g;
        long j17 = csVar.f6394a;
        java.lang.String Q0 = csVar.f6396c.Q0();
        lc5.t tVar = lc5.t.f318032d;
        kotlin.jvm.internal.o.d(Q0);
        tVar.b(j17, Q0);
        return true;
    }
}
