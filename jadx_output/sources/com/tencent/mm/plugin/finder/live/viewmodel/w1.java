package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes9.dex */
public final class w1 implements qn5.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.e2 f117507a;

    public w1(com.tencent.mm.plugin.finder.live.viewmodel.e2 e2Var) {
        this.f117507a = e2Var;
    }

    @Override // qn5.c
    public void a(boolean z17) {
    }

    @Override // qn5.c
    public boolean onLoadMore() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("loadMoreSearchData query:");
        com.tencent.mm.plugin.finder.live.viewmodel.e2 e2Var = this.f117507a;
        sb6.append(e2Var.f117067r);
        com.tencent.mars.xlog.Log.i("Finder.FinderGameLiveSearchUIC", sb6.toString());
        java.lang.String str = e2Var.f117067r;
        if (e2Var.f117069t) {
            e2Var.f117066q = new db2.m5(str, e2Var.f117068s, 0, null, 12, null);
            gm0.j1.d().g(e2Var.f117066q);
            gm0.j1.d().a(4140, e2Var);
        }
        return e2Var.f117069t;
    }
}
