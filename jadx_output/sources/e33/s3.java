package e33;

/* loaded from: classes3.dex */
public class s3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gallery.ui.ImagePreviewUI f247462d;

    public s3(com.tencent.mm.plugin.gallery.ui.ImagePreviewUI imagePreviewUI) {
        this.f247462d = imagePreviewUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/gallery/ui/ImagePreviewUI$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.gallery.ui.ImagePreviewUI.f138572k2;
        com.tencent.mm.plugin.gallery.ui.ImagePreviewUI imagePreviewUI = this.f247462d;
        imagePreviewUI.h7();
        android.view.View view2 = imagePreviewUI.R;
        if (view2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/gallery/ui/ImagePreviewUI$14", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/gallery/ui/ImagePreviewUI$14", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/gallery/ui/ImagePreviewUI$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
