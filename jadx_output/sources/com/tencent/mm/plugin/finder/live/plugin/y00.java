package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class y00 extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.f10 f115140a;

    public y00(com.tencent.mm.plugin.finder.live.plugin.f10 f10Var) {
        this.f115140a = f10Var;
    }

    @Override // ym5.n0
    public void onViewExposed(android.view.View view, long j17, long j18, boolean z17) {
        kotlin.jvm.internal.o.g(view, "view");
        if (z17) {
            com.tencent.mm.plugin.finder.live.plugin.f10 f10Var = this.f115140a;
            if (((mm2.u0) f10Var.P0(mm2.u0.class)).f329445h) {
                return;
            }
            ((mm2.u0) f10Var.P0(mm2.u0.class)).f329445h = true;
            if (((ml2.r0) i95.n0.c(ml2.r0.class)).Y != ml2.v1.f328141f) {
                ((ml2.r0) i95.n0.c(ml2.r0.class)).ak(1, 6, kz5.b1.e(new jz5.l(ya.b.SOURCE, "1")));
            }
        }
    }
}
