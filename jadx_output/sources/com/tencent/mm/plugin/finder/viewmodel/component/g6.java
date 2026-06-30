package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes10.dex */
public final class g6 implements qn5.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.p6 f134467a;

    public g6(com.tencent.mm.plugin.finder.viewmodel.component.p6 p6Var) {
        this.f134467a = p6Var;
    }

    @Override // qn5.c
    public void a(boolean z17) {
    }

    @Override // qn5.c
    public boolean onLoadMore() {
        com.tencent.mm.plugin.finder.viewmodel.component.p6 p6Var = this.f134467a;
        com.tencent.mars.xlog.Log.i(p6Var.f135527p, "requestLoadMore CgiFinderGetTopicFeed");
        kotlinx.coroutines.l.d(p6Var.f135526o, null, null, new com.tencent.mm.plugin.finder.viewmodel.component.n6(p6Var, null), 3, null);
        return true;
    }
}
