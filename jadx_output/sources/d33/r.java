package d33;

/* loaded from: classes10.dex */
public final class r implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gallery.picker.view.ImageCropUI f226269d;

    public r(com.tencent.mm.plugin.gallery.picker.view.ImageCropUI imageCropUI) {
        this.f226269d = imageCropUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/gallery/picker/view/ImageCropUI$initMMView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.gallery.picker.view.ImageCropUI.E;
        this.f226269d.V6().h();
        yj0.a.h(this, "com/tencent/mm/plugin/gallery/picker/view/ImageCropUI$initMMView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
