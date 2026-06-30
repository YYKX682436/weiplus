package t30;

/* loaded from: classes15.dex */
public class k0 extends com.tencent.mm.sdk.event.n {
    public k0() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        l42.n Ai = l42.n.Ai();
        Ai.f316002g.post(new l42.k(Ai, (com.tencent.mm.autogen.events.NewEdgeSqlDeleteEvent) iEvent));
        return false;
    }
}
