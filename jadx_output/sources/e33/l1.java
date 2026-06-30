package e33;

/* loaded from: classes4.dex */
public class l1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI f247316d;

    public l1(com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI albumPreviewUI) {
        this.f247316d = albumPreviewUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/gallery/ui/AlbumPreviewUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI albumPreviewUI = this.f247316d;
        boolean z17 = !albumPreviewUI.H1;
        albumPreviewUI.H1 = z17;
        if (z17) {
            albumPreviewUI.f138547x.setImageResource(com.tencent.mm.R.raw.radio_on);
        } else {
            albumPreviewUI.f138547x.setImageResource(com.tencent.mm.R.raw.radio_off);
        }
        boolean z18 = albumPreviewUI.H1;
        albumPreviewUI.getClass();
        albumPreviewUI.a8(albumPreviewUI.f138528m.J());
        yj0.a.h(this, "com/tencent/mm/plugin/gallery/ui/AlbumPreviewUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
