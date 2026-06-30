package z2;

/* loaded from: classes7.dex */
public final class u extends z2.z {

    /* renamed from: a, reason: collision with root package name */
    public final android.os.PowerManager.WakeLock f469521a;

    /* renamed from: b, reason: collision with root package name */
    public final android.os.PowerManager.WakeLock f469522b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f469523c;

    public u(android.content.Context context, android.content.ComponentName componentName) {
        super(componentName);
        context.getApplicationContext();
        android.os.PowerManager powerManager = (android.os.PowerManager) context.getSystemService("power");
        android.os.PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, componentName.getClassName() + ":launch");
        this.f469521a = newWakeLock;
        newWakeLock.setReferenceCounted(false);
        android.os.PowerManager.WakeLock newWakeLock2 = powerManager.newWakeLock(1, componentName.getClassName() + ":run");
        this.f469522b = newWakeLock2;
        newWakeLock2.setReferenceCounted(false);
    }

    @Override // z2.z
    public void a() {
        synchronized (this) {
            if (this.f469523c) {
                this.f469523c = false;
                android.os.PowerManager.WakeLock wakeLock = this.f469522b;
                yj0.a.c(wakeLock, "androidx/core/app/JobIntentService$CompatWorkEnqueuer", "serviceProcessingFinished", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
                wakeLock.release();
                yj0.a.f(wakeLock, "androidx/core/app/JobIntentService$CompatWorkEnqueuer", "serviceProcessingFinished", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
            }
        }
    }

    @Override // z2.z
    public void b() {
        synchronized (this) {
            if (!this.f469523c) {
                this.f469523c = true;
                android.os.PowerManager.WakeLock wakeLock = this.f469522b;
                zj0.a aVar = new zj0.a();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                aVar.c(600000L);
                yj0.a.d(wakeLock, aVar.b(), "androidx/core/app/JobIntentService$CompatWorkEnqueuer", "serviceProcessingStarted", "()V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "(J)V");
                zj0.c.f473285a.set(aVar);
                long longValue = ((java.lang.Long) aVar.a(0)).longValue();
                zj0.c.a();
                wakeLock.acquire(longValue);
                yj0.a.f(wakeLock, "androidx/core/app/JobIntentService$CompatWorkEnqueuer", "serviceProcessingStarted", "()V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "(J)V");
                android.os.PowerManager.WakeLock wakeLock2 = this.f469521a;
                yj0.a.c(wakeLock2, "androidx/core/app/JobIntentService$CompatWorkEnqueuer", "serviceProcessingStarted", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
                wakeLock2.release();
                yj0.a.f(wakeLock2, "androidx/core/app/JobIntentService$CompatWorkEnqueuer", "serviceProcessingStarted", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
            }
        }
    }

    @Override // z2.z
    public void c() {
        synchronized (this) {
        }
    }
}
