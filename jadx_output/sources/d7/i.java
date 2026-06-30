package d7;

/* loaded from: classes13.dex */
public class i extends d7.f {

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f226808b = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(t6.h.f415967a);

    @Override // t6.h
    public void b(java.security.MessageDigest messageDigest) {
        messageDigest.update(f226808b);
    }

    @Override // d7.f
    public android.graphics.Bitmap c(x6.d dVar, android.graphics.Bitmap bitmap, int i17, int i18) {
        float width;
        float height;
        android.graphics.Paint paint = d7.n0.f226825a;
        if (bitmap.getWidth() == i17 && bitmap.getHeight() == i18) {
            return bitmap;
        }
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        float f17 = 0.0f;
        if (bitmap.getWidth() * i18 > bitmap.getHeight() * i17) {
            width = i18 / bitmap.getHeight();
            f17 = (i17 - (bitmap.getWidth() * width)) * 0.5f;
            height = 0.0f;
        } else {
            width = i17 / bitmap.getWidth();
            height = (i18 - (bitmap.getHeight() * width)) * 0.5f;
        }
        matrix.setScale(width, width);
        matrix.postTranslate((int) (f17 + 0.5f), (int) (height + 0.5f));
        android.graphics.Bitmap d17 = dVar.d(i17, i18, bitmap.getConfig() != null ? bitmap.getConfig() : android.graphics.Bitmap.Config.ARGB_8888);
        d17.setHasAlpha(bitmap.hasAlpha());
        d7.n0.a(bitmap, d17, matrix);
        return d17;
    }

    @Override // t6.h
    public boolean equals(java.lang.Object obj) {
        return obj instanceof d7.i;
    }

    @Override // t6.h
    public int hashCode() {
        return -599754482;
    }
}
