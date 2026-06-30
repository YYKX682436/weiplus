package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class h0 implements qn5.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.n0 f134565a;

    public h0(com.tencent.mm.plugin.finder.viewmodel.component.n0 n0Var) {
        this.f134565a = n0Var;
    }

    @Override // qn5.c
    public void a(boolean z17) {
        com.tencent.mm.plugin.finder.viewmodel.component.n0 n0Var = this.f134565a;
        com.tencent.mm.plugin.finder.feed.model.FinderDataLoader finderDataLoader = n0Var.f135237q;
        dd2.d dVar = new dd2.d();
        java.lang.String P6 = n0Var.P6();
        kotlin.jvm.internal.o.f(P6, "access$getFinderUsername(...)");
        dVar.f228955b = new db2.j(P6, n0Var.f135238r, n0Var.Q6());
        dVar.f228956c = new dd2.b(com.tencent.mm.plugin.finder.viewmodel.component.e0.f134176d);
        dVar.f228965a = new com.tencent.mm.plugin.finder.viewmodel.component.g0(n0Var, null);
        finderDataLoader.a(dVar);
    }

    @Override // qn5.c
    public boolean onLoadMore() {
        com.tencent.mm.plugin.finder.viewmodel.component.n0 n0Var = this.f134565a;
        com.tencent.mm.plugin.finder.feed.model.FinderDataLoader finderDataLoader = n0Var.f135237q;
        dd2.d dVar = new dd2.d();
        java.lang.String P6 = n0Var.P6();
        kotlin.jvm.internal.o.f(P6, "access$getFinderUsername(...)");
        dVar.f228955b = new db2.j(P6, n0Var.f135238r, n0Var.Q6());
        dVar.f228956c = new dd2.b(com.tencent.mm.plugin.finder.viewmodel.component.b0.f133816d);
        dVar.f228965a = new com.tencent.mm.plugin.finder.viewmodel.component.d0(n0Var, null);
        finderDataLoader.a(dVar);
        return true;
    }
}
