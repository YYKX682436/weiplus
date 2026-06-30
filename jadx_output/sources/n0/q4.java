package n0;

/* loaded from: classes14.dex */
public abstract class q4 implements x0.z0, x0.e0 {

    /* renamed from: d, reason: collision with root package name */
    public final n0.r4 f333688d;

    /* renamed from: e, reason: collision with root package name */
    public n0.p4 f333689e;

    public q4(java.lang.Object obj, n0.r4 policy) {
        kotlin.jvm.internal.o.g(policy, "policy");
        this.f333688d = policy;
        this.f333689e = new n0.p4(obj);
    }

    @Override // x0.z0
    public x0.a1 d(x0.a1 previous, x0.a1 current, x0.a1 applied) {
        kotlin.jvm.internal.o.g(previous, "previous");
        kotlin.jvm.internal.o.g(current, "current");
        kotlin.jvm.internal.o.g(applied, "applied");
        n0.p4 p4Var = (n0.p4) previous;
        n0.p4 p4Var2 = (n0.p4) current;
        n0.p4 p4Var3 = (n0.p4) applied;
        java.lang.Object obj = p4Var2.f333672c;
        java.lang.Object obj2 = p4Var3.f333672c;
        n0.r4 r4Var = this.f333688d;
        if (r4Var.a(obj, obj2)) {
            return current;
        }
        java.lang.Object b17 = r4Var.b(p4Var.f333672c, p4Var2.f333672c, p4Var3.f333672c);
        if (b17 == null) {
            return null;
        }
        x0.a1 b18 = p4Var3.b();
        ((n0.p4) b18).f333672c = b17;
        return b18;
    }

    @Override // x0.z0
    public void e(x0.a1 value) {
        kotlin.jvm.internal.o.g(value, "value");
        this.f333689e = (n0.p4) value;
    }

    @Override // x0.z0
    public x0.a1 g() {
        return this.f333689e;
    }

    @Override // n0.e5
    public java.lang.Object getValue() {
        return ((n0.p4) x0.z.q(this.f333689e, this)).f333672c;
    }

    @Override // n0.v2
    public void setValue(java.lang.Object obj) {
        x0.m i17;
        n0.p4 p4Var = (n0.p4) x0.z.h(this.f333689e, x0.z.i());
        if (this.f333688d.a(p4Var.f333672c, obj)) {
            return;
        }
        n0.p4 p4Var2 = this.f333689e;
        synchronized (x0.z.f450963b) {
            i17 = x0.z.i();
            ((n0.p4) x0.z.n(p4Var2, this, i17, p4Var)).f333672c = obj;
        }
        x0.z.m(i17, this);
    }

    public java.lang.String toString() {
        return "MutableState(value=" + ((n0.p4) x0.z.h(this.f333689e, x0.z.i())).f333672c + ")@" + hashCode();
    }
}
