package d7;

/* loaded from: classes13.dex */
public class d0 extends d7.f {

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f226793b = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(t6.h.f415967a);

    @Override // t6.h
    public void b(java.security.MessageDigest messageDigest) {
        messageDigest.update(f226793b);
    }

    @Override // d7.f
    public android.graphics.Bitmap c(x6.d dVar, android.graphics.Bitmap bitmap, int i17, int i18) {
        return d7.n0.b(dVar, bitmap, i17, i18);
    }

    @Override // t6.h
    public boolean equals(java.lang.Object obj) {
        return obj instanceof d7.d0;
    }

    @Override // t6.h
    public int hashCode() {
        return 1572326941;
    }
}
