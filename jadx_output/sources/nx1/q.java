package nx1;

/* loaded from: classes12.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public static float f341317a = Float.MAX_VALUE;

    /* renamed from: b, reason: collision with root package name */
    public static float f341318b = Float.MAX_VALUE;

    /* renamed from: c, reason: collision with root package name */
    public static int f341319c = -1;

    /* renamed from: d, reason: collision with root package name */
    public static float f341320d = 48.0f;

    public static float a() {
        float f17;
        synchronized (nx1.q.class) {
            if (f341318b == Float.MAX_VALUE) {
                android.view.Display defaultDisplay = ((android.view.WindowManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("window")).getDefaultDisplay();
                android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
                defaultDisplay.getMetrics(displayMetrics);
                f341318b = displayMetrics.density * com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getConfiguration().fontScale;
            }
            f17 = f341318b;
        }
        return f17;
    }

    public static int b() {
        float f17;
        if (f341319c == -1) {
            synchronized (nx1.q.class) {
                try {
                    if (f341317a == Float.MAX_VALUE) {
                        android.view.Display defaultDisplay = ((android.view.WindowManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("window")).getDefaultDisplay();
                        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
                        defaultDisplay.getMetrics(displayMetrics);
                        f341317a = displayMetrics.density;
                    }
                    f17 = f341317a;
                } catch (java.lang.Throwable th6) {
                    throw th6;
                }
            }
            f341319c = java.lang.Math.round(f17 * 30.0f);
        }
        return f341319c;
    }
}
