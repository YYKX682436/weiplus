package j42;

/* loaded from: classes15.dex */
public class e implements j42.f {

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.String[] f297664d;

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f297665e;

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.HashMap f297666f;

    /* renamed from: a, reason: collision with root package name */
    public final int f297667a;

    /* renamed from: b, reason: collision with root package name */
    public x51.k0 f297668b;

    /* renamed from: c, reason: collision with root package name */
    public j42.d f297669c;

    static {
        l75.e0 e0Var = r42.a.f369508u;
        f297664d = new java.lang.String[]{l75.n0.getCreateSQLs(e0Var, "EdgeComputingCacheDataModel_Instance")};
        f297665e = new java.lang.String[]{l75.n0.getCreateSQLs(e0Var, "EdgeComputingCacheDataModel_Normal")};
        java.util.HashMap hashMap = new java.util.HashMap();
        f297666f = hashMap;
        hashMap.put(-91701509, new j42.b());
        hashMap.put(-756345559, new j42.c());
    }

    public e(int i17) {
        this.f297667a = i17;
    }

    @Override // j42.f
    public void close() {
        this.f297669c = null;
        x51.k0 k0Var = this.f297668b;
        if (k0Var != null) {
            k0Var.W(hashCode());
        }
        this.f297668b = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0082, code lost:
    
        if (r2.moveToFirst() != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0084, code lost:
    
        r3 = new r42.a();
        r3.convertFrom(r2);
        r3.f369509r = r3.field_configID;
        r3.f369510s = r3.field_reportTimeEC;
        r3.f369511t = r3.field_data;
        r6.add(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x009f, code lost:
    
        if (r2.moveToNext() != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00af, code lost:
    
        if (r2 != null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00d5, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d1, code lost:
    
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00cf, code lost:
    
        if (r2 == null) goto L36;
     */
    @Override // j42.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List e(java.lang.String r20) {
        /*
            r19 = this;
            r0 = r20
            boolean r1 = u46.l.e(r20)
            r2 = 0
            if (r1 != 0) goto Ldc
            r1 = r19
            j42.d r3 = r1.f297669c
            if (r3 != 0) goto L11
            goto Lde
        L11:
            r3.getClass()
            java.lang.String r4 = " limit "
            java.lang.String r5 = "reportTimeEC"
            boolean r6 = u46.l.e(r20)
            if (r6 == 0) goto L21
            goto Ld5
        L21:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            g42.f r7 = g42.f.Bi()     // Catch: java.lang.Throwable -> Lb2 java.lang.Exception -> Lb4
            o42.b r7 = r7.f268728n     // Catch: java.lang.Throwable -> Lb2 java.lang.Exception -> Lb4
            r8 = 0
            if (r7 == 0) goto L3e
            int r7 = o42.b.f342834d     // Catch: java.lang.Throwable -> Lb2 java.lang.Exception -> Lb4
            long r9 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Lb2 java.lang.Exception -> Lb4
            int r11 = o42.b.f342835e     // Catch: java.lang.Throwable -> Lb2 java.lang.Exception -> Lb4
            long r11 = (long) r11     // Catch: java.lang.Throwable -> Lb2 java.lang.Exception -> Lb4
            r13 = 86400000(0x5265c00, double:4.2687272E-316)
            long r11 = r11 * r13
            long r9 = r9 - r11
            goto L41
        L3e:
            r9 = 0
            r7 = r8
        L41:
            l75.k0 r11 = r3.f297662d     // Catch: java.lang.Throwable -> Lb2 java.lang.Exception -> Lb4
            java.lang.String r12 = r3.f297663e     // Catch: java.lang.Throwable -> Lb2 java.lang.Exception -> Lb4
            l75.e0 r3 = r42.a.f369508u     // Catch: java.lang.Throwable -> Lb2 java.lang.Exception -> Lb4
            java.lang.String[] r13 = r3.f316954c     // Catch: java.lang.Throwable -> Lb2 java.lang.Exception -> Lb4
            java.lang.String r14 = "configID = ? and reportTimeEC >= ? "
            r3 = 2
            java.lang.String[] r15 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> Lb2 java.lang.Exception -> Lb4
            r15[r8] = r0     // Catch: java.lang.Throwable -> Lb2 java.lang.Exception -> Lb4
            java.lang.String r3 = java.lang.String.valueOf(r9)     // Catch: java.lang.Throwable -> Lb2 java.lang.Exception -> Lb4
            r8 = 1
            r15[r8] = r3     // Catch: java.lang.Throwable -> Lb2 java.lang.Exception -> Lb4
            r16 = 0
            r17 = 0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb2 java.lang.Exception -> Lb4
            r3.<init>(r5)     // Catch: java.lang.Throwable -> Lb2 java.lang.Exception -> Lb4
            if (r7 <= 0) goto L6f
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb2 java.lang.Exception -> Lb4
            r5.<init>(r4)     // Catch: java.lang.Throwable -> Lb2 java.lang.Exception -> Lb4
            r5.append(r7)     // Catch: java.lang.Throwable -> Lb2 java.lang.Exception -> Lb4
            java.lang.String r4 = r5.toString()     // Catch: java.lang.Throwable -> Lb2 java.lang.Exception -> Lb4
            goto L71
        L6f:
            java.lang.String r4 = ""
        L71:
            r3.append(r4)     // Catch: java.lang.Throwable -> Lb2 java.lang.Exception -> Lb4
            java.lang.String r18 = r3.toString()     // Catch: java.lang.Throwable -> Lb2 java.lang.Exception -> Lb4
            android.database.Cursor r2 = r11.E(r12, r13, r14, r15, r16, r17, r18)     // Catch: java.lang.Throwable -> Lb2 java.lang.Exception -> Lb4
            if (r2 == 0) goto La1
            boolean r3 = r2.moveToFirst()     // Catch: java.lang.Throwable -> Lb2 java.lang.Exception -> Lb4
            if (r3 == 0) goto La1
        L84:
            r42.a r3 = new r42.a     // Catch: java.lang.Throwable -> Lb2 java.lang.Exception -> Lb4
            r3.<init>()     // Catch: java.lang.Throwable -> Lb2 java.lang.Exception -> Lb4
            r3.convertFrom(r2)     // Catch: java.lang.Throwable -> Lb2 java.lang.Exception -> Lb4
            java.lang.String r4 = r3.field_configID     // Catch: java.lang.Throwable -> Lb2 java.lang.Exception -> Lb4
            r3.f369509r = r4     // Catch: java.lang.Throwable -> Lb2 java.lang.Exception -> Lb4
            long r4 = r3.field_reportTimeEC     // Catch: java.lang.Throwable -> Lb2 java.lang.Exception -> Lb4
            r3.f369510s = r4     // Catch: java.lang.Throwable -> Lb2 java.lang.Exception -> Lb4
            java.lang.String r4 = r3.field_data     // Catch: java.lang.Throwable -> Lb2 java.lang.Exception -> Lb4
            r3.f369511t = r4     // Catch: java.lang.Throwable -> Lb2 java.lang.Exception -> Lb4
            r6.add(r3)     // Catch: java.lang.Throwable -> Lb2 java.lang.Exception -> Lb4
            boolean r3 = r2.moveToNext()     // Catch: java.lang.Throwable -> Lb2 java.lang.Exception -> Lb4
            if (r3 != 0) goto L84
        La1:
            int r3 = r6.size()     // Catch: java.lang.Throwable -> Lb2 java.lang.Exception -> Lb4
            if (r3 < r7) goto Laf
            int r3 = r6.size()     // Catch: java.lang.Throwable -> Lb2 java.lang.Exception -> Lb4
            long r3 = (long) r3     // Catch: java.lang.Throwable -> Lb2 java.lang.Exception -> Lb4
            t42.a.e(r0, r3)     // Catch: java.lang.Throwable -> Lb2 java.lang.Exception -> Lb4
        Laf:
            if (r2 == 0) goto Ld4
            goto Ld1
        Lb2:
            r0 = move-exception
            goto Ld6
        Lb4:
            r0 = move-exception
            java.lang.String r3 = "EdgeComputingCacheWCDBDao"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb2
            r4.<init>()     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r5 = "[EdgeComputingCacheWCDBDao] queryCaches throw Exception : "
            r4.append(r5)     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> Lb2
            r4.append(r0)     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> Lb2
            com.tencent.mars.xlog.Log.e(r3, r0)     // Catch: java.lang.Throwable -> Lb2
            if (r2 == 0) goto Ld4
        Ld1:
            r2.close()
        Ld4:
            r2 = r6
        Ld5:
            return r2
        Ld6:
            if (r2 == 0) goto Ldb
            r2.close()
        Ldb:
            throw r0
        Ldc:
            r1 = r19
        Lde:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: j42.e.e(java.lang.String):java.util.List");
    }

    @Override // j42.f
    public void f(long j17) {
        j42.d dVar = this.f297669c;
        if (dVar == null) {
            return;
        }
        l75.k0 k0Var = dVar.f297662d;
        long b17 = k0Var != null ? k0Var.b() : -1L;
        try {
            try {
                com.tencent.mars.xlog.Log.e("EdgeComputingCacheWCDBDao", "[EdgeComputingCacheWCDBDao] removeExpireCaches ret : " + k0Var.delete(dVar.f297663e, "reportTimeEC<?", new java.lang.String[]{java.lang.String.valueOf(j17)}));
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("EdgeComputingCacheWCDBDao", "[EdgeComputingCacheWCDBDao] removeExpireCaches throw Exception : " + e17.getMessage());
                if (k0Var == null) {
                    return;
                }
            }
            k0Var.w(java.lang.Long.valueOf(b17));
        } catch (java.lang.Throwable th6) {
            if (k0Var != null) {
                k0Var.w(java.lang.Long.valueOf(b17));
            }
            throw th6;
        }
    }

    @Override // j42.f
    public void g() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
    
        if (r3 != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0043, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
    
        r3.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003d, code lost:
    
        if (r3 == null) goto L18;
     */
    @Override // j42.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long h() {
        /*
            r12 = this;
            j42.d r0 = r12.f297669c
            if (r0 != 0) goto L7
            r0 = 0
            return r0
        L7:
            r0.getClass()
            java.lang.String r1 = "[EdgeComputingCacheWCDBDao] cachesSize throw Exception : "
            r2 = 0
            r3 = 0
            l75.k0 r4 = r0.f297662d     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L27
            java.lang.String r5 = r0.f297663e     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L27
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            android.database.Cursor r3 = r4.E(r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L27
            if (r3 == 0) goto L22
            int r2 = r3.getCount()     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L27
        L22:
            if (r3 == 0) goto L42
            goto L3f
        L25:
            r0 = move-exception
            goto L44
        L27:
            r0 = move-exception
            java.lang.String r4 = "EdgeComputingCacheWCDBDao"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L25
            r5.<init>(r1)     // Catch: java.lang.Throwable -> L25
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L25
            r5.append(r0)     // Catch: java.lang.Throwable -> L25
            java.lang.String r0 = r5.toString()     // Catch: java.lang.Throwable -> L25
            com.tencent.mars.xlog.Log.e(r4, r0)     // Catch: java.lang.Throwable -> L25
            if (r3 == 0) goto L42
        L3f:
            r3.close()
        L42:
            long r0 = (long) r2
            return r0
        L44:
            if (r3 == 0) goto L49
            r3.close()
        L49:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j42.e.h():long");
    }

    @Override // j42.f
    public void i(r42.a aVar) {
        j42.d dVar;
        if (aVar == null || (dVar = this.f297669c) == null) {
            return;
        }
        l75.k0 k0Var = dVar.f297662d;
        long b17 = k0Var != null ? k0Var.b() : -1L;
        try {
            try {
                aVar.field_configID = aVar.f369509r;
                aVar.field_reportTimeEC = aVar.f369510s;
                aVar.field_data = aVar.f369511t;
                if (!dVar.insertNotify(aVar, false)) {
                    com.tencent.mars.xlog.Log.e("EdgeComputingCacheWCDBDao", "[EdgeComputingCacheWCDBDao] saveCache fail, configID : " + aVar.f369509r);
                }
                if (k0Var == null) {
                    return;
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("EdgeComputingCacheWCDBDao", "[EdgeComputingCacheWCDBDao] saveCache throw Exception : " + e17.getMessage());
                if (k0Var == null) {
                    return;
                }
            }
            k0Var.w(java.lang.Long.valueOf(b17));
        } catch (java.lang.Throwable th6) {
            if (k0Var != null) {
                k0Var.w(java.lang.Long.valueOf(b17));
            }
            throw th6;
        }
    }

    @Override // j42.f
    public void remove(java.lang.String str) {
        j42.d dVar;
        if (u46.l.e(str) || (dVar = this.f297669c) == null) {
            return;
        }
        if (u46.l.e(str)) {
            dVar.getClass();
            return;
        }
        l75.k0 k0Var = dVar.f297662d;
        long b17 = k0Var != null ? k0Var.b() : -1L;
        try {
            try {
                com.tencent.mars.xlog.Log.e("EdgeComputingCacheWCDBDao", "[EdgeComputingCacheWCDBDao] removeCaches ret : " + k0Var.delete(dVar.f297663e, "configID=?", new java.lang.String[]{str}));
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("EdgeComputingCacheWCDBDao", "[EdgeComputingCacheWCDBDao] removeCaches throw Exception : " + e17.getMessage());
                if (k0Var == null) {
                    return;
                }
            }
            k0Var.w(java.lang.Long.valueOf(b17));
        } catch (java.lang.Throwable th6) {
            if (k0Var != null) {
                k0Var.w(java.lang.Long.valueOf(b17));
            }
            throw th6;
        }
    }

    @Override // j42.f
    public void reset() {
        x51.k0 k0Var;
        java.lang.String str = null;
        this.f297669c = null;
        x51.k0 k0Var2 = this.f297668b;
        if (k0Var2 != null) {
            k0Var2.W(hashCode());
        }
        this.f297668b = null;
        try {
            k0Var = x51.l0.a(hashCode(), gm0.j1.u().h() + "Edge.db", f297666f, true, true);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("EdgeComputingCacheStrategyWCDB", "[EdgeComputingCacheStrategyWCDB] createDataBase throw Exception : " + e17.getMessage());
            k0Var = null;
        }
        if (k0Var == null) {
            com.tencent.mars.xlog.Log.e("EdgeComputingCacheStrategyWCDB", "[EdgeComputingCacheStrategyWCDB] reset dataDB is null");
            return;
        }
        this.f297668b = k0Var;
        int i17 = this.f297667a;
        if (i17 == 2) {
            str = "EdgeComputingCacheDataModel_Instance";
        } else if (i17 == 1) {
            str = "EdgeComputingCacheDataModel_Normal";
        }
        this.f297669c = new j42.d(this, k0Var, str, new java.lang.String[0]);
    }
}
