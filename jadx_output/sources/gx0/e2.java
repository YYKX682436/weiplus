package gx0;

/* loaded from: classes5.dex */
public final class e2 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gx0.u2 f276354d;

    public e2(gx0.u2 u2Var) {
        this.f276354d = u2Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        cx0.f fVar = (cx0.f) obj;
        gx0.u2 u2Var = this.f276354d;
        if (u2Var.S7().f276642r == null || fVar == null) {
            return;
        }
        kotlinx.coroutines.l.d(u2Var.getMainScope(), null, null, new gx0.m2(fVar, u2Var, null), 3, null);
    }
}
