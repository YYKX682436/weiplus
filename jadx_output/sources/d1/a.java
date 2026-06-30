package d1;

/* loaded from: classes14.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final long f225617a = d1.b.b(0.0f, 0.0f, 2, null);

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f225618b = 0;

    public static final boolean a(long j17, long j18) {
        return j17 == j18;
    }

    public static final float b(long j17) {
        return java.lang.Float.intBitsToFloat((int) (j17 >> 32));
    }

    public static final float c(long j17) {
        return java.lang.Float.intBitsToFloat((int) (j17 & io.flutter.embedding.android.KeyboardMap.kValueMask));
    }

    public static java.lang.String d(long j17) {
        if (b(j17) == c(j17)) {
            return "CornerRadius.circular(" + d1.c.a(b(j17), 1) + ')';
        }
        return "CornerRadius.elliptical(" + d1.c.a(b(j17), 1) + ", " + d1.c.a(c(j17), 1) + ')';
    }
}
