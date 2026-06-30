package wz1;

/* loaded from: classes12.dex */
public class i extends android.os.AsyncTask {
    public static final com.tencent.wcdb.database.SQLiteCipherSpec B = new com.tencent.wcdb.database.SQLiteCipherSpec().setPageSize(1024).setSQLCipherVersion(1);
    public static final java.lang.String[] C = {"", " OR ROLLBACK", " OR ABORT", " OR FAIL", " OR IGNORE", " OR REPLACE"};
    public long A;

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.wcdb.database.SQLiteDatabase f450709a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f450710b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f450711c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f450712d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f450713e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f450714f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.List f450715g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.List f450716h;

    /* renamed from: i, reason: collision with root package name */
    public byte[] f450717i;

    /* renamed from: j, reason: collision with root package name */
    public byte[] f450718j;

    /* renamed from: k, reason: collision with root package name */
    public java.util.List f450719k;

    /* renamed from: l, reason: collision with root package name */
    public java.util.List f450720l;

    /* renamed from: m, reason: collision with root package name */
    public wz1.n f450721m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f450722n;

    /* renamed from: o, reason: collision with root package name */
    public wz1.l f450723o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f450724p;

    /* renamed from: q, reason: collision with root package name */
    public int f450725q;

    /* renamed from: r, reason: collision with root package name */
    public long f450726r;

    /* renamed from: s, reason: collision with root package name */
    public long f450727s;

    /* renamed from: t, reason: collision with root package name */
    public final com.tencent.wcdb.support.CancellationSignal f450728t = new com.tencent.wcdb.support.CancellationSignal();

    /* renamed from: u, reason: collision with root package name */
    public long f450729u;

    /* renamed from: v, reason: collision with root package name */
    public long f450730v;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.wcdb.repair.RepairKit.Statistics f450731w;

    /* renamed from: x, reason: collision with root package name */
    public int f450732x;

    /* renamed from: y, reason: collision with root package name */
    public long f450733y;

    /* renamed from: z, reason: collision with root package name */
    public int f450734z;

    public i(wz1.j jVar) {
    }

