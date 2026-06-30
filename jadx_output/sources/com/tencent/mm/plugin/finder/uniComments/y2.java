package com.tencent.mm.plugin.finder.uniComments;

/* loaded from: classes10.dex */
public final class y2 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.uniComments.q3 f130461a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fp0.r f130462b;

    public y2(com.tencent.mm.plugin.finder.uniComments.q3 q3Var, fp0.r rVar) {
        this.f130461a = q3Var;
        this.f130462b = rVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        androidx.recyclerview.widget.RecyclerView recyclerView;
        androidx.recyclerview.widget.f2 adapter;
        java.util.List list = (java.util.List) obj;
        kotlin.jvm.internal.o.d(list);
        boolean z17 = !list.isEmpty();
        com.tencent.mm.plugin.finder.uniComments.q3 q3Var = this.f130461a;
        if (z17) {
            int f17 = q3Var.f130369f.f();
            com.tencent.mm.plugin.finder.uniComments.p4 p4Var = q3Var.f130369f;
            p4Var.b(list, false, true);
            com.tencent.mm.plugin.finder.uniComments.a5 a5Var = q3Var.f130373m;
            if (a5Var != null && (recyclerView = a5Var.s().getRecyclerView()) != null && (adapter = recyclerView.getAdapter()) != null) {
                adapter.notifyItemRangeInserted(f17, p4Var.f() - f17);
            }
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.MusicUni.DrawerPresenter", "[loadMoreData] empty!");
        }
        ym5.s3 s3Var = new ym5.s3(0);
        s3Var.f463521f = q3Var.f130377q;
        int size = list.size();
        s3Var.f463523h = size;
        if (size > 0) {
            s3Var.f463522g = false;
        }
        com.tencent.mm.plugin.finder.uniComments.a5 a5Var2 = q3Var.f130373m;
        if (a5Var2 != null) {
            a5Var2.s().onPreFinishLoadMoreSmooth(s3Var);
        }
        this.f130462b.b(fp0.u.f265290f);
        return jz5.f0.f302826a;
    }
}
