package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class q10 implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.z10 f119461d;

    public q10(com.tencent.mm.plugin.finder.live.widget.z10 z10Var) {
        this.f119461d = z10Var;
    }

    @Override // in5.x
    public void s2(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17, androidx.recyclerview.widget.k3 k3Var) {
        in5.s0 holder = (in5.s0) k3Var;
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mm.plugin.finder.live.widget.z10 z10Var = this.f119461d;
        java.lang.Object obj = z10Var.f120508q.get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        if (((cm2.p) obj).f43373d == 2) {
            int i18 = ((mm2.c1) z10Var.f120494c.P0(mm2.c1.class)).H2;
            qo0.c cVar = z10Var.f120493b;
            if (i18 != 1) {
                qo0.c.a(cVar, qo0.b.E2, null, 2, null);
                return;
            }
            android.view.ViewGroup viewGroup = z10Var.f120492a;
            db5.t7.g(viewGroup.getContext(), viewGroup.getContext().getResources().getString(com.tencent.mm.R.string.czl));
            qo0.c.a(cVar, qo0.b.D2, null, 2, null);
        }
    }
}
