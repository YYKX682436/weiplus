package jq3;

/* loaded from: classes4.dex */
public final class k extends com.tencent.mm.sdk.event.n {
    public k() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.AggressiveCleanCacheEvent event = (com.tencent.mm.autogen.events.AggressiveCleanCacheEvent) iEvent;
        kotlin.jvm.internal.o.g(event, "event");
        jm0.i iVar = jm0.k.f300269h;
        if (((sq3.e) iVar.a(sq3.e.class)).Q4() == null) {
            return true;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.PriorityOnPreDownloadDBClearListener", "clear pre download check db");
        ((sq3.e) iVar.a(sq3.e.class)).onCleared();
        sq3.e.f411360m.a();
        return true;
    }
}
