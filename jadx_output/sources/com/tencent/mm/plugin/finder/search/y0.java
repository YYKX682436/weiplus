package com.tencent.mm.plugin.finder.search;

/* loaded from: classes2.dex */
public final class y0 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.search.FinderFeedSearchUI f125980d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f125981e;

    public y0(com.tencent.mm.plugin.finder.search.FinderFeedSearchUI finderFeedSearchUI, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed) {
        this.f125980d = finderFeedSearchUI;
        this.f125981e = baseFinderFeed;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        ec2.d e27;
        com.tencent.mm.plugin.finder.assist.y4 y4Var = com.tencent.mm.plugin.finder.assist.y4.f102714a;
        com.tencent.mm.plugin.finder.search.FinderFeedSearchUI context = this.f125980d;
        androidx.appcompat.app.AppCompatActivity context2 = context.getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        com.tencent.mm.plugin.finder.assist.i4 N = com.tencent.mm.plugin.finder.assist.y4.N(y4Var, context2, this.f125981e, 0, null, null, 28, null);
        androidx.appcompat.app.AppCompatActivity context3 = context.getContext();
        kotlin.jvm.internal.o.f(context3, "getContext(...)");
        kotlin.jvm.internal.o.d(g4Var);
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f125981e;
        y4Var.B(context3, g4Var, baseFinderFeed, N);
        androidx.appcompat.app.AppCompatActivity context4 = context.getContext();
        kotlin.jvm.internal.o.f(context4, "getContext(...)");
        y4Var.C(context4, g4Var, baseFinderFeed, N);
        androidx.appcompat.app.AppCompatActivity context5 = context.getContext();
        kotlin.jvm.internal.o.f(context5, "getContext(...)");
        y4Var.l(context5, g4Var, baseFinderFeed);
        androidx.appcompat.app.AppCompatActivity context6 = context.getContext();
        kotlin.jvm.internal.o.f(context6, "getContext(...)");
        y4Var.i(context6, g4Var, baseFinderFeed, N);
        androidx.appcompat.app.AppCompatActivity context7 = context.getContext();
        kotlin.jvm.internal.o.f(context7, "getContext(...)");
        y4Var.o(context7, g4Var, baseFinderFeed);
        androidx.appcompat.app.AppCompatActivity context8 = context.getContext();
        kotlin.jvm.internal.o.f(context8, "getContext(...)");
        y4Var.A(context8, g4Var, baseFinderFeed);
        androidx.appcompat.app.AppCompatActivity context9 = context.getContext();
        kotlin.jvm.internal.o.f(context9, "getContext(...)");
        y4Var.D(context9, g4Var, baseFinderFeed);
        androidx.appcompat.app.AppCompatActivity context10 = context.getContext();
        kotlin.jvm.internal.o.f(context10, "getContext(...)");
        y4Var.w(context10, g4Var, baseFinderFeed);
        androidx.appcompat.app.AppCompatActivity context11 = context.getContext();
        kotlin.jvm.internal.o.f(context11, "getContext(...)");
        y4Var.v(context11, baseFinderFeed, g4Var);
        androidx.appcompat.app.AppCompatActivity context12 = context.getContext();
        kotlin.jvm.internal.o.f(context12, "getContext(...)");
        y4Var.F(context12, baseFinderFeed, g4Var);
        ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).bj(baseFinderFeed.getItemId(), 6);
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        if (nyVar != null && (e27 = zy2.ra.e2(nyVar, 0, 1, null)) != null) {
            e27.a(new ec2.a(16, baseFinderFeed.getItemId(), baseFinderFeed.w()));
        }
        com.tencent.mm.plugin.finder.report.x3.f125432a.a(g4Var);
    }
}
