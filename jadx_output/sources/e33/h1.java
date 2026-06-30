package e33;

/* loaded from: classes4.dex */
public class h1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI f247244d;

    public h1(com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI albumPreviewUI) {
        this.f247244d = albumPreviewUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/gallery/ui/AlbumPreviewUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI albumPreviewUI = this.f247244d;
        albumPreviewUI.f138545v.performClick();
        if (albumPreviewUI.D) {
            albumPreviewUI.f138543t.setContentDescription(albumPreviewUI.getResources().getString(com.tencent.mm.R.string.fhk));
        } else {
            albumPreviewUI.f138543t.setContentDescription(albumPreviewUI.getResources().getString(com.tencent.mm.R.string.fhm));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/gallery/ui/AlbumPreviewUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
