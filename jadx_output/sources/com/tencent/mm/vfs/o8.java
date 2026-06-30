package com.tencent.mm.vfs;

/* loaded from: classes12.dex */
public abstract class o8 extends com.tencent.mm.vfs.a implements com.tencent.mm.vfs.p2 {

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.vfs.q2 f213118e;

    public o8(com.tencent.mm.vfs.q2 q2Var) {
        this.f213118e = q2Var;
    }

    @Override // com.tencent.mm.vfs.q2
    public java.lang.Iterable C(java.lang.String str) {
        return this.f213118e.C(str);
    }

    @Override // com.tencent.mm.vfs.q2
    public java.lang.String D(java.lang.String str, boolean z17) {
        return this.f213118e.D(str, z17);
    }

    @Override // com.tencent.mm.vfs.p2
    public java.util.List E() {
        return java.util.Collections.singletonList(this.f213118e);
    }

    @Override // com.tencent.mm.vfs.q2
    public boolean F(java.lang.String str) {
        return this.f213118e.F(str);
    }

    @Override // com.tencent.mm.vfs.a
    public long G(java.lang.String str, com.tencent.mm.vfs.q2 q2Var, java.lang.String str2, boolean z17) {
        return this.f213118e.i(str, q2Var, str2, z17);
    }

    @Override // com.tencent.mm.vfs.a
    public boolean H(java.lang.String str, com.tencent.mm.vfs.q2 q2Var, java.lang.String str2) {
        com.tencent.mm.vfs.q2 q17 = com.tencent.mm.vfs.e8.q(this.f213118e, str, 2);
        com.tencent.mm.vfs.q2 q18 = com.tencent.mm.vfs.e8.q(q2Var, str2, 1);
        if (q17 == null || q18 == null) {
            throw new java.io.IOException("Cannot resolve delegate filesystem.");
        }
        return q17 instanceof com.tencent.mm.vfs.a ? ((com.tencent.mm.vfs.a) q17).H(str, q18, str2) : q17.t(str, q18, str2);
    }

    @Override // com.tencent.mm.vfs.a
    public boolean I(java.lang.String str, com.tencent.mm.vfs.q2 q2Var, java.lang.String str2) {
        com.tencent.mm.vfs.q2 q17 = com.tencent.mm.vfs.e8.q(this.f213118e, str2, 2);
        com.tencent.mm.vfs.q2 q18 = com.tencent.mm.vfs.e8.q(q2Var, str, 1);
        if (q18 == null || q17 == null) {
            return false;
        }
        if (q17 instanceof com.tencent.mm.vfs.a) {
            return ((com.tencent.mm.vfs.a) q17).I(str, q18, str2);
        }
        return true;
    }

    @Override // com.tencent.mm.vfs.q2
    public java.io.InputStream a(java.lang.String str) {
        return this.f213118e.a(str);
    }

    @Override // com.tencent.mm.vfs.q2
    public java.io.OutputStream c(java.lang.String str, boolean z17) {
        return this.f213118e.c(str, z17);
    }

    @Override // com.tencent.mm.vfs.q2
    public boolean d(java.lang.String str) {
        return this.f213118e.d(str);
    }

    @Override // com.tencent.mm.vfs.q2
    public boolean e(java.lang.String str, boolean z17) {
        return this.f213118e.e(str, z17);
    }

    @Override // com.tencent.mm.vfs.q2
    public com.tencent.mm.vfs.o2 g(java.lang.String str) {
        return this.f213118e.g(str);
    }

    @Override // com.tencent.mm.vfs.a, com.tencent.mm.vfs.q2
    public java.nio.channels.WritableByteChannel h(java.lang.String str, boolean z17) {
        return this.f213118e.h(str, z17);
    }

    @Override // com.tencent.mm.vfs.q2
    public java.lang.Iterable list(java.lang.String str) {
        return this.f213118e.list(str);
    }

    @Override // com.tencent.mm.vfs.q2
    public com.tencent.mm.vfs.x1 m(java.lang.String str) {
        return this.f213118e.m(str);
    }

    @Override // com.tencent.mm.vfs.q2
    public boolean n(java.lang.String str, long j17) {
        return this.f213118e.n(str, j17);
    }

    @Override // com.tencent.mm.vfs.q2
    public int o() {
        return this.f213118e.o();
    }

    @Override // com.tencent.mm.vfs.a, com.tencent.mm.vfs.q2
    public void q(android.os.CancellationSignal cancellationSignal) {
        this.f213118e.q(cancellationSignal);
    }

    @Override // com.tencent.mm.vfs.q2
    public boolean r(java.lang.String str) {
        return this.f213118e.r(str);
    }

    @Override // com.tencent.mm.vfs.a, com.tencent.mm.vfs.q2
    public java.nio.channels.ReadableByteChannel s(java.lang.String str) {
        return this.f213118e.s(str);
    }

    @Override // com.tencent.mm.vfs.a, com.tencent.mm.vfs.q2
    public android.os.ParcelFileDescriptor x(java.lang.String str, java.lang.String str2) {
        return this.f213118e.x(str, str2);
    }

    public o8(com.tencent.mm.vfs.q2 q2Var, com.tencent.mm.vfs.FileSystem fileSystem, java.util.Map map) {
        super(fileSystem, map);
        this.f213118e = q2Var;
    }
}
