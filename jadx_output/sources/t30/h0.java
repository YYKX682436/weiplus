package t30;

/* loaded from: classes15.dex */
public class h0 extends com.tencent.mm.sdk.event.n {
    public h0() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        l42.n Ai = l42.n.Ai();
        Ai.f316002g.post(new l42.h(Ai, (com.tencent.mm.autogen.events.NewEdgeScriptUpdateEvent) iEvent));
        return false;
    }
}
