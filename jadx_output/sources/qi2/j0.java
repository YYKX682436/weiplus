package qi2;

/* loaded from: classes10.dex */
public final class j0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qi2.k0 f363534d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(qi2.k0 k0Var) {
        super(0);
        this.f363534d = k0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        fj2.s.c(fj2.s.f263183a, ml2.q2.E, null, null, 0, 0, 30, null);
        qi2.k0 k0Var = this.f363534d;
        qo0.c f17 = k0Var.f363553h.f();
        qo0.b bVar = qo0.b.M3;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("PARAM_FINDER_LIVE_SELF_EXIT_PK", true);
        bundle.putBoolean("PARAM_FINDER_LIVE_IS_NEED_TOAST_MIC", true);
        f17.statusChange(bVar, bundle);
        k0Var.a();
        return jz5.f0.f302826a;
    }
}
