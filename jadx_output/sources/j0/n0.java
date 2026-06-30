package j0;

/* loaded from: classes14.dex */
public final class n0 implements s1.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j0.c5 f296454a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.l f296455b;

    public n0(j0.c5 c5Var, yz5.l lVar) {
        this.f296454a = c5Var;
        this.f296455b = lVar;
    }

    @Override // s1.t0
    public int a(s1.u uVar, java.util.List list, int i17) {
        return s1.s0.d(this, uVar, list, i17);
    }

    @Override // s1.t0
    public int b(s1.u uVar, java.util.List list, int i17) {
        return s1.s0.a(this, uVar, list, i17);
    }

    @Override // s1.t0
    public int c(s1.u uVar, java.util.List list, int i17) {
        return s1.s0.c(this, uVar, list, i17);
    }

    @Override // s1.t0
    public s1.u0 d(s1.x0 measure, java.util.List measurables, long j17) {
        kotlin.jvm.internal.o.g(measure, "$this$measure");
        kotlin.jvm.internal.o.g(measurables, "measurables");
        j0.c5 c5Var = this.f296454a;
        j0.k3 textDelegate = c5Var.f296233a;
        p2.s layoutDirection = measure.getLayoutDirection();
        j0.d5 d5Var = c5Var.f296239g;
        a2.k1 k1Var = d5Var != null ? d5Var.f296265a : null;
        kotlin.jvm.internal.o.g(textDelegate, "textDelegate");
        kotlin.jvm.internal.o.g(layoutDirection, "layoutDirection");
        a2.k1 a17 = textDelegate.a(j17, layoutDirection, k1Var);
        long j18 = a17.f767c;
        java.lang.Integer valueOf = java.lang.Integer.valueOf((int) (j18 >> 32));
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(p2.q.b(j18));
        int intValue = valueOf.intValue();
        int intValue2 = valueOf2.intValue();
        j0.d5 d5Var2 = c5Var.f296239g;
        if (!kotlin.jvm.internal.o.b(d5Var2 != null ? d5Var2.f296265a : null, a17)) {
            c5Var.f296239g = new j0.d5(a17);
            this.f296455b.invoke(a17);
        }
        return measure.W(intValue, intValue2, kz5.c1.k(new jz5.l(s1.d.f401999a, java.lang.Integer.valueOf(a06.d.b(a17.f768d))), new jz5.l(s1.d.f402000b, java.lang.Integer.valueOf(a06.d.b(a17.f769e)))), j0.m0.f296445d);
    }

    @Override // s1.t0
    public int e(s1.u uVar, java.util.List measurables, int i17) {
        kotlin.jvm.internal.o.g(uVar, "<this>");
        kotlin.jvm.internal.o.g(measurables, "measurables");
        j0.c5 c5Var = this.f296454a;
        c5Var.f296233a.b(uVar.getLayoutDirection());
        if (c5Var.f296233a.f296411i != null) {
            return (int) java.lang.Math.ceil(r1.c());
        }
        throw new java.lang.IllegalStateException("layoutIntrinsics must be called first");
    }
}
