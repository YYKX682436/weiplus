package x36;

/* loaded from: classes16.dex */
public final class z implements x36.l {

    /* renamed from: d, reason: collision with root package name */
    public final x36.k f451723d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f451724e;

    /* renamed from: f, reason: collision with root package name */
    public final x36.f0 f451725f;

    public z(x36.f0 sink) {
        kotlin.jvm.internal.o.g(sink, "sink");
        this.f451725f = sink;
        this.f451723d = new x36.k();
    }

    @Override // x36.l
    public x36.l F0(java.lang.String string) {
        kotlin.jvm.internal.o.g(string, "string");
        if (!(!this.f451724e)) {
            throw new java.lang.IllegalStateException("closed".toString());
        }
        this.f451723d.O(string);
        z0();
        return this;
    }

    @Override // x36.l
    public x36.l G(long j17) {
        if (!(!this.f451724e)) {
            throw new java.lang.IllegalStateException("closed".toString());
        }
        this.f451723d.G(j17);
        z0();
        return this;
    }

    @Override // x36.f0
    public void U(x36.k source, long j17) {
        kotlin.jvm.internal.o.g(source, "source");
        if (!(!this.f451724e)) {
            throw new java.lang.IllegalStateException("closed".toString());
        }
        this.f451723d.U(source, j17);
        z0();
    }

    public x36.l a(byte[] source, int i17, int i18) {
        kotlin.jvm.internal.o.g(source, "source");
        if (!(!this.f451724e)) {
            throw new java.lang.IllegalStateException("closed".toString());
        }
        this.f451723d.A(source, i17, i18);
        z0();
        return this;
    }

    @Override // x36.f0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        x36.f0 f0Var = this.f451725f;
        if (this.f451724e) {
            return;
        }
        try {
            x36.k kVar = this.f451723d;
            long j17 = kVar.f451694e;
            if (j17 > 0) {
                f0Var.U(kVar, j17);
            }
            th = null;
        } catch (java.lang.Throwable th6) {
            th = th6;
        }
        try {
            f0Var.close();
        } catch (java.lang.Throwable th7) {
            if (th == null) {
                th = th7;
            }
        }
        this.f451724e = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // x36.l
    public x36.l e(int i17) {
        if (!(!this.f451724e)) {
            throw new java.lang.IllegalStateException("closed".toString());
        }
        this.f451723d.F(i17);
        z0();
        return this;
    }

    @Override // x36.l, x36.f0, java.io.Flushable
    public void flush() {
        if (!(!this.f451724e)) {
            throw new java.lang.IllegalStateException("closed".toString());
        }
        x36.k kVar = this.f451723d;
        long j17 = kVar.f451694e;
        x36.f0 f0Var = this.f451725f;
        if (j17 > 0) {
            f0Var.U(kVar, j17);
        }
        f0Var.flush();
    }

    @Override // x36.f0
    public x36.j0 h() {
        return this.f451725f.h();
    }

    @Override // x36.l
    public x36.l i0(long j17) {
        if (!(!this.f451724e)) {
            throw new java.lang.IllegalStateException("closed".toString());
        }
        this.f451723d.i0(j17);
        return z0();
    }

    @Override // x36.l
    public x36.l i1(int i17) {
        if (!(!this.f451724e)) {
            throw new java.lang.IllegalStateException("closed".toString());
        }
        this.f451723d.N(i17);
        z0();
        return this;
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f451724e;
    }

    @Override // x36.l
    public x36.k m() {
        return this.f451723d;
    }

    @Override // x36.l
    public x36.l o(int i17) {
        if (!(!this.f451724e)) {
            throw new java.lang.IllegalStateException("closed".toString());
        }
        this.f451723d.K(i17);
        return z0();
    }

    public java.lang.String toString() {
        return "buffer(" + this.f451725f + ')';
    }

    @Override // x36.l
    public x36.l w0() {
        if (!(!this.f451724e)) {
            throw new java.lang.IllegalStateException("closed".toString());
        }
        x36.k kVar = this.f451723d;
        long j17 = kVar.f451694e;
        if (j17 > 0) {
            this.f451725f.U(kVar, j17);
        }
        return this;
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(java.nio.ByteBuffer source) {
        kotlin.jvm.internal.o.g(source, "source");
        if (!this.f451724e) {
            int write = this.f451723d.write(source);
            z0();
            return write;
        }
        throw new java.lang.IllegalStateException("closed".toString());
    }

    @Override // x36.l
    public x36.l z0() {
        if (!(!this.f451724e)) {
            throw new java.lang.IllegalStateException("closed".toString());
        }
        x36.k kVar = this.f451723d;
        long a17 = kVar.a();
        if (a17 > 0) {
            this.f451725f.U(kVar, a17);
        }
        return this;
    }

    @Override // x36.l
    public x36.l write(byte[] source) {
        kotlin.jvm.internal.o.g(source, "source");
        if (!this.f451724e) {
            this.f451723d.z(source);
            z0();
            return this;
        }
        throw new java.lang.IllegalStateException("closed".toString());
    }
}
