package e33;

/* loaded from: classes10.dex */
public class a3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e33.b3 f247118d;

    public a3(e33.b3 b3Var) {
        this.f247118d = b3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        e33.b3 b3Var = this.f247118d;
        com.tencent.mm.plugin.gallery.ui.ImageFolderMgrView imageFolderMgrView = b3Var.f247157d;
        imageFolderMgrView.f138564i.a(imageFolderMgrView.f138569q, imageFolderMgrView.f138568p);
        com.tencent.mm.plugin.gallery.ui.ImageFolderMgrView imageFolderMgrView2 = b3Var.f247157d;
        imageFolderMgrView2.f138569q = null;
        imageFolderMgrView2.f138568p.clear();
        b3Var.f247157d.f138564i.notifyDataSetChanged();
    }
}
