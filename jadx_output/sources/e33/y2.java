package e33;

/* loaded from: classes10.dex */
public class y2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gallery.ui.ImageFolderMgrView f247552d;

    public y2(com.tencent.mm.plugin.gallery.ui.ImageFolderMgrView imageFolderMgrView) {
        this.f247552d = imageFolderMgrView;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI albumPreviewUI;
        com.tencent.mm.plugin.gallery.ui.ImageFolderMgrView imageFolderMgrView;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/gallery/ui/ImageFolderMgrView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        e33.f3 f3Var = this.f247552d.f138571s;
        if (f3Var != null && (imageFolderMgrView = (albumPreviewUI = ((e33.y0) f3Var).f247549a).f138540r) != null && imageFolderMgrView.f138565m) {
            imageFolderMgrView.d();
            albumPreviewUI.playActionBarOperationAreaAnim();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/gallery/ui/ImageFolderMgrView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
