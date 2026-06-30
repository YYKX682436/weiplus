package e33;

/* loaded from: classes10.dex */
public class f0 implements e33.g3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI f247217a;

    public f0(com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI albumPreviewUI) {
        this.f247217a = albumPreviewUI;
    }

    public void a(boolean z17) {
        com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI albumPreviewUI = this.f247217a;
        if (z17) {
            if (albumPreviewUI.f138527l2) {
                albumPreviewUI.setSmartGalleryEntryVisibility(false);
                return;
            }
            return;
        }
        if (albumPreviewUI.f138527l2 && !albumPreviewUI.f138540r.getSelectedAlbumName().equalsIgnoreCase(albumPreviewUI.getString(com.tencent.mm.R.string.fih))) {
            albumPreviewUI.setSmartGalleryEntryVisibility(true);
        }
        com.tencent.mm.plugin.gallery.model.GalleryItem$AlbumItem galleryItem$AlbumItem = albumPreviewUI.f138514d2;
        if (galleryItem$AlbumItem != null) {
            if (albumPreviewUI.G7(galleryItem$AlbumItem).booleanValue()) {
                albumPreviewUI.playActionBarOperationAreaAnim();
            } else {
                albumPreviewUI.S7(albumPreviewUI.f138514d2);
            }
        }
    }
}
