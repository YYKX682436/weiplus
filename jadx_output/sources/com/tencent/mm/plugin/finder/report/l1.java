package com.tencent.mm.plugin.finder.report;

/* loaded from: classes2.dex */
public final class l1 extends com.tencent.mm.plugin.finder.report.k4 {
    public static final com.tencent.mm.plugin.finder.report.f1 I = new com.tencent.mm.plugin.finder.report.f1(null);

    /* renamed from: J, reason: collision with root package name */
    public static java.util.LinkedList f125110J = new java.util.LinkedList();
    public final jz5.g F;
    public final jz5.g G;
    public final boolean H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(com.tencent.mm.ui.MMFragmentActivity activity, r45.qt2 contextObj) {
        super(activity, contextObj);
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(contextObj, "contextObj");
        this.F = jz5.h.b(new com.tencent.mm.plugin.finder.report.k1(contextObj));
        this.G = jz5.h.b(new com.tencent.mm.plugin.finder.report.g1(activity, this));
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        this.H = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.V6).getValue()).r()).intValue() == 1;
    }

    @Override // com.tencent.mm.plugin.finder.report.k4, com.tencent.mm.plugin.finder.report.r0, fc2.d
    public void G0(fc2.a event) {
        kotlin.jvm.internal.o.g(event, "event");
        com.tencent.mm.plugin.finder.report.n4 n4Var = this.f125108z;
        if (n4Var != null) {
            if (event instanceof ec2.a) {
                pm0.v.X(new com.tencent.mm.plugin.finder.report.h1(event, this));
            }
            com.tencent.mm.plugin.finder.viewmodel.component.nc k17 = k1();
            if (k17 != null) {
                k17.Z6(((java.lang.Number) ((jz5.n) this.F).getValue()).intValue(), event, this.f125284h, new com.tencent.mm.plugin.finder.report.i1(n4Var, this));
            }
        }
        super.G0(event);
        if (event instanceof fc2.w) {
            fc2.w wVar = (fc2.w) event;
            if (wVar.f261000p != wVar.f260992k) {
                pm0.v.O("FinderReporterThread", new com.tencent.mm.plugin.finder.report.j1(this));
            }
        }
    }

    @Override // com.tencent.mm.plugin.finder.report.k4, com.tencent.mm.plugin.finder.report.r0
    public java.util.LinkedList R0() {
        java.util.LinkedList R0 = super.R0();
        com.tencent.mm.plugin.finder.viewmodel.component.nc k17 = k1();
        if (k17 != null) {
            k17.T6(R0);
        }
        return R0;
    }

    public final com.tencent.mm.plugin.finder.viewmodel.component.nc k1() {
        com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment finderHomeTabFragment;
        if (!this.H || (finderHomeTabFragment = (com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment) ((jz5.n) this.G).getValue()) == null) {
            return null;
        }
        return (com.tencent.mm.plugin.finder.viewmodel.component.nc) pf5.z.f353948a.b(finderHomeTabFragment).e(com.tencent.mm.plugin.finder.viewmodel.component.nc.class);
    }
}
