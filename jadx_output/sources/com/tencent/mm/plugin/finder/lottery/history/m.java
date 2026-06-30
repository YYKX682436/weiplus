package com.tencent.mm.plugin.finder.lottery.history;

/* loaded from: classes3.dex */
public final class m extends ym5.m0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashSet f120846a = new java.util.HashSet();

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.lottery.history.n f120847b;

    public m(com.tencent.mm.plugin.finder.lottery.history.n nVar) {
        this.f120847b = nVar;
    }

    @Override // ym5.m0
    public boolean d() {
        return true;
    }

    @Override // ym5.m0
    public void e(android.view.View parent, java.util.List exposedHolders) {
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(exposedHolders, "exposedHolders");
        java.util.Iterator it = exposedHolders.iterator();
        while (it.hasNext()) {
            androidx.recyclerview.widget.k3 k3Var = (androidx.recyclerview.widget.k3) it.next();
            if (k3Var instanceof in5.s0) {
                java.lang.Object obj = ((in5.s0) k3Var).f293125i;
                if (obj instanceof so2.b3) {
                    java.util.HashSet hashSet = this.f120846a;
                    so2.b3 b3Var = (so2.b3) obj;
                    if (!hashSet.contains(java.lang.Long.valueOf(b3Var.hashCode()))) {
                        com.tencent.mm.plugin.finder.report.p pVar = com.tencent.mm.plugin.finder.report.p.f125222a;
                        com.tencent.mm.plugin.finder.report.k kVar = com.tencent.mm.plugin.finder.report.p.f125228g;
                        android.content.Context context = parent.getContext();
                        kotlin.jvm.internal.o.f(context, "getContext(...)");
                        java.lang.String e17 = xy2.c.e(context);
                        java.lang.String string = b3Var.f410268d.getString(0);
                        if (string == null) {
                            string = "";
                        }
                        kVar.c(e17, string, "");
                        c61.yb ybVar = (c61.yb) i95.n0.c(c61.yb.class);
                        com.tencent.mm.plugin.finder.presenter.contract.BaseFinderLotteryContract.ViewCallback viewCallback = this.f120847b.f122553f;
                        kotlin.jvm.internal.o.d(viewCallback);
                        zy2.ra Sj = ((c61.p2) ybVar).Sj(viewCallback.f122556d);
                        com.tencent.mm.plugin.finder.report.k.b(kVar, Sj != null ? ((com.tencent.mm.plugin.finder.viewmodel.component.ny) Sj).V6() : null, 4L, null, 4, null);
                        hashSet.add(java.lang.Long.valueOf(b3Var.hashCode()));
                    }
                }
            }
        }
    }
}
