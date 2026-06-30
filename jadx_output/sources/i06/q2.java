package i06;

/* loaded from: classes15.dex */
public final class q2 extends i06.u1 {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Class f286728e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f286729f;

    public q2(java.lang.Class jClass) {
        kotlin.jvm.internal.o.g(jClass, "jClass");
        this.f286728e = jClass;
        this.f286729f = jz5.h.a(jz5.i.f302830e, new i06.o2(this));
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof i06.q2) {
            if (kotlin.jvm.internal.o.b(this.f286728e, ((i06.q2) obj).f286728e)) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.jvm.internal.f
    public java.lang.Class f() {
        return this.f286728e;
    }

    public int hashCode() {
        return this.f286728e.hashCode();
    }

    @Override // i06.u1
    public java.util.Collection k() {
        return kz5.p0.f313996d;
    }

    @Override // i06.u1
    public java.util.Collection l(n16.g name) {
        kotlin.jvm.internal.o.g(name, "name");
        i06.n2 n2Var = (i06.n2) this.f286729f.getValue();
        n2Var.getClass();
        f06.v vVar = i06.n2.f286700g[1];
        java.lang.Object invoke = n2Var.f286702d.invoke();
        kotlin.jvm.internal.o.f(invoke, "getValue(...)");
        return ((y16.s) invoke).b(name, w06.d.f441947e);
    }

    @Override // i06.u1
    public o06.o1 m(int i17) {
        jz5.o oVar = (jz5.o) ((i06.n2) this.f286729f.getValue()).f286704f.getValue();
        if (oVar == null) {
            return null;
        }
        m16.h hVar = (m16.h) oVar.f302841d;
        i16.o0 o0Var = (i16.o0) oVar.f302842e;
        m16.g gVar = (m16.g) oVar.f302843f;
        p16.u packageLocalVariable = l16.r.f315105n;
        kotlin.jvm.internal.o.f(packageLocalVariable, "packageLocalVariable");
        i16.u0 u0Var = (i16.u0) k16.i.b(o0Var, packageLocalVariable, i17);
        if (u0Var == null) {
            return null;
        }
        java.lang.Class cls = this.f286728e;
        i16.v1 v1Var = o0Var.f287666m;
        kotlin.jvm.internal.o.f(v1Var, "getTypeTable(...)");
        return (o06.o1) i06.o4.f(cls, u0Var, hVar, new k16.k(v1Var), gVar, i06.p2.f286721d);
    }

    @Override // i06.u1
    public java.lang.Class o() {
        java.lang.Class cls = (java.lang.Class) ((i06.n2) this.f286729f.getValue()).f286703e.getValue();
        return cls == null ? this.f286728e : cls;
    }

    @Override // i06.u1
    public java.util.Collection p(n16.g name) {
        kotlin.jvm.internal.o.g(name, "name");
        i06.n2 n2Var = (i06.n2) this.f286729f.getValue();
        n2Var.getClass();
        f06.v vVar = i06.n2.f286700g[1];
        java.lang.Object invoke = n2Var.f286702d.invoke();
        kotlin.jvm.internal.o.f(invoke, "getValue(...)");
        return ((y16.s) invoke).c(name, w06.d.f441947e);
    }

    public java.lang.String toString() {
        return "file class " + u06.i.a(this.f286728e).b();
    }
}
