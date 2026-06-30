package e33;

/* loaded from: classes5.dex */
public class p3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gallery.ui.ImagePreviewUI f247434d;

    public p3(com.tencent.mm.plugin.gallery.ui.ImagePreviewUI imagePreviewUI) {
        this.f247434d = imagePreviewUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/gallery/ui/ImagePreviewUI$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.gallery.ui.ImagePreviewUI imagePreviewUI = this.f247434d;
        imagePreviewUI.D.performClick();
        if (imagePreviewUI.E) {
            imagePreviewUI.F.setContentDescription(imagePreviewUI.getResources().getString(com.tencent.mm.R.string.fhk));
        } else {
            imagePreviewUI.F.setContentDescription(imagePreviewUI.getResources().getString(com.tencent.mm.R.string.fhm));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/gallery/ui/ImagePreviewUI$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
