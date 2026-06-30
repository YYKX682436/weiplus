package re4;

/* loaded from: classes.dex */
public class o extends com.tencent.mm.sdk.event.n {
    public o() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.GetIsEnrolledEvent getIsEnrolledEvent = (com.tencent.mm.autogen.events.GetIsEnrolledEvent) iEvent;
        int i17 = getIsEnrolledEvent.f54398g.f8560a;
        com.tencent.mars.xlog.Log.i("MicroMsg.GetIsEnrolledListener", "hy: check mode: %d", java.lang.Integer.valueOf(i17));
        am.ag agVar = getIsEnrolledEvent.f54399h;
        if (i17 != 1 || !re4.g0.c()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.GetIsEnrolledListener", "hy: not support");
            agVar.f6153a = -1;
            return false;
        }
        boolean p17 = wt5.a.p(com.tencent.mm.sdk.platformtools.x2.f193071a);
        com.tencent.mars.xlog.Log.i("MicroMsg.GetIsEnrolledListener", "hy: has enrolled fingerprint: %b", java.lang.Boolean.valueOf(p17));
        agVar.f6153a = p17 ? 1 : 0;
        return false;
    }
}
