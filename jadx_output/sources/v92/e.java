package v92;

/* loaded from: classes15.dex */
public final class e implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v92.g f434156d;

    public e(v92.g gVar) {
        this.f434156d = gVar;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        v92.g gVar = this.f434156d;
        if (itemId == 20005) {
            gVar.h();
        } else {
            if (itemId != 20012) {
                return;
            }
            gVar.i();
        }
    }
}
