package f04;

/* loaded from: classes8.dex */
public final class e implements f04.j {

    /* renamed from: a, reason: collision with root package name */
    public final jz5.g f258422a = jz5.h.b(f04.d.f258421d);

    @Override // f04.j
    public int a(java.lang.Object obj, int i17, int i18) {
        f04.c request = (f04.c) obj;
        kotlin.jvm.internal.o.g(request, "request");
        if ((i17 * i18) / ((java.lang.Number) ((jz5.n) this.f258422a).getValue()).intValue() > 1.0f) {
            return (int) java.lang.Math.ceil((float) java.lang.Math.sqrt(r2));
        }
        return 1;
    }

    @Override // f04.j
    public android.graphics.Bitmap b(java.lang.Object obj, android.graphics.Bitmap bitmap) {
        f04.c request = (f04.c) obj;
        kotlin.jvm.internal.o.g(request, "request");
        if (bitmap == null || bitmap.isRecycled() || !request.f258420c) {
            return bitmap;
        }
        int a17 = com.tencent.mm.sdk.platformtools.l.a(request.f258423a);
        if (a17 != 90 && a17 != 270) {
            return bitmap;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanCodeImageCompressStrategy", "onTransform needRotate: %d", java.lang.Integer.valueOf(a17));
        return com.tencent.mm.sdk.platformtools.x.w0(bitmap, a17);
    }

    @Override // f04.j
    public boolean c(int i17, int i18) {
        if (i17 >= 4 && i18 >= 4) {
            return true;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.ScanCodeImageCompressStrategy", "isSizeValid invalid width: " + i17 + ", height: " + i18);
        return false;
    }

    @Override // f04.j
    public java.lang.String name() {
        return "MicroMsg.ScanCodeImageCompressStrategy";
    }
}
