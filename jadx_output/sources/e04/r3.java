package e04;

/* loaded from: classes10.dex */
public final class r3 {

    /* renamed from: a, reason: collision with root package name */
    public static final e04.r3 f246082a = new e04.r3();

    static {
        java.lang.String str = gm0.j1.u().d() + "scan_product_tmp/";
        if (com.tencent.mm.vfs.w6.j(str)) {
            return;
        }
        com.tencent.mm.vfs.w6.u(str);
    }

    public static byte[] a(byte[] yuv, int i17, android.graphics.Point targetSize, int i18, android.graphics.Rect rect, int i19, java.lang.Object obj) {
        if ((i19 & 16) != 0) {
            rect = null;
        }
        kotlin.jvm.internal.o.g(yuv, "yuv");
        kotlin.jvm.internal.o.g(targetSize, "targetSize");
        java.lang.System.currentTimeMillis();
        if (rect == null) {
            rect = new android.graphics.Rect(0, 0, targetSize.x, targetSize.y);
        }
        android.graphics.YuvImage yuvImage = new android.graphics.YuvImage(yuv, i17, targetSize.x, targetSize.y, null);
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        try {
            yuvImage.compressToJpeg(rect, i18, byteArrayOutputStream);
            byteArrayOutputStream.flush();
            byteArrayOutputStream.close();
            java.lang.System.currentTimeMillis();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            int length = byteArray.length;
            return byteArray;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ScanYuvUtils", e17, "convertYUVToJpeg exception %s", e17.getMessage());
            return null;
        }
    }

    public final java.lang.String b(java.lang.String str) {
        return gm0.j1.u().d() + "scan_product_tmp/" + str;
    }
}
