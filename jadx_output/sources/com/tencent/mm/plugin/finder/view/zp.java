package com.tencent.mm.plugin.finder.view;

/* loaded from: classes3.dex */
public final class zp {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f133484a;

    /* renamed from: b, reason: collision with root package name */
    public final yz5.l f133485b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.y1 f133486c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f133487d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.view.recyclerview.WxRecyclerAdapter f133488e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.view.gq f133489f;

    public zp(android.content.Context context, yz5.l selectListener) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(selectListener, "selectListener");
        this.f133484a = context;
        this.f133485b = selectListener;
        this.f133487d = new java.util.ArrayList();
        this.f133489f = new com.tencent.mm.plugin.finder.view.gq(new com.tencent.mm.plugin.finder.view.yp(this));
    }

    public final void a(java.util.List dataList) {
        kotlin.jvm.internal.o.g(dataList, "dataList");
        android.content.Context context = this.f133484a;
        com.tencent.mm.ui.widget.dialog.y1 y1Var = new com.tencent.mm.ui.widget.dialog.y1(context);
        boolean z17 = false;
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.ap9, (android.view.ViewGroup) new android.widget.FrameLayout(context), false);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f485581i83);
        if (textView != null) {
            com.tencent.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        }
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = (com.tencent.mm.view.recyclerview.WxRecyclerView) inflate.findViewById(com.tencent.mm.R.id.f485579i81);
        in5.s sVar = new in5.s() { // from class: com.tencent.mm.plugin.finder.view.LiveChargeBottomSheet$createSelectView$2$1
            @Override // in5.s
            public in5.r getItemConvert(int type) {
                com.tencent.mm.plugin.finder.view.zp zpVar = com.tencent.mm.plugin.finder.view.zp.this;
                return new com.tencent.mm.plugin.finder.view.up(zpVar, new com.tencent.mm.plugin.finder.view.vp(zpVar));
            }
        };
        java.util.ArrayList arrayList = this.f133487d;
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(sVar, arrayList, false);
        wxRecyclerAdapter.f293105o = new com.tencent.mm.plugin.finder.view.wp(this);
        this.f133488e = wxRecyclerAdapter;
        wxRecyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(wxRecyclerView.getContext()));
        wxRecyclerView.setAdapter(this.f133488e);
        ((com.tencent.mm.ui.widget.imageview.WeImageView) inflate.findViewById(com.tencent.mm.R.id.f485578i80)).setOnClickListener(new com.tencent.mm.plugin.finder.view.xp(this));
        y1Var.k(inflate);
        y1Var.B.setBackgroundResource(com.tencent.mm.R.drawable.b8l);
        y1Var.s();
        arrayList.clear();
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(dataList, 10));
        java.util.Iterator it = dataList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new com.tencent.mm.plugin.finder.view.tp(((java.lang.Number) it.next()).intValue()));
        }
        arrayList.addAll(arrayList2);
        arrayList.add(new com.tencent.mm.plugin.finder.view.tp(0));
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter2 = this.f133488e;
        if (wxRecyclerAdapter2 != null) {
            wxRecyclerAdapter2.notifyDataSetChanged();
        }
        com.tencent.mm.ui.MMActivity mMActivity = context instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) context : null;
        if (mMActivity != null && lk5.s.b(mMActivity)) {
            z17 = true;
        }
        if (z17) {
            android.app.Dialog dialog = y1Var.f212025d;
            kotlin.jvm.internal.o.f(dialog, "getDialog(...)");
            com.tencent.mm.plugin.finder.view.x7.a(dialog, context);
        }
        this.f133486c = y1Var;
    }
}
