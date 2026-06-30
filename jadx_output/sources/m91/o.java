package m91;

/* loaded from: classes7.dex */
public final class o extends com.tencent.mm.sdk.event.n {
    public o() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.ANRDetectedEvent event = (com.tencent.mm.autogen.events.ANRDetectedEvent) iEvent;
        kotlin.jvm.internal.o.g(event, "event");
        m91.j.f324955a.a(m91.j.f324959e);
        return false;
    }
}
