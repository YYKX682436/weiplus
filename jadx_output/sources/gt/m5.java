package gt;

/* loaded from: classes9.dex */
public class m5 extends com.tencent.mm.sdk.event.n {
    public m5() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.storage.f9 f9Var;
        com.tencent.mm.autogen.events.ReceiveMsgEvent receiveMsgEvent = (com.tencent.mm.autogen.events.ReceiveMsgEvent) iEvent;
        if (gm0.j1.a() && (f9Var = receiveMsgEvent.f54654g.f8209a) != null) {
            java.lang.String Q0 = f9Var.Q0();
            if (com.tencent.mm.storage.z3.z3(Q0)) {
                int P = com.tencent.mm.sdk.platformtools.t8.P(com.tencent.mm.plugin.appbrand.app.r9.Ui().z0(Q0 + "_unreadCount", "0"), 0) + 1;
                com.tencent.mm.plugin.appbrand.app.r9.Ui().P2(Q0 + "_unreadCount", P + "");
                com.tencent.mm.storage.l4 p17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().p(Q0);
                com.tencent.mm.plugin.appbrand.ipc.m0.a(k91.k4.e(Q0), p17 != null ? p17.d1() : 0);
            }
        }
        return false;
    }
}
