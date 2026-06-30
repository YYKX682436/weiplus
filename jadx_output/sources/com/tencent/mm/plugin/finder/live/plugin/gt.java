package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class gt extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.rt f112731a;

    public gt(com.tencent.mm.plugin.finder.live.plugin.rt rtVar) {
        this.f112731a = rtVar;
    }

    @Override // ym5.n0
    public void onViewExposed(android.view.View view, long j17, long j18, boolean z17) {
        kotlin.jvm.internal.o.g(view, "view");
        if (z17) {
            i95.m c17 = i95.n0.c(ml2.r0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            ml2.r0.Bj((ml2.r0) c17, ml2.g5.f327497x, null, 2, 2, null);
            ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
            android.widget.CheckBox d17 = this.f112731a.d();
            int i17 = 0;
            if (d17 != null && d17.isChecked()) {
                i17 = 1;
            }
            r0Var.ak(1, 3, kz5.b1.e(new jz5.l("status", java.lang.String.valueOf(i17))));
        }
    }
}