    public static java.util.List n(com.tencent.wcdb.database.SQLiteDatabase sQLiteDatabase, java.lang.String str) {
        com.tencent.wcdb.Cursor rawQueryWithFactory = sQLiteDatabase.rawQueryWithFactory(com.tencent.wcdb.database.SQLiteDirectCursor.FACTORY, "PRAGMA table_info(" + str + ");", null, null);
        try {
            if (!rawQueryWithFactory.moveToFirst()) {
                rawQueryWithFactory.close();
                return null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            do {
                arrayList.add(new wz1.m(rawQueryWithFactory.getString(1), rawQueryWithFactory.getString(2), rawQueryWithFactory.getInt(3) != 0, rawQueryWithFactory.getString(4), rawQueryWithFactory.getInt(5) != 0));
            } while (rawQueryWithFactory.moveToNext());
            rawQueryWithFactory.close();
            return arrayList;
        } catch (java.lang.Throwable th6) {
            if (rawQueryWithFactory != null) {
                try {
                    rawQueryWithFactory.close();
                } catch (java.lang.Throwable th7) {
                    th6.addSuppressed(th7);
                }
            }
            throw th6;
        }
    }

    public static void o(int i17, java.lang.String str, java.lang.Throwable th6) {
        java.lang.String sb6;
        jx3.f fVar = jx3.f.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = java.lang.Integer.valueOf(i17);
        objArr[1] = str;
        if (th6 == null) {
            sb6 = "";
        } else {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("\n");
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            sb7.append(com.tencent.mm.sdk.platformtools.z3.c(th6));
            sb6 = sb7.toString();
        }
        objArr[2] = sb6;
        fVar.i("DBRepairNew", java.lang.String.format("[Stage: %d] %s%s", objArr), null);
    }

    public static void p(int i17) {
        jx3.f.INSTANCE.idkeyStat(181L, i17, 1L, true);
    }

    public final int c(com.tencent.wcdb.database.SQLiteDatabase sQLiteDatabase, java.lang.String str) {
        java.util.List n17 = n(sQLiteDatabase, str);
        java.util.List n18 = n(this.f450709a, str);
        if (n17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.DBRecoveryTask", "ALTER TABLE detection for '%s' failed because no such table in source DB.");
            return -1;
        }
        if (n18 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.DBRecoveryTask", "ALTER TABLE detection for '%s' failed because no such table in target DB.");
            return -1;
        }
        java.util.ArrayList arrayList = (java.util.ArrayList) n18;
        java.util.ArrayList arrayList2 = (java.util.ArrayList) n17;
        if (arrayList.size() >= arrayList2.size()) {
            return 0;
        }
        try {
            this.f450709a.beginTransaction();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            int i17 = 0;
            for (int size = arrayList.size(); size < arrayList2.size(); size++) {
                wz1.m mVar = (wz1.m) arrayList2.get(size);
                sb6.setLength(0);
                sb6.append("ALTER TABLE ");
                sb6.append(str);
                sb6.append(" ADD COLUMN ");
                sb6.append(mVar.f450762a);
                sb6.append(' ');
                sb6.append(mVar.f450763b);
                if (mVar.f450764c) {
                    sb6.append(" NOT NULL");
                }
                java.lang.String str2 = mVar.f450765d;
                if (str2 != null && !str2.isEmpty()) {
                    sb6.append(" DEFAULT (");
                    sb6.append(str2);
                    sb6.append(')');
                }
                sb6.append(';');
                java.lang.String sb7 = sb6.toString();
                this.f450709a.execSQL(sb7, null, this.f450728t);
                com.tencent.mars.xlog.Log.i("MicroMsg.DBRecoveryTask", ">>> " + sb7);
                i17++;
            }
            this.f450709a.setTransactionSuccessful();
            return i17;
        } finally {
            if (this.f450709a.inTransaction()) {
                this.f450709a.endTransaction();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b9 A[Catch: all -> 0x0200, TryCatch #0 {all -> 0x0200, blocks: (B:18:0x0090, B:20:0x0096, B:23:0x009a, B:24:0x00af, B:25:0x00b3, B:27:0x00b9, B:28:0x00c0, B:30:0x00c3, B:34:0x00cb, B:32:0x00d0, B:36:0x00d3, B:39:0x00d7, B:40:0x00fb, B:42:0x0101, B:44:0x0110, B:45:0x0120, B:47:0x0126, B:49:0x012e, B:121:0x00ab), top: B:17:0x0090 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0101 A[Catch: all -> 0x0200, LOOP:2: B:40:0x00fb->B:42:0x0101, LOOP_END, TryCatch #0 {all -> 0x0200, blocks: (B:18:0x0090, B:20:0x0096, B:23:0x009a, B:24:0x00af, B:25:0x00b3, B:27:0x00b9, B:28:0x00c0, B:30:0x00c3, B:34:0x00cb, B:32:0x00d0, B:36:0x00d3, B:39:0x00d7, B:40:0x00fb, B:42:0x0101, B:44:0x0110, B:45:0x0120, B:47:0x0126, B:49:0x012e, B:121:0x00ab), top: B:17:0x0090 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0126 A[Catch: all -> 0x0200, LOOP:3: B:45:0x0120->B:47:0x0126, LOOP_END, TryCatch #0 {all -> 0x0200, blocks: (B:18:0x0090, B:20:0x0096, B:23:0x009a, B:24:0x00af, B:25:0x00b3, B:27:0x00b9, B:28:0x00c0, B:30:0x00c3, B:34:0x00cb, B:32:0x00d0, B:36:0x00d3, B:39:0x00d7, B:40:0x00fb, B:42:0x0101, B:44:0x0110, B:45:0x0120, B:47:0x0126, B:49:0x012e, B:121:0x00ab), top: B:17:0x0090 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x014c A[Catch: all -> 0x01fb, TryCatch #4 {all -> 0x01fb, blocks: (B:52:0x0140, B:53:0x0146, B:55:0x014c, B:58:0x0153, B:59:0x016c, B:60:0x0170, B:62:0x0173, B:66:0x01ac, B:67:0x0178, B:77:0x0189, B:79:0x0191, B:81:0x0199, B:83:0x01a1, B:85:0x01a9, B:90:0x01b7, B:95:0x01be, B:98:0x01c8), top: B:51:0x0140 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int d(com.tencent.wcdb.database.SQLiteDatabase r19, java.lang.String r20, int r21, boolean r22, boolean r23, int r24, java.lang.String[] r25, wz1.o r26) {
        /*
            Method dump skipped, instructions count: 580
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wz1.i.d(com.tencent.wcdb.database.SQLiteDatabase, java.lang.String, int, boolean, boolean, int, java.lang.String[], wz1.o):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x03c3, code lost:
    
        if (r34.isHeld() != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0114, code lost:
    
        if (r34.isHeld() != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x01ee, code lost:
    
        if (r34.isHeld() != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0116, code lost:
    
        r5 = r34;
        yj0.a.c(r5, "com/tencent/mm/plugin/dbbackup/model/DBRecoveryTask", "doInBackground", "([Ljava/lang/Void;)Ljava/lang/Integer;", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
        r34.release();
        yj0.a.f(r5, "com/tencent/mm/plugin/dbbackup/model/DBRecoveryTask", "doInBackground", "([Ljava/lang/Void;)Ljava/lang/Integer;", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0291, code lost:
    
        if (r34.isHeld() != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0342, code lost:
    
        if (r34.isHeld() != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0434, code lost:
    
        if (r34.isHeld() != false) goto L21;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x04c6  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x04bb  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x044b  */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v11, types: [int] */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    @Override // android.os.AsyncTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object doInBackground(java.lang.Object[] r36) {
        /*
            Method dump skipped, instructions count: 1260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wz1.i.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    public final void e(com.tencent.wcdb.database.SQLiteDatabase sQLiteDatabase, int i17) {
        com.tencent.wcdb.Cursor rawQueryWithFactory = sQLiteDatabase.rawQueryWithFactory(com.tencent.wcdb.database.SQLiteDirectCursor.FACTORY, "SELECT id,type,value FROM userinfo WHERE id=?", new java.lang.String[]{java.lang.Integer.toString(i17)}, "userinfo", this.f450728t);
        try {
            if (rawQueryWithFactory.moveToFirst()) {
                this.f450709a.execSQL("INSERT OR REPLACE INTO userinfo (id,type,value) VALUES (?,?,?)", new java.lang.Object[]{java.lang.Integer.valueOf(rawQueryWithFactory.getInt(0)), java.lang.Integer.valueOf(rawQueryWithFactory.getInt(1)), rawQueryWithFactory.getString(2)}, this.f450728t);
            }
            rawQueryWithFactory.close();
        } catch (java.lang.Throwable th6) {
            if (rawQueryWithFactory != null) {
                try {
                    rawQueryWithFactory.close();
                } catch (java.lang.Throwable th7) {
                    th6.addSuppressed(th7);
                }
            }
            throw th6;
        }
    }

    public final int f() {
        com.tencent.wcdb.repair.RecoverKit recoverKit;
        java.lang.Exception e17;
        com.tencent.wcdb.support.CancellationSignal cancellationSignal = this.f450728t;
        cancellationSignal.throwIfCanceled();
        com.tencent.mars.xlog.Log.i("MicroMsg.DBRecoveryTask", "Begin backup recovery.");
        com.tencent.wcdb.repair.RecoverKit recoverKit2 = null;
        for (java.lang.String str : this.f450716h) {
            try {
                recoverKit = new com.tencent.wcdb.repair.RecoverKit(this.f450709a, str, (byte[]) this.f450719k.get(0));
            } catch (java.lang.Exception e18) {
                recoverKit = recoverKit2;
                e17 = e18;
            }
            try {
                com.tencent.mars.xlog.Log.i("MicroMsg.DBRecoveryTask", "Loaded backup data: " + str);
            } catch (java.lang.Exception e19) {
                e17 = e19;
                com.tencent.mars.xlog.Log.e("MicroMsg.DBRecoveryTask", "Load backup data failed: " + e17.getMessage());
                recoverKit2 = recoverKit;
            }
            recoverKit2 = recoverKit;
        }
        try {
            if (recoverKit2 == null) {
                return -1;
            }
            try {
                try {
                    int run = recoverKit2.run(false, cancellationSignal);
                    if (run == 0) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.DBRecoveryTask", "Backup recovery succeeded.");
                    } else if (run == 1) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.DBRecoveryTask", "Backup recovery cancelled.");
                        cancellationSignal.throwIfCanceled();
                    } else {
                        com.tencent.mars.xlog.Log.e("MicroMsg.DBRecoveryTask", "Backup recovery failed.");
                    }
                    recoverKit2.release();
                    return run;
                } catch (java.lang.Exception e27) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.DBRecoveryTask", "Failed to repair database: " + e27.getMessage());
                    o(4, "Failed to recover backup database", e27);
                    recoverKit2.release();
                    return -1;
                }
            } catch (com.tencent.wcdb.support.OperationCanceledException e28) {
                throw e28;
            }
        } catch (java.lang.Throwable th6) {
            recoverKit2.release();
            throw th6;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int g(boolean r13) {
        /*
            r12 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Close and rename target database: "
            r0.<init>(r1)
            java.lang.String r1 = r12.f450710b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MicroMsg.DBRecoveryTask"
            com.tencent.mars.xlog.Log.i(r1, r0)
            com.tencent.wcdb.database.SQLiteDatabase r0 = r12.f450709a
            r2 = -1
            if (r0 != 0) goto L1b
            return r2
        L1b:
            com.tencent.mm.vfs.r6 r3 = new com.tencent.mm.vfs.r6
            java.lang.String r0 = r0.getPath()
            r3.<init>(r0)
            com.tencent.wcdb.database.SQLiteDatabase r0 = r12.f450709a
            boolean r0 = r0.isOpen()
            if (r0 == 0) goto L31
            com.tencent.wcdb.database.SQLiteDatabase r0 = r12.f450709a
            r0.close()
        L31:
            r0 = 0
            if (r13 == 0) goto L9b
            java.lang.String r13 = r12.f450710b
            short[] r4 = com.tencent.mm.vfs.AccessControlFileSystem.f212680h
            com.tencent.mm.vfs.z7 r13 = com.tencent.mm.vfs.z7.a(r13)
            r4 = 8
            com.tencent.mm.vfs.AccessControlFileSystem.c(r4, r13)
            java.lang.String r13 = r12.f450710b
            com.tencent.mm.vfs.z7 r13 = com.tencent.mm.vfs.z7.a(r13)
            java.lang.String r5 = r13.f213279f
            if (r5 == 0) goto L64
            java.lang.String r9 = com.tencent.mm.vfs.e8.l(r5, r0, r0)
            boolean r5 = r5.equals(r9)
            if (r5 != 0) goto L64
            com.tencent.mm.vfs.z7 r5 = new com.tencent.mm.vfs.z7
            java.lang.String r7 = r13.f213277d
            java.lang.String r8 = r13.f213278e
            java.lang.String r10 = r13.f213280g
            java.lang.String r11 = r13.f213281h
            r6 = r5
            r6.<init>(r7, r8, r9, r10, r11)
            r13 = r5
        L64:
            com.tencent.mm.vfs.z2 r5 = r3.M()
            com.tencent.mm.vfs.b3 r6 = com.tencent.mm.vfs.a3.f212781a
            r7 = 0
            com.tencent.mm.vfs.z2 r13 = r6.m(r13, r7)
            boolean r6 = r5.a()
            if (r6 == 0) goto L89
            boolean r6 = r13.a()
            if (r6 != 0) goto L7c
            goto L89
        L7c:
            com.tencent.mm.vfs.q2 r6 = r13.f213266a     // Catch: java.io.IOException -> L89
            java.lang.String r13 = r13.f213267b     // Catch: java.io.IOException -> L89
            com.tencent.mm.vfs.q2 r7 = r5.f213266a     // Catch: java.io.IOException -> L89
            java.lang.String r5 = r5.f213267b     // Catch: java.io.IOException -> L89
            boolean r13 = r6.t(r13, r7, r5)     // Catch: java.io.IOException -> L89
            goto L8a
        L89:
            r13 = r0
        L8a:
            com.tencent.mm.vfs.AccessControlFileSystem.e(r4)
            if (r13 != 0) goto La7
            java.lang.String r13 = r12.f450710b
            java.lang.Object[] r13 = new java.lang.Object[]{r3, r13}
            java.lang.String r0 = "Cannot rename %s to %s"
            com.tencent.mars.xlog.Log.e(r1, r0, r13)
            return r2
        L9b:
            java.lang.String r13 = "Delete temporary database file %s"
            java.lang.Object[] r2 = new java.lang.Object[]{r3}
            com.tencent.mars.xlog.Log.i(r1, r13, r2)
            r3.l()
        La7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: wz1.i.g(boolean):int");
    }

    public final int h() {
        com.tencent.wcdb.database.SQLiteDatabase sQLiteDatabase = this.f450709a;
        if (sQLiteDatabase != null) {
            if (sQLiteDatabase.isOpen()) {
                this.f450709a.close();
            }
            this.f450709a = null;
        }
        this.f450728t.throwIfCanceled();
        java.lang.String str = this.f450710b + '-' + com.tencent.mm.sdk.platformtools.t8.Y(6);
        com.tencent.mars.xlog.Log.i("MicroMsg.DBRecoveryTask", "Open target database: " + str);
        try {
            com.tencent.wcdb.database.SQLiteDatabase openOrCreateDatabase = com.tencent.wcdb.database.SQLiteDatabase.openOrCreateDatabase(str, this.f450717i, B, (com.tencent.wcdb.database.SQLiteDatabase.CursorFactory) null, (com.tencent.wcdb.DatabaseErrorHandler) null, 1);
            this.f450709a = openOrCreateDatabase;
            com.tencent.wcdb.DatabaseUtils.stringForQuery(openOrCreateDatabase, "PRAGMA journal_mode=OFF;", null);
            this.f450709a.execSQL("PRAGMA synchronous=OFF;");
            return 0;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.DBRecoveryTask", "Cannot open target database '%s': %s", str, e17.getMessage());
            o(1, "Cannot open target database", e17);
            throw e17;
        }
    }

    public final int i() {
        if (this.f450721m != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.DBRecoveryTask", "Load keys from KeyLoader");
            com.tencent.mm.plugin.dbbackup.q qVar = (com.tencent.mm.plugin.dbbackup.q) this.f450721m;
            qVar.a();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = qVar.f96871a.iterator();
            while (it.hasNext()) {
                arrayList.add(kk.k.h((((java.lang.String) it.next()) + qVar.f96872b).getBytes()));
            }
            this.f450719k.addAll(arrayList);
            com.tencent.mm.plugin.dbbackup.q qVar2 = (com.tencent.mm.plugin.dbbackup.q) this.f450721m;
            qVar2.a();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator it6 = qVar2.f96871a.iterator();
            while (it6.hasNext()) {
                arrayList2.add(kk.k.g((((java.lang.String) it6.next()) + qVar2.f96872b).getBytes()).substring(0, 7).getBytes());
            }
            this.f450720l.addAll(arrayList2);
        }
        if (this.f450719k.isEmpty()) {
            this.f450719k.add(null);
        }
        if (this.f450720l.isEmpty()) {
            this.f450720l.add(null);
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0217 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x04ce  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x04df  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x04e6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x050a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x051b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0522  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x026d A[Catch: Exception -> 0x03eb, OperationCanceledException -> 0x03ed, all -> 0x03ef, TRY_ENTER, TryCatch #32 {all -> 0x03ef, blocks: (B:75:0x019b, B:87:0x01fb, B:91:0x020d, B:95:0x0292, B:94:0x026d, B:181:0x01f4), top: B:74:0x019b }] */
    /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v13, types: [com.tencent.wcdb.database.SQLiteDatabase, com.tencent.wcdb.database.SQLiteClosable] */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v29 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r1v145 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v48 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v56 */
    /* JADX WARN: Type inference failed for: r3v3, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r3v34 */
    /* JADX WARN: Type inference failed for: r3v38 */
    /* JADX WARN: Type inference failed for: r3v45 */
    /* JADX WARN: Type inference failed for: r3v53 */
    /* JADX WARN: Type inference failed for: r3v60 */
    /* JADX WARN: Type inference failed for: r3v61 */
    /* JADX WARN: Type inference failed for: r44v0, types: [wz1.i] */
    /* JADX WARN: Type inference failed for: r5v13, types: [com.tencent.wcdb.database.SQLiteDatabase] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 3 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int j() {
        /*
            Method dump skipped, instructions count: 1335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wz1.i.j():int");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0097 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int k() {
        /*
            r15 = this;
            java.lang.String r0 = "Load and check database statistics."
            java.lang.String r1 = "MicroMsg.DBRecoveryTask"
            com.tencent.mars.xlog.Log.i(r1, r0)
            java.lang.String r0 = r15.f450710b
            if (r0 == 0) goto Lde
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L13
            goto Lde
        L13:
            r0 = 0
            r15.f450724p = r0
            r2 = 300000(0x493e0, float:4.2039E-40)
            r15.f450725q = r2
            java.lang.String r2 = r15.f450713e
            r3 = 0
            if (r2 == 0) goto L59
            java.lang.String r2 = com.tencent.mm.vfs.w6.M(r2)     // Catch: java.lang.Exception -> L3d java.io.FileNotFoundException -> L46
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: java.lang.Exception -> L3d java.io.FileNotFoundException -> L46
            r5.<init>(r2)     // Catch: java.lang.Exception -> L3d java.io.FileNotFoundException -> L46
            java.lang.String r2 = "message"
            int r2 = r5.getInt(r2)     // Catch: java.lang.Exception -> L3d java.io.FileNotFoundException -> L46
            r15.f450725q = r2     // Catch: java.lang.Exception -> L3d java.io.FileNotFoundException -> L46
            r2 = 1
            r15.f450724p = r2     // Catch: java.lang.Exception -> L3d java.io.FileNotFoundException -> L46
            java.lang.String r2 = "dbSize"
            long r5 = r5.getLong(r2)     // Catch: java.lang.Exception -> L3d java.io.FileNotFoundException -> L46
            goto L5a
        L3d:
            r2 = move-exception
            java.lang.String r5 = "Cannot read statistics from file."
            java.lang.Object[] r6 = new java.lang.Object[r0]
            com.tencent.mars.xlog.Log.printErrStackTrace(r1, r2, r5, r6)
            goto L59
        L46:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r5 = "Statistics file not found: "
            r2.<init>(r5)
            java.lang.String r5 = r15.f450713e
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            com.tencent.mars.xlog.Log.i(r1, r2)
        L59:
            r5 = r3
        L5a:
            java.lang.String r2 = r15.f450712d
            if (r2 == 0) goto L65
            long r7 = com.tencent.mm.vfs.w6.k(r2)
            r15.f450730v = r7
            goto L66
        L65:
            r7 = r3
        L66:
            long r9 = java.lang.Math.max(r5, r7)
            r15.f450726r = r9
            r11 = 10
            long r11 = r9 / r11
            r13 = 67108864(0x4000000, double:3.3156184E-316)
            long r11 = java.lang.Math.max(r11, r13)
            long r9 = r9 + r11
            r15.f450726r = r9
            java.lang.String r2 = r15.f450710b
            com.tencent.mm.vfs.r6 r9 = new com.tencent.mm.vfs.r6
            com.tencent.mm.vfs.z7 r2 = com.tencent.mm.vfs.z7.a(r2)
            r9.<init>(r2)
            boolean r2 = r9.y()
            if (r2 != 0) goto L8f
            com.tencent.mm.vfs.r6 r9 = r9.s()
        L8f:
            long r10 = r9.w()
            int r2 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r2 <= 0) goto L99
            r3 = r10
            goto L9f
        L99:
            com.tencent.mm.vfs.r6 r9 = r9.s()
            if (r9 != 0) goto L8f
        L9f:
            r15.f450727s = r3
            long r9 = r15.f450726r
            int r2 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r2 <= 0) goto Lbc
            java.lang.Long r0 = java.lang.Long.valueOf(r9)
            long r2 = r15.f450727s
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r2}
            java.lang.String r2 = "Space not enough for recovery (%d required, %d available)"
            com.tencent.mars.xlog.Log.e(r1, r2, r0)
            r0 = -2
            return r0
        Lbc:
            java.lang.Long r2 = java.lang.Long.valueOf(r9)
            long r3 = r15.f450727s
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            int r4 = r15.f450725q
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r3, r4, r7, r5}
            java.lang.String r3 = "Statistics check OK, required space: %d, available space %d, message count: %d, corrupted db size: %d, latest statistic db size: %d"
            com.tencent.mars.xlog.Log.i(r1, r3, r2)
            return r0
        Lde:
            r0 = -1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: wz1.i.k():int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0185, code lost:
    
        com.tencent.mars.xlog.Log.i("MicroMsg.DBRecoveryTask", "Opened corrupted database with key #" + r10);
        r16 = r13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02e0  */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int l() {
        /*
            Method dump skipped, instructions count: 748
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wz1.i.l():int");
    }

    public final int m() {
        try {
            this.f450709a.execSQL("DELETE FROM rconversation WHERE typeof(flag) <> 'integer';", null, this.f450728t);
            return 0;
        } catch (com.tencent.wcdb.support.OperationCanceledException e17) {
            throw e17;
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.DBRecoveryTask", e18, "Verification failed", new java.lang.Object[0]);
            return -1;
        }
    }

    @Override // android.os.AsyncTask
    public void onPostExecute(java.lang.Object obj) {
        java.lang.Integer num = (java.lang.Integer) obj;
        if (this.f450723o != null) {
            int intValue = num.intValue();
            if (intValue == -2) {
                wz1.l lVar = this.f450723o;
                long j17 = this.f450727s;
                long j18 = this.f450726r;
                com.tencent.mm.plugin.dbbackup.DBRecoveryUI dBRecoveryUI = (com.tencent.mm.plugin.dbbackup.DBRecoveryUI) lVar;
                dBRecoveryUI.f96788o = false;
                dBRecoveryUI.f96780d = null;
                dBRecoveryUI.U6();
                db5.e1.G(dBRecoveryUI, dBRecoveryUI.getString(com.tencent.mm.R.string.bn_, java.lang.Long.valueOf((j18 / 1024) / 1024), java.lang.Long.valueOf((j17 / 1024) / 1024)), null, false, dBRecoveryUI.f96789p);
                return;
            }
            if (intValue == 0) {
                final com.tencent.mm.plugin.dbbackup.DBRecoveryUI dBRecoveryUI2 = (com.tencent.mm.plugin.dbbackup.DBRecoveryUI) this.f450723o;
                dBRecoveryUI2.f96788o = false;
                dBRecoveryUI2.f96780d = null;
                com.tencent.mars.xlog.Log.i("MicroMsg.DBRecoveryUI", "Recovery succeeded");
                final com.tencent.mm.ui.widget.dialog.j0 o17 = db5.e1.o(dBRecoveryUI2, com.tencent.mm.R.string.bna, 0, false, new com.tencent.mm.plugin.dbbackup.r(dBRecoveryUI2));
                com.tencent.mm.sdk.platformtools.u3.i(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.dbbackup.DBRecoveryUI$$a
                    @Override // java.lang.Runnable
                    public final void run() {
                        int[] iArr = com.tencent.mm.plugin.dbbackup.DBRecoveryUI.f96779q;
                        com.tencent.mm.plugin.dbbackup.DBRecoveryUI dBRecoveryUI3 = com.tencent.mm.plugin.dbbackup.DBRecoveryUI.this;
                        com.tencent.mm.ui.widget.dialog.j0 j0Var = o17;
                        if (j0Var != null) {
                            dBRecoveryUI3.getClass();
                            j0Var.dismiss();
                        }
                        dBRecoveryUI3.finish();
                        com.tencent.wcdb.database.SQLiteCipherSpec sQLiteCipherSpec = com.tencent.mm.plugin.dbbackup.e0.f96841m;
                        com.tencent.mm.ui.vb.h(true);
                    }
                }, 5000L);
                return;
            }
            if (intValue != 1) {
                com.tencent.mm.plugin.dbbackup.DBRecoveryUI dBRecoveryUI3 = (com.tencent.mm.plugin.dbbackup.DBRecoveryUI) this.f450723o;
                dBRecoveryUI3.f96788o = false;
                dBRecoveryUI3.f96780d = null;
                com.tencent.mars.xlog.Log.e("MicroMsg.DBRecoveryUI", "Recovery failed.");
                dBRecoveryUI3.U6();
                db5.e1.o(dBRecoveryUI3, com.tencent.mm.R.string.bn8, 0, false, dBRecoveryUI3.f96789p);
                return;
            }
            com.tencent.mm.plugin.dbbackup.DBRecoveryUI dBRecoveryUI4 = (com.tencent.mm.plugin.dbbackup.DBRecoveryUI) this.f450723o;
            dBRecoveryUI4.f96788o = false;
            dBRecoveryUI4.f96780d = null;
            com.tencent.mars.xlog.Log.i("MicroMsg.DBRecoveryUI", "Recovery cancelled.");
            dBRecoveryUI4.U6();
            db5.e1.o(dBRecoveryUI4, com.tencent.mm.R.string.bn7, 0, false, dBRecoveryUI4.f96789p);
        }
    }

    @Override // android.os.AsyncTask
    public void onProgressUpdate(java.lang.Object[] objArr) {
        java.lang.Integer[] numArr = (java.lang.Integer[]) objArr;
        if (this.f450723o == null) {
            return;
        }
        int intValue = numArr.length >= 1 ? numArr[0].intValue() : 0;
        int intValue2 = numArr.length >= 2 ? numArr[1].intValue() : 0;
        int intValue3 = numArr.length >= 3 ? numArr[2].intValue() : 0;
        com.tencent.mm.plugin.dbbackup.DBRecoveryUI dBRecoveryUI = (com.tencent.mm.plugin.dbbackup.DBRecoveryUI) this.f450723o;
        dBRecoveryUI.getClass();
        if (intValue <= 0 || intValue > 6) {
            return;
        }
        int[] iArr = com.tencent.mm.plugin.dbbackup.DBRecoveryUI.f96779q;
        if (intValue3 > 0) {
            int i17 = iArr[intValue - 1];
            int i18 = iArr[intValue] - i17;
            float f17 = intValue2 / intValue3;
            if (f17 > 1.0f) {
                f17 = 1.0f;
            }
            dBRecoveryUI.f96783g.setProgress((int) (i17 + (f17 * i18)));
        } else if (dBRecoveryUI.f96787n != intValue) {
            dBRecoveryUI.f96783g.setProgress(iArr[intValue - 1]);
        }
        dBRecoveryUI.f96787n = intValue;
        dBRecoveryUI.f96784h.setText(java.lang.String.format(dBRecoveryUI.getResources().getStringArray(com.tencent.mm.R.array.f478000n)[intValue - 1], java.lang.Integer.valueOf(intValue2)));
    }
}
