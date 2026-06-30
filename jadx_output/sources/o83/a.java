package o83;

/* loaded from: classes14.dex */
public class a extends com.tencent.mm.sdk.event.n {
    public a() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.CheckIPCallIsStartedEvent checkIPCallIsStartedEvent = (com.tencent.mm.autogen.events.CheckIPCallIsStartedEvent) iEvent;
        if (!(checkIPCallIsStartedEvent instanceof com.tencent.mm.autogen.events.CheckIPCallIsStartedEvent)) {
            return false;
        }
        checkIPCallIsStartedEvent.f54051g.f7596a = com.tencent.mm.plugin.ipcall.model.r.bj().d();
        return false;
    }
}
