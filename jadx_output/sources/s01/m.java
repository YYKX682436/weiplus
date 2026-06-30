package s01;

/* loaded from: classes11.dex */
public class m extends l75.n0 {

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f401898f = {l75.n0.getCreateSQLs(s01.h.S, "BizChatInfo")};

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicLong f401899g = new java.util.concurrent.atomic.AtomicLong(-1);

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f401900d;

    /* renamed from: e, reason: collision with root package name */
    public final l75.v0 f401901e;

    /* JADX WARN: Removed duplicated region for block: B:20:0x007e A[Catch: all -> 0x00aa, TryCatch #6 {, blocks: (B:4:0x0029, B:18:0x0070, B:20:0x007e, B:21:0x0084, B:22:0x00a1, B:27:0x0065, B:38:0x00a9, B:34:0x0045, B:17:0x0057), top: B:3:0x0029, inners: #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0052 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public m(l75.k0 r11) {
        /*
            r10 = this;
            l75.e0 r0 = s01.h.S
            java.lang.String r1 = "BizChatInfo"
            r2 = 0
            r10.<init>(r11, r0, r1, r2)
            s01.i r0 = new s01.i
            r0.<init>(r10)
            r10.f401901e = r0
            r10.f401900d = r11
            java.lang.String r0 = "BizChatInfo"
            java.lang.String r1 = "CREATE INDEX IF NOT EXISTS bizChatLocalIdIndex ON BizChatInfo ( bizChatLocalId )"
            r11.A(r0, r1)
            java.lang.String r0 = "BizChatInfo"
            java.lang.String r1 = "CREATE INDEX IF NOT EXISTS bizChatIdIndex ON BizChatInfo ( bizChatServId )"
            r11.A(r0, r1)
            java.lang.String r0 = "BizChatInfo"
            java.lang.String r1 = "CREATE INDEX IF NOT EXISTS brandUserNameIndex ON BizChatInfo ( brandUserName )"
            r11.A(r0, r1)
            java.util.concurrent.atomic.AtomicLong r0 = s01.m.f401899g
            monitor-enter(r0)
            long r3 = r0.get()     // Catch: java.lang.Throwable -> Laa
            r1 = 2
            r5 = 0
            java.lang.String r6 = "select max(bizChatLocalId) from BizChatInfo"
            android.database.Cursor r11 = r11.f(r6, r2, r1)     // Catch: java.lang.Throwable -> L43
            boolean r6 = r11.moveToFirst()     // Catch: java.lang.Throwable -> L41
            if (r6 == 0) goto L50
            int r3 = r11.getInt(r5)     // Catch: java.lang.Throwable -> L41
            long r3 = (long) r3
            goto L50
        L41:
            r6 = move-exception
            goto L45
        L43:
            r6 = move-exception
            r11 = r2
        L45:
            java.lang.String r7 = "MicroMsg.BizChatInfoStorage"
            java.lang.String r8 = "query local biz chat id"
            java.lang.Object[] r6 = new java.lang.Object[]{r6}     // Catch: java.lang.Throwable -> La3
            com.tencent.mars.xlog.Log.e(r7, r8, r6)     // Catch: java.lang.Throwable -> La3
        L50:
            if (r11 == 0) goto L55
            r11.close()     // Catch: java.lang.Throwable -> L55
        L55:
            r6 = -1
            java.lang.String r11 = "BizChatInfo"
            com.tencent.mm.sdk.platformtools.o4 r11 = com.tencent.mm.sdk.platformtools.o4.N(r11, r1, r2)     // Catch: java.lang.Throwable -> L64
            java.lang.String r2 = "max_biz_chat_local_id"
            long r6 = r11.getLong(r2, r6)     // Catch: java.lang.Throwable -> L64
            goto L70
        L64:
            r11 = move-exception
            java.lang.String r2 = "get max biz chat local id"
            java.lang.Object[] r11 = new java.lang.Object[]{r11}     // Catch: java.lang.Throwable -> Laa
            java.lang.String r8 = "MicroMsg.BizChatInfoStorage"
            com.tencent.mars.xlog.Log.e(r8, r2, r11)     // Catch: java.lang.Throwable -> Laa
        L70:
            long r6 = java.lang.Math.max(r3, r6)     // Catch: java.lang.Throwable -> Laa
            java.util.concurrent.atomic.AtomicLong r11 = s01.m.f401899g     // Catch: java.lang.Throwable -> Laa
            long r8 = r11.get()     // Catch: java.lang.Throwable -> Laa
            int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r2 <= 0) goto L84
            r11.set(r6)     // Catch: java.lang.Throwable -> Laa
            r10.L0(r6)     // Catch: java.lang.Throwable -> Laa
        L84:
            java.lang.String r11 = "MicroMsg.BizChatInfoStorage"
            java.lang.String r2 = "loading new BizChat id=%d, last max=%d, db=%s"
            r8 = 3
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch: java.lang.Throwable -> Laa
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch: java.lang.Throwable -> Laa
            r8[r5] = r3     // Catch: java.lang.Throwable -> Laa
            java.lang.Long r3 = java.lang.Long.valueOf(r6)     // Catch: java.lang.Throwable -> Laa
            r4 = 1
            r8[r4] = r3     // Catch: java.lang.Throwable -> Laa
            java.lang.String r3 = r10.toString()     // Catch: java.lang.Throwable -> Laa
            r8[r1] = r3     // Catch: java.lang.Throwable -> Laa
            com.tencent.mars.xlog.Log.i(r11, r2, r8)     // Catch: java.lang.Throwable -> Laa
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Laa
            return
        La3:
            r1 = move-exception
            if (r11 == 0) goto La9
            r11.close()     // Catch: java.lang.Throwable -> La9
        La9:
            throw r1     // Catch: java.lang.Throwable -> Laa
        Laa:
            r11 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Laa
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: s01.m.<init>(l75.k0):void");
    }

    public s01.h D0(java.lang.String str) {
        android.database.Cursor rawQuery = rawQuery("select *  from BizChatInfo where bizChatServId = '" + str + "'  limit 1", new java.lang.String[0]);
        s01.h hVar = null;
        if (rawQuery != null) {
            if (rawQuery.moveToFirst()) {
                hVar = new s01.h();
                hVar.convertFrom(rawQuery);
            }
            rawQuery.close();
        }
        return hVar;
    }

    public boolean J0(s01.h hVar) {
        long incrementAndGet;
        if (hVar == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.BizChatInfoStorage", "insert wrong argument");
            return false;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(hVar.field_bizChatServId)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BizChatInfoStorage", "insert bizchat servid null");
            return false;
        }
        s01.h D0 = D0(hVar.field_bizChatServId);
        if (D0 != null) {
            hVar.field_bizChatLocalId = D0.field_bizChatLocalId;
            com.tencent.mars.xlog.Log.e("MicroMsg.BizChatInfoStorage", "insert bizchat servid exist");
            return true;
        }
        java.util.concurrent.atomic.AtomicLong atomicLong = f401899g;
        synchronized (atomicLong) {
            incrementAndGet = atomicLong.incrementAndGet();
            L0(incrementAndGet);
            com.tencent.mars.xlog.Log.i("MicroMsg.BizChatInfoStorage", "incBizChatLocalId %d, db=%s", java.lang.Long.valueOf(incrementAndGet), toString());
        }
        hVar.field_bizChatLocalId = incrementAndGet;
        boolean insert = super.insert(hVar);
        if (insert) {
            s01.k kVar = new s01.k();
            kVar.f401890b = hVar.field_bizChatLocalId;
            kVar.f401889a = s01.j.INSTERT;
            kVar.f401891c = hVar;
            this.f401901e.d(kVar);
            this.f401901e.c();
        }
        return insert;
    }

    public final void L0(long j17) {
        try {
            com.tencent.mm.sdk.platformtools.o4 N = com.tencent.mm.sdk.platformtools.o4.N("BizChatInfo", 2, null);
            if (j17 > N.getLong("max_biz_chat_local_id", -1L)) {
                N.putLong("max_biz_chat_local_id", j17);
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BizChatInfoStorage", "set max biz chat local id", th6);
        }
    }

    public boolean P0(s01.h hVar) {
        if (hVar == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.BizChatInfoStorage", "update wrong argument");
            return false;
        }
        long j17 = hVar.field_bizChatLocalId;
        if (j17 < 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BizChatInfoStorage", "update bizchat localid neg");
            return false;
        }
        s01.h z07 = z0(j17);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(z07.field_bizChatServId) && !z07.field_bizChatServId.equals(hVar.field_bizChatServId)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BizChatInfoStorage", "update bizchat servid nequal");
            return false;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(hVar.field_chatName)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BizChatInfoStorage", "dealWithChatNamePY null");
        } else {
            hVar.field_chatNamePY = x51.k.a(hVar.field_chatName);
        }
        boolean replace = super.replace(hVar);
        if (replace) {
            s01.r.r(hVar);
            s01.k kVar = new s01.k();
            kVar.f401890b = hVar.field_bizChatLocalId;
            kVar.f401889a = s01.j.UPDATE;
            kVar.f401891c = hVar;
            l75.v0 v0Var = this.f401901e;
            v0Var.d(kVar);
            v0Var.c();
        }
        return replace;
    }

    public boolean y0(long j17) {
        s01.h z07 = z0(j17);
        boolean delete = super.delete(z07, "bizChatLocalId");
        if (delete) {
            s01.k kVar = new s01.k();
            kVar.f401890b = z07.field_bizChatLocalId;
            kVar.f401889a = s01.j.DELETE;
            kVar.f401891c = z07;
            l75.v0 v0Var = this.f401901e;
            v0Var.d(kVar);
            v0Var.c();
        }
        return delete;
    }

    public s01.h z0(long j17) {
        s01.h hVar = new s01.h();
        hVar.field_bizChatLocalId = j17;
        super.get(hVar, new java.lang.String[0]);
        return hVar;
    }
}
