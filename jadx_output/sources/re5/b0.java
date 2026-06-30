package re5;

/* loaded from: classes12.dex */
public final class b0 implements m34.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ re5.d0 f394560d;

    public b0(re5.d0 d0Var) {
        this.f394560d = d0Var;
    }

    @Override // m34.e
    public void a(int i17) {
        re5.d0 d0Var = this.f394560d;
        fg3.p pVar = (fg3.p) d0Var.g(fg3.p.class);
        if (pVar != null) {
            ((fg3.v) pVar).W(i17 * 1000);
        }
        d0Var.e(true);
    }

    @Override // m34.e
    public void b() {
        re5.d0 d0Var = this.f394560d;
        d0Var.e(false);
    }

    @Override // m34.e
    public void d(int i17) {
        fg3.p pVar = (fg3.p) this.f394560d.g(fg3.p.class);
        if (pVar != null) {
            ((fg3.v) pVar).X(i17 * 1000);
        }
    }
}
