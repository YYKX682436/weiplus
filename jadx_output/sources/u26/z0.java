package u26;

/* loaded from: classes14.dex */
public class z0 extends u26.w0 {

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Object f424202g;

    /* renamed from: h, reason: collision with root package name */
    public final kotlinx.coroutines.q f424203h;

    public z0(java.lang.Object obj, kotlinx.coroutines.q qVar) {
        this.f424202g = obj;
        this.f424203h = qVar;
    }

    @Override // kotlinx.coroutines.internal.t
    public java.lang.String toString() {
        return getClass().getSimpleName() + '@' + kotlinx.coroutines.c1.a(this) + '(' + this.f424202g + ')';
    }

    @Override // u26.w0
    public void u() {
        kotlinx.coroutines.r rVar = (kotlinx.coroutines.r) this.f424203h;
        rVar.h(rVar.resumeMode);
    }

    @Override // u26.w0
    public java.lang.Object w() {
        return this.f424202g;
    }

    @Override // u26.w0
    public void x(u26.e0 e0Var) {
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        java.lang.Throwable th6 = e0Var.f424148g;
        if (th6 == null) {
            th6 = new u26.g0("Channel was closed");
        }
        ((kotlinx.coroutines.r) this.f424203h).resumeWith(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6)));
    }

    @Override // u26.w0
    public kotlinx.coroutines.internal.l0 y(kotlinx.coroutines.internal.q qVar) {
        if (((kotlinx.coroutines.r) this.f424203h).w(jz5.f0.f302826a, qVar != null ? qVar.f310518c : null, null) == null) {
            return null;
        }
        if (qVar != null) {
            qVar.d();
        }
        return kotlinx.coroutines.s.f310580a;
    }
}
