package hr3;

/* loaded from: classes11.dex */
public class ea implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hr3.va f283519d;

    public ea(hr3.va vaVar) {
        this.f283519d = vaVar;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        hr3.va vaVar = this.f283519d;
        if (itemId == 1) {
            vaVar.f284109e.M();
        } else {
            if (itemId != 2) {
                return;
            }
            vaVar.f284109e.N();
        }
    }
}
