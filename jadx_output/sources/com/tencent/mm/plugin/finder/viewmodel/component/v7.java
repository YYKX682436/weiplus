package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes10.dex */
public final class v7 implements qn5.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.e8 f136216a;

    public v7(com.tencent.mm.plugin.finder.viewmodel.component.e8 e8Var) {
        this.f136216a = e8Var;
    }

    @Override // qn5.c
    public void a(boolean z17) {
    }

    @Override // qn5.c
    public boolean onLoadMore() {
        com.tencent.mm.plugin.finder.viewmodel.component.e8 e8Var = this.f136216a;
        e8Var.getClass();
        com.tencent.mars.xlog.Log.i(pf5.o.TAG, "requestLoadMore CgiFinderGetTopicFeed");
        kotlinx.coroutines.l.d(e8Var.f134213o, null, null, new com.tencent.mm.plugin.finder.viewmodel.component.c8(e8Var, null), 3, null);
        return true;
    }
}
