package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class ch0 extends com.tencent.mm.plugin.finder.live.plugin.l {

    /* renamed from: p, reason: collision with root package name */
    public final qo0.c f112152p;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String f112153q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.widget.se f112154r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ch0(android.view.ViewGroup root, qo0.c statusMonitor) {
        super(root, statusMonitor, null);
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        this.f112152p = statusMonitor;
        this.f112153q = "Finder.LiveVisitorExceptionPlugin";
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean G() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void K0(int i17) {
        super.K0(i17);
        if (i17 == 0) {
            ((mm2.c1) P0(mm2.c1.class)).O1 = false;
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean k() {
        return ((mm2.c1) P0(mm2.c1.class)).f328801f2 != 1;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean r() {
        return false;
    }

    public final void t1(java.lang.String str) {
        if (this.f112154r == null) {
            this.f112154r = new com.tencent.mm.plugin.finder.live.widget.se(this.f365323d, str, ((mm2.c1) S0().a(mm2.c1.class)).t7(), this);
        }
    }

    public final void u1(java.lang.String anchorUserName, r45.qp1 qp1Var, int i17) {
        kotlin.jvm.internal.o.g(anchorUserName, "anchorUserName");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("showVisitorJoinForbidden anchorUserName:");
        sb6.append(anchorUserName);
        sb6.append(", errPage:");
        sb6.append(qp1Var != null ? pm0.b0.g(qp1Var) : null);
        com.tencent.mars.xlog.Log.i(this.f112153q, sb6.toString());
        t1(anchorUserName);
        com.tencent.mm.plugin.finder.live.widget.se seVar = this.f112154r;
        if (seVar != null) {
            seVar.c(12, qp1Var, i17, new com.tencent.mm.plugin.finder.live.plugin.bh0(this));
        }
    }
}
