package u26;

/* loaded from: classes14.dex */
public class d extends u26.s0 {

    /* renamed from: g, reason: collision with root package name */
    public final u26.a f424142g;

    /* renamed from: h, reason: collision with root package name */
    public final kotlinx.coroutines.q f424143h;

    public d(u26.a aVar, kotlinx.coroutines.q qVar) {
        this.f424142g = aVar;
        this.f424143h = qVar;
    }

    @Override // u26.u0
    public void g(java.lang.Object obj) {
        this.f424142g.f424134b = obj;
        ((kotlinx.coroutines.r) this.f424143h).e(kotlinx.coroutines.s.f310580a);
    }

    @Override // u26.u0
    public kotlinx.coroutines.internal.l0 h(java.lang.Object obj, kotlinx.coroutines.internal.q qVar) {
        if (((kotlinx.coroutines.r) this.f424143h).w(java.lang.Boolean.TRUE, qVar != null ? qVar.f310518c : null, u(obj)) == null) {
            return null;
        }
        if (qVar != null) {
            qVar.d();
        }
        return kotlinx.coroutines.s.f310580a;
    }

    @Override // kotlinx.coroutines.internal.t
    public java.lang.String toString() {
        return "ReceiveHasNext@" + kotlinx.coroutines.c1.a(this);
    }

    @Override // u26.s0
    public yz5.l u(java.lang.Object obj) {
        yz5.l lVar = this.f424142g.f424133a.f424181d;
        if (lVar != null) {
            return new kotlinx.coroutines.internal.c0(lVar, obj, ((kotlinx.coroutines.r) this.f424143h).f310577e);
        }
        return null;
    }

    @Override // u26.s0
    public void w(u26.e0 e0Var) {
        kotlinx.coroutines.internal.l0 w17;
        java.lang.Throwable th6 = e0Var.f424148g;
        kotlinx.coroutines.q qVar = this.f424143h;
        if (th6 == null) {
            w17 = ((kotlinx.coroutines.r) qVar).w(java.lang.Boolean.FALSE, null, null);
        } else {
            java.lang.Throwable A = e0Var.A();
            kotlinx.coroutines.r rVar = (kotlinx.coroutines.r) qVar;
            rVar.getClass();
            w17 = rVar.w(new kotlinx.coroutines.e0(A, false, 2, null), null, null);
        }
        if (w17 != null) {
            this.f424142g.f424134b = e0Var;
            ((kotlinx.coroutines.r) qVar).e(w17);
        }
    }
}
