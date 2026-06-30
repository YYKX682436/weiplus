package jh4;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final jh4.c f299846a = new jh4.c();

    /* renamed from: b, reason: collision with root package name */
    public static int f299847b = 20;

    /* renamed from: c, reason: collision with root package name */
    public static float f299848c = 16.0f;

    /* renamed from: d, reason: collision with root package name */
    public static int f299849d;

    public final void a() {
        android.content.SharedPreferences d17 = com.tencent.mm.sdk.platformtools.x2.d();
        int i17 = d17 != null ? d17.getInt("current_draw_fps", 20) : 20;
        f299847b = i17;
        f299848c = (1000.0f / i17) - 20;
        if (i17 == 2) {
            mq.h.b("MicroMsg.DynamicBgSurfaceView", "alvinluo updateAlphaAnimation %d", 1500L);
            nq.f.f338866n = 1500L;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.DynamicBackgroundConfig", "computeSleepTimePerFrame: %f, fps: %d, DEFAULT_DRAW_FPS: %d", java.lang.Float.valueOf(f299848c), java.lang.Integer.valueOf(f299847b), 20);
    }
}
