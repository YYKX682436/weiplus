package d33;

/* loaded from: classes9.dex */
public final class g0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gallery.picker.view.ImageCropUI f226230d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(com.tencent.mm.plugin.gallery.picker.view.ImageCropUI imageCropUI) {
        super(0);
        this.f226230d = imageCropUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.gallery.picker.view.ImageCropUI imageCropUI = this.f226230d;
        java.lang.String stringExtra = imageCropUI.getIntent().getStringExtra("CropImage_OutputPath");
        if (stringExtra != null) {
            return stringExtra;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(lp0.b.m());
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        int i17 = com.tencent.mm.plugin.gallery.picker.view.ImageCropUI.E;
        sb7.append(imageCropUI.X6());
        sb7.append(java.lang.System.currentTimeMillis());
        byte[] bytes = sb7.toString().getBytes(r26.c.f368865a);
        kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
        sb6.append(kk.k.g(bytes));
        sb6.append("_crop.jpg");
        return sb6.toString();
    }
}
