package com.tencent.mm.vfs;

/* loaded from: classes12.dex */
public class g extends com.tencent.mm.vfs.o8 {

    /* renamed from: f, reason: collision with root package name */
    public final int f212942f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.vfs.AccessLogFileSystem f212943g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.tencent.mm.vfs.AccessLogFileSystem accessLogFileSystem, com.tencent.mm.vfs.q2 q2Var, int i17, java.util.Map map) {
        super(q2Var, accessLogFileSystem, map);
        this.f212943g = accessLogFileSystem;
        this.f212942f = i17;
    }

    @Override // com.tencent.mm.vfs.o8, com.tencent.mm.vfs.q2
    public java.lang.Iterable C(java.lang.String str) {
        java.lang.Iterable C = super.C(str);
        K(32, C != null, str);
        return C;
    }

    @Override // com.tencent.mm.vfs.o8, com.tencent.mm.vfs.q2
    public java.lang.String D(java.lang.String str, boolean z17) {
        java.lang.String D = super.D(str, z17);
        boolean z18 = D != null;
        if ((this.f212942f & 128) != 0) {
            J(0, "op", 128, "ok", java.lang.Boolean.valueOf(z18), com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, str, "forWrite", java.lang.Boolean.valueOf(z17));
        }
        return D;
    }

    @Override // com.tencent.mm.vfs.o8, com.tencent.mm.vfs.q2
    public boolean F(java.lang.String str) {
        boolean F = super.F(str);
        K(4, F, str);
        return F;
    }

    @Override // com.tencent.mm.vfs.o8, com.tencent.mm.vfs.a
    public long G(java.lang.String str, com.tencent.mm.vfs.q2 q2Var, java.lang.String str2, boolean z17) {
        boolean z18 = true;
        try {
            long G = super.G(str, q2Var, str2, z17);
            L(256, true, str, q2Var, str2);
            return G;
        } catch (java.lang.Exception e17) {
            try {
                throw e17;
            } catch (java.lang.Throwable th6) {
                th = th6;
                z18 = false;
                L(256, z18, str, q2Var, str2);
                throw th;
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
            L(256, z18, str, q2Var, str2);
            throw th;
        }
    }

    @Override // com.tencent.mm.vfs.o8, com.tencent.mm.vfs.a
    public boolean H(java.lang.String str, com.tencent.mm.vfs.q2 q2Var, java.lang.String str2) {
        try {
            boolean H = super.H(str, q2Var, str2);
            L(512, H, str, q2Var, str2);
            return H;
        } catch (java.lang.Throwable th6) {
            L(512, false, str, q2Var, str2);
            throw th6;
        }
    }

    @Override // com.tencent.mm.vfs.o8, com.tencent.mm.vfs.a
    public boolean I(java.lang.String str, com.tencent.mm.vfs.q2 q2Var, java.lang.String str2) {
        boolean I = super.I(str, q2Var, str2);
        L(1024, I, str, q2Var, str2);
        return I;
    }

    public void K(int i17, boolean z17, java.lang.String str) {
        if ((this.f212942f & i17) != 0) {
            J(0, "op", java.lang.Integer.valueOf(i17), "ok", java.lang.Boolean.valueOf(z17), com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, str);
        }
    }

    public void L(int i17, boolean z17, java.lang.String str, com.tencent.mm.vfs.q2 q2Var, java.lang.String str2) {
        if ((this.f212942f & i17) != 0) {
            J(0, "op", java.lang.Integer.valueOf(i17), "ok", java.lang.Boolean.valueOf(z17), com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, str, "targetFS", q2Var, "targetPath", str2);
        }
    }

    @Override // com.tencent.mm.vfs.o8, com.tencent.mm.vfs.q2
    public java.io.InputStream a(java.lang.String str) {
        boolean z17;
        try {
            java.io.InputStream a17 = super.a(str);
            K(1, true, str);
            return a17;
        } catch (java.lang.Exception e17) {
            try {
                throw e17;
            } catch (java.lang.Throwable th6) {
                th = th6;
                z17 = false;
                K(1, z17, str);
                throw th;
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
            z17 = true;
            K(1, z17, str);
            throw th;
        }
    }

    @Override // com.tencent.mm.vfs.o8, com.tencent.mm.vfs.q2
    public java.io.OutputStream c(java.lang.String str, boolean z17) {
        boolean z18 = true;
        try {
            java.io.OutputStream c17 = super.c(str, z17);
            K(2, true, str);
            return c17;
        } catch (java.lang.Exception e17) {
            try {
                throw e17;
            } catch (java.lang.Throwable th6) {
                th = th6;
                z18 = false;
                K(2, z18, str);
                throw th;
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
            K(2, z18, str);
            throw th;
        }
    }

    @Override // com.tencent.mm.vfs.o8, com.tencent.mm.vfs.q2
    public boolean d(java.lang.String str) {
        boolean d17 = super.d(str);
        K(16, d17, str);
        return d17;
    }

    @Override // com.tencent.mm.vfs.o8, com.tencent.mm.vfs.q2
    public boolean e(java.lang.String str, boolean z17) {
        boolean e17 = super.e(str, z17);
        K(16, e17, str);
        return e17;
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.tencent.mm.vfs.g)) {
            return false;
        }
        com.tencent.mm.vfs.g gVar = (com.tencent.mm.vfs.g) obj;
        return this.f213118e.equals(gVar.f213118e) && this.f212942f == gVar.f212942f;
    }

    @Override // com.tencent.mm.vfs.o8, com.tencent.mm.vfs.a, com.tencent.mm.vfs.q2
    public java.nio.channels.WritableByteChannel h(java.lang.String str, boolean z17) {
        boolean z18 = true;
        try {
            java.nio.channels.WritableByteChannel h17 = super.h(str, z17);
            K(2, true, str);
            return h17;
        } catch (java.lang.Exception e17) {
            try {
                throw e17;
            } catch (java.lang.Throwable th6) {
                th = th6;
                z18 = false;
                K(2, z18, str);
                throw th;
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
            K(2, z18, str);
            throw th;
        }
    }

    public int hashCode() {
        int hashCode = com.tencent.mm.vfs.g.class.hashCode();
        java.lang.Object[] objArr = {this.f213118e, java.lang.Integer.valueOf(this.f212942f)};
        java.util.regex.Pattern pattern = com.tencent.mm.vfs.e8.f212917a;
        return hashCode ^ java.util.Arrays.deepHashCode(objArr);
    }

    @Override // com.tencent.mm.vfs.o8, com.tencent.mm.vfs.q2
    public java.lang.Iterable list(java.lang.String str) {
        java.lang.Iterable list = super.list(str);
        K(32, list != null, str);
        return list;
    }

    @Override // com.tencent.mm.vfs.o8, com.tencent.mm.vfs.q2
    public com.tencent.mm.vfs.x1 m(java.lang.String str) {
        com.tencent.mm.vfs.x1 m17 = super.m(str);
        K(8, m17 != null, str);
        return m17;
    }

    @Override // com.tencent.mm.vfs.o8, com.tencent.mm.vfs.q2
    public boolean n(java.lang.String str, long j17) {
        return super.n(str, j17);
    }

    @Override // com.tencent.mm.vfs.o8, com.tencent.mm.vfs.q2
    public boolean r(java.lang.String str) {
        boolean r17 = super.r(str);
        K(64, r17, str);
        return r17;
    }

    @Override // com.tencent.mm.vfs.o8, com.tencent.mm.vfs.a, com.tencent.mm.vfs.q2
    public java.nio.channels.ReadableByteChannel s(java.lang.String str) {
        boolean z17;
        try {
            java.nio.channels.ReadableByteChannel s17 = super.s(str);
            K(1, true, str);
            return s17;
        } catch (java.lang.Exception e17) {
            try {
                throw e17;
            } catch (java.lang.Throwable th6) {
                th = th6;
                z17 = false;
                K(1, z17, str);
                throw th;
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
            z17 = true;
            K(1, z17, str);
            throw th;
        }
    }

    @Override // com.tencent.mm.vfs.a
    public java.lang.String toString() {
        return java.lang.String.format("log(%04x) <- %s", java.lang.Integer.valueOf(this.f212942f), this.f213118e);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0023  */
    @Override // com.tencent.mm.vfs.o8, com.tencent.mm.vfs.a, com.tencent.mm.vfs.q2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.os.ParcelFileDescriptor x(java.lang.String r6, java.lang.String r7) {
        /*
            r5 = this;
            java.lang.String r0 = "w"
            r1 = 2
            r2 = 1
            android.os.ParcelFileDescriptor r3 = super.x(r6, r7)     // Catch: java.lang.Throwable -> L15 java.lang.Exception -> L18
            boolean r7 = r7.contains(r0)
            if (r7 == 0) goto L10
            goto L11
        L10:
            r1 = r2
        L11:
            r5.K(r1, r2, r6)
            return r3
        L15:
            r3 = move-exception
            r4 = r2
            goto L1c
        L18:
            r3 = move-exception
            throw r3     // Catch: java.lang.Throwable -> L1a
        L1a:
            r3 = move-exception
            r4 = 0
        L1c:
            boolean r7 = r7.contains(r0)
            if (r7 == 0) goto L23
            goto L24
        L23:
            r1 = r2
        L24:
            r5.K(r1, r4, r6)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.vfs.g.x(java.lang.String, java.lang.String):android.os.ParcelFileDescriptor");
    }

    @Override // com.tencent.mm.vfs.q2
    public com.tencent.mm.vfs.FileSystem y() {
        return this.f212943g;
    }
}
