package h63;

/* loaded from: classes7.dex */
public final class k0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h63.v0 f279253d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f279254e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f279255f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f279256g;

    public k0(h63.v0 v0Var, java.lang.String str, android.content.Context context, java.lang.Runnable runnable) {
        this.f279253d = v0Var;
        this.f279254e = str;
        this.f279255f = context;
        this.f279256g = runnable;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        java.lang.String str = this.f279254e;
        h63.v0 v0Var = this.f279253d;
        h63.v0.wi(v0Var, str, this.f279255f, false);
        com.tencent.mm.plugin.appbrand.menu.u[] uVarArr = com.tencent.mm.plugin.appbrand.menu.u.f85992d;
        com.tencent.mm.plugin.appbrand.menu.t[] tVarArr = com.tencent.mm.plugin.appbrand.menu.t.f85989d;
        v0Var.Di(0, 2, null);
        this.f279256g.run();
    }
}
