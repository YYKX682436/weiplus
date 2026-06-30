package d5;

/* loaded from: classes13.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d5.k f226492d;

    public g(d5.k kVar) {
        this.f226492d = kVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        d5.k kVar;
        d5.j jVar;
        synchronized (this.f226492d.f226505n) {
            d5.k kVar2 = this.f226492d;
            kVar2.f226506o = (android.content.Intent) ((java.util.ArrayList) kVar2.f226505n).get(0);
        }
        android.content.Intent intent = this.f226492d.f226506o;
        if (intent != null) {
            java.lang.String action = intent.getAction();
            int intExtra = this.f226492d.f226506o.getIntExtra("KEY_START_ID", 0);
            a5.a0 c17 = a5.a0.c();
            java.lang.String str = d5.k.f226497q;
            c17.a(str, java.lang.String.format("Processing command %s, %s", this.f226492d.f226506o, java.lang.Integer.valueOf(intExtra)), new java.lang.Throwable[0]);
            android.os.PowerManager.WakeLock a17 = k5.o.a(this.f226492d.f226498d, java.lang.String.format("%s (%s)", action, java.lang.Integer.valueOf(intExtra)));
            try {
                a5.a0.c().a(str, java.lang.String.format("Acquiring operation wake lock (%s) %s", action, a17), new java.lang.Throwable[0]);
                yj0.a.c(a17, "androidx/work/impl/background/systemalarm/SystemAlarmDispatcher$1", "run", "()V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "()V");
                a17.acquire();
                yj0.a.f(a17, "androidx/work/impl/background/systemalarm/SystemAlarmDispatcher$1", "run", "()V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "()V");
                d5.k kVar3 = this.f226492d;
                kVar3.f226503i.c(kVar3.f226506o, intExtra, kVar3);
                a5.a0.c().a(str, java.lang.String.format("Releasing operation wake lock (%s) %s", action, a17), new java.lang.Throwable[0]);
                yj0.a.c(a17, "androidx/work/impl/background/systemalarm/SystemAlarmDispatcher$1", "run", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
                a17.release();
                yj0.a.f(a17, "androidx/work/impl/background/systemalarm/SystemAlarmDispatcher$1", "run", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
                kVar = this.f226492d;
                jVar = new d5.j(kVar);
            } catch (java.lang.Throwable th6) {
                try {
                    a5.a0 c18 = a5.a0.c();
                    java.lang.String str2 = d5.k.f226497q;
                    c18.b(str2, "Unexpected error in onHandleIntent", th6);
                    a5.a0.c().a(str2, java.lang.String.format("Releasing operation wake lock (%s) %s", action, a17), new java.lang.Throwable[0]);
                    yj0.a.c(a17, "androidx/work/impl/background/systemalarm/SystemAlarmDispatcher$1", "run", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
                    a17.release();
                    yj0.a.f(a17, "androidx/work/impl/background/systemalarm/SystemAlarmDispatcher$1", "run", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
                    kVar = this.f226492d;
                    jVar = new d5.j(kVar);
                } catch (java.lang.Throwable th7) {
                    a5.a0.c().a(d5.k.f226497q, java.lang.String.format("Releasing operation wake lock (%s) %s", action, a17), new java.lang.Throwable[0]);
                    yj0.a.c(a17, "androidx/work/impl/background/systemalarm/SystemAlarmDispatcher$1", "run", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
                    a17.release();
                    yj0.a.f(a17, "androidx/work/impl/background/systemalarm/SystemAlarmDispatcher$1", "run", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
                    d5.k kVar4 = this.f226492d;
                    kVar4.e(new d5.j(kVar4));
                    throw th7;
                }
            }
            kVar.e(jVar);
        }
    }
}
