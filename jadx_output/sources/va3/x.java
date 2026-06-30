package va3;

/* loaded from: classes13.dex */
public abstract class x {

    /* renamed from: a, reason: collision with root package name */
    public static double f434380a = -85.0d;

    /* renamed from: b, reason: collision with root package name */
    public static double f434381b = -1000.0d;

    /* renamed from: c, reason: collision with root package name */
    public static double f434382c = -85.0d;

    /* renamed from: d, reason: collision with root package name */
    public static double f434383d = -1000.0d;

    public static double a(double d17, double d18) {
        double d19;
        f434382c = d17;
        f434383d = d18;
        double d27 = f434380a;
        if (d27 != -85.0d) {
            double d28 = f434381b;
            if (d28 != -1000.0d) {
                d19 = (java.lang.Math.atan2(d18 - d28, d17 - d27) * 180.0d) / 3.141592d;
                f434380a = f434382c;
                f434381b = f434383d;
                return d19;
            }
        }
        d19 = 0.0d;
        f434380a = f434382c;
        f434381b = f434383d;
        return d19;
    }
}
