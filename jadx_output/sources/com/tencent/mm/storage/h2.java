package com.tencent.mm.storage;

/* loaded from: classes11.dex */
public class h2 extends l75.n0 implements com.tencent.mm.storage.a8 {

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.String[] f194991i = {l75.n0.getCreateSQLs(com.tencent.mm.storage.s1.W1, "BizTimeLineSingleMsgInfo")};

    /* renamed from: m, reason: collision with root package name */
    public static final java.lang.String[] f194992m = {"CREATE  INDEX IF NOT EXISTS msg_svr_id_index ON BizTimeLineSingleMsgInfo ( msgSvrId ) ", "CREATE  INDEX IF NOT EXISTS talker_index ON BizTimeLineSingleMsgInfo ( talker ) ", "CREATE  INDEX IF NOT EXISTS  create_time_index ON BizTimeLineSingleMsgInfo ( createTime ) ", "CREATE  INDEX IF NOT EXISTS  status_talker_index ON BizTimeLineSingleMsgInfo ( status,talker ) ", "CREATE  INDEX IF NOT EXISTS  status_talker_id_index ON BizTimeLineSingleMsgInfo ( status,talkerId ) ", "CREATE  INDEX IF NOT EXISTS  status_create_time_index ON BizTimeLineSingleMsgInfo ( status,createTime ) ", "CREATE  INDEX IF NOT EXISTS  type_order_flag_index ON BizTimeLineSingleMsgInfo ( type,orderFlag ) "};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f194993d;

    /* renamed from: e, reason: collision with root package name */
    public final l75.v0 f194994e;

    /* renamed from: f, reason: collision with root package name */
    public int f194995f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f194996g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicLong f194997h;

    public h2(l75.k0 k0Var) {
        super(k0Var, com.tencent.mm.storage.s1.W1, "BizTimeLineSingleMsgInfo", f194992m);
        this.f194994e = new com.tencent.mm.storage.i2(this);
        this.f194995f = 100;
        this.f194996g = false;
        this.f194997h = new java.util.concurrent.atomic.AtomicLong(-50000000L);
        this.f194993d = k0Var;
    }

    public static void a(com.tencent.mm.storage.h2 h2Var, com.tencent.mm.storage.s1 s1Var, java.lang.String str) {
        h2Var.getClass();
        long j17 = s1Var.field_msgSvrId;
        if (j17 > 0 && h2Var.J0(j17, "msgSvrId") != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BizTimeLineSingleMsgStorage", "mergeAndInsert skip duplicate msgSvrId=" + s1Var.field_msgSvrId);
            return;
        }
        com.tencent.mm.storage.s1 L0 = h2Var.L0(str);
        if (L0 == null) {
            h2Var.insert(s1Var);
            return;
        }
        s1Var.field_mergeCount += L0.field_mergeCount;
        s1Var.field_mergeShowTime = L0.field_mergeShowTime;
        s1Var.field_msgId = L0.field_msgId;
        super.updateNotify(s1Var, false, "msgId");
        com.tencent.mm.storage.x1 x1Var = new com.tencent.mm.storage.x1();
        x1Var.f196323c = s1Var.field_talker;
        x1Var.f196322b = s1Var;
        x1Var.f196321a = com.tencent.mm.storage.y1.MERGE_UPDATE;
        h2Var.y0(x1Var);
    }

