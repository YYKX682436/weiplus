package e33;

/* loaded from: classes10.dex */
public class l0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI f247315d;

    public l0(com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI albumPreviewUI) {
        this.f247315d = albumPreviewUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AlbumPreviewUI", "backBtn");
        com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI albumPreviewUI = this.f247315d;
        albumPreviewUI.J7();
        albumPreviewUI.T7(-2, albumPreviewUI.getIntent().putExtra("send_raw_img", albumPreviewUI.D));
        com.tencent.mm.plugin.gallery.ui.ImageFolderMgrView imageFolderMgrView = albumPreviewUI.f138540r;
        if (imageFolderMgrView == null || !imageFolderMgrView.f138565m) {
            albumPreviewUI.getClass();
            albumPreviewUI.finish();
            return true;
        }
        imageFolderMgrView.d();
        albumPreviewUI.playActionBarOperationAreaAnim();
        return true;
    }
}
