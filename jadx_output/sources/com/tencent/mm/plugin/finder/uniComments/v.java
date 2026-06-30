package com.tencent.mm.plugin.finder.uniComments;

/* loaded from: classes10.dex */
public final class v implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.uniComments.o0 f130429a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fp0.r f130430b;

    public v(com.tencent.mm.plugin.finder.uniComments.o0 o0Var, fp0.r rVar) {
        this.f130429a = o0Var;
        this.f130430b = rVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        androidx.recyclerview.widget.RecyclerView recyclerView;
        androidx.recyclerview.widget.f2 adapter;
        java.util.List list = (java.util.List) obj;
        kotlin.jvm.internal.o.d(list);
        boolean z17 = !list.isEmpty();
        com.tencent.mm.plugin.finder.uniComments.o0 o0Var = this.f130429a;
        if (z17) {
            int e17 = o0Var.f130326h.e();
            com.tencent.mm.plugin.finder.uniComments.o1 o1Var = o0Var.f130326h;
            o1Var.b(list, false, true);
            com.tencent.mm.plugin.finder.uniComments.a2 a2Var = o0Var.f130330o;
            if (a2Var != null && (recyclerView = a2Var.k().getRecyclerView()) != null && (adapter = recyclerView.getAdapter()) != null) {
                adapter.notifyItemRangeInserted(e17, o1Var.e() - e17);
            }
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.TextStatus.TextStatusCommentDrawerPresenter", "[loadMoreData] empty!");
        }
        ym5.s3 s3Var = new ym5.s3(0);
        s3Var.f463521f = o0Var.f130335t;
        int size = list.size();
        s3Var.f463523h = size;
        if (size > 0) {
            s3Var.f463522g = false;
        }
        com.tencent.mm.plugin.finder.uniComments.a2 a2Var2 = o0Var.f130330o;
        if (a2Var2 != null) {
            a2Var2.k().onPreFinishLoadMoreSmooth(s3Var);
        }
        this.f130430b.b(fp0.u.f265290f);
        return jz5.f0.f302826a;
    }
}
