package q36;

/* loaded from: classes16.dex */
public final class c implements x36.f0 {

    /* renamed from: d, reason: collision with root package name */
    public final x36.r f359985d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f359986e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ q36.h f359987f;

    public c(q36.h hVar) {
        this.f359987f = hVar;
        this.f359985d = new x36.r(hVar.f360001d.h());
    }

    @Override // x36.f0
    public void U(x36.k kVar, long j17) {
        if (this.f359986e) {
            throw new java.lang.IllegalStateException("closed");
        }
        if (j17 == 0) {
            return;
        }
        q36.h hVar = this.f359987f;
        hVar.f360001d.i0(j17);
        hVar.f360001d.F0(com.tencent.midas.comm.log.util.APLogFileUtil.SEPARATOR_LINE);
        hVar.f360001d.U(kVar, j17);
        hVar.f360001d.F0(com.tencent.midas.comm.log.util.APLogFileUtil.SEPARATOR_LINE);
    }

    @Override // x36.f0, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        if (this.f359986e) {
            return;
        }
        this.f359986e = true;
        this.f359987f.f360001d.F0("0\r\n\r\n");
        q36.h hVar = this.f359987f;
        x36.r rVar = this.f359985d;
        hVar.getClass();
        x36.j0 j0Var = rVar.f451702e;
        rVar.f451702e = x36.j0.f451689d;
        j0Var.a();
        j0Var.b();
        this.f359987f.f360002e = 3;
    }

    @Override // x36.f0, java.io.Flushable
    public synchronized void flush() {
        if (this.f359986e) {
            return;
        }
        this.f359987f.f360001d.flush();
    }

    @Override // x36.f0
    public x36.j0 h() {
        return this.f359985d;
    }
}
