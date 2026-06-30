package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class l30 extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.f50 f135018a;

    public l30(com.tencent.mm.plugin.finder.viewmodel.component.f50 f50Var) {
        this.f135018a = f50Var;
    }

    @Override // ym5.n0
    public void onViewExposed(android.view.View view, long j17, long j18, boolean z17) {
        kotlin.jvm.internal.o.g(view, "view");
        if (z17) {
            i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            com.tencent.mm.plugin.finder.viewmodel.component.f50 f50Var = this.f135018a;
            ((com.tencent.mm.plugin.finder.report.o3) c17).Jj(f50Var.getActivity(), f50Var.G, f50Var.E, 1L, 13L, (r30 & 32) != 0 ? false : false, (r30 & 64) != 0 ? 0L : 0L, (r30 & 128) != 0 ? "" : null, (r30 & 256) != 0 ? "" : null);
        }
    }
}
