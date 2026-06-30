package e33;

/* loaded from: classes10.dex */
public class n0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI f247378d;

    public n0(com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI albumPreviewUI) {
        this.f247378d = albumPreviewUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/gallery/ui/AlbumPreviewUI$18", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI albumPreviewUI = this.f247378d;
        boolean z17 = !albumPreviewUI.V1;
        albumPreviewUI.V1 = z17;
        albumPreviewUI.X1.setChecked(z17);
        yj0.a.h(this, "com/tencent/mm/plugin/gallery/ui/AlbumPreviewUI$18", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
