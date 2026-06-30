package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes3.dex */
public final class k7 extends com.tencent.mm.plugin.finder.live.widget.e0 {
    public final java.lang.String H;
    public db2.b1 I;

    /* renamed from: J, reason: collision with root package name */
    public com.tencent.mm.protocal.protobuf.FinderContact f116441J;
    public java.util.List K;
    public android.widget.TextView L;
    public android.view.View M;
    public android.view.View N;
    public yz5.l P;
    public bm2.x5 Q;
    public com.tencent.mm.view.recyclerview.WxRecyclerView R;
    public com.tencent.mm.view.refreshLayout.WxRefreshLayout S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k7(android.content.Context context) {
        super(context, false, null, 0.75f, 4, null);
        kotlin.jvm.internal.o.g(context, "context");
        this.H = "Finder.FinderLiveMultiNoticeView";
    }

    public static void e0(com.tencent.mm.plugin.finder.live.view.k7 k7Var, boolean z17, java.lang.String str, java.lang.String str2, int i17, int i18, java.lang.Object obj) {
        java.lang.String str3 = (i18 & 4) != 0 ? "" : str2;
        int i19 = (i18 & 8) != 0 ? 0 : i17;
        db2.b1 b1Var = k7Var.I;
        if (b1Var != null) {
            b1Var.j();
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add(0);
        linkedList.add(1);
        db2.b1 b1Var2 = new db2.b1(null, null, str3, i19, null, null, null, null, 0, null, linkedList, com.tencent.mm.plugin.appbrand.jsapi.qc.CTRL_INDEX, null);
        pq5.g l17 = b1Var2.l();
        android.content.Context context = k7Var.f118183e;
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        l17.f((com.tencent.mm.ui.MMActivity) context);
        l17.K(new com.tencent.mm.plugin.finder.live.view.j7(k7Var, z17));
        k7Var.I = b1Var2;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public int A() {
        return com.tencent.mm.R.layout.axo;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public int D() {
        return 8;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public void N(android.view.View rootView) {
        kotlin.jvm.internal.o.g(rootView, "rootView");
        android.widget.TextView textView = (android.widget.TextView) rootView.findViewById(com.tencent.mm.R.id.f484739fc4);
        kotlin.jvm.internal.o.d(textView);
        com.tencent.mm.ui.fk.a(textView);
        this.L = textView;
        android.view.View findViewById = rootView.findViewById(com.tencent.mm.R.id.f484530ej2);
        this.M = findViewById;
        if (findViewById != null) {
            findViewById.setOnClickListener(new com.tencent.mm.plugin.finder.live.view.e7(this, findViewById, rootView));
        }
        android.view.View findViewById2 = rootView.findViewById(com.tencent.mm.R.id.fbu);
        findViewById2.setOnClickListener(new com.tencent.mm.plugin.finder.live.view.f7(this));
        zl2.r4.c3(zl2.r4.f473950a, findViewById2, 0, 0, 6, null);
        this.N = findViewById2;
        this.Q = new bm2.x5(new com.tencent.mm.plugin.finder.live.view.g7(this), new com.tencent.mm.plugin.finder.live.view.h7(this));
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = (com.tencent.mm.view.recyclerview.WxRecyclerView) rootView.findViewById(com.tencent.mm.R.id.f484738fc3);
        android.content.Context context = rootView.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        wxRecyclerView.setLayoutManager(new com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager(context));
        wxRecyclerView.setAdapter(this.Q);
        this.R = wxRecyclerView;
        com.tencent.mm.view.refreshLayout.WxRefreshLayout wxRefreshLayout = (com.tencent.mm.view.refreshLayout.WxRefreshLayout) rootView.findViewById(com.tencent.mm.R.id.f486583lr1);
        wxRefreshLayout.setPadding(0, 0, 0, com.tencent.mm.ui.bk.j(wxRefreshLayout.getContext()));
        wxRefreshLayout.D(new com.tencent.mm.plugin.finder.view.FinderLiveMultiNoticeListFooter(wxRefreshLayout.getContext(), null));
        wxRefreshLayout.setOnSimpleAction(new com.tencent.mm.plugin.finder.live.view.i7(this));
        this.S = wxRefreshLayout;
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView2 = this.R;
        if (wxRecyclerView2 != null) {
            wxRecyclerView2.setVisibility(0);
        }
        android.view.View view = this.N;
        if (view == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/view/FinderLiveMultiNoticeWidget", "initView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/view/FinderLiveMultiNoticeWidget", "initView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
