package w;

/* loaded from: classes13.dex */
public abstract class f extends android.graphics.drawable.Drawable {

    /* renamed from: a, reason: collision with root package name */
    public static final double f441822a = java.lang.Math.cos(java.lang.Math.toRadians(45.0d));

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f441823b = 0;

    public static float a(float f17, float f18, boolean z17) {
        return z17 ? (float) ((f17 * 1.5f) + ((1.0d - f441822a) * f18)) : f17 * 1.5f;
    }
}
