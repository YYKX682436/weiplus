package gx0;

/* loaded from: classes5.dex */
public final class g3 implements fy0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gx0.y3 f276446a;

    public g3(gx0.y3 y3Var) {
        this.f276446a = y3Var;
    }

    @Override // fy0.a
    public void a(int i17) {
        gx0.y3 y3Var = this.f276446a;
        if (i17 == 0) {
            kotlinx.coroutines.l.d(y3Var.getMainScope(), null, null, new gx0.e3(y3Var, null), 3, null);
        } else {
            if (i17 != 1) {
                return;
            }
            kotlinx.coroutines.l.d(y3Var.getMainScope(), null, null, new gx0.f3(y3Var, null), 3, null);
        }
    }
}
