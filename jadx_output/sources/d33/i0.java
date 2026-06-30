package d33;

/* loaded from: classes9.dex */
public final class i0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f226237d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f226238e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gallery.picker.view.ImageCropUI f226239f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.p f226240g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(android.widget.ImageView imageView, android.graphics.Bitmap bitmap, com.tencent.mm.plugin.gallery.picker.view.ImageCropUI imageCropUI, yz5.p pVar) {
        super(0);
        this.f226237d = imageView;
        this.f226238e = bitmap;
        this.f226239f = imageCropUI;
        this.f226240g = pVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.graphics.Bitmap bitmap = this.f226238e;
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(bitmap.getWidth(), bitmap.getHeight());
        android.widget.ImageView imageView = this.f226237d;
        imageView.setLayoutParams(layoutParams);
        com.tencent.mm.plugin.gallery.picker.view.ImageCropUI imageCropUI = this.f226239f;
        imageCropUI.f138482z = bitmap;
        imageView.setImageBitmap(bitmap);
        this.f226240g.invoke(java.lang.Integer.valueOf(bitmap.getWidth()), java.lang.Integer.valueOf(bitmap.getHeight()));
        imageCropUI.A = true;
        com.tencent.mm.ui.widget.dialog.u3 u3Var = imageCropUI.f138476t;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        return jz5.f0.f302826a;
    }
}
