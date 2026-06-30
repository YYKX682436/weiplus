package com.tencent.mm.vfs;

/* loaded from: classes12.dex */
public class c extends com.tencent.mm.vfs.o8 {

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f212844f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.vfs.AccessControlFileSystem f212845g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.tencent.mm.vfs.AccessControlFileSystem accessControlFileSystem, com.tencent.mm.vfs.q2 q2Var, byte[] bArr, java.util.Map map) {
        super(q2Var, accessControlFileSystem, map);
        this.f212845g = accessControlFileSystem;
        this.f212844f = bArr;
    }

    @Override // com.tencent.mm.vfs.o8, com.tencent.mm.vfs.q2
    public java.lang.Iterable C(java.lang.String str) {
        java.lang.Iterable iterable;
        byte b17 = this.f212844f[4];
        int i17 = 2;
        if (b17 == 3 || (b17 == 2 && !K(4, str))) {
            iterable = null;
        } else {
            iterable = super.C(str);
            i17 = iterable != null ? 0 : 1;
        }
        if (b17 != 0) {
            L(4, i17, str);
        }
        return iterable;
    }

    @Override // com.tencent.mm.vfs.o8, com.tencent.mm.vfs.q2
    public java.lang.String D(java.lang.String str, boolean z17) {
        java.lang.String str2;
        byte b17 = this.f212844f[6];
        int i17 = 2;
        if (b17 == 3 || (b17 == 2 && !K(6, str))) {
            str2 = null;
        } else {
            str2 = super.D(str, z17);
            i17 = str2 != null ? 0 : 1;
        }
        if (b17 != 0) {
            J(0, "op", 6, "result", java.lang.Integer.valueOf(i17), com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, str, "forWrite", java.lang.Boolean.valueOf(z17));
        }
        return str2;
    }

    @Override // com.tencent.mm.vfs.o8, com.tencent.mm.vfs.q2
    public boolean F(java.lang.String str) {
        boolean z17;
        int i17;
        byte b17 = this.f212844f[2];
        if (b17 == 3 || (b17 == 2 && !K(2, str))) {
            z17 = false;
            i17 = 2;
        } else {
            z17 = super.F(str);
            i17 = !z17;
        }
        if (b17 != 0) {
            L(2, i17, str);
        }
        return z17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0017, code lost:
    
        if (K(7, r9) != false) goto L11;
     */
    @Override // com.tencent.mm.vfs.o8, com.tencent.mm.vfs.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long G(java.lang.String r9, com.tencent.mm.vfs.q2 r10, java.lang.String r11, boolean r12) {
        /*
            r8 = this;
            byte[] r0 = r8.f212844f
            r1 = 7
            r0 = r0[r1]
            if (r0 != 0) goto Lc
            long r9 = super.G(r9, r10, r11, r12)
            return r9
        Lc:
            r2 = 0
            r3 = 3
            r4 = 2
            if (r0 == r3) goto L26
            if (r0 != r4) goto L19
            boolean r0 = r8.K(r1, r9)     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L2f com.tencent.mm.vfs.e -> L34
            if (r0 == 0) goto L26
        L19:
            long r6 = super.G(r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L2f com.tencent.mm.vfs.e -> L34
            r1 = 7
            r0 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r0.M(r1, r2, r3, r4, r5)
            return r6
        L26:
            com.tencent.mm.vfs.e r12 = new com.tencent.mm.vfs.e     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L2f com.tencent.mm.vfs.e -> L34
            r0 = 0
            r12.<init>(r0)     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L2f com.tencent.mm.vfs.e -> L34
            throw r12     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L2f com.tencent.mm.vfs.e -> L34
        L2d:
            r12 = move-exception
            goto L3e
        L2f:
            r12 = move-exception
            throw r12     // Catch: java.lang.Throwable -> L31
        L31:
            r12 = move-exception
            r2 = 1
            goto L3e
        L34:
            java.io.FileNotFoundException r12 = new java.io.FileNotFoundException     // Catch: java.lang.Throwable -> L3c
            java.lang.String r0 = "Access denied"
            r12.<init>(r0)     // Catch: java.lang.Throwable -> L3c
            throw r12     // Catch: java.lang.Throwable -> L3c
        L3c:
            r12 = move-exception
            r2 = r4
        L3e:
            r1 = 7
            r0 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r0.M(r1, r2, r3, r4, r5)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.vfs.c.G(java.lang.String, com.tencent.mm.vfs.q2, java.lang.String, boolean):long");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0018, code lost:
    
        if (K(8, r8) != false) goto L11;
     */
    @Override // com.tencent.mm.vfs.o8, com.tencent.mm.vfs.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean H(java.lang.String r8, com.tencent.mm.vfs.q2 r9, java.lang.String r10) {
        /*
            r7 = this;
            byte[] r0 = r7.f212844f
            r1 = 8
            r0 = r0[r1]
            if (r0 != 0) goto Ld
            boolean r8 = super.H(r8, r9, r10)
            return r8
        Ld:
            r2 = 0
            r3 = 3
            r4 = 2
            if (r0 == r3) goto L28
            if (r0 != r4) goto L1a
            boolean r0 = r7.K(r1, r8)     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L32 com.tencent.mm.vfs.e -> L37
            if (r0 == 0) goto L28
        L1a:
            boolean r6 = super.H(r8, r9, r10)     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L32 com.tencent.mm.vfs.e -> L37
            r1 = 8
            r0 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r0.M(r1, r2, r3, r4, r5)
            return r6
        L28:
            com.tencent.mm.vfs.e r0 = new com.tencent.mm.vfs.e     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L32 com.tencent.mm.vfs.e -> L37
            r1 = 0
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L32 com.tencent.mm.vfs.e -> L37
            throw r0     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L32 com.tencent.mm.vfs.e -> L37
        L2f:
            r0 = move-exception
        L30:
            r3 = r2
            goto L41
        L32:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L34
        L34:
            r0 = move-exception
            r2 = 1
            goto L30
        L37:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException     // Catch: java.lang.Throwable -> L3f
            java.lang.String r1 = "Access denied"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L3f
            throw r0     // Catch: java.lang.Throwable -> L3f
        L3f:
            r0 = move-exception
            r3 = r4
        L41:
            r2 = 8
            r1 = r7
            r4 = r8
            r5 = r9
            r6 = r10
            r1.M(r2, r3, r4, r5, r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.vfs.c.H(java.lang.String, com.tencent.mm.vfs.q2, java.lang.String):boolean");
    }

    @Override // com.tencent.mm.vfs.o8, com.tencent.mm.vfs.a
    public boolean I(java.lang.String str, com.tencent.mm.vfs.q2 q2Var, java.lang.String str2) {
        boolean z17;
        byte b17 = this.f212844f[9];
        int i17 = 2;
        if (b17 == 3 || (b17 == 2 && !K(9, str))) {
            z17 = false;
        } else {
            z17 = super.I(str, q2Var, str2);
            i17 = !z17 ? 1 : 0;
        }
        int i18 = i17;
        if (b17 != 0) {
            M(9, i18, str, q2Var, str2);
        }
        return z17;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean K(int r6, java.lang.String r7) {
        /*
            r5 = this;
            java.lang.ThreadLocal r0 = com.tencent.mm.vfs.AccessControlFileSystem.f212682m
            java.lang.Object r0 = r0.get()
            com.tencent.mm.vfs.d r0 = (com.tencent.mm.vfs.d) r0
            r1 = 0
            if (r0 == 0) goto L6d
            r2 = 1
            if (r6 < 0) goto L69
            short[] r3 = com.tencent.mm.vfs.AccessControlFileSystem.f212680h
            r4 = 10
            if (r6 < r4) goto L15
            goto L69
        L15:
            short r6 = r3[r6]
            int r3 = r0.f212888a
            int r3 = r2 << r3
            r6 = r6 & r3
            if (r6 != 0) goto L1f
            goto L69
        L1f:
            java.lang.String r6 = r0.f212890c
            boolean r3 = r7.startsWith(r6)
            if (r3 != 0) goto L28
            goto L69
        L28:
            int r3 = r7.length()
            int r4 = r6.length()
            if (r3 == r4) goto L3f
            int r6 = r6.length()
            char r6 = r7.charAt(r6)
            r7 = 47
            if (r6 == r7) goto L3f
            goto L69
        L3f:
            com.tencent.mm.vfs.q2 r6 = r0.f212889b
            boolean r7 = r5.equals(r6)
            if (r7 == 0) goto L49
        L47:
            r6 = r2
            goto L6a
        L49:
            r7 = 0
            java.lang.Iterable r6 = com.tencent.mm.vfs.e8.c(r6, r7)
            java.util.Iterator r6 = r6.iterator()
        L52:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L69
            java.lang.Object r7 = r6.next()
            com.tencent.mm.vfs.q2 r7 = (com.tencent.mm.vfs.q2) r7
            boolean r0 = r7 instanceof com.tencent.mm.vfs.c
            if (r0 == 0) goto L52
            boolean r7 = r7.equals(r5)
            if (r7 == 0) goto L52
            goto L47
        L69:
            r6 = r1
        L6a:
            if (r6 == 0) goto L6d
            r1 = r2
        L6d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.vfs.c.K(int, java.lang.String):boolean");
    }

    public void L(int i17, int i18, java.lang.String str) {
        J(0, "op", java.lang.Integer.valueOf(i17), "result", java.lang.Integer.valueOf(i18), com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, str);
    }

    public void M(int i17, int i18, java.lang.String str, com.tencent.mm.vfs.q2 q2Var, java.lang.String str2) {
        J(0, "op", java.lang.Integer.valueOf(i17), "result", java.lang.Integer.valueOf(i18), com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, str, "targetFS", q2Var, "targetPath", str2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0016, code lost:
    
        if (K(0, r5) != false) goto L11;
     */
    @Override // com.tencent.mm.vfs.o8, com.tencent.mm.vfs.q2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.io.InputStream a(java.lang.String r5) {
        /*
            r4 = this;
            byte[] r0 = r4.f212844f
            r1 = 0
            r0 = r0[r1]
            if (r0 != 0) goto Lc
            java.io.InputStream r5 = super.a(r5)
            return r5
        Lc:
            r2 = 3
            r3 = 2
            if (r0 == r2) goto L20
            if (r0 != r3) goto L18
            boolean r0 = r4.K(r1, r5)     // Catch: java.lang.Throwable -> L27 java.io.FileNotFoundException -> L2a com.tencent.mm.vfs.e -> L2f
            if (r0 == 0) goto L20
        L18:
            java.io.InputStream r0 = super.a(r5)     // Catch: java.lang.Throwable -> L27 java.io.FileNotFoundException -> L2a com.tencent.mm.vfs.e -> L2f
            r4.L(r1, r1, r5)
            return r0
        L20:
            com.tencent.mm.vfs.e r0 = new com.tencent.mm.vfs.e     // Catch: java.lang.Throwable -> L27 java.io.FileNotFoundException -> L2a com.tencent.mm.vfs.e -> L2f
            r2 = 0
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L27 java.io.FileNotFoundException -> L2a com.tencent.mm.vfs.e -> L2f
            throw r0     // Catch: java.lang.Throwable -> L27 java.io.FileNotFoundException -> L2a com.tencent.mm.vfs.e -> L2f
        L27:
            r0 = move-exception
            r3 = r1
            goto L38
        L2a:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L2c
        L2c:
            r0 = move-exception
            r3 = 1
            goto L38
        L2f:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException     // Catch: java.lang.Throwable -> L37
            java.lang.String r2 = "Access denied"
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L37
            throw r0     // Catch: java.lang.Throwable -> L37
        L37:
            r0 = move-exception
        L38:
            r4.L(r1, r3, r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.vfs.c.a(java.lang.String):java.io.InputStream");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0017, code lost:
    
        if (K(1, r6) != false) goto L11;
     */
    @Override // com.tencent.mm.vfs.o8, com.tencent.mm.vfs.q2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.io.OutputStream c(java.lang.String r6, boolean r7) {
        /*
            r5 = this;
            byte[] r0 = r5.f212844f
            r1 = 1
            r0 = r0[r1]
            if (r0 != 0) goto Lc
            java.io.OutputStream r6 = super.c(r6, r7)
            return r6
        Lc:
            r2 = 3
            r3 = 2
            r4 = 0
            if (r0 == r2) goto L21
            if (r0 != r3) goto L19
            boolean r0 = r5.K(r1, r6)     // Catch: java.lang.Throwable -> L28 java.io.FileNotFoundException -> L2b com.tencent.mm.vfs.e -> L30
            if (r0 == 0) goto L21
        L19:
            java.io.OutputStream r7 = super.c(r6, r7)     // Catch: java.lang.Throwable -> L28 java.io.FileNotFoundException -> L2b com.tencent.mm.vfs.e -> L30
            r5.L(r1, r4, r6)
            return r7
        L21:
            com.tencent.mm.vfs.e r7 = new com.tencent.mm.vfs.e     // Catch: java.lang.Throwable -> L28 java.io.FileNotFoundException -> L2b com.tencent.mm.vfs.e -> L30
            r0 = 0
            r7.<init>(r0)     // Catch: java.lang.Throwable -> L28 java.io.FileNotFoundException -> L2b com.tencent.mm.vfs.e -> L30
            throw r7     // Catch: java.lang.Throwable -> L28 java.io.FileNotFoundException -> L2b com.tencent.mm.vfs.e -> L30
        L28:
            r7 = move-exception
            r3 = r4
            goto L39
        L2b:
            r7 = move-exception
            throw r7     // Catch: java.lang.Throwable -> L2d
        L2d:
            r7 = move-exception
            r3 = r1
            goto L39
        L30:
            java.io.FileNotFoundException r7 = new java.io.FileNotFoundException     // Catch: java.lang.Throwable -> L38
            java.lang.String r0 = "Access denied"
            r7.<init>(r0)     // Catch: java.lang.Throwable -> L38
            throw r7     // Catch: java.lang.Throwable -> L38
        L38:
            r7 = move-exception
        L39:
            r5.L(r1, r3, r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.vfs.c.c(java.lang.String, boolean):java.io.OutputStream");
    }

    @Override // com.tencent.mm.vfs.o8, com.tencent.mm.vfs.q2
    public boolean d(java.lang.String str) {
        boolean z17;
        byte b17 = this.f212844f[3];
        int i17 = 2;
        if (b17 == 3 || (b17 == 2 && !K(3, str))) {
            z17 = false;
        } else {
            boolean d17 = super.d(str);
            z17 = d17;
            i17 = !d17;
        }
        if (b17 != 0) {
            L(3, i17, str);
        }
        return z17;
    }

    @Override // com.tencent.mm.vfs.o8, com.tencent.mm.vfs.q2
    public boolean e(java.lang.String str, boolean z17) {
        boolean z18;
        byte b17 = this.f212844f[3];
        int i17 = 2;
        if (b17 == 3 || (b17 == 2 && !K(3, str))) {
            z18 = false;
        } else {
            z18 = super.e(str, z17);
            i17 = !z18;
        }
        if (b17 != 0) {
            L(3, i17, str);
        }
        return z18;
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.tencent.mm.vfs.c)) {
            return false;
        }
        com.tencent.mm.vfs.c cVar = (com.tencent.mm.vfs.c) obj;
        return this.f213118e.equals(cVar.f213118e) && java.util.Arrays.equals(this.f212844f, cVar.f212844f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0017, code lost:
    
        if (K(1, r6) != false) goto L11;
     */
    @Override // com.tencent.mm.vfs.o8, com.tencent.mm.vfs.a, com.tencent.mm.vfs.q2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.nio.channels.WritableByteChannel h(java.lang.String r6, boolean r7) {
        /*
            r5 = this;
            byte[] r0 = r5.f212844f
            r1 = 1
            r0 = r0[r1]
            if (r0 != 0) goto Lc
            java.nio.channels.WritableByteChannel r6 = super.h(r6, r7)
            return r6
        Lc:
            r2 = 3
            r3 = 2
            r4 = 0
            if (r0 == r2) goto L21
            if (r0 != r3) goto L19
            boolean r0 = r5.K(r1, r6)     // Catch: java.lang.Throwable -> L28 java.io.FileNotFoundException -> L2b com.tencent.mm.vfs.e -> L30
            if (r0 == 0) goto L21
        L19:
            java.nio.channels.WritableByteChannel r7 = super.h(r6, r7)     // Catch: java.lang.Throwable -> L28 java.io.FileNotFoundException -> L2b com.tencent.mm.vfs.e -> L30
            r5.L(r1, r4, r6)
            return r7
        L21:
            com.tencent.mm.vfs.e r7 = new com.tencent.mm.vfs.e     // Catch: java.lang.Throwable -> L28 java.io.FileNotFoundException -> L2b com.tencent.mm.vfs.e -> L30
            r0 = 0
            r7.<init>(r0)     // Catch: java.lang.Throwable -> L28 java.io.FileNotFoundException -> L2b com.tencent.mm.vfs.e -> L30
            throw r7     // Catch: java.lang.Throwable -> L28 java.io.FileNotFoundException -> L2b com.tencent.mm.vfs.e -> L30
        L28:
            r7 = move-exception
            r3 = r4
            goto L39
        L2b:
            r7 = move-exception
            throw r7     // Catch: java.lang.Throwable -> L2d
        L2d:
            r7 = move-exception
            r3 = r1
            goto L39
        L30:
            java.io.FileNotFoundException r7 = new java.io.FileNotFoundException     // Catch: java.lang.Throwable -> L38
            java.lang.String r0 = "Access denied"
            r7.<init>(r0)     // Catch: java.lang.Throwable -> L38
            throw r7     // Catch: java.lang.Throwable -> L38
        L38:
            r7 = move-exception
        L39:
            r5.L(r1, r3, r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.vfs.c.h(java.lang.String, boolean):java.nio.channels.WritableByteChannel");
    }

    public int hashCode() {
        int hashCode = com.tencent.mm.vfs.c.class.hashCode();
        java.lang.Object[] objArr = {this.f213118e, this.f212844f};
        java.util.regex.Pattern pattern = com.tencent.mm.vfs.e8.f212917a;
        return hashCode ^ java.util.Arrays.deepHashCode(objArr);
    }

    @Override // com.tencent.mm.vfs.o8, com.tencent.mm.vfs.q2
    public java.lang.Iterable list(java.lang.String str) {
        java.lang.Iterable iterable;
        byte b17 = this.f212844f[4];
        int i17 = 2;
        if (b17 == 3 || (b17 == 2 && !K(4, str))) {
            iterable = null;
        } else {
            iterable = super.list(str);
            i17 = iterable != null ? 0 : 1;
        }
        if (b17 != 0) {
            L(4, i17, str);
        }
        return iterable;
    }

    @Override // com.tencent.mm.vfs.o8, com.tencent.mm.vfs.q2
    public com.tencent.mm.vfs.x1 m(java.lang.String str) {
        com.tencent.mm.vfs.x1 x1Var;
        int i17;
        byte b17 = this.f212844f[2];
        if (b17 == 3 || (b17 == 2 && !K(2, str))) {
            x1Var = null;
            i17 = 2;
        } else {
            x1Var = super.m(str);
            i17 = x1Var != null ? 0 : 1;
        }
        if (b17 != 0) {
            L(2, i17, str);
        }
        return x1Var;
    }

    @Override // com.tencent.mm.vfs.o8, com.tencent.mm.vfs.q2
    public boolean n(java.lang.String str, long j17) {
        return super.n(str, j17);
    }

    @Override // com.tencent.mm.vfs.o8, com.tencent.mm.vfs.q2
    public boolean r(java.lang.String str) {
        boolean z17;
        byte b17 = this.f212844f[5];
        int i17 = 2;
        if (b17 == 3 || (b17 == 2 && !K(5, str))) {
            z17 = false;
        } else {
            z17 = super.r(str);
            i17 = !z17;
        }
        if (b17 != 0) {
            L(5, i17, str);
        }
        return z17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0016, code lost:
    
        if (K(0, r5) != false) goto L11;
     */
    @Override // com.tencent.mm.vfs.o8, com.tencent.mm.vfs.a, com.tencent.mm.vfs.q2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.nio.channels.ReadableByteChannel s(java.lang.String r5) {
        /*
            r4 = this;
            byte[] r0 = r4.f212844f
            r1 = 0
            r0 = r0[r1]
            if (r0 != 0) goto Lc
            java.nio.channels.ReadableByteChannel r5 = super.s(r5)
            return r5
        Lc:
            r2 = 3
            r3 = 2
            if (r0 == r2) goto L20
            if (r0 != r3) goto L18
            boolean r0 = r4.K(r1, r5)     // Catch: java.lang.Throwable -> L27 java.io.FileNotFoundException -> L2a com.tencent.mm.vfs.e -> L2f
            if (r0 == 0) goto L20
        L18:
            java.nio.channels.ReadableByteChannel r0 = super.s(r5)     // Catch: java.lang.Throwable -> L27 java.io.FileNotFoundException -> L2a com.tencent.mm.vfs.e -> L2f
            r4.L(r1, r1, r5)
            return r0
        L20:
            com.tencent.mm.vfs.e r0 = new com.tencent.mm.vfs.e     // Catch: java.lang.Throwable -> L27 java.io.FileNotFoundException -> L2a com.tencent.mm.vfs.e -> L2f
            r2 = 0
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L27 java.io.FileNotFoundException -> L2a com.tencent.mm.vfs.e -> L2f
            throw r0     // Catch: java.lang.Throwable -> L27 java.io.FileNotFoundException -> L2a com.tencent.mm.vfs.e -> L2f
        L27:
            r0 = move-exception
            r3 = r1
            goto L38
        L2a:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L2c
        L2c:
            r0 = move-exception
            r3 = 1
            goto L38
        L2f:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException     // Catch: java.lang.Throwable -> L37
            java.lang.String r2 = "Access denied"
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L37
            throw r0     // Catch: java.lang.Throwable -> L37
        L37:
            r0 = move-exception
        L38:
            r4.L(r1, r3, r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.vfs.c.s(java.lang.String):java.nio.channels.ReadableByteChannel");
    }

    @Override // com.tencent.mm.vfs.a
    public java.lang.String toString() {
        int i17 = com.tencent.mm.vfs.AccessControlFileSystem.f212681i;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(i17);
        for (int i18 = 0; i18 < i17; i18++) {
            sb6.append(com.tencent.mm.vfs.AccessControlFileSystem.f212683n[this.f212844f[i18]]);
        }
        return java.lang.String.format("ac(%s) <- %s", sb6.toString(), this.f213118e);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x001d, code lost:
    
        if (K(r0 ? 1 : 0, r6) != false) goto L11;
     */
    @Override // com.tencent.mm.vfs.o8, com.tencent.mm.vfs.a, com.tencent.mm.vfs.q2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.os.ParcelFileDescriptor x(java.lang.String r6, java.lang.String r7) {
        /*
            r5 = this;
            java.lang.String r0 = "w"
            boolean r0 = r7.contains(r0)
            byte[] r1 = r5.f212844f
            r1 = r1[r0]
            if (r1 != 0) goto L12
            android.os.ParcelFileDescriptor r6 = super.x(r6, r7)
            return r6
        L12:
            r2 = 3
            r3 = 2
            r4 = 0
            if (r1 == r2) goto L27
            if (r1 != r3) goto L1f
            boolean r1 = r5.K(r0, r6)     // Catch: java.lang.Throwable -> L2e java.io.FileNotFoundException -> L31 com.tencent.mm.vfs.e -> L36
            if (r1 == 0) goto L27
        L1f:
            android.os.ParcelFileDescriptor r7 = super.x(r6, r7)     // Catch: java.lang.Throwable -> L2e java.io.FileNotFoundException -> L31 com.tencent.mm.vfs.e -> L36
            r5.L(r0, r4, r6)
            return r7
        L27:
            com.tencent.mm.vfs.e r7 = new com.tencent.mm.vfs.e     // Catch: java.lang.Throwable -> L2e java.io.FileNotFoundException -> L31 com.tencent.mm.vfs.e -> L36
            r1 = 0
            r7.<init>(r1)     // Catch: java.lang.Throwable -> L2e java.io.FileNotFoundException -> L31 com.tencent.mm.vfs.e -> L36
            throw r7     // Catch: java.lang.Throwable -> L2e java.io.FileNotFoundException -> L31 com.tencent.mm.vfs.e -> L36
        L2e:
            r7 = move-exception
            r3 = r4
            goto L3f
        L31:
            r7 = move-exception
            throw r7     // Catch: java.lang.Throwable -> L33
        L33:
            r7 = move-exception
            r3 = 1
            goto L3f
        L36:
            java.io.FileNotFoundException r7 = new java.io.FileNotFoundException     // Catch: java.lang.Throwable -> L3e
            java.lang.String r1 = "Access denied"
            r7.<init>(r1)     // Catch: java.lang.Throwable -> L3e
            throw r7     // Catch: java.lang.Throwable -> L3e
        L3e:
            r7 = move-exception
        L3f:
            r5.L(r0, r3, r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.vfs.c.x(java.lang.String, java.lang.String):android.os.ParcelFileDescriptor");
    }

    @Override // com.tencent.mm.vfs.q2
    public com.tencent.mm.vfs.FileSystem y() {
        return this.f212845g;
    }
}
