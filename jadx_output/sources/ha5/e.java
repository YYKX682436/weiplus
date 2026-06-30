package ha5;

/* loaded from: classes6.dex */
public final class e extends com.tencent.mm.sdk.event.n {
    public e() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.ActivateEvent event = (com.tencent.mm.autogen.events.ActivateEvent) iEvent;
        kotlin.jvm.internal.o.g(event, "event");
        return false;
    }
}
