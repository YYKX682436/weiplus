package e33;

/* loaded from: classes10.dex */
public class c3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gallery.ui.ImageFolderMgrView f247188d;

    public c3(com.tencent.mm.plugin.gallery.ui.ImageFolderMgrView imageFolderMgrView) {
        this.f247188d = imageFolderMgrView;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.gallery.ui.ImageFolderMgrView imageFolderMgrView = this.f247188d;
        imageFolderMgrView.f138564i.a(imageFolderMgrView.f138569q, imageFolderMgrView.f138568p);
        imageFolderMgrView.f138569q = null;
        imageFolderMgrView.f138568p.clear();
        imageFolderMgrView.f138564i.notifyDataSetChanged();
    }
}
