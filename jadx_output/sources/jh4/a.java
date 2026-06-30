package jh4;

/* loaded from: classes8.dex */
public final class a extends com.tencent.mm.sdk.event.n {
    public a() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.AggressiveCleanCacheEvent event = (com.tencent.mm.autogen.events.AggressiveCleanCacheEvent) iEvent;
        kotlin.jvm.internal.o.g(event, "event");
        com.tencent.mars.xlog.Log.i("MicroMsg.DynamicBackgroundAggressiveCleanEventListener", "aggressiveCleanEventListener: has trigger aggressive clean");
        jh4.d dVar = jh4.d.f299850a;
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        dVar.a(context);
        return true;
    }
}
