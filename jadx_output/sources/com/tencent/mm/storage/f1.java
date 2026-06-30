package com.tencent.mm.storage;

/* loaded from: classes11.dex */
public class f1 extends l75.n0 implements com.tencent.mm.storage.a8 {

    /* renamed from: h, reason: collision with root package name */
    public static final java.lang.String[] f193907h = {l75.n0.getCreateSQLs(com.tencent.mm.storage.s1.W1, "BizPhotoSingleMsgInfo")};

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.String[] f193908i = {"CREATE  INDEX IF NOT EXISTS photo_msg_svr_id_index ON BizPhotoSingleMsgInfo ( msgSvrId ) ", "CREATE  INDEX IF NOT EXISTS photo_talker_index ON BizPhotoSingleMsgInfo ( talker ) ", "CREATE  INDEX IF NOT EXISTS  photo_create_time_index ON BizPhotoSingleMsgInfo ( createTime ) ", "CREATE  INDEX IF NOT EXISTS  photo_status_talker_index ON BizPhotoSingleMsgInfo ( status,talker ) ", "CREATE  INDEX IF NOT EXISTS  photo_status_talker_id_index ON BizPhotoSingleMsgInfo ( status,talkerId ) ", "CREATE  INDEX IF NOT EXISTS  photo_status_create_time_index ON BizPhotoSingleMsgInfo ( status,createTime ) ", "CREATE  INDEX IF NOT EXISTS  photo_type_order_flag_index ON BizPhotoSingleMsgInfo ( type,orderFlag ) "};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f193909d;

    /* renamed from: e, reason: collision with root package name */
    public final l75.v0 f193910e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f193911f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicLong f193912g;

    public f1(l75.k0 k0Var) {
        super(k0Var, com.tencent.mm.storage.s1.W1, "BizPhotoSingleMsgInfo", f193908i);
        this.f193910e = new com.tencent.mm.storage.d1(this);
        this.f193911f = false;
        this.f193912g = new java.util.concurrent.atomic.AtomicLong(-60000000L);
        this.f193909d = k0Var;
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
        this.f193909d.A("BizPhotoSingleMsgInfo", "update BizPhotoSingleMsgInfo set silentFoldMsgReadStatus = 2 where msgId IN (" + ((java.lang.Object) sb6) + ")");
        com.tencent.mm.storage.x1 x1Var = new com.tencent.mm.storage.x1();
        x1Var.f196321a = com.tencent.mm.storage.y1.UPDATE;
        y0(x1Var);
    }

    @Override // l75.n0, l75.g0
    /* renamed from: J0, reason: merged with bridge method [inline-methods] */
    public boolean insert(com.tencent.mm.storage.s1 s1Var) {
        boolean insertNotify = super.insertNotify(s1Var, false);
        com.tencent.mm.storage.x1 x1Var = new com.tencent.mm.storage.x1();
        x1Var.f196323c = s1Var.field_talker;
        x1Var.f196322b = s1Var;
        x1Var.f196321a = com.tencent.mm.storage.y1.INSERT;
        y0(x1Var);
        if (!this.f193911f) {
            this.f193911f = true;
            ((ku5.t0) ku5.t0.f312615d).l(new com.tencent.mm.storage.e1(this), 1000L, "BizTimeLineInfoStorageThread");
        }
        return insertNotify;
    }

    public boolean L0(com.tencent.mm.storage.s1 s1Var) {
        boolean updateNotify = super.updateNotify(s1Var, false, "msgSvrId");
        com.tencent.mm.storage.x1 x1Var = new com.tencent.mm.storage.x1();
        x1Var.f196323c = s1Var.field_talker;
        x1Var.f196322b = s1Var;
        x1Var.f196321a = com.tencent.mm.storage.y1.UPDATE;
        y0(x1Var);
        return updateNotify;
    }

    @Override // com.tencent.mm.storage.a8
    public void P(com.tencent.mm.storage.z1 z1Var) {
        this.f193910e.j(z1Var);
    }

    @Override // com.tencent.mm.storage.a8
    public java.util.List U(int i17, long j17) {
        return D0(this.f193909d.E("BizPhotoSingleMsgInfo", null, "createTime<?", new java.lang.String[]{"" + j17}, null, null, "createTime DESC limit " + i17));
    }

    @Override // com.tencent.mm.storage.a8
    public java.util.List b() {
        return D0(this.f193909d.E("BizPhotoSingleMsgInfo", null, "status!=? OR silentFoldMsgReadStatus==?", new java.lang.String[]{"4", "1"}, null, null, "createTime DESC "));
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

    @Override // com.tencent.mm.storage.a8
    public int f() {
        android.database.Cursor B = this.f193909d.B("SELECT count(*) FROM BizPhotoSingleMsgInfo where status != 4", null);
        int i17 = B.moveToFirst() ? B.getInt(0) : 0;
        B.close();
        return i17;
    }

    @Override // com.tencent.mm.storage.a8
    public java.util.List i(int i17) {
        return D0(this.f193909d.E("BizPhotoSingleMsgInfo", null, null, null, null, null, "createTime DESC limit " + i17));
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
        this.f193909d.A("BizPhotoSingleMsgInfo", "update BizPhotoSingleMsgInfo set status = 4 where msgId IN (" + sb6.toString() + ")");
        com.tencent.mm.storage.x1 x1Var = new com.tencent.mm.storage.x1();
        x1Var.f196321a = com.tencent.mm.storage.y1.UPDATE;
        y0(x1Var);
    }

    @Override // com.tencent.mm.storage.a8
    public void j0(com.tencent.mm.storage.z1 z1Var, android.os.Looper looper) {
        this.f193910e.a(z1Var, looper);
    }

    @Override // com.tencent.mm.storage.a8
    public boolean s(java.lang.String str, int i17) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.BizPhotoSingleMsgStorage", "setNotifyMsgBlockStatusFlag mpArticleKey invalid");
            return false;
        }
        return this.f193909d.A("BizPhotoSingleMsgInfo", "update BizPhotoSingleMsgInfo set notifyMsgBlockFlag = " + i17 + " where mpArticleKey = '" + str + "'");
    }

    @Override // com.tencent.mm.storage.a8
    public int x() {
        android.database.Cursor B = this.f193909d.B("SELECT count(*) FROM BizPhotoSingleMsgInfo", null);
        int i17 = B.moveToFirst() ? B.getInt(0) : 0;
        B.close();
        return i17;
    }

    public void y0(com.tencent.mm.storage.x1 x1Var) {
        l75.v0 v0Var = this.f193910e;
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
