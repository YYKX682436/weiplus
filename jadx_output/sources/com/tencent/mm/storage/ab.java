package com.tencent.mm.storage;

/* loaded from: classes11.dex */
public class ab extends l75.n0 implements xg3.v0 {

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f193749f = {l75.n0.getCreateSQLs(com.tencent.mm.storage.ya.f196388v, "Stranger")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f193750d;

    /* renamed from: e, reason: collision with root package name */
    public final l75.v0 f193751e;

    public ab(l75.k0 k0Var) {
        super(k0Var, com.tencent.mm.storage.ya.f196388v, "Stranger", null);
        this.f193751e = new com.tencent.mm.storage.za(this);
        this.f193750d = k0Var;
    }

    @Override // l75.n0, l75.g0
    public boolean insert(l75.f0 f0Var) {
        com.tencent.mm.storage.ya yaVar = (com.tencent.mm.storage.ya) f0Var;
        if (yaVar == null) {
            return false;
        }
        boolean insert = super.insert(yaVar);
        if (!insert) {
            return insert;
        }
        l75.v0 v0Var = this.f193751e;
        if (!v0Var.d(yaVar)) {
            return insert;
        }
        v0Var.c();
        return insert;
    }

    @Override // l75.n0
    public boolean replace(l75.f0 f0Var) {
        com.tencent.mm.storage.ya yaVar = (com.tencent.mm.storage.ya) f0Var;
        iz5.a.g("stranger NULL !", yaVar != null);
        java.lang.String str = yaVar.field_encryptUsername;
        if (!(this.f193750d.m("Stranger", "", yaVar.convertTo()) > 0)) {
            return false;
        }
        l75.v0 v0Var = this.f193751e;
        if (!v0Var.d(yaVar)) {
            return true;
        }
        v0Var.c();
        return true;
    }

    public int y0(java.lang.String str) {
        int delete = this.f193750d.delete("Stranger", "(encryptUsername=?)", new java.lang.String[]{"" + str});
        if (delete > 0) {
            doNotify();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.StrangerStorage", "delByEncryptUsername:" + str + " result:" + delete);
        return delete;
    }

    public com.tencent.mm.storage.ya z0(java.lang.String str) {
        if (str == null || str.length() <= 0) {
            return null;
        }
        com.tencent.mm.storage.ya yaVar = new com.tencent.mm.storage.ya();
        android.database.Cursor D = this.f193750d.D("Stranger", null, "encryptUsername = ?", new java.lang.String[]{str}, null, null, null, 2);
        if (D.moveToFirst()) {
            yaVar.convertFrom(D);
        }
        D.close();
        return yaVar;
    }
}
