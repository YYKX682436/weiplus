package com.tencent.mm.vfs;

/* loaded from: classes12.dex */
public abstract class k4 implements com.tencent.mm.vfs.q2 {
    @Override // com.tencent.mm.vfs.q2
    public java.lang.Iterable C(java.lang.String str) {
        return null;
    }

    @Override // com.tencent.mm.vfs.q2
    public java.lang.String D(java.lang.String str, boolean z17) {
        return null;
    }

    @Override // com.tencent.mm.vfs.q2
    public boolean F(java.lang.String str) {
        return false;
    }

    @Override // com.tencent.mm.vfs.q2
    public java.io.InputStream a(java.lang.String str) {
        throw new java.io.FileNotFoundException("Path '" + str + "' not found on NullFileSystem");
    }

    @Override // com.tencent.mm.vfs.q2
    public java.io.OutputStream c(java.lang.String str, boolean z17) {
        throw new java.io.FileNotFoundException("Path '" + str + "' not found on NullFileSystem");
    }

    @Override // com.tencent.mm.vfs.q2
    public boolean d(java.lang.String str) {
        return false;
    }

    @Override // com.tencent.mm.vfs.q2
    public boolean e(java.lang.String str, boolean z17) {
        return false;
    }

    @Override // com.tencent.mm.vfs.q2
    public com.tencent.mm.vfs.o2 g(java.lang.String str) {
        return null;
    }

    @Override // com.tencent.mm.vfs.q2
    public java.nio.channels.WritableByteChannel h(java.lang.String str, boolean z17) {
        throw new java.io.FileNotFoundException("Path '" + str + "' not found on NullFileSystem");
    }

    @Override // com.tencent.mm.vfs.q2
    public long i(java.lang.String str, com.tencent.mm.vfs.q2 q2Var, java.lang.String str2, boolean z17) {
        throw new java.io.FileNotFoundException("Path '" + str + "' not found on NullFileSystem");
    }

    @Override // com.tencent.mm.vfs.q2
    public java.lang.Iterable list(java.lang.String str) {
        return null;
    }

    @Override // com.tencent.mm.vfs.q2
    public com.tencent.mm.vfs.x1 m(java.lang.String str) {
        return null;
    }

    @Override // com.tencent.mm.vfs.q2
    public boolean n(java.lang.String str, long j17) {
        return false;
    }

    @Override // com.tencent.mm.vfs.q2
    public int o() {
        return 28;
    }

    @Override // com.tencent.mm.vfs.q2
    public void q(android.os.CancellationSignal cancellationSignal) {
    }

    @Override // com.tencent.mm.vfs.q2
    public boolean r(java.lang.String str) {
        return false;
    }

    @Override // com.tencent.mm.vfs.q2
    public java.nio.channels.ReadableByteChannel s(java.lang.String str) {
        throw new java.io.FileNotFoundException("Path '" + str + "' not found on NullFileSystem");
    }

    @Override // com.tencent.mm.vfs.q2
    public boolean t(java.lang.String str, com.tencent.mm.vfs.q2 q2Var, java.lang.String str2) {
        return false;
    }

    @Override // com.tencent.mm.vfs.q2
    public android.os.ParcelFileDescriptor x(java.lang.String str, java.lang.String str2) {
        throw new java.io.FileNotFoundException("Path '" + str + "' not found on NullFileSystem");
    }
}
