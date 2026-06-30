package st2;

/* loaded from: classes3.dex */
public final class v1 {

    /* renamed from: a, reason: collision with root package name */
    public final gk2.e f412481a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f412482b;

    /* renamed from: c, reason: collision with root package name */
    public final android.view.View f412483c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.view.refreshLayout.WxRefreshLayout f412484d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f412485e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f412486f;

    /* renamed from: g, reason: collision with root package name */
    public final tt2.i1 f412487g;

    public v1(android.view.ViewGroup root, gk2.e buContext) {
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(buContext, "buContext");
        this.f412481a = buContext;
        this.f412482b = "FinderLiveShoppingParingTab";
        this.f412483c = root.findViewById(com.tencent.mm.R.id.tot);
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) root.findViewById(com.tencent.mm.R.id.tos);
        com.tencent.mm.view.refreshLayout.WxRefreshLayout wxRefreshLayout = (com.tencent.mm.view.refreshLayout.WxRefreshLayout) root.findViewById(com.tencent.mm.R.id.uov);
        this.f412484d = wxRefreshLayout;
        tt2.i1 i1Var = new tt2.i1();
        this.f412487g = i1Var;
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = new androidx.recyclerview.widget.LinearLayoutManager(root.getContext());
        recyclerView.setAdapter(i1Var);
        recyclerView.setLayoutManager(linearLayoutManager);
        wxRefreshLayout.setOnSimpleAction(new st2.t1(this));
        wxRefreshLayout.D(new com.tencent.mm.plugin.finder.view.FinderLiveMultiNoticeListFooter(root.getContext(), null));
    }

    public final void a(boolean z17) {
        r45.ld2 ld2Var = new r45.ld2();
        gk2.e eVar = this.f412481a;
        ld2Var.set(3, ((mm2.c1) eVar.a(mm2.c1.class)).f328852o);
        r45.wt1 wt1Var = new r45.wt1();
        wt1Var.set(0, java.lang.Long.valueOf(((mm2.e1) eVar.a(mm2.e1.class)).f328983m));
        wt1Var.set(1, java.lang.Long.valueOf(((mm2.e1) eVar.a(mm2.e1.class)).f328988r.getLong(0)));
        wt1Var.set(2, ((mm2.c1) eVar.a(mm2.c1.class)).f328852o);
        wt1Var.set(3, z17 ? null : this.f412486f);
        new ke2.o0("/cgi-bin/mmbiz-bin/finderlivegetpairingtab", 21384, wt1Var, ld2Var, null).l().K(new st2.u1(z17, this));
    }
}
