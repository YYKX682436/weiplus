package t16;

/* loaded from: classes15.dex */
public final class x extends t16.g {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(t16.w value) {
        super(value);
        kotlin.jvm.internal.o.g(value, "value");
    }

    @Override // t16.g
    public f26.o0 a(o06.v0 module) {
        f26.o0 o0Var;
        kotlin.jvm.internal.o.g(module, "module");
        f26.r1.f259214e.getClass();
        f26.r1 r1Var = f26.r1.f259215f;
        l06.o h17 = module.h();
        h17.getClass();
        o06.g j17 = h17.j(l06.w.Q.h());
        if (j17 == null) {
            l06.o.a(21);
            throw null;
        }
        java.lang.Object obj = this.f414613a;
        t16.w wVar = (t16.w) obj;
        if (wVar instanceof t16.u) {
            o0Var = ((t16.u) obj).f414627a;
        } else {
            if (!(wVar instanceof t16.v)) {
                throw new jz5.j();
            }
            t16.f fVar = ((t16.v) obj).f414628a;
            n16.b bVar = fVar.f414611a;
            o06.g a17 = o06.l0.a(module, bVar);
            int i17 = fVar.f414612b;
            if (a17 == null) {
                h26.l lVar = h26.l.f278355g;
                java.lang.String bVar2 = bVar.toString();
                kotlin.jvm.internal.o.f(bVar2, "toString(...)");
                o0Var = h26.m.c(lVar, bVar2, java.lang.String.valueOf(i17));
            } else {
                f26.z0 k17 = a17.k();
                kotlin.jvm.internal.o.f(k17, "getDefaultType(...)");
                f26.o0 l17 = j26.c.l(k17);
                for (int i18 = 0; i18 < i17; i18++) {
                    l17 = module.h().h(f26.d3.f259143f, l17);
                }
                o0Var = l17;
            }
        }
        return f26.r0.c(r1Var, j17, kz5.b0.c(new f26.n2(o0Var)));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(t16.f value) {
        super(new t16.v(value));
        kotlin.jvm.internal.o.g(value, "value");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public x(n16.b classId, int i17) {
        this(new t16.f(classId, i17));
        kotlin.jvm.internal.o.g(classId, "classId");
    }
}
