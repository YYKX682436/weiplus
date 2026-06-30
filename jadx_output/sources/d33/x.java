package d33;

/* loaded from: classes9.dex */
public final class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f226298d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gallery.picker.view.ImageCropUI f226299e;

    public x(android.widget.ImageView imageView, com.tencent.mm.plugin.gallery.picker.view.ImageCropUI imageCropUI) {
        this.f226298d = imageView;
        this.f226299e = imageCropUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.widget.ImageView imageView = this.f226298d;
        int width = imageView.getWidth();
        com.tencent.mm.plugin.gallery.picker.view.ImageCropUI imageCropUI = this.f226299e;
        if (width == 0 || imageView.getHeight() == 0) {
            com.tencent.mm.ui.ah a17 = com.tencent.mm.ui.bh.a(null);
            com.tencent.mm.plugin.gallery.picker.view.ImageCropUI.U6(imageCropUI, a17.f197135a, a17.f197136b);
        } else {
            com.tencent.mm.plugin.gallery.picker.view.ImageCropUI.U6(imageCropUI, imageView.getWidth(), imageView.getHeight());
        }
        imageView.setVisibility(0);
        imageCropUI.A = true;
        com.tencent.mm.ui.widget.dialog.u3 u3Var = imageCropUI.f138476t;
        if (u3Var != null) {
            u3Var.dismiss();
        }
    }
}
