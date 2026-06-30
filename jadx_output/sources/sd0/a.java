package sd0;

/* loaded from: classes5.dex */
public final class a extends com.tencent.mm.sdk.event.n {
    public a() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.DynamicConfigUpdatedEvent event = (com.tencent.mm.autogen.events.DynamicConfigUpdatedEvent) iEvent;
        kotlin.jvm.internal.o.g(event, "event");
        if (!gm0.j1.a()) {
            return false;
        }
        com.tencent.mm.ui.contact.i5.e();
        return false;
    }
}
