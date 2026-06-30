package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class y70 implements ym5.d1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC f136534a;

    public y70(com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC finderTabUIC) {
        this.f136534a = finderTabUIC;
    }

    @Override // ym5.d1
    public void a(android.view.View view, android.view.MotionEvent e17) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(e17, "e");
        com.tencent.mars.xlog.Log.i("Finder.FinderTabUIC", "onDoubleClick");
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.finder.viewmodel.component.x70(this.f136534a));
        com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC finderTabUIC = this.f136534a;
        zx2.i b76 = finderTabUIC.b7(finderTabUIC.a7());
        if (b76 != null) {
            com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC finderTabUIC2 = this.f136534a;
            ((zx2.y) finderTabUIC2.e7()).c(finderTabUIC2.getActivity(), b76);
        }
    }
}
