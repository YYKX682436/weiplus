package d33;

/* loaded from: classes10.dex */
public final class a0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gallery.picker.view.ImageCropUI f226200d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(com.tencent.mm.plugin.gallery.picker.view.ImageCropUI imageCropUI) {
        super(0);
        this.f226200d = imageCropUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17 = com.tencent.mm.plugin.gallery.picker.view.ImageCropUI.E;
        com.tencent.mm.plugin.gallery.picker.view.ImageCropUI imageCropUI = this.f226200d;
        imageCropUI.f138479w = com.tencent.mm.sdk.platformtools.l.a(imageCropUI.X6());
        android.graphics.BitmapFactory.Options n07 = com.tencent.mm.sdk.platformtools.x.n0(imageCropUI.X6());
        boolean z17 = false;
        boolean z18 = com.tencent.mm.sdk.platformtools.q2.c(n07.outWidth, n07.outHeight) && n07.outWidth > 480;
        if (com.tencent.mm.sdk.platformtools.q2.e(n07.outWidth, n07.outHeight) && n07.outHeight > 480) {
            z17 = true;
        }
        if (z18 || z17) {
            pm0.v.X(new d33.y(imageCropUI));
        } else {
            int p17 = com.tencent.mm.repairer.config.avatar.RepairerConfigAvatarHdResolutionUpgrade.p();
            int p18 = com.tencent.mm.repairer.config.avatar.RepairerConfigAvatarHdResolutionUpgrade.p();
            int i18 = imageCropUI.f138479w;
            int i19 = (i18 == 90 || i18 == 270) ? p18 : p17;
            if (i18 != 90 && i18 != 270) {
                p17 = p18;
            }
            android.graphics.Bitmap T = com.tencent.mm.sdk.platformtools.x.T(imageCropUI.X6(), p17, i19, true);
            android.graphics.Bitmap w07 = T != null ? com.tencent.mm.sdk.platformtools.x.w0(T, imageCropUI.f138479w) : null;
            if (w07 == null) {
                com.tencent.mars.xlog.Log.i("ImageCropReport", "inc: 8");
                com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1361L, 8, 1L);
                imageCropUI.setResult(-1);
                imageCropUI.finish();
            } else {
                pm0.v.X(new d33.z(imageCropUI, w07));
            }
        }
        return jz5.f0.f302826a;
    }
}
