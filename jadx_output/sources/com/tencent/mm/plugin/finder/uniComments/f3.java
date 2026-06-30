package com.tencent.mm.plugin.finder.uniComments;

/* loaded from: classes10.dex */
public final class f3 extends ym5.q3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.uniComments.q3 f130243a;

    public f3(com.tencent.mm.plugin.finder.uniComments.q3 q3Var) {
        this.f130243a = q3Var;
    }

    @Override // ym5.q3
    public void b(int i17) {
        ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.finder.uniComments.d3(this.f130243a));
    }

    @Override // ym5.q3
    public void c(ym5.s3 reason) {
        com.tencent.mm.plugin.finder.uniComments.a5 a5Var;
        kotlin.jvm.internal.o.g(reason, "reason");
        com.tencent.mm.plugin.finder.uniComments.q3 q3Var = this.f130243a;
        if (q3Var.f130377q || (a5Var = q3Var.f130373m) == null) {
            return;
        }
        com.tencent.mm.view.RefreshLoadMoreLayout.I(a5Var.s(), null, 1, null);
    }

    @Override // ym5.q3
    public void d(int i17, rn5.a aVar, boolean z17) {
        ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.finder.uniComments.e3(this.f130243a));
    }

    @Override // ym5.q3
    public void e(ym5.s3 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
        com.tencent.mm.plugin.finder.uniComments.q3 q3Var = this.f130243a;
        if (q3Var.f130376p) {
            return;
        }
        com.tencent.mm.plugin.finder.uniComments.a5 a5Var = q3Var.f130373m;
        if (a5Var != null) {
            a5Var.g(false);
        }
        com.tencent.mm.plugin.finder.uniComments.a5 a5Var2 = q3Var.f130373m;
        if (a5Var2 != null) {
            a5Var2.h().l(true);
        }
    }
}
