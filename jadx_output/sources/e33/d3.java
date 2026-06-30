package e33;

/* loaded from: classes10.dex */
public class d3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f247197d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gallery.ui.ImageFolderMgrView f247198e;

    public d3(com.tencent.mm.plugin.gallery.ui.ImageFolderMgrView imageFolderMgrView, java.util.LinkedList linkedList) {
        this.f247198e = imageFolderMgrView;
        this.f247197d = linkedList;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.gallery.ui.ImageFolderMgrView imageFolderMgrView = this.f247198e;
        imageFolderMgrView.f138564i.d(this.f247197d);
        imageFolderMgrView.f138564i.notifyDataSetChanged();
    }

    public java.lang.String toString() {
        return super.toString() + "|onQueryAlbumFinished";
    }
}
