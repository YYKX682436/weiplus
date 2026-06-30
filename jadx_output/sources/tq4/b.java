package tq4;

/* loaded from: classes14.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public android.os.PowerManager.WakeLock f421234a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.SensorController f421235b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.q7 f421236c;

    public b(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f421235b = new com.tencent.mm.sdk.platformtools.SensorController(context);
        this.f421236c = new tq4.a(this);
    }

    public final synchronized void a() {
        android.os.PowerManager.WakeLock wakeLock = this.f421234a;
        if (wakeLock == null || !wakeLock.isHeld()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ScreenSensorController", "repeatedly release screen off wakelock from object: %s, drop this call.", toString());
        } else {
            yj0.a.c(wakeLock, "com/tencent/mm/plugin/voip/screen/ScreenSensorController", "turnOn", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
            wakeLock.release();
            yj0.a.f(wakeLock, "com/tencent/mm/plugin/voip/screen/ScreenSensorController", "turnOn", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
            com.tencent.mars.xlog.Log.i("MicroMsg.ScreenSensorController", "after release screen off wakelock from object: %s, isHeld: %s", toString(), java.lang.Boolean.valueOf(wakeLock.isHeld()));
            this.f421234a = null;
        }
    }
}
