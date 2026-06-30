package x03;

/* loaded from: classes15.dex */
public final class k extends com.tencent.mm.sdk.event.n {
    public k() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.AggressiveCleanCacheEvent event = (com.tencent.mm.autogen.events.AggressiveCleanCacheEvent) iEvent;
        kotlin.jvm.internal.o.g(event, "event");
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterVideoAggressiveCleanEventListener", "aggressiveCleanEventListener: has trigger aggressive clean");
        x03.x0 a17 = x03.x0.f451161d.a();
        a17.f451164b.f451041g.clear();
        java.util.HashMap hashMap = a17.f451165c.f451060d;
        if (hashMap == null) {
            return true;
        }
        hashMap.clear();
        return true;
    }
}
