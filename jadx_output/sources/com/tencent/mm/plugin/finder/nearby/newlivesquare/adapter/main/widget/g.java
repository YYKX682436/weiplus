package com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.widget;

/* loaded from: classes2.dex */
public class g implements com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.widget.a {

    /* renamed from: a, reason: collision with root package name */
    public final dr2.a f122070a;

    /* renamed from: b, reason: collision with root package name */
    public wp2.b f122071b;

    /* renamed from: c, reason: collision with root package name */
    public long f122072c;

    /* renamed from: d, reason: collision with root package name */
    public long f122073d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f122074e;

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Context f122075f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f122076g;

    /* renamed from: h, reason: collision with root package name */
    public final r45.qt2 f122077h;

    /* renamed from: i, reason: collision with root package name */
    public final tp2.f f122078i;

    /* renamed from: j, reason: collision with root package name */
    public final com.tencent.mm.view.recyclerview.WxRecyclerView f122079j;

    /* renamed from: k, reason: collision with root package name */
    public final int f122080k;

    public g(in5.s0 holder, dr2.a convertOutsideOperator) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(convertOutsideOperator, "convertOutsideOperator");
        this.f122070a = convertOutsideOperator;
        this.f122074e = "";
        new java.util.ArrayList();
        android.content.Context context = holder.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        this.f122075f = context;
        android.view.View itemView = holder.itemView;
        kotlin.jvm.internal.o.f(itemView, "itemView");
        this.f122076g = itemView;
        r45.qt2 qt2Var = ((cr2.b) convertOutsideOperator).f221852a.f221910p;
        if (qt2Var == null) {
            kotlin.jvm.internal.o.o("contextObj");
            throw null;
        }
        this.f122077h = qt2Var;
        this.f122078i = new tp2.f(qt2Var, (com.tencent.mm.ui.MMActivity) context, null, 0, null);
        android.view.View findViewById = itemView.findViewById(com.tencent.mm.R.id.flb);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = (com.tencent.mm.view.recyclerview.WxRecyclerView) findViewById;
        this.f122079j = wxRecyclerView;
        this.f122080k = (com.tencent.mm.ui.bl.b(context).x - i65.a.b(context, 72)) / 4;
        if (wxRecyclerView.getAdapter() == null) {
            wxRecyclerView.setAdapter(new com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.widget.b(new in5.s() { // from class: com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.widget.LiveSquareShoppingWidget$createConvertFactory$1
                @Override // in5.s
                public in5.r getItemConvert(int type) {
                    com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.widget.g gVar = com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.widget.g.this;
                    return new com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.y4(gVar.f122080k, gVar);
                }
            }, new java.util.ArrayList()));
            wxRecyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(context, 0, false));
            wxRecyclerView.N(new com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.widget.f(this));
        }
        wxRecyclerView.setVisibility(0);
        in5.o.b(wxRecyclerView, new com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.widget.c(this), com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.widget.d.f122067d);
        androidx.recyclerview.widget.f2 adapter = wxRecyclerView.getAdapter();
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = adapter instanceof com.tencent.mm.view.recyclerview.WxRecyclerAdapter ? (com.tencent.mm.view.recyclerview.WxRecyclerAdapter) adapter : null;
        if (wxRecyclerAdapter == null) {
            return;
        }
        wxRecyclerAdapter.f293105o = new com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.widget.e(this);
    }

    public final void a(java.util.ArrayList dataList, boolean z17) {
        java.util.List data;
        kotlin.jvm.internal.o.g(dataList, "dataList");
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = this.f122079j;
        androidx.recyclerview.widget.f2 adapter = wxRecyclerView.getAdapter();
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = adapter instanceof com.tencent.mm.view.recyclerview.WxRecyclerAdapter ? (com.tencent.mm.view.recyclerview.WxRecyclerAdapter) adapter : null;
        if (wxRecyclerAdapter == null || (data = wxRecyclerAdapter.getData()) == null) {
            return;
        }
        data.clear();
        data.addAll(dataList);
        androidx.recyclerview.widget.f2 adapter2 = wxRecyclerView.getAdapter();
        if (adapter2 != null) {
            adapter2.notifyDataSetChanged();
        }
    }
}
