package d33;

/* loaded from: classes9.dex */
public final class s implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gallery.picker.view.ImageCropUI f226271d;

    public s(com.tencent.mm.plugin.gallery.picker.view.ImageCropUI imageCropUI) {
        this.f226271d = imageCropUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        java.lang.String Y6;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.gallery.picker.view.ImageCropUI imageCropUI = this.f226271d;
        if (!imageCropUI.A) {
            return true;
        }
        int intValue = ((java.lang.Number) ((jz5.n) imageCropUI.f138471o).getValue()).intValue();
        if (intValue == 1) {
            com.tencent.mm.plugin.gallery.picker.view.ImageCropUI.T6(imageCropUI);
        } else if (intValue != 2) {
            if (intValue != 3) {
                if (intValue == 4) {
                    if (android.text.TextUtils.isEmpty(imageCropUI.Y6())) {
                        Y6 = imageCropUI.X6();
                    } else {
                        byte[] N = com.tencent.mm.vfs.w6.N(imageCropUI.X6(), 0, -1);
                        com.tencent.mm.vfs.w6.S(imageCropUI.Y6(), N, 0, N.length);
                        Y6 = imageCropUI.Y6();
                    }
                    kotlin.jvm.internal.o.d(Y6);
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("CropImage_Compress_Img", true);
                    intent.putExtra("CropImage_OutputPath", Y6);
                    intent.putExtra("from_source", imageCropUI.getIntent().getIntExtra("from_source", 0));
                    com.tencent.mars.xlog.Log.i("ImageCropReport", "inc: 9");
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1361L, 9, 1L);
                    imageCropUI.setResult(-1, intent);
                    imageCropUI.finish();
                }
            } else if (!imageCropUI.f138478v) {
                imageCropUI.f138478v = true;
                imageCropUI.b7();
                android.content.Intent intent2 = new android.content.Intent();
                kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
                h0Var.f310123d = "";
                pm0.v.K(null, new d33.f0(imageCropUI, h0Var, intent2));
            }
        } else if (!imageCropUI.f138478v) {
            imageCropUI.f138478v = true;
            imageCropUI.b7();
            pm0.v.K(null, new d33.c(imageCropUI));
        }
        return true;
    }
}
