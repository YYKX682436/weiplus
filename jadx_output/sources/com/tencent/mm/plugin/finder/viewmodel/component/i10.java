package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class i10 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.t10 f134688d;

    public i10(com.tencent.mm.plugin.finder.viewmodel.component.t10 t10Var) {
        this.f134688d = t10Var;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        in5.s0 s0Var;
        java.lang.String string;
        androidx.recyclerview.widget.RecyclerView recyclerView;
        g4Var.clear();
        com.tencent.mm.plugin.finder.viewmodel.component.t10 t10Var = this.f134688d;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = t10Var.f135959e;
        if (baseFinderFeed == null || (s0Var = t10Var.f135961g) == null) {
            return;
        }
        com.tencent.mm.plugin.finder.assist.y4 y4Var = com.tencent.mm.plugin.finder.assist.y4.f102714a;
        y4Var.k(t10Var.getContext(), g4Var, baseFinderFeed);
        y4Var.s(t10Var.getContext(), g4Var, baseFinderFeed);
        androidx.recyclerview.widget.RecyclerView recyclerView2 = ((com.tencent.mm.view.RefreshLoadMoreLayout) t10Var.getContext().findViewById(com.tencent.mm.R.id.m6e)).getRecyclerView();
        if (recyclerView2 != null) {
            string = com.tencent.mm.plugin.finder.viewmodel.component.FinderSpeedControlUIC.f133635x.a(recyclerView2);
        } else {
            string = t10Var.getContext().getString(com.tencent.mm.R.string.gue);
            kotlin.jvm.internal.o.f(string, "getString(...)");
        }
        y4Var.G(g4Var, baseFinderFeed, string);
        y4Var.c(t10Var.getContext(), g4Var, baseFinderFeed, s0Var);
        y4Var.q(t10Var.getContext(), g4Var, baseFinderFeed);
        y4Var.m(t10Var.getContext(), g4Var, baseFinderFeed);
        if (g4Var.z()) {
            com.tencent.mm.plugin.finder.view.uj ujVar = t10Var.f135958d;
            android.widget.TextView textView = ujVar != null ? ujVar.f133197p : null;
            if (textView != null) {
                textView.setVisibility(8);
            }
            com.tencent.mm.plugin.finder.view.uj ujVar2 = t10Var.f135958d;
            recyclerView = ujVar2 != null ? ujVar2.f133191j : null;
            if (recyclerView == null) {
                return;
            }
            recyclerView.setVisibility(8);
            return;
        }
        com.tencent.mm.plugin.finder.view.uj ujVar3 = t10Var.f135958d;
        android.widget.TextView textView2 = ujVar3 != null ? ujVar3.f133197p : null;
        if (textView2 != null) {
            textView2.setVisibility(0);
        }
        com.tencent.mm.plugin.finder.view.uj ujVar4 = t10Var.f135958d;
        recyclerView = ujVar4 != null ? ujVar4.f133191j : null;
        if (recyclerView != null) {
            recyclerView.setVisibility(0);
        }
        com.tencent.mm.plugin.finder.viewmodel.component.t10.O6(t10Var, g4Var);
    }
}
