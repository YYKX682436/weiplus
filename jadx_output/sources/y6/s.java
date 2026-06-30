package y6;

/* loaded from: classes13.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final int f459608a;

    /* renamed from: b, reason: collision with root package name */
    public final int f459609b;

    /* renamed from: c, reason: collision with root package name */
    public final int f459610c;

    public s(y6.p pVar) {
        android.content.Context context = pVar.f459603a;
        android.app.ActivityManager activityManager = pVar.f459604b;
        int i17 = activityManager.isLowRamDevice() ? 2097152 : 4194304;
        this.f459610c = i17;
        int round = java.lang.Math.round(activityManager.getMemoryClass() * 1024 * 1024 * (activityManager.isLowRamDevice() ? 0.33f : 0.4f));
        android.util.DisplayMetrics displayMetrics = ((y6.q) pVar.f459605c).f459607a;
        float f17 = displayMetrics.widthPixels * displayMetrics.heightPixels * 4;
        float f18 = pVar.f459606d;
        int round2 = java.lang.Math.round(f17 * f18);
        int round3 = java.lang.Math.round(f17 * 2.0f);
        int i18 = round - i17;
        if (round3 + round2 <= i18) {
            this.f459609b = round3;
            this.f459608a = round2;
        } else {
            float f19 = i18 / (f18 + 2.0f);
            this.f459609b = java.lang.Math.round(2.0f * f19);
            this.f459608a = java.lang.Math.round(f19 * f18);
        }
        if (android.util.Log.isLoggable("MemorySizeCalculator", 3)) {
            android.text.format.Formatter.formatFileSize(context, this.f459609b);
            android.text.format.Formatter.formatFileSize(context, this.f459608a);
            android.text.format.Formatter.formatFileSize(context, i17);
            android.text.format.Formatter.formatFileSize(context, round);
            activityManager.getMemoryClass();
            activityManager.isLowRamDevice();
        }
    }
}
