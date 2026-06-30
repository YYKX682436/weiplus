package hp5;

/* loaded from: classes14.dex */
public final class b implements com.tencent.mm.sdk.platformtools.q7 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hp5.e f282944d;

    public b(hp5.e eVar) {
        this.f282944d = eVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.q7
    public final void f1(boolean z17) {
        com.tencent.mars.xlog.Log.w("MicroMsg.VoIPMPSensorController", "Sensor callback: on=" + z17);
        hp5.e eVar = this.f282944d;
        if (eVar.f282949c) {
            boolean z18 = !z17;
            eVar.f282949c = z18;
            com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMPSensorController", "onSensorEvent has skip and val is %s", java.lang.Boolean.valueOf(z18));
            return;
        }
        if (!z17) {
            long j17 = eVar.f282948b;
            if (j17 != -1) {
                boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                if (android.os.SystemClock.elapsedRealtime() - j17 > 400) {
                    this.f282944d.f282949c = true;
                    com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMPSensorController", "onSensorEvent has skip case shake near to small");
                    return;
                }
            }
        }
        hp5.e eVar2 = this.f282944d;
        eVar2.f282949c = false;
        if (z17) {
            eVar2.b();
            return;
        }
        synchronized (eVar2) {
            java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("power");
            kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.os.PowerManager");
            android.os.PowerManager powerManager = (android.os.PowerManager) systemService;
            android.os.PowerManager.WakeLock wakeLock = eVar2.f282947a;
            if (wakeLock == null) {
                wakeLock = powerManager.newWakeLock(32, "wechat:screen multi-talk");
                eVar2.f282947a = wakeLock;
            }
            android.os.PowerManager.WakeLock wakeLock2 = wakeLock;
            if (wakeLock2.isHeld()) {
                com.tencent.mars.xlog.Log.w("MicroMsg.VoIPMPSensorController", "repeatedly acquire screen off wakelock from object: %s, drop this call.", eVar2.toString());
            } else {
                yj0.a.c(wakeLock2, "com/tencent/mm/voipmp/v2/sensor/VoIPMPSensorController", "turnOff", "()V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "()V");
                wakeLock2.acquire();
                yj0.a.f(wakeLock2, "com/tencent/mm/voipmp/v2/sensor/VoIPMPSensorController", "turnOff", "()V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "()V");
                com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMPSensorController", "after acquire screen off wakelock from object: %s, isHeld: %s", eVar2.toString(), java.lang.Boolean.valueOf(wakeLock2.isHeld()));
            }
        }
    }
}
