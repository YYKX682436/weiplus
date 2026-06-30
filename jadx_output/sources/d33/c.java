package d33;

/* loaded from: classes9.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gallery.picker.view.ImageCropUI f226207d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.tencent.mm.plugin.gallery.picker.view.ImageCropUI imageCropUI) {
        super(0);
        this.f226207d = imageCropUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17 = com.tencent.mm.plugin.gallery.picker.view.ImageCropUI.E;
        com.tencent.mm.plugin.gallery.picker.view.ImageCropUI imageCropUI = this.f226207d;
        android.graphics.Bitmap m17 = com.tencent.mm.sdk.platformtools.x.m(imageCropUI.Z6().getWidth(), imageCropUI.Z6().getHeight(), android.graphics.Bitmap.Config.ARGB_8888, false);
        android.graphics.Bitmap bitmap = null;
        if (m17 == null) {
            com.tencent.mars.xlog.Log.i("ImageCropReport", "inc: 8");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1361L, 8, 1L);
            imageCropUI.setResult(-1);
            imageCropUI.finish();
        } else {
            android.graphics.Canvas canvas = new android.graphics.Canvas(m17);
            imageCropUI.Z6().draw(canvas);
            canvas.setBitmap(null);
            try {
                bitmap = com.tencent.mm.sdk.platformtools.x.E(m17, 0, 0, m17.getWidth(), m17.getHeight() - ym5.x.a(imageCropUI, 56.0f), true);
            } catch (java.lang.Throwable unused) {
                com.tencent.mars.xlog.Log.i("ImageCropReport", "inc: 8");
                com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1361L, 8, 1L);
                imageCropUI.setResult(-1);
                imageCropUI.finish();
            }
        }
        java.lang.String stringExtra = imageCropUI.getIntent().getStringExtra("CropImage_bg_vertical");
        kotlin.jvm.internal.o.d(stringExtra);
        java.lang.String stringExtra2 = imageCropUI.getIntent().getStringExtra("CropImage_bg_horizontal");
        kotlin.jvm.internal.o.d(stringExtra2);
        kotlin.jvm.internal.o.d(bitmap);
        if (imageCropUI.a7(stringExtra, bitmap, false) && imageCropUI.a7(stringExtra2, bitmap, true)) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("CropImage_bg_vertical", stringExtra);
            intent.putExtra("CropImage_bg_horizontal", stringExtra2);
            imageCropUI.setResult(-1, intent);
            com.tencent.mars.xlog.Log.i("ImageCropReport", "inc: 9");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1361L, 9, 1L);
            com.tencent.mars.xlog.Log.i("MicroMsg.AvatarCropUI", "finish background crop");
        } else {
            com.tencent.mars.xlog.Log.i("ImageCropReport", "inc: 8");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1361L, 8, 1L);
            imageCropUI.setResult(-1);
            com.tencent.mars.xlog.Log.e("MicroMsg.AvatarCropUI", "background crop error");
        }
        pm0.v.X(new d33.b(imageCropUI));
        return jz5.f0.f302826a;
    }
}
