package com.tencent.mm.vfs;

/* loaded from: classes12.dex */
public abstract class m0 extends com.tencent.mm.vfs.a implements com.tencent.mm.vfs.p2 {
    @Override // com.tencent.mm.vfs.q2
    public java.lang.Iterable C(java.lang.String str) {
        java.util.List k17 = com.tencent.mm.vfs.e8.k(M(str, 4));
        int size = k17.size();
        if (size == 1) {
            return ((com.tencent.mm.vfs.q2) k17.get(0)).C(str);
        }
        if (size == 0) {
            return null;
        }
        com.tencent.mm.vfs.l0 l0Var = new com.tencent.mm.vfs.l0(str);
        return new pm5.e(new pm5.b(k17, l0Var), l0Var);
    }

    @Override // com.tencent.mm.vfs.q2
    public java.lang.String D(java.lang.String str, boolean z17) {
        com.tencent.mm.vfs.q2 L = L(str, z17 ? 2 : 1);
        if (L == null) {
            return null;
        }
        return L.D(str, z17);
    }

    @Override // com.tencent.mm.vfs.p2
    public final java.util.List E() {
        return K();
    }

    @Override // com.tencent.mm.vfs.q2
    public boolean F(java.lang.String str) {
        com.tencent.mm.vfs.q2 L = L(str, 1);
        return L != null && L.F(str);
    }

    @Override // com.tencent.mm.vfs.a
    public final long G(java.lang.String str, com.tencent.mm.vfs.q2 q2Var, java.lang.String str2, boolean z17) {
        throw new java.lang.AssertionError();
    }

    @Override // com.tencent.mm.vfs.a
    public final boolean H(java.lang.String str, com.tencent.mm.vfs.q2 q2Var, java.lang.String str2) {
        throw new java.lang.AssertionError();
    }

    @Override // com.tencent.mm.vfs.a
    public boolean I(java.lang.String str, com.tencent.mm.vfs.q2 q2Var, java.lang.String str2) {
        throw new java.lang.AssertionError();
    }

    public abstract java.util.List K();

    public abstract com.tencent.mm.vfs.q2 L(java.lang.String str, int i17);

    public java.lang.Iterable M(java.lang.String str, int i17) {
        return K();
    }

    public final boolean N(java.lang.String str, boolean z17) {
        com.tencent.mm.vfs.x1 m17;
        java.lang.String i17 = com.tencent.mm.vfs.e8.i(str);
        if (i17 == null) {
            return false;
        }
        com.tencent.mm.vfs.q2 L = L(i17, 2);
        while (z17 && (L instanceof com.tencent.mm.vfs.m0)) {
            L = ((com.tencent.mm.vfs.m0) L).L(i17, 2);
        }
        com.tencent.mm.vfs.q2 L2 = L(i17, 1);
        while (z17 && (L2 instanceof com.tencent.mm.vfs.m0)) {
            L2 = ((com.tencent.mm.vfs.m0) L2).L(i17, 1);
        }
        if (L == L2 || L.F(i17) || (m17 = L2.m(i17)) == null || !m17.f213236f) {
            return false;
        }
        return L.r(i17);
    }

    @Override // com.tencent.mm.vfs.q2
    public java.io.InputStream a(java.lang.String str) {
        com.tencent.mm.vfs.q2 L = L(str, 1);
        if (L != null) {
            return L.a(str);
        }
        throw new java.io.FileNotFoundException("Path not found on any filesystems: " + str);
    }

    @Override // com.tencent.mm.vfs.q2
    public java.io.OutputStream c(java.lang.String str, boolean z17) {
        com.tencent.mm.vfs.q2 L = L(str, z17 ? 3 : 2);
        if (L == null) {
            throw new java.io.FileNotFoundException("Path not found on any filesystems: " + str);
        }
        if (z17 || K().size() <= 1) {
            return L.c(str, z17);
        }
        try {
            return L.c(str, false);
        } catch (java.io.FileNotFoundException e17) {
            if (N(str, false)) {
                return L.c(str, false);
            }
            throw e17;
        }
    }

    @Override // com.tencent.mm.vfs.q2
    public boolean d(java.lang.String str) {
        java.util.Iterator it = M(str, 5).iterator();
        boolean z17 = false;
        while (it.hasNext()) {
            z17 |= ((com.tencent.mm.vfs.q2) it.next()).d(str);
        }
        return z17;
    }

    @Override // com.tencent.mm.vfs.q2
    public boolean e(java.lang.String str, boolean z17) {
        java.util.Iterator it = M(str, 5).iterator();
        boolean z18 = false;
        while (it.hasNext()) {
            z18 |= ((com.tencent.mm.vfs.q2) it.next()).e(str, z17);
        }
        return z18;
    }

