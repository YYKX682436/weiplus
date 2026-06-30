package tv0;

/* loaded from: classes5.dex */
public final class r implements fy0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tv0.j0 f422238a;

    public r(tv0.j0 j0Var) {
        this.f422238a = j0Var;
    }

    @Override // fy0.a
    public void a(int i17) {
        tv0.j0 j0Var = this.f422238a;
        if (i17 == 0) {
            kotlinx.coroutines.l.d(j0Var.getMainScope(), null, null, new tv0.p(j0Var, null), 3, null);
        } else {
            if (i17 != 1) {
                return;
            }
            kotlinx.coroutines.l.d(j0Var.getMainScope(), null, null, new tv0.q(j0Var, null), 3, null);
        }
    }
}
