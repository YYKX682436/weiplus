package y80;

/* loaded from: classes2.dex */
public final class j1 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y80.n1 f459869d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f459870e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ z80.s0 f459871f;

    public j1(y80.n1 n1Var, android.content.Context context, z80.s0 s0Var) {
        this.f459869d = n1Var;
        this.f459870e = context;
        this.f459871f = s0Var;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        y80.n1.Ai(this.f459869d, this.f459870e, menuItem, i17, this.f459871f);
    }
}
