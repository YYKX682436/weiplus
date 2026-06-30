package t30;

/* loaded from: classes15.dex */
public class d extends com.tencent.mm.sdk.event.n {
    public d() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        l42.n Ai = l42.n.Ai();
        Ai.f316002g.post(new l42.m(Ai, (com.tencent.mm.autogen.events.SessionEdgeSqlChangeEvent) iEvent));
        return false;
    }
}
