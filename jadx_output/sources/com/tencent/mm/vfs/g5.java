package com.tencent.mm.vfs;

/* loaded from: classes12.dex */
public class g5 extends com.tencent.mm.vfs.a implements com.tencent.mm.vfs.p2 {

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.vfs.q2 f212953e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f212954f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.vfs.RefCountedFileSystem f212955g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g5(com.tencent.mm.vfs.RefCountedFileSystem refCountedFileSystem, com.tencent.mm.vfs.q2 q2Var, java.util.Map map) {
        super(refCountedFileSystem, map);
        this.f212955g = refCountedFileSystem;
        this.f212954f = false;
        this.f212953e = q2Var;
        if ((q2Var.o() & 2) == 0) {
            throw new java.lang.IllegalArgumentException("The wrapped filesystem must have CAP_DIRECT_ACCESS.");
        }
    }

    @Override // com.tencent.mm.vfs.q2
    public java.lang.Iterable C(java.lang.String str) {
        java.lang.String l17 = com.tencent.mm.vfs.e8.l(str, true, true);
        if (com.tencent.mm.vfs.RefCountedFileSystem.d(l17)) {
            return null;
        }
        boolean isEmpty = l17.isEmpty();
        java.lang.Iterable C = this.f212953e.C(l17);
        if (C == null) {
            return null;
        }
        return new pm5.l(C, new com.tencent.mm.vfs.e5(this, isEmpty), null, false);
    }

    @Override // com.tencent.mm.vfs.q2
    public java.lang.String D(java.lang.String str, boolean z17) {
        java.lang.String M;
        com.tencent.mm.vfs.q2 q2Var = this.f212953e;
        java.lang.String D = q2Var.D(str, z17);
        return (q2Var.F(str) || (M = M(str)) == null) ? D : q2Var.D(com.tencent.mm.vfs.RefCountedFileSystem.c(M), z17);
    }

    @Override // com.tencent.mm.vfs.p2
    public java.util.List E() {
        return java.util.Collections.singletonList(this.f212953e);
    }

