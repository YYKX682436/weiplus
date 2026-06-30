package com.tencent.mm.storage;

/* loaded from: classes10.dex */
public final class wa extends com.tencent.mm.sdk.event.n {
    public wa() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.AggressiveCleanCacheEvent event = (com.tencent.mm.autogen.events.AggressiveCleanCacheEvent) iEvent;
        kotlin.jvm.internal.o.g(event, "event");
        com.tencent.mars.xlog.Log.i("MicroMsg.BackgroundVideoAggressiveCleanEventListener", "aggressiveCleanEventListener: has trigger aggressive clean");
        bm5.t0 t0Var = bm5.t0.f22738a;
        if (!t0Var.a() || !t0Var.b()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BackgroundVideoAggressiveCleanEventListener", "entrance is close");
            return true;
        }
        jm0.i iVar = jm0.k.f300269h;
        if (((com.tencent.mm.storage.n8) iVar.a(com.tencent.mm.storage.n8.class)).Q4() == null) {
            return true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.BackgroundVideoAggressiveCleanEventListener", "exist old db need to create new db");
        ((com.tencent.mm.storage.n8) iVar.a(com.tencent.mm.storage.n8.class)).onCleared();
        com.tencent.mm.storage.s8.f195314a.a();
        return true;
    }
}
