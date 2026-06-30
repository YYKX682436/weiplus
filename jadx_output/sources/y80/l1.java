package y80;

/* loaded from: classes2.dex */
public final class l1 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y80.n1 f459880d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f459881e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ z80.s0 f459882f;

    public l1(y80.n1 n1Var, android.content.Context context, z80.s0 s0Var) {
        this.f459880d = n1Var;
        this.f459881e = context;
        this.f459882f = s0Var;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        y80.n1.Ai(this.f459880d, this.f459881e, menuItem, i17, this.f459882f);
    }
}
