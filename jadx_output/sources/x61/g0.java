package x61;

/* loaded from: classes8.dex */
public class g0 extends com.tencent.mm.sdk.event.n {
    public g0() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.GetMFriendEvent getMFriendEvent = (com.tencent.mm.autogen.events.GetMFriendEvent) iEvent;
        if (!(getMFriendEvent instanceof com.tencent.mm.autogen.events.GetMFriendEvent)) {
            return false;
        }
        int i17 = getMFriendEvent.f54403g.f6555a;
        r61.h1 h1Var = new r61.h1();
        ((r45.gi3) h1Var.f392878d.f70710a.f70684a).f375284m = i17;
        gm0.j1.d().g(h1Var);
        return false;
    }
}
