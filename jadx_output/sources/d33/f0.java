package d33;

/* loaded from: classes9.dex */
public final class f0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gallery.picker.view.ImageCropUI f226224d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f226225e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f226226f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(com.tencent.mm.plugin.gallery.picker.view.ImageCropUI imageCropUI, kotlin.jvm.internal.h0 h0Var, android.content.Intent intent) {
        super(0);
        this.f226224d = imageCropUI;
        this.f226225e = h0Var;
        this.f226226f = intent;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.gallery.picker.view.ImageCropUI imageCropUI = this.f226224d;
        boolean z17 = imageCropUI.f138480x;
        android.content.Intent intent = this.f226226f;
        kotlin.jvm.internal.h0 h0Var = this.f226225e;
        if (!z17) {
            try {
                java.lang.String a17 = com.tencent.mm.sdk.platformtools.w2.a(java.lang.String.valueOf(java.lang.System.currentTimeMillis()));
                android.graphics.Bitmap bitmap = imageCropUI.f138482z;
                if (bitmap == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AvatarCropUI", "emojiBmp is null");
                    pm0.v.X(new d33.b0(imageCropUI));
                } else {
                    int width = bitmap.getWidth();
                    int height = bitmap.getHeight();
                    if (width > 640 || height > 640) {
                        if (width > height) {
                            height = (int) ((height * 640) / width);
                            width = 640;
                        } else {
                            width = (int) ((width * 640) / height);
                            height = 640;
                        }
                    }
                    android.graphics.Bitmap createScaledBitmap = android.graphics.Bitmap.createScaledBitmap(bitmap, width, height, true);
                    if (createScaledBitmap == null) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.AvatarCropUI", "commpressedImg is null");
                        pm0.v.X(new d33.c0(imageCropUI));
                    } else {
                        com.tencent.mm.sdk.platformtools.x.D0(createScaledBitmap, 100, android.graphics.Bitmap.CompressFormat.PNG, imageCropUI.Y6() + a17, false);
                        com.tencent.mars.xlog.Log.i("MicroMsg.AvatarCropUI", "save bitmap to image successful");
                        java.lang.String b17 = com.tencent.mm.sdk.platformtools.w2.b(com.tencent.mm.vfs.w6.N(imageCropUI.Y6() + a17, 0, -1));
                        kotlin.jvm.internal.o.f(b17, "getMD5String(...)");
                        h0Var.f310123d = b17;
                        if (com.tencent.mm.vfs.w6.j(imageCropUI.Y6() + ((java.lang.String) h0Var.f310123d))) {
                            com.tencent.mm.vfs.w6.h(imageCropUI.Y6() + a17);
                        } else {
                            com.tencent.mm.vfs.w6.P(imageCropUI.Y6(), a17, (java.lang.String) h0Var.f310123d);
                        }
                        intent.putExtra("emoji_type", 0);
                    }
                }
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AvatarCropUI", e17, "", null);
                pm0.v.X(new d33.d0(imageCropUI, e17));
            }
            return jz5.f0.f302826a;
        }
        byte[] N = com.tencent.mm.vfs.w6.N(imageCropUI.X6(), 0, -1);
        java.lang.String b18 = com.tencent.mm.sdk.platformtools.w2.b(N);
        kotlin.jvm.internal.o.f(b18, "getMD5String(...)");
        h0Var.f310123d = b18;
        if (com.tencent.mm.vfs.w6.j(imageCropUI.Y6() + ((java.lang.String) h0Var.f310123d))) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AvatarCropUI", "file is exist. do not need to copy!");
        } else {
            com.tencent.mm.vfs.w6.S(imageCropUI.Y6() + ((java.lang.String) h0Var.f310123d), N, 0, N.length);
        }
        intent.putExtra("emoji_type", 1);
        pm0.v.X(new d33.e0(imageCropUI, intent, h0Var));
        return jz5.f0.f302826a;
    }
}
