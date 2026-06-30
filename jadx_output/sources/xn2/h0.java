package xn2;

/* loaded from: classes2.dex */
public final class h0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xn2.p0 f455508d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.MegaVideoSeeLaterDeletedEvent f455509e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(xn2.p0 p0Var, com.tencent.mm.autogen.events.MegaVideoSeeLaterDeletedEvent megaVideoSeeLaterDeletedEvent) {
        super(0);
        this.f455508d = p0Var;
        this.f455509e = megaVideoSeeLaterDeletedEvent;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        xn2.p0 p0Var = this.f455508d;
        boolean i17 = p0Var.i();
        com.tencent.mm.autogen.events.MegaVideoSeeLaterDeletedEvent megaVideoSeeLaterDeletedEvent = this.f455509e;
        if (i17) {
            vn2.u0 u0Var = vn2.u0.f438387a;
            java.lang.String str = p0Var.f455545c;
            android.app.Activity activity = p0Var.f455543a;
            r45.qt2 l17 = p0Var.l();
            xn2.b bVar = p0Var.f455547e;
            ym5.q1 a17 = bVar != null ? ((xn2.f1) bVar).a() : null;
            com.tencent.mm.plugin.finder.megavideo.topstory.flow.MegaVideoFlowLoader j17 = p0Var.j();
            com.tencent.mm.plugin.finder.model.BaseFinderFeed finderFeed = megaVideoSeeLaterDeletedEvent.f54493g.f7714a;
            kotlin.jvm.internal.o.f(finderFeed, "finderFeed");
            u0Var.d(str, activity, l17, a17, j17, 0, finderFeed, true, false);
        } else {
            com.tencent.mm.plugin.finder.model.BaseFinderFeed finderFeed2 = megaVideoSeeLaterDeletedEvent.f54493g.f7714a;
            kotlin.jvm.internal.o.f(finderFeed2, "finderFeed");
            xn2.p0.b(p0Var, finderFeed2, false);
        }
        return jz5.f0.f302826a;
    }
}
