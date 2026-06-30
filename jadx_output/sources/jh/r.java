package jh;

/* loaded from: classes13.dex */
public final class r extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public android.os.CancellationSignal f299742a;

    /* renamed from: b, reason: collision with root package name */
    public final android.os.Handler f299743b;

    /* renamed from: c, reason: collision with root package name */
    public final android.content.Context f299744c;

    /* renamed from: d, reason: collision with root package name */
    public final jh.f0 f299745d;

    /* renamed from: e, reason: collision with root package name */
    public final long f299746e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Set f299747f = new java.util.HashSet();

    public r(android.content.Context context, android.os.Handler handler, jh.f0 f0Var, long j17) {
        this.f299744c = context;
        this.f299743b = handler;
        this.f299745d = f0Var;
        this.f299746e = j17;
    }

    public synchronized void a(android.content.Context context) {
        int intExtra;
        boolean isInteractive = ((android.os.PowerManager) context.getSystemService("power")).isInteractive();
        android.content.IntentFilter intentFilter = new android.content.IntentFilter("android.intent.action.BATTERY_CHANGED");
        android.content.Intent registerReceiver = (android.os.Build.VERSION.SDK_INT < 33 || context.getApplicationInfo().targetSdkVersion < 34) ? context.registerReceiver(null, intentFilter) : context.registerReceiver(null, intentFilter, 4);
        boolean z17 = false;
        if (registerReceiver != null && ((intExtra = registerReceiver.getIntExtra("status", -1)) == 2 || intExtra == 5)) {
            z17 = true;
        }
        b(isInteractive, z17);
    }

    public final synchronized void b(boolean z17, boolean z18) {
        oj.j.c("Matrix.WarmUpScheduler", "Idle status changed: interactive = %s, charging = %s", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18));
        boolean z19 = !z17 && (this.f299745d == jh.f0.WhileScreenOff || !z18);
        if (z19 && this.f299742a == null) {
            this.f299742a = new android.os.CancellationSignal();
            java.util.Iterator it = ((java.util.HashSet) this.f299747f).iterator();
            while (it.hasNext()) {
                int ordinal = ((jh.s) it.next()).ordinal();
                if (ordinal != 0) {
                    if (ordinal == 1) {
                        if (jh.a0.g(this.f299744c)) {
                            android.os.Handler handler = this.f299743b;
                            handler.sendMessageDelayed(android.os.Message.obtain(handler, 3, this.f299742a), 3000L);
                        } else {
                            it.remove();
                        }
                        oj.j.c("Matrix.WarmUpScheduler", "System idle, trigger clean up in %s seconds.", 3L);
                    } else if (ordinal == 2) {
                        android.os.Handler handler2 = this.f299743b;
                        handler2.sendMessageDelayed(android.os.Message.obtain(handler2, 2, this.f299742a), this.f299746e);
                        oj.j.c("Matrix.WarmUpScheduler", "System idle, trigger consume requested qut in %s seconds.", java.lang.Long.valueOf(this.f299746e / 1000));
                    } else if (ordinal == 3) {
                        if (jh.a0.i(this.f299744c)) {
                            android.os.Handler handler3 = this.f299743b;
                            handler3.sendMessageDelayed(android.os.Message.obtain(handler3, 4, this.f299742a), 3000L);
                        } else {
                            it.remove();
                        }
                        oj.j.c("Matrix.WarmUpScheduler", "System idle, trigger disk usage in %s seconds.", 3L);
                    }
                } else if (jh.a0.l(this.f299744c).exists()) {
                    it.remove();
                } else {
                    android.os.Handler handler4 = this.f299743b;
                    handler4.sendMessageDelayed(android.os.Message.obtain(handler4, 1, this.f299742a), this.f299746e);
                    oj.j.c("Matrix.WarmUpScheduler", "System idle, trigger warm up in %s seconds.", java.lang.Long.valueOf(this.f299746e / 1000));
                }
            }
        } else if (!z19 && this.f299742a != null) {
            this.f299743b.removeMessages(1);
            this.f299743b.removeMessages(2);
            this.f299743b.removeMessages(3);
            this.f299743b.removeMessages(4);
            this.f299742a.cancel();
            this.f299742a = null;
            oj.j.c("Matrix.WarmUpScheduler", "Exit idle state, task cancelled.", new java.lang.Object[0]);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        char c17;
        java.lang.String action = intent.getAction();
        if (action == null) {
            return;
        }
        synchronized (this) {
            boolean z17 = true;
            boolean z18 = false;
            switch (action.hashCode()) {
                case -2128145023:
                    if (action.equals("android.intent.action.SCREEN_OFF")) {
                        c17 = 1;
                        break;
                    }
                    c17 = 65535;
                    break;
                case -1886648615:
                    if (action.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
                        c17 = 3;
                        break;
                    }
                    c17 = 65535;
                    break;
                case -1454123155:
                    if (action.equals("android.intent.action.SCREEN_ON")) {
                        c17 = 0;
                        break;
                    }
                    c17 = 65535;
                    break;
                case 1019184907:
                    if (action.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
                        c17 = 2;
                        break;
                    }
                    c17 = 65535;
                    break;
                default:
                    c17 = 65535;
                    break;
            }
            if (c17 != 0) {
                if (c17 == 1 || c17 != 2) {
                    z17 = false;
                } else {
                    z18 = true;
                    z17 = false;
                }
            }
            b(z17, z18);
        }
    }
}
