package com.tencent.mm.storage;

/* loaded from: classes11.dex */
public class b2 extends l75.n0 {

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.String[] f193760i = {l75.n0.getCreateSQLs(com.tencent.mm.storage.s1.W1, "BizTimeLineInfo")};

    /* renamed from: m, reason: collision with root package name */
    public static final java.lang.String[] f193761m = {"CREATE  INDEX IF NOT EXISTS msg_id_index ON BizTimeLineInfo ( msgId ) ", "CREATE  INDEX IF NOT EXISTS  has_show_talker_index ON BizTimeLineInfo ( hasShow,talker ) ", "CREATE  INDEX IF NOT EXISTS  order_flag_place_top_index ON BizTimeLineInfo ( orderFlag,placeTop ) ", "CREATE  INDEX IF NOT EXISTS  talker_id_order_flag_index ON BizTimeLineInfo ( talkerId,orderFlag ) "};

    /* renamed from: n, reason: collision with root package name */
    public static final kk.j f193762n = new jt0.j(30);

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f193763d;

    /* renamed from: e, reason: collision with root package name */
    public final l75.v0 f193764e;

    /* renamed from: f, reason: collision with root package name */
    public int f193765f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicLong f193766g;

    /* renamed from: h, reason: collision with root package name */
    public long f193767h;

    public b2(l75.k0 k0Var) {
        super(k0Var, com.tencent.mm.storage.s1.W1, "BizTimeLineInfo", f193761m);
        this.f193764e = new com.tencent.mm.storage.t1(this);
        this.f193765f = 100;
        this.f193766g = new java.util.concurrent.atomic.AtomicLong(10L);
        this.f193767h = 10L;
        this.f193763d = k0Var;
        n1();
    }

    public boolean D0(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.BizTimeLineInfoStorage", "deleteByTalker: %s", str);
        com.tencent.mm.storage.s1 s1Var = new com.tencent.mm.storage.s1();
        s1Var.field_talker = str;
        boolean delete = super.delete((l75.f0) s1Var, false, "talker");
        com.tencent.mm.storage.x1 x1Var = new com.tencent.mm.storage.x1();
        x1Var.f196323c = s1Var.field_talker;
        x1Var.f196322b = s1Var;
        x1Var.f196321a = com.tencent.mm.storage.y1.DELETE;
        y0(x1Var);
        synchronized (this) {
            com.tencent.mm.storage.s1 b17 = b1();
            if (b17 != null) {
                this.f193767h = java.lang.Math.min((b17.field_orderFlag & (-4294967296L)) >> 32, this.f193767h);
            }
        }
        return delete;
    }

