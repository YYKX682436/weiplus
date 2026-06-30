package eg5;

/* loaded from: classes5.dex */
public final class j extends com.tencent.mm.sdk.event.n {
    public j() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.RevokeMsgEvent event = (com.tencent.mm.autogen.events.RevokeMsgEvent) iEvent;
        kotlin.jvm.internal.o.g(event, "event");
        com.tencent.mm.storage.f9 f9Var = event.f54713g.f6396c;
        if (f9Var == null || f9Var.A0() != 0) {
            return false;
        }
        g95.u.k(f9Var.getMsgId(), f9Var.Q0());
        return false;
    }
}
