package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class hq implements qn5.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.nq f118589a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.a63 f118590b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.refreshLayout.WxRefreshLayout f118591c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.jq f118592d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.fq f118593e;

    public hq(com.tencent.mm.plugin.finder.live.widget.nq nqVar, r45.a63 a63Var, com.tencent.mm.view.refreshLayout.WxRefreshLayout wxRefreshLayout, com.tencent.mm.plugin.finder.live.widget.jq jqVar, com.tencent.mm.plugin.finder.live.widget.fq fqVar) {
        this.f118589a = nqVar;
        this.f118590b = a63Var;
        this.f118591c = wxRefreshLayout;
        this.f118592d = jqVar;
        this.f118593e = fqVar;
    }

    @Override // qn5.c
    public void a(boolean z17) {
        com.tencent.mars.xlog.Log.i(this.f118589a.H, "#onRefresh");
    }

    @Override // qn5.c
    public boolean onLoadMore() {
        com.tencent.mm.plugin.finder.live.widget.nq nqVar = this.f118589a;
        com.tencent.mars.xlog.Log.i(nqVar.H, "#onLoadMore");
        r45.a63 a63Var = this.f118590b;
        if (!a63Var.getBoolean(3)) {
            com.tencent.mars.xlog.Log.e(nqVar.H, "#onLoadMore has_next=false. return");
            com.tencent.mm.view.refreshLayout.WxRefreshLayout wxRefreshLayout = this.f118591c;
            if (wxRefreshLayout != null) {
                wxRefreshLayout.f();
            }
            return true;
        }
        r45.b63 b63Var = new r45.b63();
        b63Var.set(0, java.lang.Integer.valueOf(a63Var.getInteger(0)));
        b63Var.set(1, a63Var.getString(4));
        pq5.g l17 = new ke2.y("", 0, false, null, false, b63Var, 28, null).l();
        android.content.Context context = this.f118592d.f228355d;
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        l17.f((com.tencent.mm.ui.MMActivity) context);
        l17.K(new com.tencent.mm.plugin.finder.live.widget.gq(this.f118589a, this, this.f118591c, this.f118590b, this.f118593e));
        return true;
    }
}
