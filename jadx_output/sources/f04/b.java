package f04;

/* loaded from: classes8.dex */
public final class b implements f04.j {
    @Override // f04.j
    public int a(java.lang.Object obj, int i17, int i18) {
        f04.a request = (f04.a) obj;
        kotlin.jvm.internal.o.g(request, "request");
        if ((i17 * i18) / request.f258419c > 1.0f) {
            return (int) java.lang.Math.ceil((float) java.lang.Math.sqrt(r3));
        }
        return 1;
    }

    @Override // f04.j
    public android.graphics.Bitmap b(java.lang.Object obj, android.graphics.Bitmap bitmap) {
        f04.a request = (f04.a) obj;
        kotlin.jvm.internal.o.g(request, "request");
        if (bitmap == null || bitmap.isRecycled()) {
            return bitmap;
        }
        int a17 = com.tencent.mm.sdk.platformtools.l.a(request.f258423a);
        if (a17 != 90 && a17 != 270) {
            return bitmap;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AiImageCompressStrategy", "onTransform needRotate: %d", java.lang.Integer.valueOf(a17));
        return com.tencent.mm.sdk.platformtools.x.w0(bitmap, a17);
    }

    @Override // f04.j
    public boolean c(int i17, int i18) {
        return true;
    }

    @Override // f04.j
    public java.lang.String name() {
        return "MicroMsg.AiImageCompressStrategy";
    }
}
