package l93;

/* loaded from: classes8.dex */
public final class a extends com.tencent.mm.sdk.event.n {
    public a() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.AggressiveCleanCacheEvent event = (com.tencent.mm.autogen.events.AggressiveCleanCacheEvent) iEvent;
        kotlin.jvm.internal.o.g(event, "event");
        com.tencent.mars.xlog.Log.i("MicroMsg.AggressiveCleanEventListener", "aggressiveCleanEventListener: has trigger aggressive clean");
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_SYNC_KEYBUF2_STRING_SYNC, "");
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_SYNC_LAST_BUFF_STRING_SYNC, "");
        return true;
    }
}
