package nu0;

/* loaded from: classes5.dex */
public final class r1 implements hx0.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nu0.b4 f340086a;

    public r1(nu0.b4 b4Var) {
        this.f340086a = b4Var;
    }

    @Override // hx0.b
    public void a() {
        kotlinx.coroutines.r2 r2Var = this.f340086a.f339881q;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
    }

    @Override // hx0.b
    public boolean b() {
        if (this.f340086a.f339878o != nu0.c1.f339900m) {
            return false;
        }
        kotlinx.coroutines.r2 r2Var = this.f340086a.f339881q;
        return r2Var != null && r2Var.a();
    }
}
