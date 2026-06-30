package i06;

/* loaded from: classes16.dex */
public abstract class k3 extends i06.h3 implements f06.q {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ f06.v[] f286683o = {kotlin.jvm.internal.i0.e(new kotlin.jvm.internal.a0(kotlin.jvm.internal.i0.a(i06.k3.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertyGetterDescriptor;"))};

    /* renamed from: m, reason: collision with root package name */
    public final i06.c4 f286684m = i06.f4.a(new i06.j3(this));

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f286685n = jz5.h.a(jz5.i.f302830e, new i06.i3(this));

    public boolean equals(java.lang.Object obj) {
        return (obj instanceof i06.k3) && kotlin.jvm.internal.o.b(q(), ((i06.k3) obj).q());
    }

    @Override // f06.c
    public java.lang.String getName() {
        return "<get-" + q().f286732n + '>';
    }

    public int hashCode() {
        return q().hashCode();
    }

    @Override // i06.k0
    public j06.k i() {
        return (j06.k) this.f286685n.getValue();
    }

    @Override // i06.k0
    public o06.d l() {
        f06.v vVar = f286683o[0];
        java.lang.Object invoke = this.f286684m.invoke();
        kotlin.jvm.internal.o.f(invoke, "getValue(...)");
        return (o06.p1) invoke;
    }

    @Override // i06.h3
    public o06.n1 p() {
        f06.v vVar = f286683o[0];
        java.lang.Object invoke = this.f286684m.invoke();
        kotlin.jvm.internal.o.f(invoke, "getValue(...)");
        return (o06.p1) invoke;
    }

    public java.lang.String toString() {
        return "getter of " + q();
    }
}
