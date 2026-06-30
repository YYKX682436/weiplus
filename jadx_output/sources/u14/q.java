package u14;

/* loaded from: classes10.dex */
public final class q extends com.tencent.mm.sdk.event.n {
    public q() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.VoipCustomEvent event = (com.tencent.mm.autogen.events.VoipCustomEvent) iEvent;
        kotlin.jvm.internal.o.g(event, "event");
        java.lang.String str = event.f54944g.f8333a;
        if (kotlin.jvm.internal.o.b(str, "Voip_Init")) {
            ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).getClass();
            return false;
        }
        if (!kotlin.jvm.internal.o.b(str, "Voip_End")) {
            return false;
        }
        ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).getClass();
        return false;
    }
}
