package h63;

/* loaded from: classes7.dex */
public final class z implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h63.v0 f279303d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f279304e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f279305f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f279306g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ h63.l1 f279307h;

    public z(h63.v0 v0Var, java.lang.String str, android.content.Context context, int i17, h63.l1 l1Var) {
        this.f279303d = v0Var;
        this.f279304e = str;
        this.f279305f = context;
        this.f279306g = i17;
        this.f279307h = l1Var;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        java.lang.String str = this.f279304e;
        h63.v0 v0Var = this.f279303d;
        h63.v0.wi(v0Var, str, this.f279305f, true);
        com.tencent.mm.plugin.appbrand.menu.u[] uVarArr = com.tencent.mm.plugin.appbrand.menu.u.f85992d;
        v0Var.Di(0, this.f279306g, null);
        h63.l1 l1Var = this.f279307h;
        if (l1Var != null) {
            mc1.b bVar = (mc1.b) l1Var;
            bVar.f325577a.a(bVar.f325578b, bVar.f325579c.o("ok"));
        }
    }
}
