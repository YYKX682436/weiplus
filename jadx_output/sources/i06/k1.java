package i06;

/* loaded from: classes15.dex */
public final class k1 extends i06.u1 implements f06.d, i06.l1, i06.z3 {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f286679g = 0;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Class f286680e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f286681f;

    public k1(java.lang.Class jClass) {
        kotlin.jvm.internal.o.g(jClass, "jClass");
        this.f286680e = jClass;
        this.f286681f = jz5.h.a(jz5.i.f302830e, new i06.i1(this));
    }

    @Override // f06.d
    public java.util.List a() {
        i06.f1 f1Var = (i06.f1) this.f286681f.getValue();
        f1Var.getClass();
        f06.v vVar = i06.f1.f286632o[7];
        java.lang.Object invoke = f1Var.f286636f.invoke();
        kotlin.jvm.internal.o.f(invoke, "getValue(...)");
        return (java.util.List) invoke;
    }

    @Override // f06.d
    public java.lang.String d() {
        i06.f1 f1Var = (i06.f1) this.f286681f.getValue();
        f1Var.getClass();
        f06.v vVar = i06.f1.f286632o[3];
        return (java.lang.String) f1Var.f286635e.invoke();
    }

    @Override // f06.d
    public java.util.Collection e() {
        i06.f1 f1Var = (i06.f1) this.f286681f.getValue();
        f1Var.getClass();
        f06.v vVar = i06.f1.f286632o[16];
        java.lang.Object invoke = f1Var.f286644n.invoke();
        kotlin.jvm.internal.o.f(invoke, "getValue(...)");
        return (java.util.Collection) invoke;
    }

    public boolean equals(java.lang.Object obj) {
        return (obj instanceof i06.k1) && kotlin.jvm.internal.o.b(xz5.a.c(this), xz5.a.c((f06.d) obj));
    }

    @Override // kotlin.jvm.internal.f
    public java.lang.Class f() {
        return this.f286680e;
    }

    @Override // f06.d
    public java.lang.String g() {
        i06.f1 f1Var = (i06.f1) this.f286681f.getValue();
        f1Var.getClass();
        f06.v vVar = i06.f1.f286632o[2];
        return (java.lang.String) f1Var.f286634d.invoke();
    }

    public int hashCode() {
        return xz5.a.c(this).hashCode();
    }

    @Override // f06.d
    public boolean isAbstract() {
        return h().f() == o06.t0.f341988h;
    }

    @Override // i06.u1
    public java.util.Collection k() {
        o06.g h17 = h();
        if (h17.j() == o06.h.f341961e || h17.j() == o06.h.f341965i) {
            return kz5.p0.f313996d;
        }
        java.util.Collection S = h17.S();
        kotlin.jvm.internal.o.f(S, "getConstructors(...)");
        return S;
    }

    @Override // i06.u1
    public java.util.Collection l(n16.g name) {
        kotlin.jvm.internal.o.g(name, "name");
        y16.s x17 = x();
        w06.d dVar = w06.d.f441947e;
        return kz5.n0.t0(x17.b(name, dVar), y().b(name, dVar));
    }

