package d33;

/* loaded from: classes9.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f226241d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f226242e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f226243f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f226244g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.p f226245h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gallery.picker.view.ImageCropUI f226246i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(android.widget.ImageView imageView, android.graphics.Bitmap bitmap, int i17, int i18, yz5.p pVar, com.tencent.mm.plugin.gallery.picker.view.ImageCropUI imageCropUI) {
        super(0);
        this.f226241d = imageView;
        this.f226242e = bitmap;
        this.f226243f = i17;
        this.f226244g = i18;
        this.f226245h = pVar;
        this.f226246i = imageCropUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.widget.ImageView imageView = this.f226241d;
        imageView.setImageBitmap(this.f226242e);
        int i17 = this.f226243f;
        int i18 = this.f226244g;
        imageView.setLayoutParams(new android.widget.FrameLayout.LayoutParams(i17, i18));
        this.f226245h.invoke(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        com.tencent.mm.plugin.gallery.picker.view.ImageCropUI imageCropUI = this.f226246i;
        imageCropUI.A = true;
        com.tencent.mm.ui.widget.dialog.u3 u3Var = imageCropUI.f138476t;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        return jz5.f0.f302826a;
    }
}
