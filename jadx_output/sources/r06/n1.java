package r06;

/* loaded from: classes16.dex */
public final class n1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r06.o1 f368490d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o06.f f368491e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(r06.o1 o1Var, o06.f fVar) {
        super(0);
        this.f368490d = o1Var;
        this.f368491e = fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yz5.a
    public java.lang.Object invoke() {
        r06.o1 o1Var = this.f368490d;
        e26.c0 c0Var = o1Var.K;
        o06.d2 d2Var = o1Var.L;
        o06.f fVar = this.f368491e;
        p06.k annotations = ((p06.b) fVar).getAnnotations();
        r06.j0 j0Var = (r06.j0) this.f368491e;
        o06.c j17 = j0Var.j();
        kotlin.jvm.internal.o.f(j17, "getKind(...)");
        o06.p pVar = o1Var.L;
        o06.x1 source = ((r06.w) pVar).getSource();
        kotlin.jvm.internal.o.f(source, "getSource(...)");
        r06.o1 o1Var2 = new r06.o1(c0Var, d2Var, fVar, o1Var, annotations, j17, source);
        r06.o1.N.getClass();
        d26.p0 p0Var = (d26.p0) pVar;
        f26.v2 d17 = p0Var.s0() == null ? null : f26.v2.d(p0Var.u0());
        if (d17 == null) {
            return null;
        }
        o06.r1 r1Var = j0Var.f368463p;
        o06.r1 d18 = r1Var != null ? ((r06.g) r1Var).d(d17) : null;
        java.util.List p07 = j0Var.p0();
        kotlin.jvm.internal.o.f(p07, "getContextReceiverParameters(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(p07, 10));
        java.util.Iterator it = p07.iterator();
        while (it.hasNext()) {
            arrayList.add(((r06.g) ((o06.r1) it.next())).d(d17));
        }
        r06.l lVar = (r06.l) pVar;
        java.util.List m17 = lVar.m();
        java.util.List W = o1Var.W();
        f26.o0 o0Var = o1Var.f368460m;
        kotlin.jvm.internal.o.d(o0Var);
        o1Var2.x0(null, d18, arrayList, m17, W, o0Var, o06.t0.f341985e, lVar.f368480i);
        return o1Var2;
    }
}
