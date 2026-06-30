package dl4;

/* loaded from: classes3.dex */
public final class e1 {

    /* renamed from: a, reason: collision with root package name */
    public static final dl4.e1 f235389a = new dl4.e1();

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f235390b = {90, 70, 50, 30, 10};

    public final android.graphics.Bitmap a(byte[] bArr, android.graphics.Point point, int i17) {
        int i18;
        try {
            android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
            int i19 = point.x;
            int i27 = point.y;
            if (i19 > i27) {
                i18 = (int) (((i27 * 1.0f) * i17) / i19);
            } else {
                int i28 = (int) (((i19 * 1.0f) * i17) / i27);
                i18 = i17;
                i17 = i28;
            }
            android.graphics.Point point2 = new android.graphics.Point(i17, i18);
            int i29 = point2.x;
            int i37 = point2.y;
            options.inSampleSize = com.tencent.mm.sdk.platformtools.x.f(point.x, point.y, i29, i37);
            options.inJustDecodeBounds = false;
            com.tencent.mars.xlog.Log.i("MicroMsg.TingImageUtils", "compressImage resizeImage width: %d, height: %d, targetWidth: %d, targetHeight: %d, sampleSize: %d", java.lang.Integer.valueOf(point.x), java.lang.Integer.valueOf(point.y), java.lang.Integer.valueOf(i29), java.lang.Integer.valueOf(i37), java.lang.Integer.valueOf(options.inSampleSize));
            android.graphics.Bitmap I = com.tencent.mm.sdk.platformtools.x.I(bArr, i29, i37, null);
            return (I == null || I.isRecycled() || I.getWidth() <= i29) ? I : com.tencent.mm.sdk.platformtools.x.S(I, i37, i29, false, true);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TingImageUtils", e17, "resizeImage exception", new java.lang.Object[0]);
            return null;
        }
    }
}
