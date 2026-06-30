package e33;

/* loaded from: classes3.dex */
public class q3 implements android.view.View.OnClickListener {
    public q3(com.tencent.mm.plugin.gallery.ui.ImagePreviewUI imagePreviewUI) {
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/gallery/ui/ImagePreviewUI$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/gallery/ui/ImagePreviewUI$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
