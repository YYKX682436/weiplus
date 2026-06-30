package eh;

/* loaded from: classes7.dex */
public final class a extends com.github.henryye.nativeiv.LegacyBitmap {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s7.t2 f252863c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ eh.c f252864d;

    public a(s7.t2 t2Var, eh.c cVar) {
        this.f252863c = t2Var;
        this.f252864d = cVar;
    }

    @Override // com.github.henryye.nativeiv.LegacyBitmap
    public android.graphics.Bitmap a(java.io.InputStream inputStream, com.github.henryye.nativeiv.ImageDecodeConfig imageDecodeConfig, f8.c cVar) {
        android.graphics.Picture g17;
        s7.q2 q2Var;
        s7.t0 t0Var;
        int i17;
        s7.t2 t2Var = this.f252863c;
        int c17 = (int) t2Var.c();
        int b17 = (int) t2Var.b();
        if (cVar != f8.c.CUSTOM || c17 <= 0 || c17 <= 0) {
            android.graphics.Bitmap a17 = super.a(inputStream, imageDecodeConfig, cVar);
            kotlin.jvm.internal.o.f(a17, "{\n                      …                        }");
            return a17;
        }
        if (imageDecodeConfig != null) {
            ah.i.f4715a.d(this.f252864d.f252867g.f252868g, "hy: image config width %d, height %d, scale %f", java.lang.Integer.valueOf(imageDecodeConfig.mPreferredWidth), java.lang.Integer.valueOf(imageDecodeConfig.mPreferredHeight), java.lang.Double.valueOf(imageDecodeConfig.mPreferredScale));
            int i18 = imageDecodeConfig.mPreferredWidth;
            if (i18 <= 0 || (i17 = imageDecodeConfig.mPreferredHeight) <= 0) {
                double d17 = imageDecodeConfig.mPreferredScale;
                i18 = d17 > 0.0d ? (int) (0 * d17) : 0;
                i17 = i18;
            }
            java.lang.Integer valueOf = java.lang.Integer.valueOf(i18);
            java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i17);
            if (valueOf.intValue() > 0 && valueOf2.intValue() > 0) {
                c17 = valueOf.intValue();
                b17 = valueOf2.intValue();
            }
        }
        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(b17));
        arrayList.add(java.lang.Integer.valueOf(c17));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/magicbrush/image/BitmapDecoderMagicBrushExtension$createBitmapWrapper$1$providePictureInfo$1$produceBitmap$1", "decodeInputStreamImp", "(Ljava/io/InputStream;Lcom/github/henryye/nativeiv/ImageDecodeConfig;Lcom/github/henryye/nativeiv/bitmap/PictureFormat;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "com/tencent/magicbrush/image/BitmapDecoderMagicBrushExtension$createBitmapWrapper$1$providePictureInfo$1$produceBitmap$1", "decodeInputStreamImp", "(Ljava/io/InputStream;Lcom/github/henryye/nativeiv/ImageDecodeConfig;Lcom/github/henryye/nativeiv/bitmap/PictureFormat;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        kotlin.jvm.internal.o.f(createBitmap, "createBitmap(preferredWi… Bitmap.Config.ARGB_8888)");
        android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
        s7.s1 s1Var = t2Var.f403836a;
        s7.f0 f0Var = s1Var.f403640o;
        s7.t0 t0Var2 = s1Var.f403831r;
        if (t0Var2 != null && t0Var2.f403835e != (q2Var = s7.q2.percent) && (t0Var = s1Var.f403832s) != null && t0Var.f403835e != q2Var) {
            g17 = t2Var.g((int) java.lang.Math.ceil(t0Var2.a(t2Var.f403837b)), (int) java.lang.Math.ceil(t2Var.f403836a.f403832s.a(t2Var.f403837b)), null);
        } else if (t0Var2 == null || f0Var == null) {
            s7.t0 t0Var3 = s1Var.f403832s;
            if (t0Var3 == null || f0Var == null) {
                g17 = t2Var.g(512, 512, null);
            } else {
                g17 = t2Var.g((int) java.lang.Math.ceil((f0Var.f403645c * r14) / f0Var.f403646d), (int) java.lang.Math.ceil(t0Var3.a(t2Var.f403837b)), null);
            }
        } else {
            g17 = t2Var.g((int) java.lang.Math.ceil(t0Var2.a(t2Var.f403837b)), (int) java.lang.Math.ceil((f0Var.f403646d * r14) / f0Var.f403645c), null);
        }
        canvas.drawPicture(g17, new android.graphics.RectF(0.0f, 0.0f, c17, b17));
        return createBitmap;
    }
}
