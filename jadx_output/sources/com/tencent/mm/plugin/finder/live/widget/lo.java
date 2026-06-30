package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class lo {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f118957a;

    /* renamed from: b, reason: collision with root package name */
    public final int f118958b;

    /* renamed from: c, reason: collision with root package name */
    public final int f118959c;

    /* renamed from: d, reason: collision with root package name */
    public final int f118960d;

    /* renamed from: e, reason: collision with root package name */
    public final int f118961e;

    /* renamed from: f, reason: collision with root package name */
    public final int f118962f;

    /* renamed from: g, reason: collision with root package name */
    public final int f118963g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.view.recyclerview.WxRecyclerView f118964h;

    /* renamed from: i, reason: collision with root package name */
    public final vm2.c0 f118965i;

    /* renamed from: j, reason: collision with root package name */
    public final java.util.ArrayList f118966j;

    /* renamed from: k, reason: collision with root package name */
    public yz5.l f118967k;

    public lo(android.view.View root, com.tencent.mm.plugin.finder.live.plugin.l basePlugin) {
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(basePlugin, "basePlugin");
        this.f118957a = root;
        this.f118958b = i65.a.b(root.getContext(), 21);
        int i17 = com.tencent.mm.ui.bl.b(root.getContext()).x;
        this.f118959c = i17;
        this.f118960d = i65.a.b(root.getContext(), 80);
        this.f118961e = i65.a.b(root.getContext(), 56);
        this.f118962f = (i17 - i65.a.b(root.getContext(), 192)) / 2;
        this.f118963g = i65.a.b(root.getContext(), 20) / 2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f118966j = arrayList;
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = (com.tencent.mm.view.recyclerview.WxRecyclerView) root.findViewById(com.tencent.mm.R.id.l_e);
        this.f118964h = wxRecyclerView;
        if (wxRecyclerView != null) {
            androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = new androidx.recyclerview.widget.LinearLayoutManager(root.getContext());
            linearLayoutManager.Q(0);
            wxRecyclerView.setLayoutManager(linearLayoutManager);
        }
        vm2.c0 c0Var = new vm2.c0(arrayList);
        this.f118965i = c0Var;
        if (wxRecyclerView != null) {
            wxRecyclerView.setAdapter(c0Var);
        }
        c0Var.f293105o = new com.tencent.mm.plugin.finder.live.widget.jo(this);
        if (wxRecyclerView != null) {
            wxRecyclerView.N(new com.tencent.mm.plugin.finder.live.widget.ko(this));
        }
    }

    public final void a(int i17) {
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = this.f118964h;
        if (wxRecyclerView == null) {
            return;
        }
        wxRecyclerView.setVisibility(i17);
    }
}
