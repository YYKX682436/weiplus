package u26;

/* loaded from: classes14.dex */
public final class e0 extends u26.w0 implements u26.u0 {

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Throwable f424148g;

    public e0(java.lang.Throwable th6) {
        this.f424148g = th6;
    }

    public final java.lang.Throwable A() {
        java.lang.Throwable th6 = this.f424148g;
        return th6 == null ? new u26.f0("Channel was closed") : th6;
    }

    @Override // u26.u0
    public java.lang.Object d() {
        return this;
    }

    @Override // u26.u0
    public void g(java.lang.Object obj) {
    }

    @Override // u26.u0
    public kotlinx.coroutines.internal.l0 h(java.lang.Object obj, kotlinx.coroutines.internal.q qVar) {
        kotlinx.coroutines.internal.l0 l0Var = kotlinx.coroutines.s.f310580a;
        if (qVar != null) {
            qVar.d();
        }
        return l0Var;
    }

    @Override // kotlinx.coroutines.internal.t
    public java.lang.String toString() {
        return "Closed@" + kotlinx.coroutines.c1.a(this) + '[' + this.f424148g + ']';
    }

    @Override // u26.w0
    public void u() {
    }

    @Override // u26.w0
    public java.lang.Object w() {
        return this;
    }

    @Override // u26.w0
    public void x(u26.e0 e0Var) {
    }

    @Override // u26.w0
    public kotlinx.coroutines.internal.l0 y(kotlinx.coroutines.internal.q qVar) {
        kotlinx.coroutines.internal.l0 l0Var = kotlinx.coroutines.s.f310580a;
        if (qVar != null) {
            qVar.d();
        }
        return l0Var;
    }
}
