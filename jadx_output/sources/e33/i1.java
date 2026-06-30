package e33;

/* loaded from: classes10.dex */
public class i1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI f247285d;

    public i1(com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI albumPreviewUI) {
        this.f247285d = albumPreviewUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/gallery/ui/AlbumPreviewUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI albumPreviewUI = this.f247285d;
        albumPreviewUI.D = !albumPreviewUI.D;
        if (t21.d3.s() && albumPreviewUI.E1 == 3) {
            e33.b0 b0Var = albumPreviewUI.f138528m;
            b0Var.f247137p = albumPreviewUI.D;
            b0Var.notifyDataSetChanged();
        }
        if (t21.d3.s()) {
            com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI.c7(albumPreviewUI);
        } else {
            com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI.e7(albumPreviewUI);
        }
        albumPreviewUI.f138543t.setText(albumPreviewUI.getContext().getString(com.tencent.mm.R.string.f492182fj0));
        if (albumPreviewUI.D || albumPreviewUI.H) {
            albumPreviewUI.b8(true);
            if (albumPreviewUI.h7()) {
                albumPreviewUI.R7();
            } else {
                albumPreviewUI.f138544u.setVisibility(8);
            }
        } else {
            albumPreviewUI.b8(false);
            albumPreviewUI.f138544u.setVisibility(8);
            if (t21.d3.s()) {
                albumPreviewUI.c8(albumPreviewUI.f138528m.J());
            }
        }
        if (!t21.d3.s()) {
            i33.g gVar = (i33.g) pf5.z.f353948a.a(albumPreviewUI).a(i33.g.class);
            int size = albumPreviewUI.f138528m.f247131g.size();
            gVar.getClass();
            gVar.k6(size > 0);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/gallery/ui/AlbumPreviewUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
