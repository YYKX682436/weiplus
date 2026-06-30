package dx0;

/* loaded from: classes5.dex */
public final class c implements com.tencent.maas.moviecomposing.l0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dx0.g f244423a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.base.MJID f244424b;

    public c(dx0.g gVar, com.tencent.maas.base.MJID mjid) {
        this.f244423a = gVar;
        this.f244424b = mjid;
    }

    @Override // com.tencent.maas.moviecomposing.l0
    public final void a(com.tencent.maas.moviecomposing.m0 m0Var, int i17, com.tencent.maas.moviecomposing.n0 n0Var) {
        android.graphics.Bitmap bitmap;
        kotlin.jvm.internal.o.g(m0Var, "<anonymous parameter 0>");
        android.graphics.Bitmap bitmap2 = n0Var != null ? n0Var.f48514a : null;
        com.tencent.maas.base.MJID segmentID = this.f244424b;
        dx0.g gVar = this.f244423a;
        if (bitmap2 != null) {
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = gVar.f244438e;
            android.graphics.Bitmap bitmap3 = n0Var.f48514a;
            kotlin.jvm.internal.o.f(bitmap3, "bitmap");
            int width = bitmap3.getWidth();
            int height = bitmap3.getHeight();
            if (height != 0 && width != 0) {
                android.util.Size size = gVar.f244435b;
                float f17 = width;
                float f18 = height;
                float max = java.lang.Math.max(size.getWidth() / f17, size.getHeight() / f18);
                if (max == 1.0f) {
                    bitmap = gVar.c(bitmap3);
                } else {
                    android.graphics.Bitmap createScaledBitmap = android.graphics.Bitmap.createScaledBitmap(bitmap3, (int) (f17 * max), (int) (f18 * max), false);
                    kotlin.jvm.internal.o.f(createScaledBitmap, "createScaledBitmap(...)");
                    try {
                        bitmap = gVar.c(createScaledBitmap);
                    } catch (java.lang.Exception e17) {
                        com.tencent.mars.xlog.Log.e("MJCoverThumbnailProvider", "getScaledCenterCropBitmap: ", e17);
                    }
                }
                concurrentHashMap.put(segmentID, new dx0.p(bitmap, n0Var.f48516c));
            }
            bitmap = null;
            concurrentHashMap.put(segmentID, new dx0.p(bitmap, n0Var.f48516c));
        }
        ex0.y yVar = (ex0.y) gVar.f244436c;
        yVar.getClass();
        kotlin.jvm.internal.o.g(segmentID, "segmentID");
        ex0.a0 a0Var = yVar.f257185a;
        kotlinx.coroutines.l.d(a0Var.f257093c, a0Var.f257094d, null, new ex0.x(a0Var, segmentID, null), 2, null);
    }
}
