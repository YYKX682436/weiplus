package l36;

/* loaded from: classes16.dex */
public final class j implements java.io.Closeable, java.io.Flushable {

    /* renamed from: d, reason: collision with root package name */
    public final n36.m f315516d;

    /* renamed from: e, reason: collision with root package name */
    public final n36.k f315517e;

    public j(java.io.File file, long j17) {
        s36.b bVar = s36.b.f402845a;
        this.f315516d = new l36.d(this);
        java.util.regex.Pattern pattern = n36.k.A;
        if (j17 <= 0) {
            throw new java.lang.IllegalArgumentException("maxSize <= 0");
        }
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.SECONDS;
        java.util.concurrent.LinkedBlockingQueue linkedBlockingQueue = new java.util.concurrent.LinkedBlockingQueue();
        byte[] bArr = m36.e.f323386a;
        this.f315517e = new n36.k(bVar, file, 201105, 2, j17, new java.util.concurrent.ThreadPoolExecutor(0, 1, 60L, timeUnit, linkedBlockingQueue, new m36.d("OkHttp DiskLruCache", true)));
    }

    public static java.lang.String a(l36.k0 k0Var) {
        return x36.o.f451696h.a(k0Var.f315538h).k("MD5").m();
    }

    public static int b(x36.m mVar) {
        try {
            long p17 = mVar.p1();
            java.lang.String L0 = mVar.L0();
            if (p17 >= 0 && p17 <= 2147483647L && L0.isEmpty()) {
                return (int) p17;
            }
            throw new java.io.IOException("expected an int but was \"" + p17 + L0 + "\"");
        } catch (java.lang.NumberFormatException e17) {
            throw new java.io.IOException(e17.getMessage());
        }
    }

    public void c(l36.w0 w0Var) {
        n36.k kVar = this.f315517e;
        java.lang.String a17 = a(w0Var.f315681a);
        synchronized (kVar) {
            kVar.i();
            kVar.a();
            kVar.z(a17);
            n36.i iVar = (n36.i) kVar.f334845q.get(a17);
            if (iVar == null) {
                return;
            }
            kVar.w(iVar);
            if (kVar.f334843o <= kVar.f334841m) {
                kVar.f334850v = false;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f315517e.close();
    }

    @Override // java.io.Flushable
    public void flush() {
        this.f315517e.flush();
    }
}
