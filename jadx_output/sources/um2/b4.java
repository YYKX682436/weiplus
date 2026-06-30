package um2;

/* loaded from: classes3.dex */
public final class b4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ um2.x5 f428726d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ no0.a f428727e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b4(um2.x5 x5Var, no0.a aVar) {
        super(0);
        this.f428726d = x5Var;
        this.f428727e = aVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        um2.x5 x5Var = this.f428726d;
        com.tencent.mm.plugin.finder.live.plugin.vi0 vi0Var = x5Var.f429051l0;
        if (vi0Var != null) {
            vi0Var.v1();
        }
        no0.a aVar = this.f428727e;
        java.lang.Integer num = aVar.f338710k;
        if (num != null && num.intValue() == 1) {
            i95.m c17 = i95.n0.c(ml2.r0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            ml2.r0.ik((ml2.r0) c17, ml2.n4.f327742i, ml2.s2.f327920f, 0, 4, null);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Cj("finder_live_anchor_pass_link_event", x5Var.f19606c, kz5.b1.e(new jz5.l("link_type", 0)), 25561);
        } else {
            java.lang.Integer num2 = aVar.f338710k;
            if (num2 != null && num2.intValue() == 2) {
                com.tencent.mm.plugin.finder.live.plugin.dk0 dk0Var = x5Var.f429041i;
                if (dk0Var != null) {
                    dk0Var.v1();
                }
                co0.s E = x5Var.E();
                if (E != null) {
                    E.n();
                }
                i95.m c18 = i95.n0.c(ml2.r0.class);
                kotlin.jvm.internal.o.f(c18, "getService(...)");
                ml2.r0.ik((ml2.r0) c18, ml2.n4.f327742i, ml2.s2.f327921g, 0, 4, null);
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Cj("finder_live_anchor_pass_link_event", x5Var.f19606c, kz5.b1.e(new jz5.l("link_type", 1)), 25561);
            } else {
                com.tencent.mars.xlog.Log.i(x5Var.f429032f, "onAcceptLinkMicSelf TRTC invalid micType:" + num2);
            }
        }
        return jz5.f0.f302826a;
    }
}
