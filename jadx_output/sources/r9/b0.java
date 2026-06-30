package r9;

/* loaded from: classes15.dex */
public final class b0 extends android.os.Handler implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final r9.c0 f393342d;

    /* renamed from: e, reason: collision with root package name */
    public final r9.a0 f393343e;

    /* renamed from: f, reason: collision with root package name */
    public final int f393344f;

    /* renamed from: g, reason: collision with root package name */
    public final long f393345g;

    /* renamed from: h, reason: collision with root package name */
    public java.io.IOException f393346h;

    /* renamed from: i, reason: collision with root package name */
    public int f393347i;

    /* renamed from: m, reason: collision with root package name */
    public volatile java.lang.Thread f393348m;

    /* renamed from: n, reason: collision with root package name */
    public volatile boolean f393349n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ r9.g0 f393350o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(r9.g0 g0Var, android.os.Looper looper, r9.c0 c0Var, r9.a0 a0Var, int i17, long j17) {
        super(looper);
        this.f393350o = g0Var;
        this.f393342d = c0Var;
        this.f393343e = a0Var;
        this.f393344f = i17;
        this.f393345g = j17;
    }

    public void b(boolean z17) {
        this.f393349n = z17;
        this.f393346h = null;
        if (hasMessages(0)) {
            removeMessages(0);
            if (!z17) {
                sendEmptyMessage(1);
            }
        } else {
            this.f393342d.c();
            if (this.f393348m != null) {
                this.f393348m.interrupt();
            }
        }
        if (z17) {
            this.f393350o.f393366b = null;
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            this.f393343e.q(this.f393342d, elapsedRealtime, elapsedRealtime - this.f393345g, true);
        }
    }

    public void c(long j17) {
        r9.g0 g0Var = this.f393350o;
        t9.a.d(g0Var.f393366b == null);
        g0Var.f393366b = this;
        if (j17 > 0) {
            sendEmptyMessageDelayed(0, j17);
        } else {
            this.f393346h = null;
            g0Var.f393365a.execute(g0Var.f393366b);
        }
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message message) {
        if (this.f393349n) {
            return;
        }
        int i17 = message.what;
        if (i17 == 0) {
            this.f393346h = null;
            r9.g0 g0Var = this.f393350o;
            g0Var.f393365a.execute(g0Var.f393366b);
            return;
        }
        if (i17 == 4) {
            throw ((java.lang.Error) message.obj);
        }
        this.f393350o.f393366b = null;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        long j17 = elapsedRealtime - this.f393345g;
        if (this.f393342d.b()) {
            this.f393343e.q(this.f393342d, elapsedRealtime, j17, false);
            return;
        }
        int i18 = message.what;
        if (i18 == 1) {
            this.f393343e.q(this.f393342d, elapsedRealtime, j17, false);
            return;
        }
        if (i18 == 2) {
            this.f393343e.e(this.f393342d, elapsedRealtime, j17);
            return;
        }
        if (i18 != 3) {
            return;
        }
        java.io.IOException iOException = (java.io.IOException) message.obj;
        this.f393346h = iOException;
        int g17 = this.f393343e.g(this.f393342d, elapsedRealtime, j17, iOException);
        if (g17 == 3) {
            this.f393350o.f393367c = this.f393346h;
        } else if (g17 != 2) {
            this.f393347i = g17 != 1 ? 1 + this.f393347i : 1;
            c(java.lang.Math.min((r1 - 1) * 1000, 5000));
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f393348m = java.lang.Thread.currentThread();
            if (!this.f393342d.b()) {
                this.f393342d.getClass();
                int i17 = t9.d0.f416498a;
                try {
                    this.f393342d.a();
                } catch (java.lang.Throwable th6) {
                    int i18 = t9.d0.f416498a;
                    throw th6;
                }
            }
            if (this.f393349n) {
                return;
            }
            sendEmptyMessage(2);
        } catch (java.io.IOException e17) {
            if (this.f393349n) {
                return;
            }
            obtainMessage(3, e17).sendToTarget();
        } catch (java.lang.OutOfMemoryError e18) {
            if (this.f393349n) {
                return;
            }
            obtainMessage(3, new r9.f0(e18)).sendToTarget();
        } catch (java.lang.Error e19) {
            if (!this.f393349n) {
                obtainMessage(4, e19).sendToTarget();
            }
            throw e19;
        } catch (java.lang.InterruptedException unused) {
            t9.a.d(this.f393342d.b());
            if (this.f393349n) {
                return;
            }
            sendEmptyMessage(2);
        } catch (java.lang.Exception e27) {
            if (this.f393349n) {
                return;
            }
            obtainMessage(3, new r9.f0(e27)).sendToTarget();
        }
    }
}
