package com.tencent.mm.storage;

/* loaded from: classes11.dex */
public class q7 extends l75.n0 implements xg3.z {

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f195243f = {l75.n0.getCreateSQLs(com.tencent.mm.storage.p7.H, "fmessage_msginfo")};

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String[] f195244g = {"CREATE INDEX IF NOT EXISTS  fmessageTalkerIndex ON fmessage_msginfo ( talker )"};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f195245d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.storage.r7 f195246e;

    public q7(l75.k0 k0Var) {
        super(k0Var, com.tencent.mm.storage.p7.H, "fmessage_msginfo", f195244g);
        this.f195245d = k0Var;
        this.f195246e = new com.tencent.mm.storage.r7(this, k0Var);
    }

    public boolean D0(java.lang.String str) {
        if (str == null || str.length() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FMessageMsgInfoStorage", "deleteByTalker fail, talker is null");
            return false;
        }
        if (com.tencent.mars.xlog.Log.isDebug()) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mm.sdk.platformtools.z3.b(true);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.FMessageMsgInfoStorage", "deleteByTalker() called with: talker = [" + str + "]");
        }
        return this.f195245d.delete("fmessage_msginfo", "talker = ?", new java.lang.String[]{str}) > 0;
    }

    public java.util.List J0(int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.database.Cursor f17 = this.f195245d.f("select *, rowid from fmessage_msginfo where type = " + i17, null, 2);
        while (f17.moveToNext()) {
            com.tencent.mm.storage.p7 p7Var = new com.tencent.mm.storage.p7();
            p7Var.convertFrom(f17);
            arrayList.add(p7Var);
        }
        f17.close();
        arrayList.size();
        return arrayList;
    }

    public com.tencent.mm.storage.p7[] L0(java.lang.String str, int i17) {
        android.database.Cursor f17 = this.f195245d.f("select *, rowid from fmessage_msginfo  where talker = ? order by createTime DESC limit " + i17, new java.lang.String[]{str}, 2);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (f17.moveToNext()) {
            com.tencent.mm.storage.p7 p7Var = new com.tencent.mm.storage.p7();
            p7Var.convertFrom(f17);
            arrayList.add(p7Var);
        }
        f17.close();
        return (com.tencent.mm.storage.p7[]) arrayList.toArray(new com.tencent.mm.storage.p7[arrayList.size()]);
    }

    public com.tencent.mm.storage.p7[] P0(java.lang.String str, java.lang.String str2, int i17) {
        android.database.Cursor f17;
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(str2);
        l75.k0 k0Var = this.f195245d;
        if (K0) {
            f17 = k0Var.f("select *, rowid from fmessage_msginfo  where talker = ? order by createTime DESC limit " + i17, new java.lang.String[]{str}, 2);
        } else {
            f17 = k0Var.f("select *, rowid from fmessage_msginfo  where talker = ? or talker = ? order by createTime DESC limit " + i17, new java.lang.String[]{str, str2}, 2);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (f17.moveToNext()) {
            com.tencent.mm.storage.p7 p7Var = new com.tencent.mm.storage.p7();
            p7Var.convertFrom(f17);
            arrayList.add(p7Var);
        }
        f17.close();
        return (com.tencent.mm.storage.p7[]) arrayList.toArray(new com.tencent.mm.storage.p7[arrayList.size()]);
    }

    public com.tencent.mm.storage.p7 W0(java.lang.String str) {
        if (str == null || str.length() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FMessageMsgInfoStorage", "getLastFMsg fail, talker is null");
            return null;
        }
        android.database.Cursor f17 = this.f195245d.f("select * from fmessage_msginfo where talker = ? order by createTime DESC limit 1", new java.lang.String[]{str}, 2);
        com.tencent.mm.storage.p7 p7Var = new com.tencent.mm.storage.p7();
        if (f17.moveToFirst()) {
            p7Var.convertFrom(f17);
        }
        f17.close();
        return p7Var;
    }

    public com.tencent.mm.storage.p7 b1(java.lang.String str) {
        com.tencent.mm.storage.p7[] d17 = d1(str, 1);
        if (d17 == null || d17.length <= 0) {
            return null;
        }
        return d17[0];
    }

    public com.tencent.mm.storage.p7[] d1(java.lang.String str, int i17) {
        if (str == null || str.length() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FMessageMsgInfoStorage", "getLastRecvFMsg fail, talker is null");
            return null;
        }
        android.database.Cursor f17 = this.f195245d.f("select * from fmessage_msginfo where isSend != 1 and talker = ? order by createTime DESC limit " + i17, new java.lang.String[]{str}, 2);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (f17.moveToNext()) {
            com.tencent.mm.storage.p7 p7Var = new com.tencent.mm.storage.p7();
            p7Var.convertFrom(f17);
            arrayList.add(p7Var);
        }
        f17.close();
        return (com.tencent.mm.storage.p7[]) arrayList.toArray(new com.tencent.mm.storage.p7[arrayList.size()]);
    }

    public com.tencent.mm.storage.p7[] f1(java.lang.String str, int i17) {
        if (str == null || str.length() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FMessageMsgInfoStorage", "getLastRecvFMsg fail, talker is null");
            return null;
        }
        android.database.Cursor f17 = this.f195245d.f("select * from fmessage_msginfo where isSend != 1 and encryptTalker = ? order by createTime DESC limit " + i17, new java.lang.String[]{str}, 2);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (f17.moveToNext()) {
            com.tencent.mm.storage.p7 p7Var = new com.tencent.mm.storage.p7();
            p7Var.convertFrom(f17);
            arrayList.add(p7Var);
        }
        f17.close();
        return (com.tencent.mm.storage.p7[]) arrayList.toArray(new com.tencent.mm.storage.p7[arrayList.size()]);
    }

    public com.tencent.mm.storage.p7 i1(com.tencent.mm.storage.z3 z3Var) {
        com.tencent.mm.storage.r7 r7Var = this.f195246e;
        r7Var.getClass();
        if (z3Var == null) {
            return null;
        }
        java.lang.String d17 = z3Var.d1();
        java.lang.String J0 = z3Var.J0();
        com.tencent.mm.storage.p7 b17 = r7Var.b(d17);
        return b17 == null ? r7Var.b(J0) : b17;
    }

    @Override // l75.n0, l75.g0
    /* renamed from: k1, reason: merged with bridge method [inline-methods] */
    public boolean insert(com.tencent.mm.storage.p7 p7Var) {
        if (p7Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FMessageMsgInfoStorage", "insert fail, fmsgInfo is null");
            return false;
        }
        if (com.tencent.mars.xlog.Log.isDebug()) {
            p7Var.toJSON().toString();
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mm.sdk.platformtools.z3.b(true);
        }
        if (!super.insert(p7Var)) {
            return false;
        }
        doNotify(p7Var.systemRowid + "");
        return true;
    }

    public void y0(com.tencent.mm.storage.p7 insertMsgInfo) {
        com.tencent.mm.storage.r7 r7Var = this.f195246e;
        r7Var.getClass();
        kotlin.jvm.internal.o.g(insertMsgInfo, "insertMsgInfo");
        com.tencent.mars.xlog.Log.i("MicroMsg.FMessageMsgInfoStorage", "beforeInsertVerify insertMsgInfo type:" + insertMsgInfo.field_type + " isSender:" + insertMsgInfo.field_isSend);
        boolean z17 = true;
        if (insertMsgInfo.field_type != 1) {
            return;
        }
        java.lang.String str = insertMsgInfo.field_talker;
        java.lang.String str2 = insertMsgInfo.field_encryptTalker;
        com.tencent.mm.storage.p7 b17 = r7Var.b(str);
        if (b17 != null && b17.field_isContactDeleted == 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FMessageMsgInfoStorage", "beforeInsertVerify need delete old fMsgInfos talker:" + str + " enTalker:" + str2);
            if (str != null && !r26.n0.N(str)) {
                z17 = false;
            }
            if (z17) {
                return;
            }
            r7Var.f195277a.D0(str);
        }
    }

    public boolean z0(java.lang.String str) {
        if (str == null || str.length() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FMessageMsgInfoStorage", "deleteByEncryptTalker fail, encryptTalker is null");
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FMessageMsgInfoStorage", "deleteByEncryptTalker() called with: encryptTalker = [" + str + "]");
        return this.f195245d.delete("fmessage_msginfo", "encryptTalker = ?", new java.lang.String[]{str}) > 0;
    }
}