    public final java.util.List J0(android.database.Cursor cursor) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        while (cursor.moveToNext()) {
            com.tencent.mm.storage.s1 s1Var = new com.tencent.mm.storage.s1();
            s1Var.convertFrom(cursor);
            linkedList.add(s1Var);
        }
        cursor.close();
        return linkedList;
    }

    public com.tencent.mm.storage.s1 L0(long j17) {
        com.tencent.mm.storage.s1 s1Var = new com.tencent.mm.storage.s1();
        android.database.Cursor D = this.f193763d.D("BizTimeLineInfo", null, "msgId=?", new java.lang.String[]{"" + j17}, null, null, null, 2);
        if (!D.moveToFirst()) {
            D.close();
            return null;
        }
        s1Var.convertFrom(D);
        D.close();
        return s1Var;
    }

    public java.util.List P0(int i17, int i18) {
        return J0(this.f193763d.E("BizTimeLineInfo", null, "type=? ", new java.lang.String[]{"" + i18}, null, null, "orderFlag DESC limit " + i17));
    }

    public java.util.List W0(long j17, int i17) {
        return J0(this.f193763d.E("BizTimeLineInfo", null, "type=? and orderFlag>=?", new java.lang.String[]{"" + i17, "" + j17}, null, null, "orderFlag DESC"));
    }

    public com.tencent.mm.storage.s1 b1() {
        com.tencent.mm.storage.s1 s1Var = null;
        android.database.Cursor f17 = this.f193763d.f("SELECT * FROM BizTimeLineInfo order by orderFlag DESC limit 1", null, 2);
        if (f17.moveToFirst()) {
            s1Var = new com.tencent.mm.storage.s1();
            s1Var.convertFrom(f17);
        }
        f17.close();
        return s1Var;
    }

    public java.util.List d1(int i17, int i18) {
        return J0(this.f193763d.E("BizTimeLineInfo", null, "type=?", new java.lang.String[]{"" + i17}, null, null, "orderFlag DESC limit " + i18));
    }

    public java.util.List f1(int i17, long j17, int i18) {
        return J0(this.f193763d.E("BizTimeLineInfo", null, "type=? and orderFlag<? ", new java.lang.String[]{"" + i18, "" + j17}, null, null, "orderFlag DESC limit " + i17));
    }

    public int i1(long j17) {
        java.lang.System.currentTimeMillis();
        android.database.Cursor B = this.f193763d.B("SELECT count(*) FROM BizTimeLineInfo where orderFlag >= " + (j17 & (-4294967296L)) + " and hasShow < 1 ", null);
        int i17 = B.moveToFirst() ? B.getInt(0) : 0;
        java.lang.System.currentTimeMillis();
        B.close();
        return i17;
    }

    @Override // l75.n0, l75.g0
    public boolean insert(l75.f0 f0Var) {
        com.tencent.mm.storage.s1 s1Var = (com.tencent.mm.storage.s1) f0Var;
        boolean insertNotify = super.insertNotify(s1Var, false);
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        long j17 = (s1Var.field_orderFlag & (-4294967296L)) >> 32;
        synchronized (this) {
            this.f193767h = java.lang.Math.max(j17, this.f193767h);
        }
        com.tencent.mm.storage.x1 x1Var = new com.tencent.mm.storage.x1();
        x1Var.f196323c = s1Var.field_talker;
        x1Var.f196322b = s1Var;
        x1Var.f196321a = com.tencent.mm.storage.y1.INSERT;
        y0(x1Var);
        return insertNotify;
    }

    public int k1(long j17) {
        kk.j jVar = f193762n;
        java.lang.Boolean bool = (java.lang.Boolean) ((lt0.f) jVar).get(java.lang.Long.valueOf(j17));
        if (bool != null && bool.booleanValue()) {
            return 0;
        }
        java.lang.System.currentTimeMillis();
        l75.k0 k0Var = this.f193763d;
        android.database.Cursor B = k0Var.B("SELECT count(*) FROM BizTimeLineInfo where orderFlag >= " + j17 + " and status > 4", null);
        int i17 = B.moveToFirst() ? B.getInt(0) : 0;
        B.close();
        android.database.Cursor B2 = k0Var.B("SELECT count(*) FROM BizTimeLineInfo where orderFlag >= " + j17 + " and status < 4", null);
        if (B2.moveToFirst()) {
            i17 += B2.getInt(0);
        }
        B2.close();
        if (i17 == 0) {
            ((lt0.f) jVar).j(java.lang.Long.valueOf(j17), java.lang.Boolean.TRUE);
        }
        java.lang.System.currentTimeMillis();
        return i17;
    }

    public synchronized void n1() {
        long j17;
        synchronized (this) {
            android.database.Cursor f17 = this.f193763d.f("select max(orderFlag) from BizTimeLineInfo", null, 2);
            if (f17.moveToFirst()) {
                j17 = f17.getLong(0);
                f17.close();
            } else {
                j17 = 0;
            }
        }
        long j18 = j17 >> 32;
        this.f193767h = j18;
        if (j18 < 10) {
            this.f193767h = 10L;
        }
        com.tencent.mm.storage.s1 b17 = b1();
        if (b17 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.BizTimeLineInfoStorage", "initGroupId is null, id %d", java.lang.Long.valueOf(this.f193767h));
            return;
        }
        if (b17.field_status == 4) {
            this.f193766g.set(this.f193767h + 1);
        } else {
            this.f193766g.set(this.f193767h);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.BizTimeLineInfoStorage", "initGroupId id %d/%d, status %d", java.lang.Long.valueOf(this.f193766g.longValue()), java.lang.Long.valueOf(this.f193767h), java.lang.Integer.valueOf(b17.field_status));
    }

    public boolean o1(com.tencent.mm.storage.s1 s1Var, boolean z17) {
        boolean updateNotify = super.updateNotify(s1Var, false, "msgId");
        if (z17) {
            com.tencent.mm.storage.x1 x1Var = new com.tencent.mm.storage.x1();
            x1Var.f196323c = s1Var.field_talker;
            x1Var.f196322b = s1Var;
            x1Var.f196321a = com.tencent.mm.storage.y1.UPDATE;
            y0(x1Var);
        }
        return updateNotify;
    }

    public void p1(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        boolean w27 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true).w2();
        java.lang.String str2 = "update BizTimeLineInfo set placeTop = " + (w27 ? 1 : 0) + " where status > 4 and talker = '" + str + "'";
        l75.k0 k0Var = this.f193763d;
        k0Var.A("BizTimeLineInfo", str2);
        k0Var.A("BizTimeLineInfo", "update BizTimeLineInfo set placeTop = " + (w27 ? 1 : 0) + " where status < 4 and talker = '" + str + "'");
        com.tencent.mm.storage.s1 b17 = b1();
        if (b17 != null && str.equals(b17.field_talker)) {
            b17.field_placeTop = w27 ? 1 : 0;
            super.updateNotify(b17, false, "msgSvrId");
        }
        com.tencent.mm.storage.x1 x1Var = new com.tencent.mm.storage.x1();
        x1Var.f196321a = com.tencent.mm.storage.y1.UPDATE;
        y0(x1Var);
    }

    public void y0(com.tencent.mm.storage.x1 x1Var) {
        l75.v0 v0Var = this.f193764e;
        if (v0Var.d(x1Var)) {
            v0Var.c();
        }
    }

    public void z0(long j17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.BizTimeLineInfoStorage", "deleteById: %d", java.lang.Long.valueOf(j17));
        com.tencent.mm.storage.s1 s1Var = new com.tencent.mm.storage.s1();
        s1Var.field_msgId = j17;
        super.delete((l75.f0) s1Var, false, "msgId");
        com.tencent.mm.storage.x1 x1Var = new com.tencent.mm.storage.x1();
        x1Var.f196321a = com.tencent.mm.storage.y1.DELETE;
        y0(x1Var);
        synchronized (this) {
            com.tencent.mm.storage.s1 b17 = b1();
            if (b17 != null) {
                this.f193767h = java.lang.Math.min((b17.field_orderFlag & (-4294967296L)) >> 32, this.f193767h);
            }
        }
    }
}
