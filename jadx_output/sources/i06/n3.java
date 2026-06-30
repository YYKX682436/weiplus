package i06;

/* loaded from: classes16.dex */
public abstract class n3 extends i06.h3 implements f06.h {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ f06.v[] f286705o = {kotlin.jvm.internal.i0.e(new kotlin.jvm.internal.a0(kotlin.jvm.internal.i0.a(i06.n3.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertySetterDescriptor;"))};

    /* renamed from: m, reason: collision with root package name */
    public final i06.c4 f286706m = i06.f4.a(new i06.m3(this));

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f286707n = jz5.h.a(jz5.i.f302830e, new i06.l3(this));

    public boolean equals(java.lang.Object obj) {
        return (obj instanceof i06.n3) && kotlin.jvm.internal.o.b(q(), ((i06.n3) obj).q());
    }

    @Override // f06.c
    public java.lang.String getName() {
        return "<set-" + q().f286732n + '>';
    }

    public int hashCode() {
        return q().hashCode();
    }

    @Override // i06.k0
    public j06.k i() {
        return (j06.k) this.f286707n.getValue();
    }

    @Override // i06.k0
    public o06.d l() {
        f06.v vVar = f286705o[0];
        java.lang.Object invoke = this.f286706m.invoke();
        kotlin.jvm.internal.o.f(invoke, "getValue(...)");
        return (o06.q1) invoke;
    }

    @Override // i06.h3
    public o06.n1 p() {
        f06.v vVar = f286705o[0];
        java.lang.Object invoke = this.f286706m.invoke();
        kotlin.jvm.internal.o.f(invoke, "getValue(...)");
        return (o06.q1) invoke;
    }

    public java.lang.String toString() {
        return "setter of " + q();
    }
}
