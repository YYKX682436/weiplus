package db5;

/* loaded from: classes8.dex */
public class n0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ db5.c1 f228443d;

    public n0(db5.c1 c1Var) {
        this.f228443d = c1Var;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        db5.c1 c1Var = this.f228443d;
        if (c1Var != null) {
            c1Var.e(menuItem.getItemId());
        }
    }
}
