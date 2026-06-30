package com.tencent.mm.storage;

/* loaded from: classes4.dex */
public class m extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f195099e = {l75.n0.getCreateSQLs(com.tencent.mm.storage.l.f195080r, "BackupMoveTime")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f195100d;

    public m(l75.k0 k0Var) {
        super(k0Var, com.tencent.mm.storage.l.f195080r, "BackupMoveTime", null);
        this.f195100d = k0Var;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long F = k0Var.F(java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        java.lang.System.currentTimeMillis();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.addAll(java.util.Arrays.asList("CREATE INDEX IF NOT EXISTS DeviceIdSessionIndex ON BackupMoveTime ( deviceId,sessionName )"));
        for (int i17 = 0; i17 < arrayList.size(); i17++) {
            k0Var.A("BackupMoveTime", (java.lang.String) arrayList.get(i17));
        }
        java.lang.System.currentTimeMillis();
        k0Var.w(java.lang.Long.valueOf(F));
        com.tencent.mars.xlog.Log.i("MicroMsg.BackupMoveTimeStorage", "executeInitSQL last time[%d]", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.n0
    public boolean update(long j17, l75.f0 f0Var) {
        return super.update(j17, (com.tencent.mm.storage.l) f0Var);
    }
}
