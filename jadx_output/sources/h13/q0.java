package h13;

/* loaded from: classes8.dex */
public final class q0 extends com.tencent.mm.sdk.event.n {
    public q0() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.ManualAuthEvent event = (com.tencent.mm.autogen.events.ManualAuthEvent) iEvent;
        kotlin.jvm.internal.o.g(event, "event");
        com.tencent.mars.xlog.Log.i("MicroMsg.ForceNotifyService", "[callback] event:%s", event);
        new i13.f().l();
        return true;
    }
}
