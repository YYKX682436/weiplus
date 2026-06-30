package e33;

/* loaded from: classes10.dex */
public class f1 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI f247218d;

    public f1(com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI albumPreviewUI) {
        this.f247218d = albumPreviewUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI albumPreviewUI = this.f247218d;
        if (1 != itemId) {
            return albumPreviewUI.N7();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AlbumPreviewUI", "go smart gallery.");
        o23.m.f342426a.f342429c = 1;
        android.net.Uri uri = t23.o2.f415216e;
        t23.o2 o2Var = t23.n2.f415209a;
        java.util.ArrayList arrayList = albumPreviewUI.f138528m.f247131g;
        o2Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.SmartGalleryQueryUtil", "clearSelectedMediaPath");
        java.util.ArrayList arrayList2 = (java.util.ArrayList) o2Var.f415220d;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        android.content.Intent intent = new android.content.Intent(albumPreviewUI, (java.lang.Class<?>) com.tencent.mm.plugin.gallery.ui.SmartGalleryUI.class);
        intent.putExtra("select_type_tag", 2);
        intent.putExtras(albumPreviewUI.getIntent());
        intent.removeExtra("album_query_session_id");
        intent.putExtra("send_raw_img", albumPreviewUI.D);
        albumPreviewUI.startActivityForResult(intent, 4382);
        return true;
    }
}
