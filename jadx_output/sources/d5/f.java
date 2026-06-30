package d5;

/* loaded from: classes13.dex */
public class f implements f5.c, b5.b, k5.w {

    /* renamed from: p, reason: collision with root package name */
    public static final java.lang.String f226482p = a5.a0.e("DelayMetCommandHandler");

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f226483d;

    /* renamed from: e, reason: collision with root package name */
    public final int f226484e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f226485f;

    /* renamed from: g, reason: collision with root package name */
    public final d5.k f226486g;

    /* renamed from: h, reason: collision with root package name */
    public final f5.d f226487h;

    /* renamed from: n, reason: collision with root package name */
    public android.os.PowerManager.WakeLock f226490n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f226491o = false;

    /* renamed from: m, reason: collision with root package name */
    public int f226489m = 0;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.Object f226488i = new java.lang.Object();

    public f(android.content.Context context, int i17, java.lang.String str, d5.k kVar) {
        this.f226483d = context;
        this.f226484e = i17;
        this.f226486g = kVar;
        this.f226485f = str;
        this.f226487h = new f5.d(context, kVar.f226499e, this);
    }

    @Override // f5.c
    public void a(java.util.List list) {
        e();
    }

    public final void b() {
        synchronized (this.f226488i) {
            this.f226487h.c();
            this.f226486g.f226500f.b(this.f226485f);
            android.os.PowerManager.WakeLock wakeLock = this.f226490n;
            if (wakeLock != null && wakeLock.isHeld()) {
                a5.a0.c().a(f226482p, java.lang.String.format("Releasing wakelock %s for WorkSpec %s", this.f226490n, this.f226485f), new java.lang.Throwable[0]);
                android.os.PowerManager.WakeLock wakeLock2 = this.f226490n;
                yj0.a.c(wakeLock2, "androidx/work/impl/background/systemalarm/DelayMetCommandHandler", "cleanUp", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
                wakeLock2.release();
                yj0.a.f(wakeLock2, "androidx/work/impl/background/systemalarm/DelayMetCommandHandler", "cleanUp", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
            }
        }
    }

    public void c() {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f226484e);
        java.lang.String str = this.f226485f;
        this.f226490n = k5.o.a(this.f226483d, java.lang.String.format("%s (%s)", str, valueOf));
        java.lang.String str2 = f226482p;
        a5.a0.c().a(str2, java.lang.String.format("Acquiring wakelock %s for WorkSpec %s", this.f226490n, str), new java.lang.Throwable[0]);
        android.os.PowerManager.WakeLock wakeLock = this.f226490n;
        yj0.a.c(wakeLock, "androidx/work/impl/background/systemalarm/DelayMetCommandHandler", "handleProcessWork", "()V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "()V");
        wakeLock.acquire();
        yj0.a.f(wakeLock, "androidx/work/impl/background/systemalarm/DelayMetCommandHandler", "handleProcessWork", "()V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "()V");
        j5.w i17 = ((j5.g0) this.f226486g.f226502h.f17897c.n()).i(str);
        if (i17 == null) {
            e();
            return;
        }
        boolean b17 = i17.b();
        this.f226491o = b17;
        if (b17) {
            this.f226487h.b(java.util.Collections.singletonList(i17));
        } else {
            a5.a0.c().a(str2, java.lang.String.format("No constraints for %s", str), new java.lang.Throwable[0]);
            f(java.util.Collections.singletonList(str));
        }
    }

    @Override // b5.b
    public void d(java.lang.String str, boolean z17) {
        a5.a0.c().a(f226482p, java.lang.String.format("onExecuted %s, %s", str, java.lang.Boolean.valueOf(z17)), new java.lang.Throwable[0]);
        b();
        int i17 = this.f226484e;
        d5.k kVar = this.f226486g;
        android.content.Context context = this.f226483d;
        if (z17) {
            kVar.e(new d5.h(kVar, d5.b.b(context, this.f226485f), i17));
        }
        if (this.f226491o) {
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) androidx.work.impl.background.systemalarm.SystemAlarmService.class);
            intent.setAction("ACTION_CONSTRAINTS_CHANGED");
            kVar.e(new d5.h(kVar, intent, i17));
        }
    }

    public final void e() {
        synchronized (this.f226488i) {
            if (this.f226489m < 2) {
                this.f226489m = 2;
                a5.a0 c17 = a5.a0.c();
                java.lang.String str = f226482p;
                c17.a(str, java.lang.String.format("Stopping work for WorkSpec %s", this.f226485f), new java.lang.Throwable[0]);
                android.content.Context context = this.f226483d;
                java.lang.String str2 = this.f226485f;
                android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) androidx.work.impl.background.systemalarm.SystemAlarmService.class);
                intent.setAction("ACTION_STOP_WORK");
                intent.putExtra("KEY_WORKSPEC_ID", str2);
                d5.k kVar = this.f226486g;
                kVar.e(new d5.h(kVar, intent, this.f226484e));
                if (this.f226486g.f226501g.c(this.f226485f)) {
                    a5.a0.c().a(str, java.lang.String.format("WorkSpec %s needs to be rescheduled", this.f226485f), new java.lang.Throwable[0]);
                    android.content.Intent b17 = d5.b.b(this.f226483d, this.f226485f);
                    d5.k kVar2 = this.f226486g;
                    kVar2.e(new d5.h(kVar2, b17, this.f226484e));
                } else {
                    a5.a0.c().a(str, java.lang.String.format("Processor does not have WorkSpec %s. No need to reschedule ", this.f226485f), new java.lang.Throwable[0]);
                }
            } else {
                a5.a0.c().a(f226482p, java.lang.String.format("Already stopped work for %s", this.f226485f), new java.lang.Throwable[0]);
            }
        }
    }

    @Override // f5.c
    public void f(java.util.List list) {
        if (list.contains(this.f226485f)) {
            synchronized (this.f226488i) {
                if (this.f226489m == 0) {
                    this.f226489m = 1;
                    a5.a0.c().a(f226482p, java.lang.String.format("onAllConstraintsMet for %s", this.f226485f), new java.lang.Throwable[0]);
                    if (this.f226486g.f226501g.f(this.f226485f, null)) {
                        this.f226486g.f226500f.a(this.f226485f, 600000L, this);
                    } else {
                        b();
                    }
                } else {
                    a5.a0.c().a(f226482p, java.lang.String.format("Already started work for %s", this.f226485f), new java.lang.Throwable[0]);
                }
            }
        }
    }
}
