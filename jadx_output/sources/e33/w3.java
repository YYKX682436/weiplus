package e33;

/* loaded from: classes3.dex */
public class w3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gallery.ui.ImagePreviewUI f247525d;

    public w3(com.tencent.mm.plugin.gallery.ui.ImagePreviewUI imagePreviewUI) {
        this.f247525d = imagePreviewUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/gallery/ui/ImagePreviewUI$18", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.gallery.ui.ImagePreviewUI imagePreviewUI = this.f247525d;
        boolean z17 = !imagePreviewUI.J1;
        imagePreviewUI.J1 = z17;
        imagePreviewUI.L1.setChecked(z17);
        yj0.a.h(this, "com/tencent/mm/plugin/gallery/ui/ImagePreviewUI$18", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
