package com.tencent.mm.storage;

/* loaded from: classes4.dex */
public class o extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f195187e = {l75.n0.getCreateSQLs(com.tencent.mm.storage.n.f195130p, "BackupRecoverMsgListDataId")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f195188d;

    public o(l75.k0 k0Var) {
        super(k0Var, com.tencent.mm.storage.n.f195130p, "BackupRecoverMsgListDataId", null);
        this.f195188d = k0Var;
    }

    @Override // l75.n0
    public boolean update(long j17, l75.f0 f0Var) {
        return super.update(j17, (com.tencent.mm.storage.n) f0Var);
    }

    public java.lang.String y0(java.lang.String str) {
        android.database.Cursor B = this.f195188d.B("SELECT * FROM BackupRecoverMsgListDataId WHERE msgListDataId = \"" + str + "\" ", null);
        if (B == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BackupRecoverMsgListDataIdStorage", "getSessionNameByMsgListDataId failed, msgListDataId:%s", str);
            return null;
        }
        if (!B.moveToFirst()) {
            B.close();
            return null;
        }
        com.tencent.mm.storage.n nVar = new com.tencent.mm.storage.n();
        nVar.convertFrom(B);
        B.close();
        return nVar.field_sessionName;
    }

    public boolean z0() {
        android.database.Cursor B = this.f195188d.B("SELECT * FROM BackupRecoverMsgListDataId", null);
        if (B == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BackupRecoverMsgListDataIdStorage", "isMsgListDataIdExist failed.");
            return false;
        }
        if (B.getCount() > 0) {
            B.close();
            return true;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.BackupRecoverMsgListDataIdStorage", "No data in BackupRecoverMsgListDataIdStorage.");
        B.close();
        return false;
    }
}
