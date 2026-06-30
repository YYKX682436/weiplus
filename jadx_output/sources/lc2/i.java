package lc2;

/* loaded from: classes8.dex */
public final class i extends com.tencent.mm.sdk.event.n {
    public i() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.RedDotExposureEventEvent event = (com.tencent.mm.autogen.events.RedDotExposureEventEvent) iEvent;
        kotlin.jvm.internal.o.g(event, "event");
        ((c61.l7) i95.n0.c(c61.l7.class)).nk().Q0(event);
        return false;
    }
}
