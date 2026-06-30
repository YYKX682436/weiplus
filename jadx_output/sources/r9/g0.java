package r9;

/* loaded from: classes15.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ExecutorService f393365a;

    /* renamed from: b, reason: collision with root package name */
    public r9.b0 f393366b;

    /* renamed from: c, reason: collision with root package name */
    public java.io.IOException f393367c;

    public g0(java.lang.String str) {
        int i17 = t9.d0.f416498a;
        this.f393365a = java.util.concurrent.Executors.newSingleThreadExecutor(new t9.c0(str));
    }

    public boolean a() {
        return this.f393366b != null;
    }

    public void b() {
        java.io.IOException iOException;
        java.io.IOException iOException2 = this.f393367c;
        if (iOException2 != null) {
            throw iOException2;
        }
        r9.b0 b0Var = this.f393366b;
        if (b0Var != null && (iOException = b0Var.f393346h) != null && b0Var.f393347i > b0Var.f393344f) {
            throw iOException;
        }
    }

    public boolean c(r9.d0 d0Var) {
        r9.b0 b0Var = this.f393366b;
        java.util.concurrent.ExecutorService executorService = this.f393365a;
        boolean z17 = true;
        if (b0Var != null) {
            b0Var.b(true);
            if (d0Var != null) {
                executorService.execute(new r9.e0(d0Var));
            }
        } else if (d0Var != null) {
            d0Var.f();
            executorService.shutdown();
            return z17;
        }
        z17 = false;
        executorService.shutdown();
        return z17;
    }

    public long d(r9.c0 c0Var, r9.a0 a0Var, int i17) {
        android.os.Looper myLooper = android.os.Looper.myLooper();
        t9.a.d(myLooper != null);
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        new r9.b0(this, myLooper, c0Var, a0Var, i17, elapsedRealtime).c(0L);
        return elapsedRealtime;
    }
}
