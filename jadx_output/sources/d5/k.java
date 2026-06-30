package d5;

/* loaded from: classes13.dex */
public class k implements b5.b {

    /* renamed from: q, reason: collision with root package name */
    public static final java.lang.String f226497q = a5.a0.e("SystemAlarmDispatcher");

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f226498d;

    /* renamed from: e, reason: collision with root package name */
    public final m5.a f226499e;

    /* renamed from: f, reason: collision with root package name */
    public final k5.y f226500f;

    /* renamed from: g, reason: collision with root package name */
    public final b5.e f226501g;

    /* renamed from: h, reason: collision with root package name */
    public final b5.w f226502h;

    /* renamed from: i, reason: collision with root package name */
    public final d5.b f226503i;

    /* renamed from: m, reason: collision with root package name */
    public final android.os.Handler f226504m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.List f226505n;

    /* renamed from: o, reason: collision with root package name */
    public android.content.Intent f226506o;

    /* renamed from: p, reason: collision with root package name */
    public d5.i f226507p;

    public k(android.content.Context context) {
        android.content.Context applicationContext = context.getApplicationContext();
        this.f226498d = applicationContext;
        this.f226503i = new d5.b(applicationContext);
        this.f226500f = new k5.y();
        b5.w c17 = b5.w.c(context);
        this.f226502h = c17;
        b5.e eVar = c17.f17900f;
        this.f226501g = eVar;
        this.f226499e = c17.f17898d;
        eVar.a(this);
        this.f226505n = new java.util.ArrayList();
        this.f226506o = null;
        this.f226504m = new android.os.Handler(android.os.Looper.getMainLooper());
    }

    public boolean a(android.content.Intent intent, int i17) {
        boolean z17;
        a5.a0 c17 = a5.a0.c();
        java.lang.String str = f226497q;
        c17.a(str, java.lang.String.format("Adding command %s (%s)", intent, java.lang.Integer.valueOf(i17)), new java.lang.Throwable[0]);
        b();
        java.lang.String action = intent.getAction();
        if (android.text.TextUtils.isEmpty(action)) {
            a5.a0.c().f(str, "Unknown command. Ignoring", new java.lang.Throwable[0]);
            return false;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            b();
            synchronized (this.f226505n) {
                java.util.Iterator it = ((java.util.ArrayList) this.f226505n).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z17 = false;
                        break;
                    }
                    if ("ACTION_CONSTRAINTS_CHANGED".equals(((android.content.Intent) it.next()).getAction())) {
                        z17 = true;
                        break;
                    }
                }
            }
            if (z17) {
                return false;
            }
        }
        intent.putExtra("KEY_START_ID", i17);
        synchronized (this.f226505n) {
            boolean z18 = ((java.util.ArrayList) this.f226505n).isEmpty() ? false : true;
            ((java.util.ArrayList) this.f226505n).add(intent);
            if (!z18) {
                f();
            }
        }
        return true;
    }

    public final void b() {
        if (this.f226504m.getLooper().getThread() != java.lang.Thread.currentThread()) {
            throw new java.lang.IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    public void c() {
        a5.a0.c().a(f226497q, "Destroying SystemAlarmDispatcher", new java.lang.Throwable[0]);
        b5.e eVar = this.f226501g;
        synchronized (eVar.f17868q) {
            ((java.util.ArrayList) eVar.f17867p).remove(this);
        }
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService = this.f226500f.f304172a;
        if (!scheduledExecutorService.isShutdown()) {
            scheduledExecutorService.shutdownNow();
        }
        this.f226507p = null;
    }

    @Override // b5.b
    public void d(java.lang.String str, boolean z17) {
        java.lang.String str2 = d5.b.f226470g;
        android.content.Intent intent = new android.content.Intent(this.f226498d, (java.lang.Class<?>) androidx.work.impl.background.systemalarm.SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z17);
        e(new d5.h(this, intent, 0));
    }

    public void e(java.lang.Runnable runnable) {
        this.f226504m.post(runnable);
    }

    public final void f() {
        b();
        android.os.PowerManager.WakeLock a17 = k5.o.a(this.f226498d, "ProcessCommand");
        try {
            yj0.a.c(a17, "androidx/work/impl/background/systemalarm/SystemAlarmDispatcher", "processCommand", "()V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "()V");
            a17.acquire();
            yj0.a.f(a17, "androidx/work/impl/background/systemalarm/SystemAlarmDispatcher", "processCommand", "()V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "()V");
            ((m5.c) this.f226502h.f17898d).a(new d5.g(this));
        } finally {
            yj0.a.c(a17, "androidx/work/impl/background/systemalarm/SystemAlarmDispatcher", "processCommand", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
            a17.release();
            yj0.a.f(a17, "androidx/work/impl/background/systemalarm/SystemAlarmDispatcher", "processCommand", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
        }
    }
}
