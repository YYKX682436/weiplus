package j82;

/* loaded from: classes8.dex */
public class f implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j82.g f298155d;

    public f(j82.g gVar) {
        this.f298155d = gVar;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        android.content.Intent intent = new android.content.Intent();
        int itemId = menuItem.getItemId();
        j82.g gVar = this.f298155d;
        if (itemId == 0) {
            intent.putExtra("key_fav_scene", 4);
            intent.putExtra("key_fav_item_id", gVar.f298156d.f100257f.field_localId);
            o72.x1.L0(gVar.f298156d.getContext(), ".ui.FavTagEditUI", intent, null);
        } else {
            if (itemId != 1) {
                return;
            }
            o72.x1.k(gVar.f298156d.f100257f, null, 3);
            gVar.f298156d.finish();
        }
    }
}
