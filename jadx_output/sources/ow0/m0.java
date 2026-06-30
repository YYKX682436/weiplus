package ow0;

/* loaded from: classes5.dex */
public final class m0 implements fy0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gx0.u2 f349335a;

    public m0(gx0.u2 u2Var) {
        this.f349335a = u2Var;
    }

    @Override // fy0.a
    public void a(int i17) {
        gx0.u2 u2Var = this.f349335a;
        if (i17 == 0) {
            kotlinx.coroutines.l.d(u2Var.getMainScope(), null, null, new ow0.k0(u2Var, null), 3, null);
        } else {
            if (i17 != 1) {
                return;
            }
            kotlinx.coroutines.l.d(u2Var.getMainScope(), null, null, new ow0.l0(u2Var, null), 3, null);
        }
    }
}