    @Override // i06.u1
    public o06.o1 m(int i17) {
        java.lang.Class<?> declaringClass;
        java.lang.Class cls = this.f286680e;
        if (kotlin.jvm.internal.o.b(cls.getSimpleName(), "DefaultImpls") && (declaringClass = cls.getDeclaringClass()) != null && declaringClass.isInterface()) {
            f06.d a17 = kotlin.jvm.internal.i0.a(declaringClass);
            kotlin.jvm.internal.o.e(a17, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<*>");
            return ((i06.k1) a17).m(i17);
        }
        o06.g h17 = h();
        d26.x xVar = h17 instanceof d26.x ? (d26.x) h17 : null;
        if (xVar == null) {
            return null;
        }
        p16.u classLocalVariable = l16.r.f315101j;
        kotlin.jvm.internal.o.f(classLocalVariable, "classLocalVariable");
        i16.u0 u0Var = (i16.u0) k16.i.b(xVar.f226053h, classLocalVariable, i17);
        if (u0Var == null) {
            return null;
        }
        java.lang.Class cls2 = this.f286680e;
        b26.t tVar = xVar.f226060r;
        return (o06.o1) i06.o4.f(cls2, u0Var, tVar.f17516b, tVar.f17518d, xVar.f226054i, i06.j1.f286666d);
    }

    @Override // i06.u1
    public java.util.Collection p(n16.g name) {
        kotlin.jvm.internal.o.g(name, "name");
        y16.s x17 = x();
        w06.d dVar = w06.d.f441947e;
        return kz5.n0.t0(x17.c(name, dVar), y().c(name, dVar));
    }

    public java.lang.String toString() {
        java.lang.String str;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("class ");
        n16.b v17 = v();
        n16.c h17 = v17.h();
        kotlin.jvm.internal.o.f(h17, "getPackageFqName(...)");
        if (h17.d()) {
            str = "";
        } else {
            str = h17.b() + '.';
        }
        java.lang.String b17 = v17.i().b();
        kotlin.jvm.internal.o.f(b17, "asString(...)");
        sb6.append(str + r26.i0.u(b17, '.', '$', false, 4, null));
        return sb6.toString();
    }

    public final o06.g u(n16.b bVar, t06.k kVar) {
        o06.v0 v0Var = kVar.f414542a.f17484b;
        n16.c h17 = bVar.h();
        kotlin.jvm.internal.o.f(h17, "getPackageFqName(...)");
        r06.y yVar = new r06.y(v0Var, h17);
        n16.g j17 = bVar.j();
        o06.t0 t0Var = o06.t0.f341985e;
        o06.h hVar = o06.h.f341960d;
        b26.q qVar = kVar.f414542a;
        r06.t tVar = new r06.t(yVar, j17, t0Var, hVar, kz5.b0.c(qVar.f17484b.h().k("Any").k()), o06.x1.f342004a, false, qVar.f17483a);
        tVar.u0(new i06.h1(tVar, qVar.f17483a), kz5.r0.f314002d, null);
        return tVar;
    }

    public final n16.b v() {
        l06.r i17;
        i06.k4 k4Var = i06.k4.f286686a;
        java.lang.Class klass = this.f286680e;
        kotlin.jvm.internal.o.g(klass, "klass");
        if (klass.isArray()) {
            java.lang.Class<?> componentType = klass.getComponentType();
            kotlin.jvm.internal.o.f(componentType, "getComponentType(...)");
            i17 = componentType.isPrimitive() ? w16.e.b(componentType.getSimpleName()).i() : null;
            return i17 != null ? new n16.b(l06.x.f314956k, i17.f314906e) : n16.b.l(l06.w.f314927h.h());
        }
        if (kotlin.jvm.internal.o.b(klass, java.lang.Void.TYPE)) {
            return i06.k4.f286687b;
        }
        i17 = klass.isPrimitive() ? w16.e.b(klass.getSimpleName()).i() : null;
        if (i17 != null) {
            return new n16.b(l06.x.f314956k, i17.f314905d);
        }
        n16.b a17 = u06.i.a(klass);
        if (a17.f334158c) {
            return a17;
        }
        n06.d dVar = n06.d.f333953a;
        n16.c b17 = a17.b();
        kotlin.jvm.internal.o.f(b17, "asSingleFqName(...)");
        n16.b f17 = dVar.f(b17);
        return f17 != null ? f17 : a17;
    }

    @Override // i06.l1
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public o06.g h() {
        return ((i06.f1) this.f286681f.getValue()).a();
    }

    public final y16.s x() {
        return h().k().V();
    }

    public final y16.s y() {
        y16.s m07 = h().m0();
        kotlin.jvm.internal.o.f(m07, "getStaticScope(...)");
        return m07;
    }
}
