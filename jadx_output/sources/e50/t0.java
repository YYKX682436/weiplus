package e50;

/* loaded from: classes11.dex */
public final class t0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final e50.t0 f249535d = new e50.t0();

    @Override // java.lang.Runnable
    public final void run() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        androidx.window.layout.WindowInfoTracker.Companion companion = androidx.window.layout.WindowInfoTracker.INSTANCE;
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        companion.getOrCreate(context);
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterEngineService", "WindowInfoTracker: cost:" + (java.lang.System.currentTimeMillis() - currentTimeMillis));
    }
}
