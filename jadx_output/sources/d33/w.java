package d33;

/* loaded from: classes10.dex */
public final class w extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gallery.picker.view.ImageCropUI f226293d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gallery.picker.view.WxMediaCropLayout f226294e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(com.tencent.mm.plugin.gallery.picker.view.ImageCropUI imageCropUI, com.tencent.mm.plugin.gallery.picker.view.WxMediaCropLayout wxMediaCropLayout) {
        super(0);
        this.f226293d = imageCropUI;
        this.f226294e = wxMediaCropLayout;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17 = com.tencent.mm.plugin.gallery.picker.view.ImageCropUI.E;
        com.tencent.mm.plugin.gallery.picker.view.ImageCropUI imageCropUI = this.f226293d;
        java.lang.String X6 = imageCropUI.X6();
        kotlin.jvm.internal.o.f(X6, "access$getImgPath(...)");
        android.graphics.BitmapFactory.Options n07 = com.tencent.mm.sdk.platformtools.x.n0(X6);
        int[] iArr = null;
        if (n07 != null) {
            if (!(n07.outWidth > 0 && n07.outHeight > 0)) {
                n07 = null;
            }
            if (n07 != null) {
                iArr = new int[]{n07.outWidth, n07.outHeight};
            }
        }
        if (iArr == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AvatarCropUI", "load matting img info error");
            com.tencent.mars.xlog.Log.i("ImageCropReport", "inc: 8");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1361L, 8, 1L);
            imageCropUI.setResult(-1);
            imageCropUI.finish();
        } else {
            imageCropUI.f138481y = iArr;
            imageCropUI.f138479w = com.tencent.mm.sdk.platformtools.l.a(imageCropUI.X6());
            pm0.v.X(new d33.v(this.f226294e, imageCropUI));
        }
        return jz5.f0.f302826a;
    }
}
