package hb2;

/* loaded from: classes2.dex */
public final class d0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.y f280032d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f280033e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ hb2.e0 f280034f;

    public d0(androidx.lifecycle.y yVar, long j17, hb2.e0 e0Var) {
        this.f280032d = yVar;
        this.f280033e = j17;
        this.f280034f = e0Var;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 1) {
            hb2.f0.f280042e.n(this.f280032d, false, this.f280033e, this.f280034f);
        }
    }
}
