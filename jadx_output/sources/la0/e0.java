package la0;

/* loaded from: classes11.dex */
public class e0 extends com.tencent.mm.sdk.event.n {
    public e0() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.MusicActionEvent musicActionEvent = (com.tencent.mm.autogen.events.MusicActionEvent) iEvent;
        ((bl3.e) i95.n0.c(bl3.e.class)).getClass();
        int i17 = musicActionEvent.f54509g.f6770a;
        if (i17 != 0) {
            if (i17 == 14) {
                if (((kl3.z) ((kl3.i) sl3.b.b(kl3.i.class))).f308854c != 2) {
                    return false;
                }
                ((kl3.z) ((kl3.i) sl3.b.b(kl3.i.class))).C();
                return false;
            }
            if (i17 != 15 || ((kl3.z) ((kl3.i) sl3.b.b(kl3.i.class))).f308854c != 2) {
                return false;
            }
            ((kl3.z) ((kl3.i) sl3.b.b(kl3.i.class))).D();
            return false;
        }
        ka0.i0 i0Var = (ka0.i0) i95.n0.c(ka0.i0.class);
        b21.r rVar = musicActionEvent.f54509g.f6771b;
        ma0.h hVar = (ma0.h) i0Var;
        hVar.getClass();
        if (rVar != null && rVar.f17345d == 15) {
            return false;
        }
        ((ku5.t0) ku5.t0.f312615d).q(new ma0.g(hVar, rVar));
        return false;
    }
}
