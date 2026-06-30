package yv1;

/* loaded from: classes2.dex */
public final class h3 extends com.tencent.mm.sdk.event.n {
    public h3() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.BeforeAggressiveCleanCacheEvent event = (com.tencent.mm.autogen.events.BeforeAggressiveCleanCacheEvent) iEvent;
        kotlin.jvm.internal.o.g(event, "event");
        if ((event.f53999g.f7589a & 32) == 0) {
            return false;
        }
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
        cu2.x.f222449a.a();
        return true;
    }
}
