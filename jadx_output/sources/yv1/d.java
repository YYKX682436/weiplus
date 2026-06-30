package yv1;

/* loaded from: classes7.dex */
public final class d extends com.tencent.mm.sdk.event.n {
    public d() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.BeforeAggressiveCleanCacheEvent event = (com.tencent.mm.autogen.events.BeforeAggressiveCleanCacheEvent) iEvent;
        kotlin.jvm.internal.o.g(event, "event");
        if ((event.f53999g.f7589a & 8) == 0) {
            return false;
        }
        ((ft.e) i95.n0.c(ft.e.class)).V4();
        return true;
    }
}
