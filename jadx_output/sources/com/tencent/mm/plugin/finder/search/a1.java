package com.tencent.mm.plugin.finder.search;

/* loaded from: classes2.dex */
public final class a1 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.search.FinderFeedSearchUI f125611d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f125612e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f125613f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f125614g;

    public a1(com.tencent.mm.plugin.finder.search.FinderFeedSearchUI finderFeedSearchUI, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, com.tencent.mm.ui.widget.dialog.k0 k0Var, in5.s0 s0Var) {
        this.f125611d = finderFeedSearchUI;
        this.f125612e = baseFinderFeed;
        this.f125613f = k0Var;
        this.f125614g = s0Var;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        com.tencent.mm.plugin.finder.assist.y4 y4Var = com.tencent.mm.plugin.finder.assist.y4.f102714a;
        com.tencent.mm.plugin.finder.search.FinderFeedSearchUI finderFeedSearchUI = this.f125611d;
        androidx.appcompat.app.AppCompatActivity context = finderFeedSearchUI.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        kotlin.jvm.internal.o.d(g4Var);
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f125612e;
        y4Var.k(context, g4Var, baseFinderFeed);
        androidx.appcompat.app.AppCompatActivity context2 = finderFeedSearchUI.getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        y4Var.s(context2, g4Var, baseFinderFeed);
        if (baseFinderFeed.getFeedObject().isLongVideo()) {
            com.tencent.mm.plugin.finder.viewmodel.component.n50 n50Var = com.tencent.mm.plugin.finder.viewmodel.component.FinderSpeedControlUIC.f133635x;
            androidx.recyclerview.widget.RecyclerView recyclerView = finderFeedSearchUI.P;
            if (recyclerView == null) {
                kotlin.jvm.internal.o.o("recyclerView");
                throw null;
            }
            y4Var.G(g4Var, baseFinderFeed, n50Var.a(recyclerView));
        }
        androidx.appcompat.app.AppCompatActivity context3 = finderFeedSearchUI.getContext();
        kotlin.jvm.internal.o.f(context3, "getContext(...)");
        y4Var.y(context3, this.f125612e, g4Var, this.f125613f, 200);
        if (com.tencent.mm.plugin.finder.search.FinderFeedSearchUI.c7(finderFeedSearchUI, baseFinderFeed)) {
            androidx.appcompat.app.AppCompatActivity context4 = finderFeedSearchUI.getContext();
            kotlin.jvm.internal.o.f(context4, "getContext(...)");
            y4Var.t(context4, g4Var, baseFinderFeed);
            androidx.appcompat.app.AppCompatActivity context5 = finderFeedSearchUI.getContext();
            kotlin.jvm.internal.o.f(context5, "getContext(...)");
            y4Var.g(context5, g4Var, baseFinderFeed);
        }
        if (!com.tencent.mm.plugin.finder.search.FinderFeedSearchUI.c7(finderFeedSearchUI, baseFinderFeed)) {
            zl2.q4 q4Var = zl2.q4.f473933a;
            if (q4Var.C(baseFinderFeed)) {
                q4Var.a(g4Var);
                androidx.appcompat.app.AppCompatActivity context6 = finderFeedSearchUI.getContext();
                kotlin.jvm.internal.o.f(context6, "getContext(...)");
                r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context6).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
                i95.m c17 = i95.n0.c(zy2.zb.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                zy2.zb.I8((zy2.zb) c17, ml2.u1.T2, kz5.c1.i(new jz5.l(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "1")), V6.getString(1), java.lang.Integer.valueOf(V6.getInteger(5)).toString(), null, null, false, 112, null);
            }
            androidx.appcompat.app.AppCompatActivity context7 = finderFeedSearchUI.getContext();
            kotlin.jvm.internal.o.f(context7, "getContext(...)");
            y4Var.h(context7, g4Var, baseFinderFeed);
        }
        if (!com.tencent.mm.plugin.finder.search.FinderFeedSearchUI.c7(finderFeedSearchUI, baseFinderFeed)) {
            g4Var.g(101, finderFeedSearchUI.getContext().getString(com.tencent.mm.R.string.gys), com.tencent.mm.R.raw.icons_outlined_report_problem);
        }
        androidx.appcompat.app.AppCompatActivity context8 = finderFeedSearchUI.getContext();
        kotlin.jvm.internal.o.f(context8, "getContext(...)");
        y4Var.q(context8, g4Var, baseFinderFeed);
        androidx.appcompat.app.AppCompatActivity context9 = finderFeedSearchUI.getContext();
        kotlin.jvm.internal.o.f(context9, "getContext(...)");
        y4Var.m(context9, g4Var, baseFinderFeed);
        androidx.appcompat.app.AppCompatActivity context10 = finderFeedSearchUI.getContext();
        kotlin.jvm.internal.o.f(context10, "getContext(...)");
        y4Var.c(context10, g4Var, baseFinderFeed, this.f125614g);
        androidx.appcompat.app.AppCompatActivity context11 = finderFeedSearchUI.getContext();
        kotlin.jvm.internal.o.f(context11, "getContext(...)");
        y4Var.z(context11, baseFinderFeed, g4Var);
        androidx.appcompat.app.AppCompatActivity context12 = finderFeedSearchUI.getContext();
        kotlin.jvm.internal.o.f(context12, "getContext(...)");
        y4Var.H(context12, baseFinderFeed, g4Var);
        androidx.appcompat.app.AppCompatActivity context13 = finderFeedSearchUI.getContext();
        kotlin.jvm.internal.o.f(context13, "getContext(...)");
        y4Var.b(context13, baseFinderFeed, g4Var);
        androidx.appcompat.app.AppCompatActivity context14 = finderFeedSearchUI.getContext();
        kotlin.jvm.internal.o.f(context14, "getContext(...)");
        y4Var.r(context14, baseFinderFeed, g4Var);
        androidx.appcompat.app.AppCompatActivity context15 = finderFeedSearchUI.getContext();
        kotlin.jvm.internal.o.f(context15, "getContext(...)");
        y4Var.p(context15, baseFinderFeed, g4Var);
        androidx.appcompat.app.AppCompatActivity context16 = finderFeedSearchUI.getContext();
        kotlin.jvm.internal.o.f(context16, "getContext(...)");
        y4Var.e(context16, baseFinderFeed, g4Var);
        androidx.appcompat.app.AppCompatActivity context17 = finderFeedSearchUI.getContext();
        kotlin.jvm.internal.o.f(context17, "getContext(...)");
        y4Var.j(context17, baseFinderFeed, g4Var);
        androidx.appcompat.app.AppCompatActivity context18 = finderFeedSearchUI.getContext();
        kotlin.jvm.internal.o.f(context18, "getContext(...)");
        y4Var.f(context18, baseFinderFeed, g4Var);
        com.tencent.mm.plugin.finder.report.x3.f125432a.b(g4Var);
    }
}
