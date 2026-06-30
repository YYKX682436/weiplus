package w36;

/* loaded from: classes16.dex */
public final class l implements x36.f0 {

    /* renamed from: d, reason: collision with root package name */
    public int f442816d;

    /* renamed from: e, reason: collision with root package name */
    public long f442817e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f442818f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f442819g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ w36.m f442820h;

    public l(w36.m mVar) {
        this.f442820h = mVar;
    }

    @Override // x36.f0
    public void U(x36.k kVar, long j17) {
        boolean z17;
        long a17;
        if (this.f442819g) {
            throw new java.io.IOException("closed");
        }
        w36.m mVar = this.f442820h;
        mVar.f442826f.U(kVar, j17);
        if (this.f442818f) {
            long j18 = this.f442817e;
            if (j18 != -1 && mVar.f442826f.f451694e > j18 - 8192) {
                z17 = true;
                a17 = mVar.f442826f.a();
                if (a17 > 0 || z17) {
                }
                this.f442820h.b(this.f442816d, a17, this.f442818f, false);
                this.f442818f = false;
                return;
            }
        }
        z17 = false;
        a17 = mVar.f442826f.a();
        if (a17 > 0) {
        }
    }

    @Override // x36.f0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f442819g) {
            throw new java.io.IOException("closed");
        }
        w36.m mVar = this.f442820h;
        mVar.b(this.f442816d, mVar.f442826f.f451694e, this.f442818f, true);
        this.f442819g = true;
        this.f442820h.f442828h = false;
    }

    @Override // x36.f0, java.io.Flushable
    public void flush() {
        if (this.f442819g) {
            throw new java.io.IOException("closed");
        }
        w36.m mVar = this.f442820h;
        mVar.b(this.f442816d, mVar.f442826f.f451694e, this.f442818f, false);
        this.f442818f = false;
    }

    @Override // x36.f0
    public x36.j0 h() {
        return this.f442820h.f442823c.h();
    }
}
