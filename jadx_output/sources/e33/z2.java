package e33;

/* loaded from: classes10.dex */
public class z2 implements t23.k1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gallery.ui.ImageFolderMgrView f247562d;

    public z2(com.tencent.mm.plugin.gallery.ui.ImageFolderMgrView imageFolderMgrView) {
        this.f247562d = imageFolderMgrView;
    }

    @Override // t23.k1
    public void F6(java.util.LinkedList linkedList) {
        java.util.LinkedList linkedList2;
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = linkedList != null ? java.lang.Integer.valueOf(linkedList.size()) : "res is null.";
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageFolderMgrView", "onGetPrivateAlbum, %s.", objArr);
        t23.x1 k17 = t23.p0.k();
        com.tencent.mm.plugin.gallery.ui.ImageFolderMgrView imageFolderMgrView = this.f247562d;
        k17.f415293b.remove(imageFolderMgrView.f138567o);
        if (linkedList == null || linkedList.size() <= 0) {
            return;
        }
        java.util.Iterator it = linkedList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            linkedList2 = imageFolderMgrView.f138568p;
            if (!hasNext) {
                break;
            }
            com.tencent.mm.plugin.gallery.model.GalleryItem$AlbumItem galleryItem$AlbumItem = (com.tencent.mm.plugin.gallery.model.GalleryItem$AlbumItem) it.next();
            if (galleryItem$AlbumItem instanceof com.tencent.mm.plugin.gallery.model.PrivateAlbumItem) {
                com.tencent.mm.plugin.gallery.model.PrivateAlbumItem privateAlbumItem = (com.tencent.mm.plugin.gallery.model.PrivateAlbumItem) galleryItem$AlbumItem;
                t23.g2 g2Var = privateAlbumItem.f138449p.f415153h;
                if (g2Var == null ? false : g2Var.f415157d) {
                    imageFolderMgrView.f138569q = privateAlbumItem;
                } else {
                    linkedList2.add(privateAlbumItem);
                }
            }
        }
        java.lang.Object[] objArr2 = new java.lang.Object[2];
        objArr2[0] = java.lang.Integer.valueOf(linkedList2.size());
        objArr2[1] = java.lang.Boolean.valueOf(imageFolderMgrView.f138569q != null);
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageFolderMgrView", "filter res: %s. had favoriteAlbum: %s", objArr2);
        if (imageFolderMgrView.isInLayout()) {
            return;
        }
        if (imageFolderMgrView.f138569q != null || linkedList2.size() > 0) {
            t23.p0.n().c(new e33.c3(imageFolderMgrView));
        }
    }
}