    @Override // com.tencent.mm.vfs.q2
    public com.tencent.mm.vfs.o2 g(java.lang.String str) {
        com.tencent.mm.vfs.q2 L = L(str, 0);
        if (L != null) {
            return L.g(str);
        }
        throw new java.lang.RuntimeException("Cannot delegate path to filesystem: " + str);
    }

    @Override // com.tencent.mm.vfs.a, com.tencent.mm.vfs.q2
    public java.nio.channels.WritableByteChannel h(java.lang.String str, boolean z17) {
        com.tencent.mm.vfs.q2 L = L(str, z17 ? 3 : 2);
        if (L == null) {
            throw new java.io.FileNotFoundException("Path not found on any filesystems: " + str);
        }
        if (z17 || K().size() <= 1) {
            return L.h(str, z17);
        }
        try {
            return L.h(str, false);
        } catch (java.io.FileNotFoundException e17) {
            if (N(str, false)) {
                return L.h(str, false);
            }
            throw e17;
        }
    }

    @Override // com.tencent.mm.vfs.a, com.tencent.mm.vfs.q2
    public long i(java.lang.String str, com.tencent.mm.vfs.q2 q2Var, java.lang.String str2, boolean z17) {
        if (str.equals(str2) && equals(q2Var)) {
            throw new java.io.IOException("Copying within the same filesystem is not allowed: " + str + " -> " + this);
        }
        try {
            return super.i(str, q2Var, str2, z17);
        } catch (java.io.FileNotFoundException e17) {
            if (N(str, true)) {
                return super.i(str, q2Var, str2, z17);
            }
            throw e17;
        }
    }

    @Override // com.tencent.mm.vfs.q2
    public java.lang.Iterable list(java.lang.String str) {
        java.util.List k17 = com.tencent.mm.vfs.e8.k(M(str, 4));
        int size = k17.size();
        if (size == 1) {
            return ((com.tencent.mm.vfs.q2) k17.get(0)).list(str);
        }
        if (size == 0) {
            return null;
        }
        com.tencent.mm.vfs.k0 k0Var = new com.tencent.mm.vfs.k0(str);
        return new pm5.e(new pm5.b(k17, k0Var), k0Var);
    }

    @Override // com.tencent.mm.vfs.q2
    public com.tencent.mm.vfs.x1 m(java.lang.String str) {
        com.tencent.mm.vfs.q2 L = L(str, 1);
        if (L == null) {
            return null;
        }
        return L.m(str);
    }

    @Override // com.tencent.mm.vfs.q2
    public boolean n(java.lang.String str, long j17) {
        com.tencent.mm.vfs.q2 L = L(str, 3);
        return L != null && L.n(str, j17);
    }

    @Override // com.tencent.mm.vfs.q2
    public int o() {
        return L("", 0).o();
    }

    @Override // com.tencent.mm.vfs.a, com.tencent.mm.vfs.q2
    public void q(android.os.CancellationSignal cancellationSignal) {
        for (com.tencent.mm.vfs.q2 q2Var : K()) {
            cancellationSignal.throwIfCanceled();
            q2Var.q(cancellationSignal);
        }
    }

    @Override // com.tencent.mm.vfs.q2
    public boolean r(java.lang.String str) {
        com.tencent.mm.vfs.q2 L = L(str, 2);
        return L != null && L.r(str);
    }

    @Override // com.tencent.mm.vfs.a, com.tencent.mm.vfs.q2
    public java.nio.channels.ReadableByteChannel s(java.lang.String str) {
        com.tencent.mm.vfs.q2 L = L(str, 1);
        if (L != null) {
            return L.s(str);
        }
        throw new java.io.FileNotFoundException("Path not found on any filesystems: " + str);
    }

    @Override // com.tencent.mm.vfs.a, com.tencent.mm.vfs.q2
    public boolean t(java.lang.String str, com.tencent.mm.vfs.q2 q2Var, java.lang.String str2) {
        if (str.equals(str2) && equals(q2Var)) {
            return false;
        }
        boolean t17 = super.t(str, q2Var, str2);
        return (t17 || !N(str, true)) ? t17 : super.t(str, q2Var, str2);
    }

    @Override // com.tencent.mm.vfs.a, com.tencent.mm.vfs.q2
    public android.os.ParcelFileDescriptor x(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.vfs.q2 L = L(str, str2.contains("rw") ? 3 : str2.contains("w") ? 2 : 1);
        if (L != null) {
            return L.x(str, str2);
        }
        throw new java.io.FileNotFoundException("Path not found on any filesystems: " + str);
    }
}
