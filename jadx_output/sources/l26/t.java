package l26;

/* loaded from: classes16.dex */
public final class t implements l26.i {

    /* renamed from: a, reason: collision with root package name */
    public static final l26.t f315274a = new l26.t();

    @Override // l26.i
    public java.lang.String a(o06.n0 n0Var) {
        return l26.h.a(this, n0Var);
    }

    @Override // l26.i
    public boolean b(o06.n0 functionDescriptor) {
        f26.z0 c17;
        kotlin.jvm.internal.o.g(functionDescriptor, "functionDescriptor");
        o06.p pVar = (o06.l2) functionDescriptor.W().get(1);
        l06.t tVar = l06.v.f314910d;
        kotlin.jvm.internal.o.d(pVar);
        o06.v0 j17 = v16.f.j(pVar);
        tVar.getClass();
        o06.g a17 = o06.l0.a(j17, l06.w.R);
        if (a17 == null) {
            c17 = null;
        } else {
            f26.r1.f259214e.getClass();
            f26.r1 r1Var = f26.r1.f259215f;
            java.util.List parameters = a17.g().getParameters();
            kotlin.jvm.internal.o.f(parameters, "getParameters(...)");
            java.lang.Object z07 = kz5.n0.z0(parameters);
            kotlin.jvm.internal.o.f(z07, "single(...)");
            c17 = f26.r0.c(r1Var, a17, kz5.b0.c(new f26.g1((o06.e2) z07)));
        }
        if (c17 == null) {
            return false;
        }
        f26.o0 type = ((r06.t1) pVar).getType();
        kotlin.jvm.internal.o.f(type, "getType(...)");
        f26.o0 h17 = f26.z2.h(type);
        kotlin.jvm.internal.o.f(h17, "makeNotNullable(...)");
        return j26.c.i(c17, h17);
    }

    @Override // l26.i
    public java.lang.String getDescription() {
        return "second parameter must be of type KProperty<*> or its supertype";
    }
}
