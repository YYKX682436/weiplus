package e33;

/* loaded from: classes10.dex */
public class p1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public int f247430d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.ref.WeakReference f247431e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem f247432f;

    public p1(e33.p0 p0Var) {
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.LinkedList linkedList;
        java.lang.ref.WeakReference weakReference = this.f247431e;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        com.tencent.mm.plugin.gallery.ui.ImageFolderMgrView imageFolderMgrView = (com.tencent.mm.plugin.gallery.ui.ImageFolderMgrView) this.f247431e.get();
        com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem = this.f247432f;
        int i17 = this.f247430d;
        imageFolderMgrView.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageFolderMgrView", "checkFolderAlbumCount: count=%d", java.lang.Integer.valueOf(i17));
        e33.c2 c2Var = imageFolderMgrView.f138564i;
        if (com.tencent.mm.sdk.platformtools.t8.K0(c2Var.f247185f) || (linkedList = c2Var.f247184e) == null || linkedList.size() == 0) {
            java.util.Objects.toString(c2Var.f247184e);
            return;
        }
        for (int i18 = 0; i18 < c2Var.f247184e.size(); i18++) {
            com.tencent.mm.plugin.gallery.model.GalleryItem$AlbumItem galleryItem$AlbumItem = (com.tencent.mm.plugin.gallery.model.GalleryItem$AlbumItem) c2Var.f247184e.get(i18);
            if (galleryItem$AlbumItem != null && !galleryItem$AlbumItem.f138421m && !galleryItem$AlbumItem.f138422n && c2Var.f247185f.equals(galleryItem$AlbumItem.f138415d)) {
                if (i17 != galleryItem$AlbumItem.f138417f) {
                    galleryItem$AlbumItem.f138417f = i17;
                }
                galleryItem$AlbumItem.f138423o = false;
                if (galleryItem$MediaItem != null && galleryItem$AlbumItem.f138420i != null && !com.tencent.mm.sdk.platformtools.t8.K0(galleryItem$MediaItem.o()) && !galleryItem$AlbumItem.n().equals(galleryItem$MediaItem.o())) {
                    galleryItem$AlbumItem.f138420i.f138433h = galleryItem$MediaItem.o();
                }
                c2Var.notifyDataSetChanged();
                return;
            }
        }
    }
}
