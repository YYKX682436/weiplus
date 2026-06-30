package x36;

/* loaded from: classes16.dex */
public class g extends x36.j0 {

    /* renamed from: h, reason: collision with root package name */
    public static final long f451673h;

    /* renamed from: i, reason: collision with root package name */
    public static final long f451674i;

    /* renamed from: j, reason: collision with root package name */
    public static x36.g f451675j;

    /* renamed from: k, reason: collision with root package name */
    public static final x36.c f451676k = new x36.c(null);

    /* renamed from: e, reason: collision with root package name */
    public boolean f451677e;

    /* renamed from: f, reason: collision with root package name */
    public x36.g f451678f;

    /* renamed from: g, reason: collision with root package name */
    public long f451679g;

    static {
        long millis = java.util.concurrent.TimeUnit.SECONDS.toMillis(60L);
        f451673h = millis;
        f451674i = java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public final void i() {
        x36.g gVar;
        long j17 = this.f451692c;
        boolean z17 = this.f451690a;
        if (j17 != 0 || z17) {
            synchronized (x36.g.class) {
                if (!(!this.f451677e)) {
                    throw new java.lang.IllegalStateException("Unbalanced enter/exit".toString());
                }
                this.f451677e = true;
                if (f451675j == null) {
                    f451675j = new x36.g();
                    new x36.d().start();
                }
                long nanoTime = java.lang.System.nanoTime();
                if (j17 != 0 && z17) {
                    this.f451679g = java.lang.Math.min(j17, c() - nanoTime) + nanoTime;
                } else if (j17 != 0) {
                    this.f451679g = j17 + nanoTime;
                } else {
                    if (!z17) {
                        throw new java.lang.AssertionError();
                    }
                    this.f451679g = c();
                }
                long j18 = this.f451679g - nanoTime;
                x36.g gVar2 = f451675j;
                kotlin.jvm.internal.o.d(gVar2);
                while (true) {
                    gVar = gVar2.f451678f;
                    if (gVar == null || j18 < gVar.f451679g - nanoTime) {
                        break;
                    }
                    kotlin.jvm.internal.o.d(gVar);
                    gVar2 = gVar;
                }
                this.f451678f = gVar;
                gVar2.f451678f = this;
                if (gVar2 == f451675j) {
                    x36.g.class.notify();
                }
            }
        }
    }

    public final boolean j() {
        synchronized (x36.g.class) {
            if (!this.f451677e) {
                return false;
            }
            this.f451677e = false;
            x36.g gVar = f451675j;
            while (gVar != null) {
                x36.g gVar2 = gVar.f451678f;
                if (gVar2 == this) {
                    gVar.f451678f = this.f451678f;
                    this.f451678f = null;
                    return false;
                }
                gVar = gVar2;
            }
            return true;
        }
    }

    public java.io.IOException k(java.io.IOException iOException) {
        java.io.InterruptedIOException interruptedIOException = new java.io.InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public void l() {
    }
}
