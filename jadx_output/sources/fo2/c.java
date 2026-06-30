package fo2;

/* loaded from: classes2.dex */
public final class c implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fo2.e f264898d;

    public c(fo2.e eVar) {
        this.f264898d = eVar;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        fo2.e eVar = this.f264898d;
        if (itemId == 20002) {
            eVar.getClass();
            eVar.r();
            return;
        }
        if (itemId == 20003) {
            eVar.getClass();
            eVar.getClass();
        } else if (itemId == 20005) {
            eVar.h();
        } else if (itemId == 20008) {
            eVar.B();
        } else {
            if (itemId != 20009) {
                return;
            }
            eVar.C();
        }
    }
}
