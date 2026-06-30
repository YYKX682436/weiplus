package e33;

/* loaded from: classes10.dex */
public class b3 implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gallery.ui.ImageFolderMgrView f247157d;

    public b3(com.tencent.mm.plugin.gallery.ui.ImageFolderMgrView imageFolderMgrView) {
        this.f247157d = imageFolderMgrView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        com.tencent.mm.plugin.gallery.ui.ImageFolderMgrView imageFolderMgrView = this.f247157d;
        if (imageFolderMgrView.f138569q == null && imageFolderMgrView.f138568p.size() <= 0) {
            return true;
        }
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = java.lang.Integer.valueOf(imageFolderMgrView.f138568p.size());
        objArr[1] = java.lang.Boolean.valueOf(imageFolderMgrView.f138569q != null);
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageFolderMgrView", "onPreDraw pAlbums size=%d, had favoriteAlbum=%s", objArr);
        t23.p0.n().c(new e33.a3(this));
        return false;
    }
}
