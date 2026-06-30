package re1;

/* loaded from: classes13.dex */
public class d implements se1.f {

    /* renamed from: a, reason: collision with root package name */
    public final re1.b f394301a;

    /* renamed from: b, reason: collision with root package name */
    public final long f394302b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.vfs.r6 f394303c;

    /* renamed from: d, reason: collision with root package name */
    public se1.i f394304d;

    /* renamed from: e, reason: collision with root package name */
    public java.io.BufferedOutputStream f394305e;

    /* renamed from: f, reason: collision with root package name */
    public java.io.OutputStream f394306f;

    /* renamed from: g, reason: collision with root package name */
    public long f394307g;

    /* renamed from: h, reason: collision with root package name */
    public long f394308h;

    /* renamed from: i, reason: collision with root package name */
    public long f394309i = -1;

    /* renamed from: j, reason: collision with root package name */
    public te1.b f394310j = te1.b.f417768c;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f394311k = "";

    public d(re1.b bVar, long j17) {
        this.f394301a = bVar;
        this.f394302b = j17;
    }

    public void a() {
        try {
            b();
            ve1.g.p(4, c(), "close outputStream, " + java.lang.String.format("total cached %d bytes", java.lang.Long.valueOf(this.f394308h)), null);
        } catch (java.io.IOException e17) {
            throw new re1.c(e17);
        }
    }

    public final void b() {
        java.io.BufferedOutputStream bufferedOutputStream = this.f394305e;
        if (bufferedOutputStream == null) {
            ve1.g.p(4, c(), "finish cache, outputStream is null", null);
            return;
        }
        try {
            bufferedOutputStream.flush();
            try {
                this.f394305e.close();
            } catch (java.io.IOException unused) {
            }
            re1.b bVar = this.f394301a;
            com.tencent.mm.vfs.r6 r6Var = this.f394303c;
            re1.m mVar = (re1.m) bVar;
            synchronized (mVar) {
                re1.i b17 = re1.i.b(r6Var);
                ve1.a.a(b17 != null);
                ve1.a.a(mVar.f394351d.containsKey(b17.f394335d));
                if (r6Var.m()) {
                    if (r6Var.C() == 0) {
                        r6Var.l();
                    } else {
                        mVar.b(b17);
                        mVar.notifyAll();
                    }
                }
            }
            ve1.g.p(4, c(), "finish cache " + this.f394303c.o() + "  fileSize=" + this.f394303c.C(), null);
            this.f394306f = null;
            this.f394305e = null;
            this.f394303c = null;
        } catch (java.lang.Throwable th6) {
            try {
                this.f394305e.close();
            } catch (java.io.IOException unused2) {
            }
            this.f394303c.l();
            ve1.g.p(6, c(), "close outputStream failed: " + this.f394303c.o(), null);
            this.f394306f = null;
            this.f394305e = null;
            this.f394303c = null;
            throw th6;
        }
    }

    public java.lang.String c() {
        return this.f394311k + "CacheDataSink";
    }

    public void d() {
        com.tencent.mm.vfs.r6 d17;
        re1.b bVar = this.f394301a;
        se1.i iVar = this.f394304d;
        java.lang.String str = iVar.f406776e;
        long j17 = iVar.f406773b;
        long j18 = this.f394308h;
        long j19 = j17 + j18;
        long j27 = this.f394309i;
        te1.b bVar2 = this.f394310j;
        long min = java.lang.Math.min(iVar.f406775d - j18, this.f394302b);
        re1.m mVar = (re1.m) bVar;
        synchronized (mVar) {
            ve1.a.a(mVar.f394351d.containsKey(str));
            if (!mVar.f394349b.m()) {
                mVar.g();
                mVar.f394349b.J();
            }
            ((re1.k) mVar.f394350c).a(mVar, min);
            d17 = re1.i.d(mVar.f394349b, str, j19, j27, bVar2, java.lang.System.currentTimeMillis());
        }
        this.f394303c = d17;
        ve1.g.p(4, c(), "start cache " + this.f394303c.o(), null);
        this.f394306f = com.tencent.mm.vfs.w6.H(this.f394303c);
        this.f394305e = new java.io.BufferedOutputStream(this.f394306f);
        this.f394307g = 0L;
    }

    public void e(byte[] bArr, int i17, int i18) {
        int i19 = 0;
        while (i19 < i18) {
            try {
                long j17 = this.f394307g;
                long j18 = this.f394302b;
                if (j17 == j18) {
                    b();
                    d();
                }
                int min = (int) java.lang.Math.min(i18 - i19, j18 - this.f394307g);
                this.f394305e.write(bArr, i17 + i19, min);
                i19 += min;
                long j19 = min;
                this.f394307g += j19;
                this.f394308h += j19;
            } catch (java.io.IOException e17) {
                throw new re1.c(e17);
            }
        }
    }
}
