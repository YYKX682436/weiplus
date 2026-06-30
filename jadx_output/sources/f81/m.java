package f81;

/* loaded from: classes9.dex */
public class m extends com.tencent.mm.sdk.event.n {
    public m() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        am.y3 y3Var = ((com.tencent.mm.autogen.events.DeleteMsgEvent) iEvent).f54086g;
        if (y3Var.f8428d == 1107296305) {
            com.tencent.mm.plugin.announcement.x.wi(y3Var.f8425a);
        }
        tg3.p1.f419206a.e(y3Var.f8427c, y3Var.f8425a);
        dh3.c.f232489a.k(y3Var.f8427c, y3Var.f8425a, y3Var.f8426b, y3Var.f8429e);
        bm5.y b17 = bm5.y.b(y3Var.f8427c, y3Var.f8425a, y3Var.f8426b, 0L, "", bm5.d1.b(y3Var.f8428d, null), bm5.f0.f22564i);
        if (b17.c() != 0) {
            return false;
        }
        bm5.c0 c0Var = bm5.c0.f22550a;
        c0Var.c(bm5.z.f(b17), true);
        c0Var.c(bm5.z.e(b17), true);
        return false;
    }
}
