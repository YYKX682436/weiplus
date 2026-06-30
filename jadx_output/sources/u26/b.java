package u26;

/* loaded from: classes14.dex */
public class b extends u26.s0 {

    /* renamed from: g, reason: collision with root package name */
    public final kotlinx.coroutines.q f424137g;

    /* renamed from: h, reason: collision with root package name */
    public final int f424138h;

    public b(kotlinx.coroutines.q qVar, int i17) {
        this.f424137g = qVar;
        this.f424138h = i17;
    }

    @Override // u26.u0
    public void g(java.lang.Object obj) {
        kotlinx.coroutines.r rVar = (kotlinx.coroutines.r) this.f424137g;
        rVar.h(rVar.resumeMode);
    }

    @Override // u26.u0
    public kotlinx.coroutines.internal.l0 h(java.lang.Object obj, kotlinx.coroutines.internal.q qVar) {
        if (((kotlinx.coroutines.r) this.f424137g).w(this.f424138h == 1 ? new u26.c0(obj) : obj, qVar != null ? qVar.f310518c : null, u(obj)) == null) {
            return null;
        }
        if (qVar != null) {
            qVar.d();
        }
        return kotlinx.coroutines.s.f310580a;
    }

    @Override // kotlinx.coroutines.internal.t
    public java.lang.String toString() {
        return "ReceiveElement@" + kotlinx.coroutines.c1.a(this) + "[receiveMode=" + this.f424138h + ']';
    }

    @Override // u26.s0
    public void w(u26.e0 e0Var) {
        int i17 = this.f424138h;
        kotlinx.coroutines.q qVar = this.f424137g;
        if (i17 == 1) {
            qVar.resumeWith(kotlin.Result.m521constructorimpl(new u26.c0(new u26.a0(e0Var.f424148g))));
        } else {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            qVar.resumeWith(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(e0Var.A())));
        }
    }
}
