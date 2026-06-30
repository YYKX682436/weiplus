package e33;

/* loaded from: classes10.dex */
public class t4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gallery.ui.ImagePreviewUI f247478d;

    public t4(com.tencent.mm.plugin.gallery.ui.ImagePreviewUI imagePreviewUI) {
        this.f247478d = imagePreviewUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        int i17;
        e33.h5 h5Var;
        int i18;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/gallery/ui/ImagePreviewUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.gallery.ui.ImagePreviewUI imagePreviewUI = this.f247478d;
        boolean z17 = !imagePreviewUI.f138597q;
        imagePreviewUI.f138597q = z17;
        if (z17) {
            imagePreviewUI.F7(true);
            if (imagePreviewUI.f138591m.size() == 0 && !t21.d3.s()) {
                imagePreviewUI.D.performClick();
            }
            if (t21.d3.s() && (((i18 = imagePreviewUI.L) == 3 || i18 == 16) && imagePreviewUI.f138597q)) {
                imagePreviewUI.U6(true);
                imagePreviewUI.Q1.Y0(imagePreviewUI.e7());
                imagePreviewUI.s7();
            } else {
                imagePreviewUI.f138604x.setVisibility(8);
            }
        } else {
            imagePreviewUI.F7(false);
            imagePreviewUI.f138604x.setVisibility(8);
            imagePreviewUI.X6(true);
        }
        imagePreviewUI.f138603w.setText(imagePreviewUI.getContext().getString(com.tencent.mm.R.string.f492182fj0));
        com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem k17 = imagePreviewUI.f138579e.k(imagePreviewUI.f138593o.intValue());
        if (k17 != null) {
            imagePreviewUI.K7(k17);
        }
        if (t21.d3.s() && (((i17 = imagePreviewUI.L) == 3 || i17 == 16) && (h5Var = (e33.h5) imagePreviewUI.f138581f.getAdapter()) != null)) {
            h5Var.f247264o = imagePreviewUI.f138597q;
            h5Var.notifyDataSetChanged();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/gallery/ui/ImagePreviewUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
