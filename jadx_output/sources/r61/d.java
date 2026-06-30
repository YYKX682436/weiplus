package r61;

/* loaded from: classes8.dex */
public class d extends com.tencent.mm.sdk.event.n {
    public d() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        ((com.tencent.mm.autogen.events.BindQQEvent) iEvent).f54000g.getClass();
        try {
            int n17 = c01.z1.n() | 4096;
            gm0.j1.u().c().w(34, java.lang.Integer.valueOf(n17));
            xg3.o0 fj6 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj();
            ((e21.z0) fj6).c(new e21.t(2048, "", "", 0, "", "", "", 0, 0, 0, "", "", "", n17, "", 0, "", 0));
            return false;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FriendBindQQ.EventListener", e17, "", new java.lang.Object[0]);
            return false;
        }
    }
}
