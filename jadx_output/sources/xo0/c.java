package xo0;

/* loaded from: classes10.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final xo0.c f455743a = new xo0.c();

    public static boolean a(xo0.c cVar, android.graphics.Bitmap bm6, android.graphics.Bitmap.CompressFormat format, int i17, java.io.OutputStream stream, int i18, java.lang.Object obj) {
        if ((i18 & 2) != 0) {
            format = android.graphics.Bitmap.CompressFormat.JPEG;
        }
        if ((i18 & 4) != 0) {
            i17 = 80;
        }
        cVar.getClass();
        kotlin.jvm.internal.o.g(bm6, "bm");
        kotlin.jvm.internal.o.g(format, "format");
        kotlin.jvm.internal.o.g(stream, "stream");
        pm0.c cVar2 = new pm0.c("compress");
        boolean compress = bm6.compress(format, i17, stream);
        if (!compress) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.Loader.DiskFunction", "compress error %s", com.tencent.mm.sdk.platformtools.z3.b(true));
        }
        cVar2.a();
        return compress;
    }

    public final java.io.OutputStream b(java.lang.String filePath) {
        kotlin.jvm.internal.o.g(filePath, "filePath");
        if (filePath.length() == 0) {
            return null;
        }
        try {
            com.tencent.mm.vfs.r6 s17 = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(filePath)).s();
            if (s17 != null) {
                s17.J();
            }
            return com.tencent.mm.vfs.w6.K(filePath, false);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Loader.DiskFunction", "obtainOutputStream:%s", e17);
            return null;
        }
    }
}
