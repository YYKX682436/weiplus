package f1;

/* loaded from: classes14.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final long f258466a;

    /* renamed from: b, reason: collision with root package name */
    public static final long f258467b;

    /* renamed from: c, reason: collision with root package name */
    public static final long f258468c;

    /* renamed from: d, reason: collision with root package name */
    public static final long f258469d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f258470e = 0;

    static {
        long j17 = 3;
        long j18 = j17 << 32;
        f258466a = (0 & io.flutter.embedding.android.KeyboardMap.kValueMask) | j18;
        f258467b = (1 & io.flutter.embedding.android.KeyboardMap.kValueMask) | j18;
        f258468c = j18 | (2 & io.flutter.embedding.android.KeyboardMap.kValueMask);
        f258469d = (j17 & io.flutter.embedding.android.KeyboardMap.kValueMask) | (4 << 32);
    }

    public static final boolean a(long j17, long j18) {
        return j17 == j18;
    }

    public static java.lang.String b(long j17) {
        return a(j17, f258466a) ? "Rgb" : a(j17, f258467b) ? "Xyz" : a(j17, f258468c) ? "Lab" : a(j17, f258469d) ? "Cmyk" : "Unknown";
    }
}
