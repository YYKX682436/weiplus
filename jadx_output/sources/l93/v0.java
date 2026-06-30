package l93;

/* loaded from: classes8.dex */
public final class v0 extends com.tencent.mm.sdk.event.n {
    public v0() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.HomeUITabChangeEvent event = (com.tencent.mm.autogen.events.HomeUITabChangeEvent) iEvent;
        kotlin.jvm.internal.o.g(event, "event");
        if (event.f54438g.f7425a != 2) {
            return false;
        }
        ((ku5.t0) ku5.t0.f312615d).B(l93.u0.f317308d);
        return false;
    }
}
