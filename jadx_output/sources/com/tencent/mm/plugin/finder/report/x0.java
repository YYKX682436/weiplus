package com.tencent.mm.plugin.finder.report;

/* loaded from: classes2.dex */
public final class x0 extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f125426a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f125427b;

    public x0(int i17, boolean z17) {
        this.f125426a = i17;
        this.f125427b = z17;
    }

    @Override // ym5.n0
    public void onViewExposed(android.view.View view, long j17, long j18, boolean z17) {
        kotlin.jvm.internal.o.g(view, "view");
        int i17 = this.f125426a;
        boolean z18 = this.f125427b;
        if (z17) {
            com.tencent.mm.plugin.finder.report.y0 y0Var = com.tencent.mm.plugin.finder.report.y0.f125442a;
            android.content.Context context = view.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            com.tencent.mars.xlog.Log.i("Finder.HomeActionReporter", "[onLoadingExposed] tabType:" + i17 + " isTop:" + z18);
            com.tencent.mm.plugin.finder.report.w0 c17 = y0Var.c(i17);
            c17.f125416d = true;
            c17.f125417e = z18;
            y0Var.h(i17, 9, false);
            y0Var.g(context, i17, new jz5.l(9, 0), false);
            return;
        }
        com.tencent.mm.plugin.finder.report.y0 y0Var2 = com.tencent.mm.plugin.finder.report.y0.f125442a;
        android.content.Context context2 = view.getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        com.tencent.mars.xlog.Log.i("Finder.HomeActionReporter", "[onLoadingDisposed] tabType:" + i17 + " isTop:" + z18);
        com.tencent.mm.plugin.finder.report.w0 c18 = y0Var2.c(i17);
        c18.f125416d = false;
        c18.f125417e = z18;
        y0Var2.h(i17, 10, false);
        long g17 = y0Var2.g(context2, i17, new jz5.l(10, 9), false);
        com.tencent.mm.plugin.finder.report.r1 r1Var = (com.tencent.mm.plugin.finder.report.r1) com.tencent.mm.plugin.finder.report.v1.f125399g.get(java.lang.Integer.valueOf(i17));
        if (r1Var != null) {
            r1Var.f125314l0 = g17;
        }
    }
}
