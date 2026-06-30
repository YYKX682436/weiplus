package ow;

/* loaded from: classes11.dex */
public final class b extends com.tencent.mm.sdk.event.n {
    public b() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.BrandEcsTmplMsgChangeEvent event = (com.tencent.mm.autogen.events.BrandEcsTmplMsgChangeEvent) iEvent;
        kotlin.jvm.internal.o.g(event, "event");
        if (!gm0.j1.a()) {
            return false;
        }
        yq1.n.a("BrandServiceWorkerThread", ow.a.f349239d, 0L);
        return false;
    }
}
