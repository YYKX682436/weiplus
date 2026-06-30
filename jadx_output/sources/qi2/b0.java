package qi2;

/* loaded from: classes10.dex */
public final class b0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qi2.c0 f363498d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(qi2.c0 c0Var) {
        super(0);
        this.f363498d = c0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        fj2.s.c(fj2.s.f263183a, ml2.q2.E, null, null, 0, 0, 30, null);
        qi2.c0 c0Var = this.f363498d;
        qo0.c cVar = c0Var.f363502h.f113325g;
        qo0.b bVar = qo0.b.M3;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("PARAM_FINDER_LIVE_SELF_EXIT_PK", true);
        bundle.putBoolean("PARAM_FINDER_LIVE_IS_NEED_TOAST_MIC", true);
        cVar.statusChange(bVar, bundle);
        c0Var.a();
        return jz5.f0.f302826a;
    }
}
