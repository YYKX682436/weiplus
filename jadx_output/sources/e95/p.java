package e95;

/* loaded from: classes12.dex */
public final class p extends com.tencent.wcdb.database.SQLiteDirectQuery {
    public p(com.tencent.wcdb.database.SQLiteDatabase sQLiteDatabase, java.lang.String str, java.lang.Object[] objArr, com.tencent.wcdb.support.CancellationSignal cancellationSignal) {
        super(sQLiteDatabase, str, null, cancellationSignal);
    }

    public int a(e95.b bVar, int i17, int i18) {
        boolean z17;
        acquireReference();
        bVar.acquireReference();
        try {
            if (i17 > 0) {
                try {
                    try {
                        int step = step(i17);
                        if (step < i17) {
                            com.tencent.mars.xlog.Log.w("WCDB.SQLiteNewQuery", "startPos %d > actual rows %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(step));
                            bVar.releaseReference();
                            releaseReference();
                            return step;
                        }
                    } catch (java.lang.IllegalStateException e17) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("WCDB.SQLiteNewQuery", e17, "fillWindow failed", new java.lang.Object[0]);
                        bVar.releaseReference();
                        releaseReference();
                        return 0;
                    }
                } catch (com.tencent.wcdb.database.SQLiteException e18) {
                    com.tencent.mars.xlog.Log.e("WCDB.SQLiteNewQuery", "exception: " + e18.getMessage() + "; query: " + getSql());
                    checkCorruption(e18);
                    throw e18;
                }
            }
            int length = getColumnNames().length;
            int i19 = i18 + i17;
            while (true) {
                if (i17 >= i19) {
                    z17 = false;
                    break;
                }
                if (step(1) != 1) {
                    z17 = true;
                    break;
                }
                bVar.f250398g = bVar.c();
                for (int i27 = 0; i27 < length; i27++) {
                    int type = getType(i27);
                    if (type == 0) {
                        e95.a aVar = bVar.f250398g;
                        if (aVar != null) {
                            aVar.s(i27);
                        }
                    } else if (type == 1) {
                        long j17 = getLong(i27);
                        e95.a aVar2 = bVar.f250398g;
                        if (aVar2 != null) {
                            aVar2.L(i27, j17);
                        }
                    } else if (type == 2) {
                        double d17 = getDouble(i27);
                        e95.a aVar3 = bVar.f250398g;
                        if (aVar3 != null) {
                            aVar3.r(i27, d17);
                        }
                    } else if (type == 3) {
                        java.lang.String string = getString(i27);
                        e95.a aVar4 = bVar.f250398g;
                        if (aVar4 != null) {
                            aVar4.P(i27, string);
                        }
                    } else {
                        if (type != 4) {
                            bVar.j(i17, 1);
                            throw new com.tencent.wcdb.database.SQLiteException("Unknown column type when filling window.");
                        }
                        byte[] blob = getBlob(i27);
                        e95.a aVar5 = bVar.f250398g;
                        if (aVar5 != null) {
                            aVar5.I(i27, blob);
                        }
                    }
                }
                bVar.j(i17, 0);
                i17++;
            }
            if (!z17) {
                i17 += step(Integer.MAX_VALUE);
            }
            reset(true);
            bVar.releaseReference();
            releaseReference();
            return i17;
        } catch (java.lang.Throwable th6) {
            bVar.releaseReference();
            releaseReference();
            throw th6;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0093, code lost:
    
        if (r2 != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0095, code lost:
    
        r12 = r12 + step(Integer.MAX_VALUE);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x009d, code lost:
    
        reset(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a0, code lost:
    
        releaseReference();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a3, code lost:
    
        return r12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int b(e95.f r11, int r12, int r13) {
        /*
            r10 = this;
            r10.acquireReference()
            r0 = 2
            java.lang.String r1 = "WCDB.SQLiteNewQuery"
            r2 = 0
            r3 = 1
            if (r12 <= 0) goto L28
            int r4 = r10.step(r12)     // Catch: java.lang.Throwable -> L83 com.tencent.wcdb.database.SQLiteException -> L85
            if (r4 >= r12) goto L28
            java.lang.String r11 = "startPos %d > actual rows %d"
            java.lang.Object[] r13 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L83 com.tencent.wcdb.database.SQLiteException -> L85
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch: java.lang.Throwable -> L83 com.tencent.wcdb.database.SQLiteException -> L85
            r13[r2] = r12     // Catch: java.lang.Throwable -> L83 com.tencent.wcdb.database.SQLiteException -> L85
            java.lang.Integer r12 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L83 com.tencent.wcdb.database.SQLiteException -> L85
            r13[r3] = r12     // Catch: java.lang.Throwable -> L83 com.tencent.wcdb.database.SQLiteException -> L85
            com.tencent.mars.xlog.Log.w(r1, r11, r13)     // Catch: java.lang.Throwable -> L83 com.tencent.wcdb.database.SQLiteException -> L85
            r10.releaseReference()
            return r4
        L28:
            java.lang.String[] r4 = r10.getColumnNames()     // Catch: java.lang.Throwable -> L83 com.tencent.wcdb.database.SQLiteException -> L85
            int r4 = r4.length     // Catch: java.lang.Throwable -> L83 com.tencent.wcdb.database.SQLiteException -> L85
            int r13 = r13 + r12
        L2e:
            if (r12 >= r13) goto L93
            int r5 = r10.step(r3)     // Catch: java.lang.Throwable -> L83 com.tencent.wcdb.database.SQLiteException -> L85
            if (r5 != r3) goto L92
            e95.e r5 = r11.c(r12)     // Catch: java.lang.Throwable -> L83 com.tencent.wcdb.database.SQLiteException -> L85
            r6 = r2
        L3b:
            if (r6 >= r4) goto L8f
            int r7 = r10.getType(r6)     // Catch: java.lang.Throwable -> L83 com.tencent.wcdb.database.SQLiteException -> L85
            if (r7 == 0) goto L71
            if (r7 == r3) goto L68
            if (r7 == r0) goto L5f
            r8 = 3
            if (r7 == r8) goto L5a
            r8 = 4
            if (r7 != r8) goto L52
            byte[] r7 = r10.getBlob(r6)     // Catch: java.lang.Throwable -> L83 com.tencent.wcdb.database.SQLiteException -> L85
            goto L72
        L52:
            com.tencent.wcdb.database.SQLiteException r11 = new com.tencent.wcdb.database.SQLiteException     // Catch: java.lang.Throwable -> L83 com.tencent.wcdb.database.SQLiteException -> L85
            java.lang.String r12 = "Unknown column type when filling window."
            r11.<init>(r12)     // Catch: java.lang.Throwable -> L83 com.tencent.wcdb.database.SQLiteException -> L85
            throw r11     // Catch: java.lang.Throwable -> L83 com.tencent.wcdb.database.SQLiteException -> L85
        L5a:
            java.lang.String r7 = r10.getString(r6)     // Catch: java.lang.Throwable -> L83 com.tencent.wcdb.database.SQLiteException -> L85
            goto L72
        L5f:
            double r7 = r10.getDouble(r6)     // Catch: java.lang.Throwable -> L83 com.tencent.wcdb.database.SQLiteException -> L85
            java.lang.Double r7 = java.lang.Double.valueOf(r7)     // Catch: java.lang.Throwable -> L83 com.tencent.wcdb.database.SQLiteException -> L85
            goto L72
        L68:
            long r7 = r10.getLong(r6)     // Catch: java.lang.Throwable -> L83 com.tencent.wcdb.database.SQLiteException -> L85
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch: java.lang.Throwable -> L83 com.tencent.wcdb.database.SQLiteException -> L85
            goto L72
        L71:
            r7 = 0
        L72:
            int r8 = r5.f250412b     // Catch: java.lang.Throwable -> L83 com.tencent.wcdb.database.SQLiteException -> L85
            int r9 = r5.f250413c     // Catch: java.lang.Throwable -> L83 com.tencent.wcdb.database.SQLiteException -> L85
            if (r8 == r9) goto L87
            int r9 = r8 + 1
            r5.f250412b = r9     // Catch: java.lang.Throwable -> L83 com.tencent.wcdb.database.SQLiteException -> L85
            java.lang.Object[] r9 = r5.f250411a     // Catch: java.lang.Throwable -> L83 com.tencent.wcdb.database.SQLiteException -> L85
            r9[r8] = r7     // Catch: java.lang.Throwable -> L83 com.tencent.wcdb.database.SQLiteException -> L85
            int r6 = r6 + 1
            goto L3b
        L83:
            r11 = move-exception
            goto Lcc
        L85:
            r11 = move-exception
            goto La4
        L87:
            android.database.CursorIndexOutOfBoundsException r11 = new android.database.CursorIndexOutOfBoundsException     // Catch: java.lang.Throwable -> L83 com.tencent.wcdb.database.SQLiteException -> L85
            java.lang.String r12 = "No more columns left."
            r11.<init>(r12)     // Catch: java.lang.Throwable -> L83 com.tencent.wcdb.database.SQLiteException -> L85
            throw r11     // Catch: java.lang.Throwable -> L83 com.tencent.wcdb.database.SQLiteException -> L85
        L8f:
            int r12 = r12 + 1
            goto L2e
        L92:
            r2 = r3
        L93:
            if (r2 != 0) goto L9d
            r11 = 2147483647(0x7fffffff, float:NaN)
            int r11 = r10.step(r11)     // Catch: java.lang.Throwable -> L83 com.tencent.wcdb.database.SQLiteException -> L85
            int r12 = r12 + r11
        L9d:
            r10.reset(r3)     // Catch: java.lang.Throwable -> L83 com.tencent.wcdb.database.SQLiteException -> L85
            r10.releaseReference()
            return r12
        La4:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L83
            r12.<init>()     // Catch: java.lang.Throwable -> L83
            java.lang.String r13 = "exception: "
            r12.append(r13)     // Catch: java.lang.Throwable -> L83
            java.lang.String r13 = r11.getMessage()     // Catch: java.lang.Throwable -> L83
            r12.append(r13)     // Catch: java.lang.Throwable -> L83
            java.lang.String r13 = "; query: "
            r12.append(r13)     // Catch: java.lang.Throwable -> L83
            java.lang.String r13 = r10.getSql()     // Catch: java.lang.Throwable -> L83
            r12.append(r13)     // Catch: java.lang.Throwable -> L83
            java.lang.String r12 = r12.toString()     // Catch: java.lang.Throwable -> L83
            com.tencent.mars.xlog.Log.e(r1, r12)     // Catch: java.lang.Throwable -> L83
            r10.checkCorruption(r11)     // Catch: java.lang.Throwable -> L83
            throw r11     // Catch: java.lang.Throwable -> L83
        Lcc:
            r10.releaseReference()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: e95.p.b(e95.f, int, int):int");
    }

    public java.lang.String toString() {
        return "SQLiteNewQuery: " + getSql();
    }
}
