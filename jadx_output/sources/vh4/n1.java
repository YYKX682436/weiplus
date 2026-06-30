package vh4;

/* loaded from: classes5.dex */
public class n1 extends com.tencent.mm.sdk.event.n {
    public n1() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        if (((com.tencent.mm.autogen.events.InitEndEvent) iEvent).f54441g.f7712a) {
            uh4.c0.getService().bg(false);
        }
        return false;
    }
}
