package e33;

/* loaded from: classes10.dex */
public class j5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f247296d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gallery.ui.SelectAlbumPreviewFolderUI f247297e;

    public j5(com.tencent.mm.plugin.gallery.ui.SelectAlbumPreviewFolderUI selectAlbumPreviewFolderUI, java.util.LinkedList linkedList) {
        this.f247297e = selectAlbumPreviewFolderUI;
        this.f247296d = linkedList;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.gallery.ui.SelectAlbumPreviewFolderUI selectAlbumPreviewFolderUI = this.f247297e;
        selectAlbumPreviewFolderUI.f138616d.addAll(this.f247296d);
        selectAlbumPreviewFolderUI.f138617e.notifyDataSetChanged();
    }
}
