package e33;

/* loaded from: classes10.dex */
public class i5 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gallery.ui.SelectAlbumPreviewFolderUI f247288d;

    public i5(com.tencent.mm.plugin.gallery.ui.SelectAlbumPreviewFolderUI selectAlbumPreviewFolderUI) {
        this.f247288d = selectAlbumPreviewFolderUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f247288d.finish();
        return false;
    }
}
