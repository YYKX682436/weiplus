package kf3;

/* loaded from: classes5.dex */
public class w implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kf3.j0 f307455d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kf3.k0 f307456e;

    public w(kf3.k0 k0Var, kf3.j0 j0Var) {
        this.f307456e = k0Var;
        this.f307455d = j0Var;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 1) {
            com.tencent.mm.sdk.platformtools.b0.d(com.tencent.mm.sdk.platformtools.x2.f193071a, this.f307456e.f307383v, this.f307455d.f307365c.getText(), null);
        }
    }
}
