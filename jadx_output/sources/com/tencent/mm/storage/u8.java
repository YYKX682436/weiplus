package com.tencent.mm.storage;

/* loaded from: classes11.dex */
public class u8 extends l75.n0 implements xg3.c0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f196264e = {l75.n0.getCreateSQLs(com.tencent.mm.storage.t8.N, "LBSVerifyMessage")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f196265d;

    public u8(l75.k0 k0Var) {
        super(k0Var, com.tencent.mm.storage.t8.N, "LBSVerifyMessage", dm.f7.f236859v);
        this.f196265d = k0Var;
    }

    public com.tencent.mm.storage.t8 D0(java.lang.String str, int i17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("select *, rowid from LBSVerifyMessage  where (sayhiuser = '");
        com.tencent.mm.sdk.platformtools.t8.n(str);
        sb6.append(str);
        sb6.append("' or sayhiencryptuser = '");
        com.tencent.mm.sdk.platformtools.t8.n(str);
        sb6.append(str);
        sb6.append("') and flag=");
        sb6.append(i17);
        sb6.append(" order by createtime DESC limit 1");
        com.tencent.mm.storage.t8 t8Var = null;
        android.database.Cursor f17 = this.f196265d.f(sb6.toString(), null, 2);
        if (f17.moveToFirst()) {
            t8Var = new com.tencent.mm.storage.t8();
            t8Var.convertFrom(f17);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.LBSVerifyMessageStorage", "getLBSVerifyMessage, cursor count = 0");
        }
        f17.close();
        return t8Var;
    }

    public com.tencent.mm.storage.t8[] J0(java.lang.String str, int i17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("select *, rowid from LBSVerifyMessage  where sayhiuser = '");
        com.tencent.mm.sdk.platformtools.t8.n(str);
        sb6.append(str);
        sb6.append("' or sayhiencryptuser = '");
        com.tencent.mm.sdk.platformtools.t8.n(str);
        sb6.append(str);
        sb6.append("' order by createtime DESC limit ");
        sb6.append(i17);
        android.database.Cursor f17 = this.f196265d.f(sb6.toString(), null, 2);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (f17.moveToNext()) {
            com.tencent.mm.storage.t8 t8Var = new com.tencent.mm.storage.t8();
            t8Var.convertFrom(f17);
            arrayList.add(t8Var);
        }
        f17.close();
        return (com.tencent.mm.storage.t8[]) arrayList.toArray(new com.tencent.mm.storage.t8[arrayList.size()]);
    }

    public com.tencent.mm.storage.t8[] L0(java.lang.String str, int i17) {
        if (str == null || str.length() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LBSVerifyMessageStorage", "getLastRecvLbsMsg fail, talker is null");
            return null;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("select * from LBSVerifyMessage where isSend = 0 and (sayhiuser = '");
        com.tencent.mm.sdk.platformtools.t8.n(str);
        sb6.append(str);
        sb6.append("' or sayhiencryptuser = '");
        com.tencent.mm.sdk.platformtools.t8.n(str);
        sb6.append(str);
        sb6.append("') order by createTime DESC limit ");
        sb6.append(i17);
        android.database.Cursor f17 = this.f196265d.f(sb6.toString(), null, 2);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (f17.moveToNext()) {
            com.tencent.mm.storage.t8 t8Var = new com.tencent.mm.storage.t8();
            t8Var.convertFrom(f17);
            arrayList.add(t8Var);
        }
        f17.close();
        return (com.tencent.mm.storage.t8[]) arrayList.toArray(new com.tencent.mm.storage.t8[arrayList.size()]);
    }

    public com.tencent.mm.storage.t8 P0() {
        android.database.Cursor f17 = this.f196265d.f("SELECT * FROM " + getTableName() + " where status != 4 ORDER BY createtime DESC LIMIT 1", null, 2);
        if (f17 == null) {
            return null;
        }
        if (!f17.moveToFirst()) {
            f17.close();
            return null;
        }
        com.tencent.mm.storage.t8 t8Var = new com.tencent.mm.storage.t8();
        t8Var.convertFrom(f17);
        f17.close();
        return t8Var;
    }

    @Override // l75.n0, l75.g0
    /* renamed from: W0, reason: merged with bridge method [inline-methods] */
    public boolean insert(com.tencent.mm.storage.t8 t8Var) {
        if (t8Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LBSVerifyMessageStorage", "insert fail, lbsMsg is null");
            return false;
        }
        if (!super.insert(t8Var)) {
            return false;
        }
        doNotify(t8Var.systemRowid + "");
        return true;
    }

    public int f() {
        android.database.Cursor f17 = this.f196265d.f("select count(*) from " + getTableName() + " where status != 4", null, 2);
        if (!f17.moveToFirst()) {
            f17.close();
            return 0;
        }
        int i17 = f17.getInt(0);
        f17.close();
        return i17;
    }

    @Override // l75.n0
    public int getCount() {
        android.database.Cursor f17 = this.f196265d.f("select count(*) from " + getTableName(), null, 2);
        int i17 = f17.moveToFirst() ? f17.getInt(0) : 0;
        f17.close();
        return i17;
    }

    public void y0(java.lang.String str) {
        int delete = this.f196265d.delete(getTableName(), "svrid = '" + str + "'", null);
        if (delete > 0) {
            doNotify();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LBSVerifyMessageStorage", "delBySvrId = " + delete);
    }

    public void z0(java.lang.String str) {
        int delete = this.f196265d.delete(getTableName(), "sayhiuser = '" + str + "' or sayhiencryptuser='" + str + "'", null);
        if (delete > 0) {
            doNotify();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LBSVerifyMessageStorage", "delByUserName = " + delete);
    }
}
