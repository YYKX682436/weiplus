package t30;

/* loaded from: classes15.dex */
public class e0 extends com.tencent.mm.sdk.event.n {
    public e0() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        l42.n Ai = l42.n.Ai();
        Ai.f316002g.post(new l42.i(Ai, (com.tencent.mm.autogen.events.NewEdgeScriptDeleteEvent) iEvent));
        return false;
    }
}
