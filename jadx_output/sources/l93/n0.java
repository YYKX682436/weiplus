package l93;

/* loaded from: classes8.dex */
public final class n0 extends com.tencent.mm.sdk.event.n {
    public n0() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.FinderSyncEvent event = (com.tencent.mm.autogen.events.FinderSyncEvent) iEvent;
        kotlin.jvm.internal.o.g(event, "event");
        event.f54327g.getClass();
        ((c61.l7) i95.n0.c(c61.l7.class)).P.e(826259965, 3);
        return true;
    }
}
