package d7;

/* loaded from: classes13.dex */
public abstract class n0 {

    /* renamed from: a, reason: collision with root package name */
    public static final android.graphics.Paint f226825a = new android.graphics.Paint(6);

    /* renamed from: b, reason: collision with root package name */
    public static final android.graphics.Paint f226826b = new android.graphics.Paint(7);

    /* renamed from: c, reason: collision with root package name */
    public static final android.graphics.Paint f226827c;

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.concurrent.locks.Lock f226828d;

    static {
        f226828d = new java.util.HashSet(java.util.Arrays.asList("XT1085", "XT1092", "XT1093", "XT1094", "XT1095", "XT1096", "XT1097", "XT1098", "XT1031", "XT1028", "XT937C", "XT1032", "XT1008", "XT1033", "XT1035", "XT1034", "XT939G", "XT1039", "XT1040", "XT1042", "XT1045", "XT1063", "XT1064", "XT1068", "XT1069", "XT1072", "XT1077", "XT1078", "XT1079")).contains(android.os.Build.MODEL) ? new java.util.concurrent.locks.ReentrantLock() : new d7.m0();
        android.graphics.Paint paint = new android.graphics.Paint(7);
        f226827c = paint;
        paint.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.SRC_IN));
    }

    public static void a(android.graphics.Bitmap bitmap, android.graphics.Bitmap bitmap2, android.graphics.Matrix matrix) {
        java.util.concurrent.locks.Lock lock = f226828d;
        lock.lock();
        try {
            android.graphics.Canvas canvas = new android.graphics.Canvas(bitmap2);
            canvas.drawBitmap(bitmap, matrix, f226825a);
            canvas.setBitmap(null);
        } finally {
            lock.unlock();
        }
    }

    public static android.graphics.Bitmap b(x6.d dVar, android.graphics.Bitmap bitmap, int i17, int i18) {
        if (bitmap.getWidth() == i17 && bitmap.getHeight() == i18) {
            android.util.Log.isLoggable("TransformationUtils", 2);
            return bitmap;
        }
        float min = java.lang.Math.min(i17 / bitmap.getWidth(), i18 / bitmap.getHeight());
        int round = java.lang.Math.round(bitmap.getWidth() * min);
        int round2 = java.lang.Math.round(bitmap.getHeight() * min);
        if (bitmap.getWidth() == round && bitmap.getHeight() == round2) {
            android.util.Log.isLoggable("TransformationUtils", 2);
            return bitmap;
        }
        android.graphics.Bitmap d17 = dVar.d((int) (bitmap.getWidth() * min), (int) (bitmap.getHeight() * min), bitmap.getConfig() != null ? bitmap.getConfig() : android.graphics.Bitmap.Config.ARGB_8888);
        d17.setHasAlpha(bitmap.hasAlpha());
        if (android.util.Log.isLoggable("TransformationUtils", 2)) {
            bitmap.getWidth();
            bitmap.getHeight();
            d17.getWidth();
            d17.getHeight();
        }
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.setScale(min, min);
        a(bitmap, d17, matrix);
        return d17;
    }
}
