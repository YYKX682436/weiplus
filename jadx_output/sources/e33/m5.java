package e33;

/* loaded from: classes3.dex */
public class m5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gallery.ui.SmartGalleryUI f247362d;

    public m5(com.tencent.mm.plugin.gallery.ui.SmartGalleryUI smartGalleryUI) {
        this.f247362d = smartGalleryUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/gallery/ui/SmartGalleryUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.gallery.ui.SmartGalleryUI smartGalleryUI = this.f247362d;
        if (com.tencent.mm.sdk.platformtools.t8.J0(smartGalleryUI.f138623e.getText())) {
            smartGalleryUI.setResult(-2, smartGalleryUI.getIntent().putExtra("send_raw_img", smartGalleryUI.f138637v));
            smartGalleryUI.finish();
        } else {
            smartGalleryUI.f138623e.setText("");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/gallery/ui/SmartGalleryUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
