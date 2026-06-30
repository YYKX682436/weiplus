package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes10.dex */
public final class i6 extends androidx.recyclerview.widget.h2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.o6 f129350a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView f129351b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.LinearLayoutManager f129352c;

    public i6(com.tencent.mm.plugin.finder.ui.o6 o6Var, androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager) {
        this.f129350a = o6Var;
        this.f129351b = recyclerView;
        this.f129352c = linearLayoutManager;
    }

    @Override // androidx.recyclerview.widget.h2
    public void g(int i17, int i18) {
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = this.f129352c;
        com.tencent.mm.plugin.finder.ui.o6 o6Var = this.f129350a;
        com.tencent.mm.plugin.finder.ui.h6 h6Var = new com.tencent.mm.plugin.finder.ui.h6(o6Var, linearLayoutManager);
        o6Var.f129580o = h6Var;
        androidx.recyclerview.widget.RecyclerView recyclerView = o6Var.f129576k;
        if (recyclerView == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        androidx.recyclerview.widget.n2 itemAnimator = this.f129351b.getItemAnimator();
        recyclerView.postDelayed(h6Var, itemAnimator != null ? itemAnimator.n() : 20L);
    }
}
