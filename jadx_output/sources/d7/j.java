package d7;

/* loaded from: classes13.dex */
public class j extends d7.f {

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f226815b = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(t6.h.f415967a);

    @Override // t6.h
    public void b(java.security.MessageDigest messageDigest) {
        messageDigest.update(f226815b);
    }

    @Override // d7.f
    public android.graphics.Bitmap c(x6.d dVar, android.graphics.Bitmap bitmap, int i17, int i18) {
        android.graphics.Paint paint = d7.n0.f226825a;
        if (bitmap.getWidth() > i17 || bitmap.getHeight() > i18) {
            android.util.Log.isLoggable("TransformationUtils", 2);
            return d7.n0.b(dVar, bitmap, i17, i18);
        }
        android.util.Log.isLoggable("TransformationUtils", 2);
        return bitmap;
    }

    @Override // t6.h
    public boolean equals(java.lang.Object obj) {
        return obj instanceof d7.j;
    }

    @Override // t6.h
    public int hashCode() {
        return -670243078;
    }
}
