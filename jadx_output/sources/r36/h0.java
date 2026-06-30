package r36;

/* loaded from: classes16.dex */
public final class h0 implements java.io.Closeable {

    /* renamed from: m, reason: collision with root package name */
    public static final java.util.logging.Logger f369409m = java.util.logging.Logger.getLogger(r36.g.class.getName());

    /* renamed from: d, reason: collision with root package name */
    public final x36.l f369410d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f369411e;

    /* renamed from: f, reason: collision with root package name */
    public final x36.k f369412f;

    /* renamed from: g, reason: collision with root package name */
    public int f369413g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f369414h;

    /* renamed from: i, reason: collision with root package name */
    public final r36.e f369415i;

    public h0(x36.l lVar, boolean z17) {
        this.f369410d = lVar;
        this.f369411e = z17;
        x36.k kVar = new x36.k();
        this.f369412f = kVar;
        this.f369415i = new r36.e(kVar);
        this.f369413g = 16384;
    }

    public synchronized void a(r36.m0 m0Var) {
        if (this.f369414h) {
            throw new java.io.IOException("closed");
        }
        int i17 = this.f369413g;
        int i18 = m0Var.f369440a;
        if ((i18 & 32) != 0) {
            i17 = m0Var.f369441b[5];
        }
        this.f369413g = i17;
        if (((i18 & 2) != 0 ? m0Var.f369441b[1] : -1) != -1) {
            r36.e eVar = this.f369415i;
            int i19 = (i18 & 2) != 0 ? m0Var.f369441b[1] : -1;
            eVar.getClass();
            int min = java.lang.Math.min(i19, 16384);
            int i27 = eVar.f369377d;
            if (i27 != min) {
                if (min < i27) {
                    eVar.f369375b = java.lang.Math.min(eVar.f369375b, min);
                }
                eVar.f369376c = true;
                eVar.f369377d = min;
                int i28 = eVar.f369381h;
                if (min < i28) {
                    if (min == 0) {
                        java.util.Arrays.fill(eVar.f369378e, (java.lang.Object) null);
                        eVar.f369379f = eVar.f369378e.length - 1;
                        eVar.f369380g = 0;
                        eVar.f369381h = 0;
                    } else {
                        eVar.a(i28 - min);
                    }
                }
            }
        }
        c(0, 0, (byte) 4, (byte) 1);
        this.f369410d.flush();
    }

    public synchronized void b(boolean z17, int i17, x36.k kVar, int i18) {
        if (this.f369414h) {
            throw new java.io.IOException("closed");
        }
        c(i17, i18, (byte) 0, z17 ? (byte) 1 : (byte) 0);
        if (i18 > 0) {
            this.f369410d.U(kVar, i18);
        }
    }

    public void c(int i17, int i18, byte b17, byte b18) {
        java.util.logging.Level level = java.util.logging.Level.FINE;
        java.util.logging.Logger logger = f369409m;
        if (logger.isLoggable(level)) {
            logger.fine(r36.g.a(false, i17, i18, b17, b18));
        }
        int i19 = this.f369413g;
        if (i18 > i19) {
            java.lang.Object[] objArr = {java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i18)};
            x36.o oVar = r36.g.f369391a;
            throw new java.lang.IllegalArgumentException(m36.e.j("FRAME_SIZE_ERROR length > %d: %d", objArr));
        }
        if ((Integer.MIN_VALUE & i17) != 0) {
            java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(i17)};
            x36.o oVar2 = r36.g.f369391a;
            throw new java.lang.IllegalArgumentException(m36.e.j("reserved bit set: %s", objArr2));
        }
        x36.l lVar = this.f369410d;
        lVar.e((i18 >>> 16) & 255);
        lVar.e((i18 >>> 8) & 255);
        lVar.e(i18 & 255);
        lVar.e(b17 & 255);
        lVar.e(b18 & 255);
        lVar.o(i17 & Integer.MAX_VALUE);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.f369414h = true;
        this.f369410d.close();
    }

    public synchronized void f(int i17, r36.b bVar, byte[] bArr) {
        if (this.f369414h) {
            throw new java.io.IOException("closed");
        }
        if (bVar.f369347d == -1) {
            x36.o oVar = r36.g.f369391a;
            throw new java.lang.IllegalArgumentException(m36.e.j("errorCode.httpCode == -1", new java.lang.Object[0]));
        }
        c(0, bArr.length + 8, (byte) 7, (byte) 0);
        this.f369410d.o(i17);
        this.f369410d.o(bVar.f369347d);
        if (bArr.length > 0) {
            this.f369410d.write(bArr);
        }
        this.f369410d.flush();
    }

    public void i(boolean z17, int i17, java.util.List list) {
        if (this.f369414h) {
            throw new java.io.IOException("closed");
        }
        this.f369415i.d(list);
        x36.k kVar = this.f369412f;
        long j17 = kVar.f451694e;
        int min = (int) java.lang.Math.min(this.f369413g, j17);
        long j18 = min;
        byte b17 = j17 == j18 ? (byte) 4 : (byte) 0;
        if (z17) {
            b17 = (byte) (b17 | 1);
        }
        c(i17, min, (byte) 1, b17);
        this.f369410d.U(kVar, j18);
        if (j17 > j18) {
            p(i17, j17 - j18);
        }
    }

    public synchronized void j(boolean z17, int i17, int i18) {
        if (this.f369414h) {
            throw new java.io.IOException("closed");
        }
        c(0, 8, (byte) 6, z17 ? (byte) 1 : (byte) 0);
        this.f369410d.o(i17);
        this.f369410d.o(i18);
        this.f369410d.flush();
    }

    public synchronized void k(int i17, r36.b bVar) {
        if (this.f369414h) {
            throw new java.io.IOException("closed");
        }
        if (bVar.f369347d == -1) {
            throw new java.lang.IllegalArgumentException();
        }
        c(i17, 4, (byte) 3, (byte) 0);
        this.f369410d.o(bVar.f369347d);
        this.f369410d.flush();
    }

    public synchronized void l(int i17, long j17) {
        if (this.f369414h) {
            throw new java.io.IOException("closed");
        }
        if (j17 == 0 || j17 > 2147483647L) {
            java.lang.Object[] objArr = {java.lang.Long.valueOf(j17)};
            x36.o oVar = r36.g.f369391a;
            throw new java.lang.IllegalArgumentException(m36.e.j("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", objArr));
        }
        c(i17, 4, (byte) 8, (byte) 0);
        this.f369410d.o((int) j17);
        this.f369410d.flush();
    }

    public final void p(int i17, long j17) {
        while (j17 > 0) {
            int min = (int) java.lang.Math.min(this.f369413g, j17);
            long j18 = min;
            j17 -= j18;
            c(i17, min, (byte) 9, j17 == 0 ? (byte) 4 : (byte) 0);
            this.f369410d.U(this.f369412f, j18);
        }
    }
}
