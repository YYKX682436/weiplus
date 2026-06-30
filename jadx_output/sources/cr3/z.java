package cr3;

/* loaded from: classes8.dex */
public class z implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cr3.d0 f221970d;

    public z(cr3.d0 d0Var) {
        this.f221970d = d0Var;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.tencent.mars.xlog.Log.i("MicroMsg.ProfileMenuManager", "onMMMenuItemSelected() called with: menuItemId = [" + itemId + "], index = [" + i17 + "]");
        cr3.d0 d0Var = this.f221970d;
        if (itemId == 11) {
            d0Var.g(false);
        } else if (itemId == 12) {
            d0Var.g(true);
        }
    }
}
