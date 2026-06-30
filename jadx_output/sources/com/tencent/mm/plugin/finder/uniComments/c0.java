package com.tencent.mm.plugin.finder.uniComments;

/* loaded from: classes10.dex */
public final class c0 extends ym5.q3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.uniComments.o0 f130211a;

    public c0(com.tencent.mm.plugin.finder.uniComments.o0 o0Var) {
        this.f130211a = o0Var;
    }

    @Override // ym5.q3
    public void b(int i17) {
        ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.finder.uniComments.a0(this.f130211a));
    }

    @Override // ym5.q3
    public void c(ym5.s3 reason) {
        com.tencent.mm.plugin.finder.uniComments.a2 a2Var;
        kotlin.jvm.internal.o.g(reason, "reason");
        com.tencent.mm.plugin.finder.uniComments.o0 o0Var = this.f130211a;
        if (o0Var.f130335t || (a2Var = o0Var.f130330o) == null) {
            return;
        }
        com.tencent.mm.view.RefreshLoadMoreLayout.I(a2Var.k(), null, 1, null);
    }

    @Override // ym5.q3
    public void d(int i17, rn5.a aVar, boolean z17) {
        ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.finder.uniComments.b0(this.f130211a));
    }

    @Override // ym5.q3
    public void e(ym5.s3 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
        com.tencent.mm.plugin.finder.uniComments.o0 o0Var = this.f130211a;
        if (o0Var.f130334s) {
            return;
        }
        com.tencent.mm.plugin.finder.uniComments.a2 a2Var = o0Var.f130330o;
        if (a2Var != null) {
            a2Var.d(false);
        }
        com.tencent.mm.plugin.finder.uniComments.a2 a2Var2 = o0Var.f130330o;
        if (a2Var2 != null) {
            a2Var2.e().f213551h.setCanCloseDrawerWhenStop(true);
        }
    }
}
