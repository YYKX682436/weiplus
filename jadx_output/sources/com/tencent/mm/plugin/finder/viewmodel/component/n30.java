package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class n30 extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.f50 f135253a;

    public n30(com.tencent.mm.plugin.finder.viewmodel.component.f50 f50Var) {
        this.f135253a = f50Var;
    }

    @Override // ym5.n0
    public void onViewExposed(android.view.View view, long j17, long j18, boolean z17) {
        kotlin.jvm.internal.o.g(view, "view");
        if (z17) {
            i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            com.tencent.mm.plugin.finder.viewmodel.component.f50 f50Var = this.f135253a;
            com.tencent.mm.plugin.finder.report.o3.Mj((com.tencent.mm.plugin.finder.report.o3) c17, f50Var.getActivity(), 8L, 1L, false, 0, 0, null, 120, null);
            i95.m c18 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            ((com.tencent.mm.plugin.finder.report.o3) c18).Jj(f50Var.getActivity(), f50Var.G, f50Var.E, 1L, 11L, (r30 & 32) != 0 ? false : false, (r30 & 64) != 0 ? 0L : 0L, (r30 & 128) != 0 ? "" : null, (r30 & 256) != 0 ? "" : null);
        }
    }
}