    public final java.util.List D0(android.database.Cursor cursor) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        while (cursor.moveToNext()) {
            com.tencent.mm.storage.s1 s1Var = new com.tencent.mm.storage.s1();
            s1Var.convertFrom(cursor);
            linkedList.add(s1Var);
        }
        cursor.close();
        return linkedList;
    }

    @Override // com.tencent.mm.storage.a8
    public void H(java.util.List list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        for (int i17 = 0; i17 < list.size(); i17++) {
            if (i17 > 0) {
                sb6.append(",");
            }
            sb6.append(list.get(i17));
        }
        this.f194993d.A("BizTimeLineSingleMsgInfo", "update BizTimeLineSingleMsgInfo set silentFoldMsgReadStatus = 2 where msgId IN (" + ((java.lang.Object) sb6) + ")");
        com.tencent.mm.storage.x1 x1Var = new com.tencent.mm.storage.x1();
        x1Var.f196321a = com.tencent.mm.storage.y1.UPDATE;
        y0(x1Var);
    }

    public com.tencent.mm.storage.s1 J0(long j17, java.lang.String str) {
        com.tencent.mm.storage.s1 s1Var = new com.tencent.mm.storage.s1();
        android.database.Cursor D = this.f194993d.D("BizTimeLineSingleMsgInfo", null, str + "=?", new java.lang.String[]{"" + j17}, null, null, null, 2);
        if (!D.moveToFirst()) {
            D.close();
            return null;
        }
        s1Var.convertFrom(D);
        D.close();
        return s1Var;
    }

    public com.tencent.mm.storage.s1 L0(java.lang.String str) {
        com.tencent.mm.storage.s1 s1Var = null;
        if (str != null && !str.isEmpty()) {
            android.database.Cursor B = this.f194993d.B("SELECT * FROM BizTimeLineSingleMsgInfo WHERE status != 4 AND notifyMsgId = ? ORDER BY createTime DESC LIMIT 1", new java.lang.String[]{str});
            if (B.moveToFirst()) {
                s1Var = new com.tencent.mm.storage.s1();
                s1Var.convertFrom(B);
            }
            B.close();
        }
        return s1Var;
    }

    @Override // com.tencent.mm.storage.a8
    public void P(com.tencent.mm.storage.z1 z1Var) {
        this.f194994e.j(z1Var);
    }

    public int P0(long j17) {
        android.database.Cursor B = this.f194993d.B("SELECT count(*) FROM BizTimeLineSingleMsgInfo where status != 4 and talkerId = " + j17 + " ", null);
        int i17 = B.moveToFirst() ? B.getInt(0) : 0;
        B.close();
        return i17;
    }

    @Override // com.tencent.mm.storage.a8
    public java.util.List U(int i17, long j17) {
        return D0(this.f194993d.E("BizTimeLineSingleMsgInfo", null, "createTime<?", new java.lang.String[]{"" + j17}, null, null, "createTime DESC limit " + i17));
    }

    public synchronized long W0() {
        if (this.f194997h.longValue() == -50000000) {
            com.tencent.mm.storage.s1 s1Var = null;
            android.database.Cursor B = this.f194993d.B("SELECT * FROM BizTimeLineSingleMsgInfo where type=10100 or type=318767153 order by createTime DESC limit 1", null);
            if (B.moveToFirst()) {
                s1Var = new com.tencent.mm.storage.s1();
                s1Var.convertFrom(B);
            }
            B.close();
            if (s1Var != null) {
                this.f194997h.set(s1Var.field_msgId);
            }
        }
        return this.f194997h.incrementAndGet();
    }

    @Override // com.tencent.mm.storage.a8
    public java.util.List b() {
        return D0(this.f194993d.E("BizTimeLineSingleMsgInfo", null, "status!=? OR silentFoldMsgReadStatus==?", new java.lang.String[]{"4", "1"}, null, null, "createTime DESC "));
    }

    @Override // l75.n0, l75.g0
    /* renamed from: b1, reason: merged with bridge method [inline-methods] */
    public boolean insert(com.tencent.mm.storage.s1 s1Var) {
        boolean insertNotify = super.insertNotify(s1Var, false);
        com.tencent.mm.storage.x1 x1Var = new com.tencent.mm.storage.x1();
        x1Var.f196323c = s1Var.field_talker;
        x1Var.f196322b = s1Var;
        x1Var.f196321a = com.tencent.mm.storage.y1.INSERT;
        y0(x1Var);
        if (!this.f194996g) {
            this.f194996g = true;
            ((ku5.t0) ku5.t0.f312615d).l(new com.tencent.mm.storage.k2(this), 1000L, "BizTimeLineInfoStorageThread");
        }
        return insertNotify;
    }

    @Override // com.tencent.mm.storage.a8
    public boolean c(long j17, boolean z17, boolean z18) {
        com.tencent.mm.storage.s1 s1Var = new com.tencent.mm.storage.s1();
        s1Var.field_msgId = j17;
        boolean delete = super.delete(s1Var, z17, "msgId");
        if (z18) {
            com.tencent.mm.storage.x1 x1Var = new com.tencent.mm.storage.x1();
            x1Var.f196321a = com.tencent.mm.storage.y1.DELETE;
            y0(x1Var);
        }
        return delete;
    }

    public void d1(java.lang.String str) {
        if (str == null || str.isEmpty()) {
            return;
        }
        try {
            this.f194993d.A("BizTimeLineSingleMsgInfo", "update BizTimeLineSingleMsgInfo set status = 4 where talker = '" + str + "'  and status != 4");
            com.tencent.mm.storage.x1 x1Var = new com.tencent.mm.storage.x1();
            x1Var.f196321a = com.tencent.mm.storage.y1.UPDATE;
            y0(x1Var);
            com.tencent.mars.xlog.Log.i("MicroMsg.BizTimeLineSingleMsgStorage", "bobkw resetUnreadByTalker success, talker: ".concat(str));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BizTimeLineSingleMsgStorage", "bobkw resetUnreadByTalker failed, talker: ".concat(str), e17);
        }
    }

    @Override // com.tencent.mm.storage.a8
    public int f() {
        android.database.Cursor B = this.f194993d.B("SELECT count(*) FROM BizTimeLineSingleMsgInfo where status != 4", null);
        int i17 = B.moveToFirst() ? B.getInt(0) : 0;
        B.close();
        return i17;
    }

    public boolean f1(com.tencent.mm.storage.s1 s1Var) {
        boolean updateNotify = super.updateNotify(s1Var, false, "msgSvrId");
        com.tencent.mm.storage.x1 x1Var = new com.tencent.mm.storage.x1();
        x1Var.f196323c = s1Var.field_talker;
        x1Var.f196322b = s1Var;
        x1Var.f196321a = com.tencent.mm.storage.y1.UPDATE;
        y0(x1Var);
        return updateNotify;
    }

    @Override // com.tencent.mm.storage.a8
    public java.util.List i(int i17) {
        return D0(this.f194993d.E("BizTimeLineSingleMsgInfo", null, null, null, null, null, "createTime DESC limit " + i17));
    }

    @Override // com.tencent.mm.storage.a8
    public void i0(java.util.List list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        for (int i17 = 0; i17 < list.size(); i17++) {
            if (i17 > 0) {
                sb6.append(",");
            }
            sb6.append(list.get(i17));
        }
        this.f194993d.A("BizTimeLineSingleMsgInfo", "update BizTimeLineSingleMsgInfo set status = 4 where msgId IN (" + sb6.toString() + ")");
        com.tencent.mm.storage.x1 x1Var = new com.tencent.mm.storage.x1();
        x1Var.f196321a = com.tencent.mm.storage.y1.UPDATE;
        y0(x1Var);
    }

    @Override // com.tencent.mm.storage.a8
    public void j0(com.tencent.mm.storage.z1 z1Var, android.os.Looper looper) {
        this.f194994e.a(z1Var, looper);
    }

    @Override // com.tencent.mm.storage.a8
    public boolean s(java.lang.String str, int i17) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.BizTimeLineSingleMsgStorage", "setNotifyMsgBlockStatusFlag mpArticleKey invalid");
            return false;
        }
        return this.f194993d.A("BizTimeLineSingleMsgInfo", "update BizTimeLineSingleMsgInfo set notifyMsgBlockFlag = " + i17 + " where mpArticleKey = '" + str + "'");
    }

    @Override // com.tencent.mm.storage.a8
    public int x() {
        android.database.Cursor B = this.f194993d.B("SELECT count(*) FROM BizTimeLineSingleMsgInfo", null);
        int i17 = B.moveToFirst() ? B.getInt(0) : 0;
        B.close();
        return i17;
    }

    public void y0(com.tencent.mm.storage.x1 x1Var) {
        l75.v0 v0Var = this.f194994e;
        if (v0Var.d(x1Var)) {
            v0Var.c();
        }
    }

    public boolean z0(java.lang.String str) {
        com.tencent.mm.storage.s1 s1Var = new com.tencent.mm.storage.s1();
        s1Var.field_talker = str;
        boolean delete = super.delete((l75.f0) s1Var, false, "talker");
        com.tencent.mm.storage.x1 x1Var = new com.tencent.mm.storage.x1();
        x1Var.f196323c = s1Var.field_talker;
        x1Var.f196322b = s1Var;
        x1Var.f196321a = com.tencent.mm.storage.y1.DELETE;
        y0(x1Var);
        return delete;
    }
}
