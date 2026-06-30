package ns2;

/* loaded from: classes3.dex */
public final class i implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ns2.b f339385d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ns2.j f339386e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ns2.a f339387f;

    public i(ns2.b bVar, ns2.j jVar, ns2.a aVar) {
        this.f339385d = bVar;
        this.f339386e = jVar;
        this.f339387f = aVar;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 4) {
            ns2.b bVar = this.f339385d;
            bVar.f339357c.set(1, 1);
            ml2.i5 i5Var = ml2.i5.f327572g;
            ns2.j jVar = this.f339386e;
            jVar.c(bVar, i5Var, "");
            jVar.a(bVar, this.f339387f, 2);
            android.content.Context context = bVar.f339355a;
            db5.t7.i(context, context.getString(com.tencent.mm.R.string.cn8), com.tencent.mm.R.raw.icons_filled_done);
        }
    }
}
