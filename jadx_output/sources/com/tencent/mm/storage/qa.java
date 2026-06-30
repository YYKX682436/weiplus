package com.tencent.mm.storage;

/* loaded from: classes11.dex */
public class qa extends l75.n0 implements xg3.s0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f195249e = {l75.n0.getCreateSQLs(com.tencent.mm.storage.pa.H, "shakeverifymessage")};

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f195250f = {"CREATE INDEX IF NOT EXISTS  shakeverifymessage_unread_index ON shakeverifymessage ( status )", "CREATE INDEX IF NOT EXISTS shakeverifymessage_statusIndex ON shakeverifymessage ( status )", "CREATE INDEX IF NOT EXISTS shakeverifymessage_createtimeIndex ON shakeverifymessage ( createtime )"};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f195251d;

    public qa(l75.k0 k0Var) {
        super(k0Var, com.tencent.mm.storage.pa.H, "shakeverifymessage", f195250f);
        this.f195251d = k0Var;
    }

    public com.tencent.mm.storage.pa[] D0(java.lang.String str, int i17) {
        if (str == null || str.length() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ShakeVerifyMessageStorage", "getLastRecvShakeMsg fail, talker is null");
            return null;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("select * from ShakeVerifyMessage where isSend = 0 and sayhiuser = '");
        com.tencent.mm.sdk.platformtools.t8.n(str);
        sb6.append(str);
        sb6.append("' order by createTime DESC limit ");
        sb6.append(i17);
        android.database.Cursor f17 = this.f195251d.f(sb6.toString(), null, 2);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (f17.moveToNext()) {
            com.tencent.mm.storage.pa paVar = new com.tencent.mm.storage.pa();
            paVar.convertFrom(f17);
            arrayList.add(paVar);
        }
        f17.close();
        if (arrayList.size() == 0) {
            return null;
        }
        return (com.tencent.mm.storage.pa[]) arrayList.toArray(new com.tencent.mm.storage.pa[arrayList.size()]);
    }

    public com.tencent.mm.storage.pa[] J0(java.lang.String str, int i17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("select *, rowid from ShakeVerifyMessage  where sayhiuser = '");
        com.tencent.mm.sdk.platformtools.t8.n(str);
        sb6.append(str);
        sb6.append("' order by createtime DESC limit ");
        sb6.append(i17);
        android.database.Cursor f17 = this.f195251d.f(sb6.toString(), null, 2);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (f17.moveToNext()) {
            com.tencent.mm.storage.pa paVar = new com.tencent.mm.storage.pa();
            paVar.convertFrom(f17);
            arrayList.add(paVar);
        }
        f17.close();
        if (arrayList.size() == 0) {
            return null;
        }
        return (com.tencent.mm.storage.pa[]) arrayList.toArray(new com.tencent.mm.storage.pa[arrayList.size()]);
    }

    @Override // l75.n0, l75.g0
    /* renamed from: L0, reason: merged with bridge method [inline-methods] */
    public boolean insert(com.tencent.mm.storage.pa paVar) {
        if (paVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ShakeVerifyMessageStorage", "insert fail, shakeMsg is null");
            return false;
        }
        if (!super.insert(paVar)) {
            return false;
        }
        doNotify(paVar.systemRowid + "");
        return true;
    }

    public int f() {
        android.database.Cursor f17 = this.f195251d.f("select count(*) from " + getTableName() + " where status != 4", null, 2);
        if (!f17.moveToFirst()) {
            f17.close();
            return 0;
        }
        int i17 = f17.getInt(0);
        f17.close();
        if (i17 > 0) {
            return i17;
        }
        return 0;
    }

    @Override // l75.n0
    public int getCount() {
        android.database.Cursor f17 = this.f195251d.f("select count(*) from " + getTableName(), null, 2);
        if (!f17.moveToFirst()) {
            f17.close();
            return 0;
        }
        int i17 = f17.getInt(0);
        f17.close();
        if (i17 > 0) {
            return i17;
        }
        return 0;
    }

    public void y0(java.lang.String str) {
        int delete = this.f195251d.delete(getTableName(), "svrid = '" + str + "'", null);
        if (delete > 0) {
            doNotify();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ShakeVerifyMessageStorage", "delBySvrId = " + delete);
    }

    public com.tencent.mm.storage.pa z0() {
        android.database.Cursor f17 = this.f195251d.f("SELECT * FROM " + getTableName() + " ORDER BY createtime DESC LIMIT 1", null, 2);
        if (f17 == null) {
            return null;
        }
        if (!f17.moveToFirst()) {
            f17.close();
            return null;
        }
        com.tencent.mm.storage.pa paVar = new com.tencent.mm.storage.pa();
        paVar.convertFrom(f17);
        f17.close();
        return paVar;
    }
}
