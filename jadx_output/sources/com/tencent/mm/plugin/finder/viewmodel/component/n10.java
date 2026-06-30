package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class n10 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.t10 f135248d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f135249e;

    public n10(com.tencent.mm.plugin.finder.viewmodel.component.t10 t10Var, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed) {
        this.f135248d = t10Var;
        this.f135249e = baseFinderFeed;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        com.tencent.mm.plugin.finder.viewmodel.component.t10 t10Var;
        com.tencent.mm.plugin.finder.assist.y4 y4Var;
        androidx.recyclerview.widget.RecyclerView recyclerView;
        ec2.d e27;
        g4Var.clear();
        com.tencent.mm.plugin.finder.assist.y4 y4Var2 = com.tencent.mm.plugin.finder.assist.y4.f102714a;
        com.tencent.mm.plugin.finder.viewmodel.component.t10 t10Var2 = this.f135248d;
        android.app.Activity context = t10Var2.getContext();
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f135249e;
        com.tencent.mm.plugin.finder.assist.i4 N = com.tencent.mm.plugin.finder.assist.y4.N(y4Var2, context, baseFinderFeed, 0, new com.tencent.mm.plugin.finder.viewmodel.component.l10(g4Var, baseFinderFeed, t10Var2), new com.tencent.mm.plugin.finder.viewmodel.component.m10(g4Var), 4, null);
        boolean z17 = N.f102251a;
        boolean z18 = N.f102252b;
        java.lang.String str = N.f102255e;
        java.lang.String str2 = N.f102256f;
        boolean z19 = N.f102259i;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed2 = this.f135249e;
        if (z19 || baseFinderFeed2.getFeedObject().isPrivate()) {
            t10Var = t10Var2;
            y4Var = y4Var2;
        } else {
            t10Var = t10Var2;
            y4Var = y4Var2;
            g4Var.j(102, str, com.tencent.mm.R.raw.finder_icons_filled_share, com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.f478502m), z17);
        }
        if (!N.f102260j && !baseFinderFeed2.getFeedObject().isPrivate()) {
            g4Var.j(103, str2, com.tencent.mm.R.raw.bottomsheet_icon_moment, 0, z18);
        }
        y4Var.l(t10Var.getContext(), g4Var, baseFinderFeed2);
        y4Var.E(g4Var, N);
        if (((java.lang.Number) com.tencent.mm.plugin.finder.storage.t70.f127590a.D0().r()).intValue() == 1 && !N.f102261k) {
            g4Var.j(104, t10Var.getContext().getString(com.tencent.mm.R.string.c__), com.tencent.mm.R.raw.bottomsheet_icon_fav, 0, N.f102263m);
            i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            com.tencent.mm.plugin.finder.report.o3.Rk((com.tencent.mm.plugin.finder.report.o3) c17, t10Var.getContext(), false, baseFinderFeed2.getItemId(), N.f102263m, 2, null);
        }
        y4Var.o(t10Var.getContext(), g4Var, baseFinderFeed2);
        y4Var.D(t10Var.getContext(), g4Var, baseFinderFeed2);
        y4Var.A(t10Var.getContext(), g4Var, baseFinderFeed2);
        y4Var.w(t10Var.getContext(), g4Var, baseFinderFeed2);
        y4Var.v(t10Var.getContext(), baseFinderFeed2, g4Var);
        y4Var.F(t10Var.getContext(), baseFinderFeed2, g4Var);
        android.app.Activity context2 = t10Var.getContext();
        kotlin.jvm.internal.o.g(context2, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context2 instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a((androidx.appcompat.app.AppCompatActivity) context2).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
        int i17 = t10Var.f135960f;
        cl0.g gVar = new cl0.g();
        gVar.h("ref_eid", i17 == 1 ? "forward" : "tridot");
        com.tencent.mm.plugin.finder.report.b6 b6Var = com.tencent.mm.plugin.finder.report.b6.f124969a;
        b6Var.c(V6, "delete", false, gVar);
        b6Var.c(V6, t10Var.f135960f != 1 ? "tridot" : "forward", true, new cl0.g());
        com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
        long itemId = baseFinderFeed2.getItemId();
        android.app.Activity context3 = t10Var.getContext();
        kotlin.jvm.internal.o.g(context3, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context3 instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a((androidx.appcompat.app.AppCompatActivity) context3).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        o3Var.bj(itemId, nyVar != null ? nyVar.f135380n : 0);
        android.app.Activity context4 = t10Var.getContext();
        kotlin.jvm.internal.o.g(context4, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar2 = context4 instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a((androidx.appcompat.app.AppCompatActivity) context4).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        if (nyVar2 != null && (e27 = zy2.ra.e2(nyVar2, 0, 1, null)) != null) {
            e27.a(new ec2.a(16, baseFinderFeed2.getItemId(), baseFinderFeed2.w()));
        }
        com.tencent.mm.plugin.finder.report.x3.f125432a.a(g4Var);
        if (g4Var.z()) {
            com.tencent.mm.plugin.finder.view.uj ujVar = t10Var.f135958d;
            android.widget.TextView textView = ujVar != null ? ujVar.f133195n : null;
            if (textView != null) {
                textView.setVisibility(8);
            }
            com.tencent.mm.plugin.finder.view.uj ujVar2 = t10Var.f135958d;
            recyclerView = ujVar2 != null ? ujVar2.f133189h : null;
            if (recyclerView == null) {
                return;
            }
            recyclerView.setVisibility(8);
            return;
        }
        com.tencent.mm.plugin.finder.view.uj ujVar3 = t10Var.f135958d;
        android.widget.TextView textView2 = ujVar3 != null ? ujVar3.f133195n : null;
        if (textView2 != null) {
            textView2.setVisibility(0);
        }
        com.tencent.mm.plugin.finder.view.uj ujVar4 = t10Var.f135958d;
        recyclerView = ujVar4 != null ? ujVar4.f133189h : null;
        if (recyclerView != null) {
            recyclerView.setVisibility(0);
        }
        com.tencent.mm.plugin.finder.viewmodel.component.t10.O6(t10Var, g4Var);
    }
}
