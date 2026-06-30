package nv;

/* loaded from: classes5.dex */
public final class p1 extends com.tencent.mm.sdk.event.n {
    public p1() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.AggressiveCleanCacheEvent event = (com.tencent.mm.autogen.events.AggressiveCleanCacheEvent) iEvent;
        kotlin.jvm.internal.o.g(event, "event");
        com.tencent.mars.xlog.Log.i("RoamAggressiveCleanEventListener", "aggressiveCleanEventListener: has trigger aggressive clean");
        ((ku5.t0) ku5.t0.f312615d).q(nv.o1.f340377d);
        return true;
    }
}
