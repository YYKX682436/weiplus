package mz4;

/* loaded from: classes12.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static float f333223a = Float.MAX_VALUE;

    /* renamed from: b, reason: collision with root package name */
    public static float f333224b = Float.MAX_VALUE;

    /* renamed from: c, reason: collision with root package name */
    public static int f333225c = -1;

    /* renamed from: d, reason: collision with root package name */
    public static float f333226d = 48.0f;

    public static float a() {
        float f17;
        synchronized (mz4.b.class) {
            if (f333224b == Float.MAX_VALUE) {
                android.view.Display defaultDisplay = ((android.view.WindowManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("window")).getDefaultDisplay();
                android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
                defaultDisplay.getMetrics(displayMetrics);
                f333224b = displayMetrics.density * com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getConfiguration().fontScale;
            }
            f17 = f333224b;
        }
        return f17;
    }

    public static int b() {
        float f17;
        if (f333225c == -1) {
            synchronized (mz4.b.class) {
                try {
                    if (f333223a == Float.MAX_VALUE) {
                        android.view.Display defaultDisplay = ((android.view.WindowManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("window")).getDefaultDisplay();
                        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
                        defaultDisplay.getMetrics(displayMetrics);
                        f333223a = displayMetrics.density;
                    }
                    f17 = f333223a;
                } catch (java.lang.Throwable th6) {
                    throw th6;
                }
            }
            f333225c = java.lang.Math.round(f17 * 30.0f);
        }
        return f333225c;
    }
}
