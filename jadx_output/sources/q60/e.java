package q60;

/* loaded from: classes8.dex */
public final class e extends com.tencent.mm.sdk.event.n {
    public e() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.FeedUpdateEvent event = (com.tencent.mm.autogen.events.FeedUpdateEvent) iEvent;
        kotlin.jvm.internal.o.g(event, "event");
        p60.u uVar = (p60.u) i95.n0.c(p60.u.class);
        uVar.getClass();
        am.ia iaVar = event.f54252g;
        if (iaVar != null && iaVar.f6919b == 8) {
            if (iaVar != null && iaVar.f6925h == 2) {
                com.tencent.mars.xlog.Log.i("MicroMsg.PluginGameLive", uVar.Zi("received live end event"));
            }
        }
        return false;
    }
}
