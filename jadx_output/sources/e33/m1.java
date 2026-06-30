package e33;

/* loaded from: classes10.dex */
public class m1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e33.n1 f247354d;

    public m1(e33.n1 n1Var) {
        this.f247354d = n1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI albumPreviewUI;
        java.lang.ref.WeakReference weakReference = this.f247354d.f247379d;
        if (weakReference == null || (albumPreviewUI = (com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI) weakReference.get()) == null) {
            return;
        }
        albumPreviewUI.setSmartGalleryEntryVisibility(true);
        albumPreviewUI.f138527l2 = true;
    }
}
