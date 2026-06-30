package gx0;

/* loaded from: classes5.dex */
public final class s5 implements hx0.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gx0.w8 f276943a;

    public s5(gx0.w8 w8Var) {
        this.f276943a = w8Var;
    }

    @Override // hx0.b
    public void a() {
        kotlinx.coroutines.r2 r2Var = this.f276943a.f277117t;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
    }

    @Override // hx0.b
    public boolean b() {
        if (this.f276943a.f277115r != gx0.y4.f277206m) {
            return false;
        }
        kotlinx.coroutines.r2 r2Var = this.f276943a.f277117t;
        return r2Var != null && r2Var.a();
    }
}
