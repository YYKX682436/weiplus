package f04;

/* loaded from: classes10.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f258427a = {480, com.tencent.wcdb.FileUtils.S_IRWXU, com.tencent.mapsdk.internal.km.f50100e, 240};

    public static byte[] a(android.graphics.Bitmap bitmap, int i17) {
        try {
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            bitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, i17, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ScanImageJpegCompressUtils", e17, "compressImageByQuality exception", new java.lang.Object[0]);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00dd A[EDGE_INSN: B:47:0x00dd->B:48:0x00dd BREAK  A[LOOP:0: B:2:0x0007->B:43:0x00d9], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] b(java.lang.String r18, int r19, int r20, f04.k r21) {
        /*
            Method dump skipped, instructions count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f04.l.b(java.lang.String, int, int, f04.k):byte[]");
    }

    public static android.graphics.Bitmap c(java.lang.String str, int i17) {
        int i18;
        try {
            android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            com.tencent.mm.sdk.platformtools.x.J(str, options);
            int i19 = options.outWidth;
            int i27 = options.outHeight;
            if (i19 > i27) {
                int i28 = (int) (((i19 * 1.0f) * i17) / i27);
                i18 = i17;
                i17 = i28;
            } else {
                i18 = (int) (((i27 * 1.0f) * i17) / i19);
            }
            android.graphics.Point point = new android.graphics.Point(i17, i18);
            int i29 = point.x;
            int i37 = point.y;
            options.inSampleSize = com.tencent.mm.sdk.platformtools.x.f(options.outWidth, options.outHeight, i29, i37);
            options.inJustDecodeBounds = false;
            com.tencent.mars.xlog.Log.i("MicroMsg.ScanImageJpegCompressUtils", "resizeImage width: %d, height: %d, targetWidth: %d, targetHeight: %d, sampleSize: %d", java.lang.Integer.valueOf(options.outWidth), java.lang.Integer.valueOf(options.outHeight), java.lang.Integer.valueOf(i29), java.lang.Integer.valueOf(i37), java.lang.Integer.valueOf(options.inSampleSize));
            android.graphics.Bitmap J2 = com.tencent.mm.sdk.platformtools.x.J(str, options);
            return (J2 == null || J2.isRecycled() || J2.getWidth() <= i29) ? J2 : com.tencent.mm.sdk.platformtools.x.S(J2, i37, i29, false, true);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ScanImageJpegCompressUtils", e17, "resizeImage exception", new java.lang.Object[0]);
            return null;
        }
    }
}
