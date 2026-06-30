package d33;

/* loaded from: classes10.dex */
public final class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gallery.picker.view.WxMediaCropLayout f226284d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gallery.picker.view.ImageCropUI f226285e;

    public u(com.tencent.mm.plugin.gallery.picker.view.WxMediaCropLayout wxMediaCropLayout, com.tencent.mm.plugin.gallery.picker.view.ImageCropUI imageCropUI) {
        this.f226284d = wxMediaCropLayout;
        this.f226285e = imageCropUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        float f17;
        float f18;
        float f19;
        float f27;
        com.tencent.mm.plugin.gallery.picker.view.ImageCropUI imageCropUI = this.f226285e;
        int[] iArr = imageCropUI.f138481y;
        if (iArr == null) {
            kotlin.jvm.internal.o.o("mattingImageInfo");
            throw null;
        }
        int i17 = iArr[0];
        if (iArr == null) {
            kotlin.jvm.internal.o.o("mattingImageInfo");
            throw null;
        }
        int i18 = iArr[1];
        com.tencent.mm.plugin.gallery.picker.view.WxMediaCropLayout this_apply = this.f226284d;
        int width = this_apply.getWidth();
        int height = this_apply.getHeight();
        int i19 = imageCropUI.f138479w;
        int i27 = (i19 == 90 || i19 == 270) ? i18 : i17;
        if (i19 != 90 && i19 != 270) {
            i17 = i18;
        }
        if (i17 < height && i27 < width) {
            f19 = (width - i27) / 2.0f;
            f27 = i27 + f19;
            f17 = (height - i17) / 2.0f;
            f18 = i17 + f17;
        } else if (com.tencent.mm.sdk.platformtools.q2.e(i27, i17)) {
            f27 = width;
            f18 = height;
            f19 = 0.0f;
            f17 = 0.0f;
        } else if (com.tencent.mm.sdk.platformtools.q2.c(i27, i17)) {
            f27 = width;
            f17 = (height - i17) / 2.0f;
            f18 = f17 + f27;
            f19 = 0.0f;
        } else {
            float f28 = i17;
            float f29 = i27;
            float f37 = height;
            float f38 = width;
            if (f28 / f29 > f37 / f38) {
                float f39 = (height * i27) / f28;
                float f47 = (f38 - f39) / 2.0f;
                f27 = f47 + f39;
                f19 = f47;
                f17 = 0.0f;
                f18 = f37;
            } else {
                float f48 = (width * i17) / f29;
                f17 = (f37 - f48) / 2.0f;
                f18 = f48 + f17;
                f19 = 0.0f;
                f27 = f38;
            }
        }
        this_apply.f(new android.graphics.RectF(f19, f17, f27, f18), ru3.o.f399765f);
        kotlin.jvm.internal.o.f(this_apply, "$this_apply");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.String X6 = imageCropUI.X6();
        kotlin.jvm.internal.o.f(X6, "access$getImgPath(...)");
        com.tencent.mm.plugin.gallery.picker.view.WxMediaCropLayout.g(this_apply, currentTimeMillis, X6, true, null, imageCropUI.C, 8, null);
    }
}
