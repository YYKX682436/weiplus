package hb2;

/* loaded from: classes.dex */
public final class h0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.y f280049d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f280050e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f280051f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f280052g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ hb2.i0 f280053h;

    public h0(androidx.lifecycle.y yVar, int i17, long j17, java.lang.String str, hb2.i0 i0Var) {
        this.f280049d = yVar;
        this.f280050e = i17;
        this.f280051f = j17;
        this.f280052g = str;
        this.f280053h = i0Var;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 1) {
            hb2.j0.f280060e.n(this.f280049d, this.f280050e, this.f280051f, this.f280052g, this.f280053h);
        }
    }
}
