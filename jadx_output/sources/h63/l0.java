package h63;

/* loaded from: classes.dex */
public final class l0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f279259d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h63.v0 f279260e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f279261f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f279262g;

    public l0(android.content.Context context, h63.v0 v0Var, java.lang.String str, java.lang.Runnable runnable) {
        this.f279259d = context;
        this.f279260e = v0Var;
        this.f279261f = str;
        this.f279262g = runnable;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        android.content.Context context = this.f279259d;
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(context, 1, false);
        k0Var.f211872n = new h63.j0(context);
        k0Var.f211881s = new h63.k0(this.f279260e, this.f279261f, context, this.f279262g);
        k0Var.v();
    }
}
