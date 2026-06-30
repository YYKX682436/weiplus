package od0;

/* loaded from: classes12.dex */
public abstract class o0 {

    /* renamed from: a, reason: collision with root package name */
    public static r45.jw4 f344568a;

    static {
        new java.util.HashMap();
        f344568a = null;
    }

    public static r45.kw4 a(int i17) {
        r45.jw4 jw4Var = f344568a;
        if (jw4Var == null) {
            return null;
        }
        java.util.Iterator it = jw4Var.f378168d.iterator();
        while (it.hasNext()) {
            r45.kw4 kw4Var = (r45.kw4) it.next();
            if (kw4Var.f379001d == i17) {
                return kw4Var;
            }
        }
        return null;
    }

    public static java.lang.String b() {
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            return gm0.j1.u().h();
        }
        int i17 = gm0.m.i();
        if (i17 == 0) {
            return null;
        }
        return com.tencent.mm.storage.v3.f196273a + gm0.b0.e(i17) + '/';
    }

    public static synchronized boolean c(int i17, long j17, int i18) {
        synchronized (od0.o0.class) {
            if (j17 <= 0 || i18 <= 0) {
                com.tencent.mars.xlog.Log.w("MicroMsg.SecInfoReporterImpl", "bad interval: %s, %s", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i18));
                return false;
            }
            if (f344568a == null) {
                d();
            }
            r45.kw4 a17 = a(i17);
            if (a17 == null) {
                a17 = new r45.kw4();
                a17.f379001d = i17;
                a17.f379002e = 0L;
                f344568a.f378168d.add(a17);
            }
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            long j18 = a17.f379002e;
            if (currentTimeMillis >= j18 && currentTimeMillis / j17 == j18 / j17) {
                int i19 = a17.f379003f;
                if (i19 >= i18) {
                    return false;
                }
                a17.f379002e = currentTimeMillis;
                a17.f379003f = i19 + 1;
                g();
                return true;
            }
            a17.f379002e = currentTimeMillis;
            a17.f379003f = 1;
            g();
            return true;
        }
    }

    public static synchronized void d() {
        synchronized (od0.o0.class) {
            if (f344568a != null) {
                return;
            }
            try {
                f344568a = f();
            } catch (od0.n0 unused) {
                f344568a = e();
            } catch (java.lang.Exception e17) {
                f344568a = new r45.jw4();
                com.tencent.mars.xlog.Log.e("MicroMsg.SecInfoReporterImpl", "normsg stat load failed, use default. %s", e17);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ba, code lost:
    
        if (r5 == null) goto L36;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized r45.jw4 e() {
        /*
            java.lang.Class<od0.o0> r0 = od0.o0.class
            monitor-enter(r0)
            r45.jw4 r1 = new r45.jw4     // Catch: java.lang.Throwable -> Lc7
            r1.<init>()     // Catch: java.lang.Throwable -> Lc7
            java.lang.String r2 = b()     // Catch: java.lang.Throwable -> Lc7
            if (r2 != 0) goto L10
            monitor-exit(r0)
            return r1
        L10:
            fo3.s r3 = fo3.s.INSTANCE     // Catch: java.lang.Throwable -> Lc7
            java.lang.String r4 = "!#?'8/f((6(1$\u001f2*>(s826"
            java.lang.String r3 = r3.V6(r4)     // Catch: java.lang.Throwable -> Lc7
            com.tencent.mm.vfs.z7 r2 = com.tencent.mm.vfs.z7.a(r2)     // Catch: java.lang.Throwable -> Lc7
            r4 = 0
            boolean r5 = r3.isEmpty()     // Catch: java.lang.Throwable -> Lc7
            java.lang.String r6 = r2.f213279f     // Catch: java.lang.Throwable -> Lc7
            if (r5 != 0) goto L3d
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc7
            r5.<init>()     // Catch: java.lang.Throwable -> Lc7
            r5.append(r6)     // Catch: java.lang.Throwable -> Lc7
            r6 = 47
            r5.append(r6)     // Catch: java.lang.Throwable -> Lc7
            r5.append(r3)     // Catch: java.lang.Throwable -> Lc7
            java.lang.String r3 = r5.toString()     // Catch: java.lang.Throwable -> Lc7
            java.lang.String r6 = com.tencent.mm.vfs.e8.l(r3, r4, r4)     // Catch: java.lang.Throwable -> Lc7
        L3d:
            r8 = r6
            com.tencent.mm.vfs.z7 r3 = new com.tencent.mm.vfs.z7     // Catch: java.lang.Throwable -> Lc7
            java.lang.String r6 = r2.f213277d     // Catch: java.lang.Throwable -> Lc7
            java.lang.String r7 = r2.f213278e     // Catch: java.lang.Throwable -> Lc7
            java.lang.String r9 = r2.f213280g     // Catch: java.lang.Throwable -> Lc7
            java.lang.String r10 = r2.f213281h     // Catch: java.lang.Throwable -> Lc7
            r5 = r3
            r5.<init>(r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> Lc7
            r2 = 0
            java.io.DataInputStream r5 = new java.io.DataInputStream     // Catch: java.lang.Throwable -> La9 java.lang.Exception -> Lab
            com.tencent.mm.vfs.b3 r6 = com.tencent.mm.vfs.a3.f212781a     // Catch: java.lang.Throwable -> La9 java.lang.Exception -> Lab
            com.tencent.mm.vfs.z2 r6 = r6.m(r3, r2)     // Catch: java.lang.Throwable -> La9 java.lang.Exception -> Lab
            java.io.InputStream r3 = com.tencent.mm.vfs.w6.D(r3, r6)     // Catch: java.lang.Throwable -> La9 java.lang.Exception -> Lab
            r5.<init>(r3)     // Catch: java.lang.Throwable -> La9 java.lang.Exception -> Lab
            short r2 = r5.readShort()     // Catch: java.lang.Exception -> La7 java.lang.Throwable -> Lbf
            r3 = -774(0xfffffffffffffcfa, float:NaN)
            if (r2 != r3) goto L9f
            r5.readShort()     // Catch: java.lang.Exception -> La7 java.lang.Throwable -> Lbf
            int r2 = r5.readInt()     // Catch: java.lang.Exception -> La7 java.lang.Throwable -> Lbf
            if (r2 < 0) goto L97
        L6d:
            if (r4 >= r2) goto L8b
            int r3 = r5.readInt()     // Catch: java.lang.Exception -> La7 java.lang.Throwable -> Lbf
            long r6 = r5.readLong()     // Catch: java.lang.Exception -> La7 java.lang.Throwable -> Lbf
            r45.kw4 r8 = new r45.kw4     // Catch: java.lang.Exception -> La7 java.lang.Throwable -> Lbf
            r8.<init>()     // Catch: java.lang.Exception -> La7 java.lang.Throwable -> Lbf
            r8.f379001d = r3     // Catch: java.lang.Exception -> La7 java.lang.Throwable -> Lbf
            r8.f379002e = r6     // Catch: java.lang.Exception -> La7 java.lang.Throwable -> Lbf
            r3 = 1
            r8.f379003f = r3     // Catch: java.lang.Exception -> La7 java.lang.Throwable -> Lbf
            java.util.LinkedList r3 = r1.f378168d     // Catch: java.lang.Exception -> La7 java.lang.Throwable -> Lbf
            r3.add(r8)     // Catch: java.lang.Exception -> La7 java.lang.Throwable -> Lbf
            int r4 = r4 + 1
            goto L6d
        L8b:
            java.lang.String r2 = "MicroMsg.SecInfoReporterImpl"
            java.lang.String r3 = "normsg stat load done."
            com.tencent.mars.xlog.Log.i(r2, r3)     // Catch: java.lang.Exception -> La7 java.lang.Throwable -> Lbf
        L93:
            r5.close()     // Catch: java.lang.Exception -> Lbd java.lang.Throwable -> Lc7
            goto Lbd
        L97:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Exception -> La7 java.lang.Throwable -> Lbf
            java.lang.String r3 = "bad pair count."
            r2.<init>(r3)     // Catch: java.lang.Exception -> La7 java.lang.Throwable -> Lbf
            throw r2     // Catch: java.lang.Exception -> La7 java.lang.Throwable -> Lbf
        L9f:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Exception -> La7 java.lang.Throwable -> Lbf
            java.lang.String r3 = "bad magic."
            r2.<init>(r3)     // Catch: java.lang.Exception -> La7 java.lang.Throwable -> Lbf
            throw r2     // Catch: java.lang.Exception -> La7 java.lang.Throwable -> Lbf
        La7:
            r2 = move-exception
            goto Lae
        La9:
            r1 = move-exception
            goto Lc1
        Lab:
            r3 = move-exception
            r5 = r2
            r2 = r3
        Lae:
            java.lang.String r3 = "MicroMsg.SecInfoReporterImpl"
            java.lang.String r4 = "normsg stat load failed, use default."
            java.lang.Object[] r2 = new java.lang.Object[]{r2}     // Catch: java.lang.Throwable -> Lbf
            com.tencent.mars.xlog.Log.e(r3, r4, r2)     // Catch: java.lang.Throwable -> Lbf
            if (r5 == 0) goto Lbd
            goto L93
        Lbd:
            monitor-exit(r0)
            return r1
        Lbf:
            r1 = move-exception
            r2 = r5
        Lc1:
            if (r2 == 0) goto Lc6
            r2.close()     // Catch: java.lang.Exception -> Lc6 java.lang.Throwable -> Lc7
        Lc6:
            throw r1     // Catch: java.lang.Throwable -> Lc7
        Lc7:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: od0.o0.e():r45.jw4");
    }

    public static synchronized r45.jw4 f() {
        com.tencent.mm.vfs.x1 m17;
        java.io.DataInputStream dataInputStream;
        synchronized (od0.o0.class) {
            r45.jw4 jw4Var = new r45.jw4();
            java.lang.String b17 = b();
            if (b17 == null) {
                return jw4Var;
            }
            java.lang.String V6 = fo3.s.INSTANCE.V6("!#?'8/f((6(1$\u001f2*>(s826");
            com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(b17);
            boolean isEmpty = V6.isEmpty();
            java.lang.String str = a17.f213279f;
            if (!isEmpty) {
                str = com.tencent.mm.vfs.e8.l(str + '/' + V6, false, false);
            }
            com.tencent.mm.vfs.z7 z7Var = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, str, a17.f213280g, a17.f213281h);
            java.io.DataInputStream dataInputStream2 = null;
            com.tencent.mm.vfs.z2 m18 = com.tencent.mm.vfs.a3.f212781a.m(z7Var, null);
            long j17 = 0;
            if (m18.a() && (m17 = m18.f213266a.m(m18.f213267b)) != null) {
                j17 = m17.f213233c;
            }
            int i17 = (int) j17;
            if (i17 == 0) {
                return jw4Var;
            }
            byte[] bArr = new byte[i17];
            try {
                try {
                    dataInputStream = new java.io.DataInputStream(com.tencent.mm.vfs.w6.D(z7Var, com.tencent.mm.vfs.a3.f212781a.m(z7Var, m18)));
                } catch (java.lang.Exception e17) {
                    e = e17;
                }
            } catch (java.lang.Throwable th6) {
                th = th6;
            }
            try {
                dataInputStream.read(bArr);
                try {
                    dataInputStream.close();
                } catch (java.lang.Exception unused) {
                }
                try {
                    jw4Var.parseFrom(bArr);
                    com.tencent.mars.xlog.Log.i("MicroMsg.SecInfoReporterImpl", "normsg stat load done.");
                    return jw4Var;
                } catch (java.lang.Exception unused2) {
                    throw new od0.n0();
                }
            } catch (java.lang.Exception e18) {
                e = e18;
                dataInputStream2 = dataInputStream;
                com.tencent.mars.xlog.Log.e("MicroMsg.SecInfoReporterImpl", "normsg stat load failed, use default. %s", e);
                if (dataInputStream2 != null) {
                    try {
                        dataInputStream2.close();
                    } catch (java.lang.Exception unused3) {
                    }
                }
                return jw4Var;
            } catch (java.lang.Throwable th7) {
                th = th7;
                dataInputStream2 = dataInputStream;
                if (dataInputStream2 != null) {
                    try {
                        dataInputStream2.close();
                    } catch (java.lang.Exception unused4) {
                    }
                }
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.String] */
    public static synchronized void g() {
        java.io.DataOutputStream dataOutputStream;
        java.lang.Throwable th6;
        synchronized (od0.o0.class) {
            java.lang.String b17 = b();
            if (b17 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SecInfoReporterImpl", "normsg cache path is null.");
                return;
            }
            com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(b17, fo3.s.INSTANCE.V6("!#?'8/f((6(1$\u001f2*>(s826"));
            if (!r6Var.m()) {
                r6Var.s().J();
            }
            java.io.DataOutputStream dataOutputStream2 = null;
            java.io.DataOutputStream dataOutputStream3 = null;
            try {
                try {
                    try {
                        dataOutputStream = new java.io.DataOutputStream(com.tencent.mm.vfs.w6.H(r6Var));
                    } catch (java.lang.Throwable th7) {
                        dataOutputStream = dataOutputStream2;
                        th6 = th7;
                    }
                } catch (java.lang.Exception unused) {
                }
            } catch (java.lang.Exception unused2) {
            }
            try {
                r45.jw4 jw4Var = f344568a;
                if (jw4Var != null) {
                    dataOutputStream.write(jw4Var.toByteArray());
                }
                ?? r17 = "MicroMsg.SecInfoReporterImpl";
                com.tencent.mars.xlog.Log.i("MicroMsg.SecInfoReporterImpl", "normsg stat save done.");
                dataOutputStream.close();
                dataOutputStream2 = r17;
            } catch (java.lang.Exception unused3) {
                dataOutputStream3 = dataOutputStream;
                com.tencent.mars.xlog.Log.e("MicroMsg.SecInfoReporterImpl", "normsg stat save failed.");
                dataOutputStream2 = dataOutputStream3;
                if (dataOutputStream3 != null) {
                    dataOutputStream3.close();
                    dataOutputStream2 = dataOutputStream3;
                }
            } catch (java.lang.Throwable th8) {
                th6 = th8;
                if (dataOutputStream != null) {
                    try {
                        dataOutputStream.close();
                    } catch (java.lang.Exception unused4) {
                    }
                }
                throw th6;
            }
        }
    }
}
