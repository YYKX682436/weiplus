package ix3;

/* loaded from: classes.dex */
public final class c0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ix3.e0 f295374d;

    public c0(ix3.e0 e0Var) {
        this.f295374d = e0Var;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 1) {
            pm0.v.O("SharedBlockDetectList", new ix3.b0(this.f295374d));
        }
    }
}
