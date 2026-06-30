package st2;

/* loaded from: classes3.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ st2.h1 f412399d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(st2.h1 h1Var) {
        super(2);
        this.f412399d = h1Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        l81.b1 bundle = (l81.b1) obj2;
        kotlin.jvm.internal.o.g(bundle, "bundle");
        st2.h1 h1Var = this.f412399d;
        h1Var.r();
        com.tencent.mm.plugin.finder.live.plugin.l lVar = h1Var.f412337h;
        boolean z17 = lVar != null && lVar.x0();
        zl2.r4 r4Var = zl2.r4.f473950a;
        boolean x17 = r4Var.x1();
        boolean L9 = ((mm2.c1) h1Var.f412335f.a(mm2.c1.class)).L9();
        boolean y17 = com.tencent.mm.ui.bk.y();
        com.tencent.mars.xlog.Log.i("Finder.LiveShoppingListPlugin", "openHalfScreenMiniprogram isLandscape:" + z17 + ", isAnchorMainDevice:" + x17 + ", supportRotate:" + L9 + ", inMagicWindowMode:" + y17);
        if (!z17 || r4Var.x1() || !L9 || y17) {
            h1Var.F(bundle);
        } else if (lVar != null) {
            com.tencent.mm.plugin.finder.live.plugin.l.s1(lVar, "PORTRAIT_ACTION_HALF_SCREEN_MINIPRO", bundle, 0, 4, null);
        }
        l81.p0 p0Var = bundle.f317028i;
        dk2.ah ahVar = p0Var instanceof dk2.ah ? (dk2.ah) p0Var : null;
        java.lang.String u17 = pm0.v.u(ahVar != null ? ahVar.f233212e : 0L);
        if (intValue == 1) {
            c61.yb ybVar = (c61.yb) i95.n0.c(c61.yb.class);
            com.tencent.mm.plugin.finder.live.view.k0 R0 = lVar != null ? lVar.R0() : null;
            com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout finderLiveVisitorPluginLayout = R0 instanceof com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout ? (com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout) R0 : null;
            ((c61.p2) ybVar).Kj(finderLiveVisitorPluginLayout != null ? finderLiveVisitorPluginLayout.getReportObj() : null, 18054, zl2.r4.k0(r4Var, h1Var.f412335f, 28, u17, 0, null, 24, null));
        } else if (intValue == 2) {
            c61.yb ybVar2 = (c61.yb) i95.n0.c(c61.yb.class);
            com.tencent.mm.plugin.finder.live.view.k0 R02 = lVar != null ? lVar.R0() : null;
            com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout finderLiveVisitorPluginLayout2 = R02 instanceof com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout ? (com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout) R02 : null;
            ((c61.p2) ybVar2).Kj(finderLiveVisitorPluginLayout2 != null ? finderLiveVisitorPluginLayout2.getReportObj() : null, 18054, zl2.r4.k0(r4Var, h1Var.f412335f, 27, u17, 0, null, 24, null));
        }
        return jz5.f0.f302826a;
    }
}
