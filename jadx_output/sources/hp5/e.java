package hp5;

/* loaded from: classes14.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public android.os.PowerManager.WakeLock f282947a;

    /* renamed from: c, reason: collision with root package name */
    public boolean f282949c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f282950d;

    /* renamed from: b, reason: collision with root package name */
    public long f282948b = -1;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f282951e = jz5.h.b(hp5.c.f282945d);

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f282952f = jz5.h.b(hp5.d.f282946d);

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.q7 f282953g = new hp5.b(this);

    public final void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMPSensorController", "disable()");
        ((com.tencent.mm.sdk.platformtools.SensorController) ((jz5.n) this.f282951e).getValue()).a();
        ((com.tencent.mm.sdk.platformtools.s7) ((jz5.n) this.f282952f).getValue()).b();
        b();
    }

    public final synchronized void b() {
        android.os.PowerManager.WakeLock wakeLock = this.f282947a;
        if (wakeLock == null || !wakeLock.isHeld()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.VoIPMPSensorController", "repeatedly release screen off wakelock from object: %s, drop this call.", toString());
        } else {
            yj0.a.c(wakeLock, "com/tencent/mm/voipmp/v2/sensor/VoIPMPSensorController", "turnOn", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
            wakeLock.release();
            yj0.a.f(wakeLock, "com/tencent/mm/voipmp/v2/sensor/VoIPMPSensorController", "turnOn", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
            com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMPSensorController", "after release screen off wakelock from object: %s, isHeld: %s", toString(), java.lang.Boolean.valueOf(wakeLock.isHeld()));
            this.f282947a = null;
        }
    }
}
