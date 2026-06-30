package com.tencent.mm.plugin.finder.search;

/* loaded from: classes2.dex */
public final class s1 extends ym5.q3 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f125846a = true;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.search.FinderFeedSearchUI f125847b;

    public s1(com.tencent.mm.plugin.finder.search.FinderFeedSearchUI finderFeedSearchUI) {
        this.f125847b = finderFeedSearchUI;
    }

    @Override // ym5.q3
    public void a(int i17) {
        if (!this.f125846a || i17 <= 0) {
            return;
        }
        com.tencent.mm.plugin.finder.search.FinderFeedSearchUI activity = this.f125847b;
        kotlin.jvm.internal.o.g(activity, "activity");
        androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        fc2.o Z6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) a17).Z6(-1);
        if (Z6 != null) {
            fc2.i iVar = new fc2.i(Z6);
            androidx.recyclerview.widget.RecyclerView recyclerView = activity.P;
            if (recyclerView == null) {
                kotlin.jvm.internal.o.o("recyclerView");
                throw null;
            }
            iVar.onScrollStateChanged(recyclerView, 5);
        }
        this.f125846a = false;
    }

    @Override // ym5.q3
    public void b(int i17) {
        com.tencent.mars.xlog.Log.i("Finder.FinderFeedSearchUI", "onLoadMoreBegin");
        int i18 = com.tencent.mm.plugin.finder.search.FinderFeedSearchUI.U1;
        com.tencent.mm.plugin.finder.search.FinderFeedSearchUI finderFeedSearchUI = this.f125847b;
        if (finderFeedSearchUI.h7()) {
            if (finderFeedSearchUI.f125549v != null) {
                bq.o1 o1Var = finderFeedSearchUI.E1;
                if (o1Var != null) {
                    o1Var.j();
                }
                bq.o1 o1Var2 = new bq.o1(finderFeedSearchUI.f125549v, finderFeedSearchUI.f125550w, finderFeedSearchUI.E, finderFeedSearchUI.f125557z, finderFeedSearchUI.j7(), ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(finderFeedSearchUI).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6(), null, null, null, null, false, 0, 3456, null);
                finderFeedSearchUI.E1 = o1Var2;
                o1Var2.f23509v = finderFeedSearchUI.H;
                pm0.v.T(o1Var2.l(), new com.tencent.mm.plugin.finder.search.j2(finderFeedSearchUI, o1Var2)).f(finderFeedSearchUI);
                finderFeedSearchUI.p7();
                return;
            }
            return;
        }
        java.lang.String str = finderFeedSearchUI.f125549v;
        if (str != null) {
            if (finderFeedSearchUI.f125551x == 1) {
                finderFeedSearchUI.x7(str, false);
                return;
            }
            if (finderFeedSearchUI.w7(false)) {
                finderFeedSearchUI.p7();
                return;
            }
            int i19 = finderFeedSearchUI.f125554y;
            if (i19 == 1) {
                finderFeedSearchUI.g7(null, false);
                return;
            }
            if (i19 != 0 || finderFeedSearchUI.X != null || !finderFeedSearchUI.L) {
                finderFeedSearchUI.q7();
            } else {
                com.tencent.mars.xlog.Log.i("Finder.FinderFeedSearchUI", "onLoadMoreBegin wait for onGetList");
                finderFeedSearchUI.M = true;
            }
        }
    }

    @Override // ym5.q3
    public void c(ym5.s3 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
        com.tencent.mars.xlog.Log.i("Finder.FinderFeedSearchUI", "onLoadMoreEnd");
    }
}