    @Override // com.tencent.mm.vfs.q2
    public boolean F(java.lang.String str) {
        com.tencent.mm.vfs.q2 q2Var = this.f212953e;
        if (!q2Var.F(str)) {
            if (!q2Var.F(str + (char) 8982)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.tencent.mm.vfs.a
    public long G(java.lang.String str, com.tencent.mm.vfs.q2 q2Var, java.lang.String str2, boolean z17) {
        com.tencent.mm.vfs.x1 m17;
        com.tencent.mm.vfs.q2 q2Var2 = this.f212953e;
        if (z17 && q2Var == this && (m17 = m(str2)) != null && !m17.f213236f) {
            long j17 = this.f212955g.f212751f;
            long j18 = m17.f213233c;
            if (j18 >= j17) {
                try {
                    N(str);
                    K(str2, str);
                    if (q2Var2.F(str) && !q2Var2.d(str)) {
                        throw new java.io.IOException("Cannot delete old plain file: " + str);
                    }
                    return j18;
                } catch (java.io.IOException e17) {
                    com.tencent.stubs.logger.Log.w("VFS.RefCountedFileSystem", e17, "Cannot create link, fallback to plain copy.");
                }
            }
        }
        long i17 = q2Var2.i(str, q2Var, str2, z17);
        N(str);
        return i17;
    }

    @Override // com.tencent.mm.vfs.a
    public boolean H(java.lang.String str, com.tencent.mm.vfs.q2 q2Var, java.lang.String str2) {
        com.tencent.mm.vfs.q2 q2Var2 = this.f212953e;
        if (q2Var != this || M(str2) == null) {
            if (!q2Var2.t(str, q2Var, str2)) {
                return false;
            }
            N(str);
            return true;
        }
        N(str);
        K(str2, str);
        q2Var2.d(str);
        return N(str2);
    }

    @Override // com.tencent.mm.vfs.a
    public boolean I(java.lang.String str, com.tencent.mm.vfs.q2 q2Var, java.lang.String str2) {
        return q2Var == this || M(str) == null;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0184 A[Catch: all -> 0x01a3, TryCatch #2 {all -> 0x01a3, blocks: (B:51:0x0164, B:53:0x016e, B:42:0x0184, B:44:0x018e, B:45:0x01a2), top: B:50:0x0164 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0164 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void K(java.lang.String r20, java.lang.String r21) {
        /*
            Method dump skipped, instructions count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.vfs.g5.K(java.lang.String, java.lang.String):void");
    }

    public final com.tencent.mm.vfs.x1 L(java.lang.String str, com.tencent.mm.vfs.x1 x1Var) {
        int i17;
        java.lang.String M = M(str);
        if (M == null || M.isEmpty()) {
            return null;
        }
        java.lang.String c17 = com.tencent.mm.vfs.RefCountedFileSystem.c(M);
        com.tencent.mm.vfs.q2 q2Var = this.f212953e;
        com.tencent.mm.vfs.x1 m17 = q2Var.m(c17);
        if (m17 == null) {
            return null;
        }
        com.tencent.mm.vfs.x1 m18 = q2Var.m(com.tencent.mm.vfs.RefCountedFileSystem.e(M));
        if (m18 != null) {
            long j17 = m18.f213233c;
            if (j17 != 0) {
                i17 = (int) j17;
                java.lang.String str2 = x1Var.f213232b;
                java.lang.String substring = str2.substring(0, str2.length() - 1);
                long j18 = m17.f213233c;
                long j19 = m17.f213234d;
                return new com.tencent.mm.vfs.k5(this, str, substring, j18, ((4096 + j19) / i17) + x1Var.f213234d, m17.f213235e, m17.f213236f, M, i17, j19);
            }
        }
        i17 = 1;
        java.lang.String str22 = x1Var.f213232b;
        java.lang.String substring2 = str22.substring(0, str22.length() - 1);
        long j182 = m17.f213233c;
        long j192 = m17.f213234d;
        return new com.tencent.mm.vfs.k5(this, str, substring2, j182, ((4096 + j192) / i17) + x1Var.f213234d, m17.f213235e, m17.f213236f, M, i17, j192);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.io.Closeable] */
    public final java.lang.String M(java.lang.String str) {
        com.tencent.mm.vfs.i5 i5Var;
        com.tencent.mm.vfs.q2 q2Var = this.f212953e;
        java.lang.String D = q2Var.D(str + (char) 8982, true);
        ?? r17 = 0;
        try {
            if (D == null) {
                return null;
            }
            try {
                i5Var = new com.tencent.mm.vfs.i5(D, false);
            } catch (java.io.FileNotFoundException unused) {
                i5Var = null;
            } catch (java.io.IOException e17) {
                e = e17;
                i5Var = null;
            } catch (java.lang.Throwable th6) {
                th = th6;
                com.tencent.mm.vfs.e8.d(r17);
                throw th;
            }
            try {
                byte[] bArr = new byte[64];
                int i17 = 0;
                while (i17 < 64) {
                    int read = i5Var.f212997d.read(bArr, i17, 64 - i17);
                    if (read == -1) {
                        break;
                    }
                    i17 += read;
                }
                java.lang.String str2 = i17 > 0 ? new java.lang.String(bArr, 0, i17) : null;
                com.tencent.mm.vfs.e8.d(i5Var);
                return str2;
            } catch (java.io.FileNotFoundException unused2) {
                com.tencent.mm.vfs.e8.d(i5Var);
                return null;
            } catch (java.io.IOException e18) {
                e = e18;
                com.tencent.stubs.logger.Log.w("VFS.RefCountedFileSystem", e, "Cannot read link file: " + str);
                com.tencent.mm.vfs.e8.d(i5Var);
                return null;
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
            r17 = q2Var;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean N(java.lang.String r8) {
        /*
            r7 = this;
            java.lang.String r0 = r7.M(r8)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r8)
            r8 = 8982(0x2316, float:1.2586E-41)
            r2.append(r8)
            java.lang.String r8 = r2.toString()
            com.tencent.mm.vfs.q2 r2 = r7.f212953e
            boolean r8 = r2.d(r8)
            if (r8 != 0) goto L22
            return r1
        L22:
            java.lang.String r8 = ".ref/maintenance"
            r2.d(r8)
            java.lang.String r8 = com.tencent.mm.vfs.RefCountedFileSystem.e(r0)
            r3 = 1
            java.lang.String r4 = r2.D(r8, r3)
            if (r4 == 0) goto L5d
            r5 = 0
            com.tencent.mm.vfs.j5 r6 = new com.tencent.mm.vfs.j5     // Catch: java.lang.Throwable -> L49 java.io.IOException -> L4e
            r6.<init>(r4)     // Catch: java.lang.Throwable -> L49 java.io.IOException -> L4e
            r4 = -1
            int r4 = r6.a(r4)     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L47
            if (r4 != 0) goto L40
            r1 = r3
        L40:
            com.tencent.mm.vfs.e8.d(r6)
            goto L51
        L44:
            r8 = move-exception
            r5 = r6
            goto L4a
        L47:
            r5 = r6
            goto L4e
        L49:
            r8 = move-exception
        L4a:
            com.tencent.mm.vfs.e8.d(r5)
            throw r8
        L4e:
            com.tencent.mm.vfs.e8.d(r5)
        L51:
            if (r1 == 0) goto L5d
            r2.d(r8)
            java.lang.String r8 = com.tencent.mm.vfs.RefCountedFileSystem.c(r0)
            r2.d(r8)
        L5d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.vfs.g5.N(java.lang.String):boolean");
    }

    @Override // com.tencent.mm.vfs.q2
    public java.io.InputStream a(java.lang.String str) {
        com.tencent.mm.vfs.q2 q2Var = this.f212953e;
        try {
            return q2Var.a(str);
        } catch (java.io.FileNotFoundException e17) {
            java.lang.String M = M(str);
            if (M != null) {
                return q2Var.a(com.tencent.mm.vfs.RefCountedFileSystem.c(M));
            }
            throw e17;
        }
    }

    @Override // com.tencent.mm.vfs.q2
    public java.io.OutputStream c(java.lang.String str, boolean z17) {
        if (com.tencent.mm.vfs.RefCountedFileSystem.d(str)) {
            throw new java.io.FileNotFoundException("Internal path referenced: ".concat(str));
        }
        if (z17 && M(str) != null) {
            throw new java.lang.RuntimeException("Appending a reference counting file is not supported!");
        }
        java.io.OutputStream c17 = this.f212953e.c(str, z17);
        N(str);
        return c17;
    }

    @Override // com.tencent.mm.vfs.q2
    public boolean d(java.lang.String str) {
        if (com.tencent.mm.vfs.RefCountedFileSystem.d(str)) {
            return false;
        }
        return this.f212953e.d(str) | N(str);
    }

    @Override // com.tencent.mm.vfs.q2
    public boolean e(java.lang.String str, boolean z17) {
        boolean z18;
        if (com.tencent.mm.vfs.RefCountedFileSystem.d(str)) {
            return false;
        }
        com.tencent.mm.vfs.q2 q2Var = this.f212953e;
        if (!z17) {
            return q2Var.e(str, false);
        }
        java.lang.Iterable p17 = com.tencent.mm.vfs.e8.p(this, str, true, null);
        if (p17 != null) {
            java.util.Iterator it = ((pm5.b) p17).iterator();
            z18 = true;
            while (it.hasNext()) {
                z18 &= ((com.tencent.mm.vfs.x1) it.next()).b(false);
            }
        } else {
            z18 = true;
        }
        return q2Var.e(str, false) && z18;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof com.tencent.mm.vfs.g5) {
            if (this.f212953e.equals(((com.tencent.mm.vfs.g5) obj).f212953e)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.tencent.mm.vfs.q2
    public com.tencent.mm.vfs.o2 g(java.lang.String str) {
        return this.f212953e.g(str);
    }

    @Override // com.tencent.mm.vfs.a, com.tencent.mm.vfs.q2
    public java.nio.channels.WritableByteChannel h(java.lang.String str, boolean z17) {
        if (com.tencent.mm.vfs.RefCountedFileSystem.d(str)) {
            throw new java.io.FileNotFoundException("Internal path referenced: ".concat(str));
        }
        if (z17 && M(str) != null) {
            throw new java.lang.RuntimeException("Appending a reference counting file is not supported!");
        }
        java.nio.channels.WritableByteChannel h17 = this.f212953e.h(str, z17);
        if (!z17) {
            N(str);
        }
        return h17;
    }

    public int hashCode() {
        return com.tencent.mm.vfs.RefCountedFileSystem.class.hashCode() ^ this.f212953e.hashCode();
    }

    @Override // com.tencent.mm.vfs.q2
    public java.lang.Iterable list(java.lang.String str) {
        java.lang.String l17 = com.tencent.mm.vfs.e8.l(str, true, true);
        if (com.tencent.mm.vfs.RefCountedFileSystem.d(l17)) {
            return null;
        }
        boolean isEmpty = l17.isEmpty();
        java.lang.Iterable list = this.f212953e.list(l17);
        if (list == null) {
            return null;
        }
        return new pm5.l(list, new com.tencent.mm.vfs.d5(this, isEmpty), null, false);
    }

    @Override // com.tencent.mm.vfs.q2
    public com.tencent.mm.vfs.x1 m(java.lang.String str) {
        com.tencent.mm.vfs.q2 q2Var = this.f212953e;
        com.tencent.mm.vfs.x1 m17 = q2Var.m(str);
        if (m17 != null) {
            return new com.tencent.mm.vfs.x1(this, m17.f213231a, m17.f213232b, m17.f213233c, m17.f213234d, m17.f213235e, m17.f213236f);
        }
        com.tencent.mm.vfs.x1 m18 = q2Var.m(str + (char) 8982);
        if (m18 == null) {
            return null;
        }
        return L(str, m18);
    }

    @Override // com.tencent.mm.vfs.q2
    public boolean n(java.lang.String str, long j17) {
        if (com.tencent.mm.vfs.RefCountedFileSystem.d(str)) {
            return false;
        }
        java.lang.String M = M(str);
        com.tencent.mm.vfs.q2 q2Var = this.f212953e;
        return q2Var.n(str, j17) | (M != null ? q2Var.n(com.tencent.mm.vfs.RefCountedFileSystem.c(M), j17) : false);
    }

    @Override // com.tencent.mm.vfs.q2
    public int o() {
        return this.f212953e.o();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x007c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x007d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x023b A[Catch: all -> 0x027b, TryCatch #5 {all -> 0x027b, blocks: (B:14:0x007d, B:18:0x0089, B:19:0x00a7, B:21:0x00ad, B:25:0x00bc, B:28:0x00c2, B:31:0x00d0, B:34:0x00e2, B:41:0x00ea, B:37:0x00f2, B:52:0x00f8, B:54:0x0100, B:57:0x0109, B:58:0x0110, B:60:0x0116, B:63:0x012d, B:66:0x013b, B:68:0x0143, B:71:0x0148, B:75:0x014f, B:78:0x0167, B:82:0x0193, B:84:0x0199, B:87:0x01c2, B:88:0x01ce, B:90:0x01d4, B:95:0x01f7, B:99:0x023b, B:112:0x0225, B:122:0x022e, B:123:0x0231, B:119:0x0233, B:129:0x0245), top: B:13:0x007d }] */
    @Override // com.tencent.mm.vfs.a, com.tencent.mm.vfs.q2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void q(android.os.CancellationSignal r19) {
        /*
            Method dump skipped, instructions count: 640
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.vfs.g5.q(android.os.CancellationSignal):void");
    }

    @Override // com.tencent.mm.vfs.q2
    public boolean r(java.lang.String str) {
        if (com.tencent.mm.vfs.RefCountedFileSystem.d(str)) {
            return false;
        }
        return this.f212953e.r(str);
    }

    @Override // com.tencent.mm.vfs.a, com.tencent.mm.vfs.q2
    public java.nio.channels.ReadableByteChannel s(java.lang.String str) {
        com.tencent.mm.vfs.q2 q2Var = this.f212953e;
        try {
            return q2Var.s(str);
        } catch (java.io.FileNotFoundException e17) {
            java.lang.String M = M(str);
            if (M != null) {
                return q2Var.s(com.tencent.mm.vfs.RefCountedFileSystem.c(M));
            }
            throw e17;
        }
    }

    @Override // com.tencent.mm.vfs.a
    public java.lang.String toString() {
        return "refCount <- " + this.f212953e;
    }

    @Override // com.tencent.mm.vfs.a, com.tencent.mm.vfs.q2
    public android.os.ParcelFileDescriptor x(java.lang.String str, java.lang.String str2) {
        if (com.tencent.mm.vfs.RefCountedFileSystem.d(str) && str2.contains("w")) {
            throw new java.io.FileNotFoundException("Internal path referenced: ".concat(str));
        }
        str2.getClass();
        char c17 = 65535;
        switch (str2.hashCode()) {
            case 114:
                if (str2.equals("r")) {
                    c17 = 0;
                    break;
                }
                break;
            case 3653:
                if (str2.equals("rw")) {
                    c17 = 1;
                    break;
                }
                break;
            case 3786:
                if (str2.equals("wa")) {
                    c17 = 2;
                    break;
                }
                break;
        }
        com.tencent.mm.vfs.q2 q2Var = this.f212953e;
        switch (c17) {
            case 0:
                try {
                    return q2Var.x(str, str2);
                } catch (java.io.FileNotFoundException e17) {
                    java.lang.String M = M(str);
                    if (M != null) {
                        return q2Var.x(com.tencent.mm.vfs.RefCountedFileSystem.c(M), str2);
                    }
                    throw e17;
                }
            case 1:
            case 2:
                if (M(str) == null) {
                    return q2Var.x(str, str2);
                }
                throw new java.lang.RuntimeException("Appending a reference counting file is not supported!");
            default:
                android.os.ParcelFileDescriptor x17 = q2Var.x(str, str2);
                N(str);
                return x17;
        }
    }

    @Override // com.tencent.mm.vfs.q2
    public com.tencent.mm.vfs.FileSystem y() {
        return this.f212955g;
    }
}
