package d33;

/* loaded from: classes9.dex */
public final class z extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gallery.picker.view.ImageCropUI f226303d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f226304e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(com.tencent.mm.plugin.gallery.picker.view.ImageCropUI imageCropUI, android.graphics.Bitmap bitmap) {
        super(0);
        this.f226303d = imageCropUI;
        this.f226304e = bitmap;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17 = com.tencent.mm.plugin.gallery.picker.view.ImageCropUI.E;
        com.tencent.mm.plugin.gallery.picker.view.ImageCropUI imageCropUI = this.f226303d;
        android.widget.ImageView Z6 = imageCropUI.Z6();
        Z6.setVisibility(0);
        Z6.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
        Z6.setImageBitmap(this.f226304e);
        imageCropUI.A = true;
        com.tencent.mm.ui.widget.dialog.u3 u3Var = imageCropUI.f138476t;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        return jz5.f0.f302826a;
    }
}
