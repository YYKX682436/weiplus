package db5;

/* loaded from: classes8.dex */
public class l0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ db5.d1 f228427d;

    public l0(db5.d1 d1Var) {
        this.f228427d = d1Var;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        db5.d1 d1Var = this.f228427d;
        if (d1Var != null) {
            d1Var.a(i17, menuItem.getItemId());
        }
    }
}
