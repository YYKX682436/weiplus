package p42;

/* loaded from: classes7.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f351759a = new java.util.HashMap();

    public final x51.k0 a(java.lang.String str) {
        if (u46.l.e(str)) {
            return null;
        }
        java.util.Map map = this.f351759a;
        x51.k0 k0Var = (x51.k0) ((java.util.HashMap) map).get(str);
        if (k0Var == null) {
            try {
                k0Var = x51.l0.a(hashCode(), gm0.j1.u().h() + str, new java.util.HashMap(), true, true);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("EdgeComputingDBService", "[EdgeComputingDBService] getOrCreateDataDB getOrCreateDataDB throw Exception : " + e17.getMessage());
            }
            if (k0Var != null) {
                ((java.util.HashMap) map).put(str, k0Var);
            }
        }
        return k0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ac, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a9, code lost:
    
        if (r8.isClosed() != false) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List b(java.lang.String r7, java.lang.String r8) {
        /*
            r6 = this;
            boolean r0 = u46.l.e(r7)
            r1 = 0
            if (r0 != 0) goto Lc0
            boolean r0 = u46.l.e(r8)
            if (r0 == 0) goto Lf
            goto Lc0
        Lf:
            x51.k0 r0 = r6.a(r7)
            java.lang.String r2 = "EdgeComputingDBService"
            if (r0 != 0) goto L29
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "[EdgeComputingDBService] queryDataBySQL dataDB is null, dbPath : "
            r8.<init>(r0)
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            g42.i.a(r2, r7)
            return r1
        L29:
            r7 = 0
            android.database.Cursor r8 = r0.f(r8, r1, r7)     // Catch: java.lang.Exception -> L2f
            goto L46
        L2f:
            r8 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "[EdgeComputingDBService] queryDataBySQL rawQuery throw Exception : "
            r0.<init>(r3)
            java.lang.String r8 = r8.getMessage()
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            com.tencent.mars.xlog.Log.e(r2, r8)
            r8 = r1
        L46:
            if (r8 == 0) goto Lc0
            boolean r0 = r8.moveToFirst()
            if (r0 != 0) goto L50
            goto Lc0
        L50:
            java.lang.String[] r0 = r8.getColumnNames()
            if (r0 == 0) goto Lb7
            int r3 = r0.length
            if (r3 > 0) goto L5a
            goto Lb7
        L5a:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L5f:
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L8a java.lang.Exception -> L8c
            r3.<init>()     // Catch: java.lang.Throwable -> L8a java.lang.Exception -> L8c
            r4 = r7
        L65:
            int r5 = r0.length     // Catch: java.lang.Throwable -> L8a java.lang.Exception -> L8c
            if (r4 >= r5) goto L74
            java.lang.String r5 = r8.getString(r4)     // Catch: java.lang.Exception -> L72 java.lang.Throwable -> L8a
            r3.add(r5)     // Catch: java.lang.Exception -> L72 java.lang.Throwable -> L8a
            int r4 = r4 + 1
            goto L65
        L72:
            r4 = 1
            goto L75
        L74:
            r4 = r7
        L75:
            if (r4 != 0) goto L7a
            r1.add(r3)     // Catch: java.lang.Throwable -> L8a java.lang.Exception -> L8c
        L7a:
            boolean r3 = r8.moveToNext()     // Catch: java.lang.Throwable -> L8a java.lang.Exception -> L8c
            if (r3 != 0) goto L5f
            boolean r7 = r8.isClosed()
            if (r7 != 0) goto Lac
        L86:
            r8.close()
            goto Lac
        L8a:
            r7 = move-exception
            goto Lad
        L8c:
            r7 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8a
            r0.<init>()     // Catch: java.lang.Throwable -> L8a
            java.lang.String r3 = "[EdgeComputingDBService] queryDataBySQL moveToNext throw Exception : "
            r0.append(r3)     // Catch: java.lang.Throwable -> L8a
            java.lang.String r7 = r7.getMessage()     // Catch: java.lang.Throwable -> L8a
            r0.append(r7)     // Catch: java.lang.Throwable -> L8a
            java.lang.String r7 = r0.toString()     // Catch: java.lang.Throwable -> L8a
            com.tencent.mars.xlog.Log.e(r2, r7)     // Catch: java.lang.Throwable -> L8a
            boolean r7 = r8.isClosed()
            if (r7 != 0) goto Lac
            goto L86
        Lac:
            return r1
        Lad:
            boolean r0 = r8.isClosed()
            if (r0 != 0) goto Lb6
            r8.close()
        Lb6:
            throw r7
        Lb7:
            boolean r7 = r8.isClosed()
            if (r7 != 0) goto Lc0
            r8.close()
        Lc0:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p42.a.b(java.lang.String, java.lang.String):java.util.List");
    }

    public void c() {
        java.util.Map map = this.f351759a;
        for (x51.k0 k0Var : ((java.util.HashMap) map).values()) {
            if (k0Var != null && !k0Var.J()) {
                k0Var.W(hashCode());
            }
        }
        ((java.util.HashMap) map).clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0055, code lost:
    
        if (r3.isClosed() == false) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x014e A[LOOP:1: B:53:0x0148->B:55:0x014e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean d(java.lang.String r10, java.lang.String r11, java.util.List r12, java.util.List r13) {
        /*
            Method dump skipped, instructions count: 583
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p42.a.d(java.lang.String, java.lang.String, java.util.List, java.util.List):boolean");
    }
}
