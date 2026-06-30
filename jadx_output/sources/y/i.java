package y;

/* loaded from: classes14.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z.l2 f458366d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(z.l2 l2Var) {
        super(0);
        this.f458366d = l2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        z.l2 l2Var = this.f458366d;
        java.lang.Object b17 = l2Var.b();
        y.g0 g0Var = y.g0.Visible;
        return java.lang.Boolean.valueOf(b17 == g0Var || l2Var.d() == g0Var);
    }
}
