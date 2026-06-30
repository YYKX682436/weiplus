package tv1;

/* loaded from: classes5.dex */
public class k extends com.tencent.mm.sdk.event.n {
    public k() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        if (!((com.tencent.mm.autogen.events.InitEndEvent) iEvent).f54441g.f7712a) {
            return false;
        }
        c01.v1.b(true);
        return false;
    }
}
