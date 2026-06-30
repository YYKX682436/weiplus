package tq4;

/* loaded from: classes14.dex */
public final class a implements com.tencent.mm.sdk.platformtools.q7 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tq4.b f421233d;

    public a(tq4.b bVar) {
        this.f421233d = bVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.q7
    public final void f1(boolean z17) {
        com.tencent.mars.xlog.Log.w("MicroMsg.ScreenSensorController", "Sensor callback: on=" + z17);
        if (z17) {
            this.f421233d.a();
            return;
        }
        tq4.b bVar = this.f421233d;
        synchronized (bVar) {
            java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("power");
            kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.os.PowerManager");
            android.os.PowerManager powerManager = (android.os.PowerManager) systemService;
            android.os.PowerManager.WakeLock wakeLock = bVar.f421234a;
            if (wakeLock == null) {
                wakeLock = powerManager.newWakeLock(32, "wechat:screen multi-talk");
                bVar.f421234a = wakeLock;
            }
            android.os.PowerManager.WakeLock wakeLock2 = wakeLock;
            if (wakeLock2.isHeld()) {
                com.tencent.mars.xlog.Log.w("MicroMsg.ScreenSensorController", "repeatedly acquire screen off wakelock from object: %s, drop this call.", bVar.toString());
            } else {
                yj0.a.c(wakeLock2, "com/tencent/mm/plugin/voip/screen/ScreenSensorController", "turnOff", "()V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "()V");
                wakeLock2.acquire();
                yj0.a.f(wakeLock2, "com/tencent/mm/plugin/voip/screen/ScreenSensorController", "turnOff", "()V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "()V");
                com.tencent.mars.xlog.Log.i("MicroMsg.ScreenSensorController", "after acquire screen off wakelock from object: %s, isHeld: %s", bVar.toString(), java.lang.Boolean.valueOf(wakeLock2.isHeld()));
            }
        }
    }
}
