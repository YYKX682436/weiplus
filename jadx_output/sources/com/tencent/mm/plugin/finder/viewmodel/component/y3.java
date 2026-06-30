package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class y3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.a4 f136521d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f136522e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderMediaLayout f136523f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y3(com.tencent.mm.plugin.finder.viewmodel.component.a4 a4Var, yz5.l lVar, com.tencent.mm.plugin.finder.view.FinderMediaLayout finderMediaLayout) {
        super(1);
        this.f136521d = a4Var;
        this.f136522e = lVar;
        this.f136523f = finderMediaLayout;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a it = (com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.finder.viewmodel.component.a4 a4Var = this.f136521d;
        in5.s0 s0Var = a4Var.f133715h;
        com.tencent.mm.plugin.finder.view.FinderMediaLayout finderMediaLayout = s0Var != null ? (com.tencent.mm.plugin.finder.view.FinderMediaLayout) s0Var.p(com.tencent.mm.R.id.fs6) : null;
        if (finderMediaLayout == null) {
            com.tencent.mars.xlog.Log.w("FinderAnimateVideoviewUIC", "removeMediaMask return for null.");
        } else {
            finderMediaLayout.removeView(a4Var.f133717m);
        }
        this.f136522e.invoke(it);
        this.f136523f.clearAnimation();
        yz5.a aVar = a4Var.f133730z;
        if (aVar != null) {
            aVar.invoke();
        }
        a4Var.f133730z = null;
        return jz5.f0.f302826a;
    }
}
