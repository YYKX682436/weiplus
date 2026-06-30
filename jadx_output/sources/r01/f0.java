package r01;

/* loaded from: classes8.dex */
public class f0 extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f368062e = {l75.n0.getCreateSQLs(r01.a0.f368016x, "BizKF")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f368063d;

    public f0(l75.k0 k0Var) {
        super(k0Var, r01.a0.f368016x, "BizKF", null);
        this.f368063d = k0Var;
        k0Var.A("BizKF", "CREATE INDEX IF NOT EXISTS BizKFAppIdUsernameIndex ON BizKF ( brandUsername )");
        k0Var.A("BizKF", "CREATE INDEX IF NOT EXISTS BizKFOpenIdIndex ON BizKF ( openId )");
    }

    public r01.a0 D0(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return null;
        }
        android.database.Cursor D = this.f368063d.D("BizKF", null, "brandUsername = ? order by kfType desc ", new java.lang.String[]{str}, null, null, null, 2);
        if (D.moveToFirst()) {
            r01.a0 a0Var = new r01.a0();
            a0Var.convertFrom(D);
            D.close();
            return a0Var;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.BizKFStorage", "get null with brandUsername:" + str);
        D.close();
        return null;
    }

    @Override // l75.n0
    /* renamed from: J0, reason: merged with bridge method [inline-methods] */
    public boolean replace(r01.a0 a0Var) {
        if (a0Var == null || com.tencent.mm.sdk.platformtools.t8.K0(a0Var.field_openId) || com.tencent.mm.sdk.platformtools.t8.K0(a0Var.field_brandUsername)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.BizKFStorage", "wrong argument");
            return false;
        }
        boolean z17 = this.f368063d.m("BizKF", r01.a0.f368016x.f316953b, a0Var.convertTo()) > 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.BizKFStorage", "replace: openId=%s, brandUsername=%s, ret=%s ", a0Var.field_openId, a0Var.field_brandUsername, java.lang.Boolean.valueOf(z17));
        return z17;
    }

    public int y0(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return -1;
        }
        int delete = this.f368063d.delete("BizKF", "brandUsername = ?", new java.lang.String[]{str});
        com.tencent.mars.xlog.Log.i("MicroMsg.BizKFStorage", "deleteKFWorker by brand username(u:%s, r:%d).", str, java.lang.Integer.valueOf(delete));
        return delete;
    }

    public r01.a0 z0(java.lang.String str) {
        if (str == null || str.length() <= 0) {
            return null;
        }
        android.database.Cursor D = this.f368063d.D("BizKF", null, "openId=?", new java.lang.String[]{str}, null, null, null, 2);
        if (!D.moveToFirst()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.BizKFStorage", "get null with openId:".concat(str));
            D.close();
            return null;
        }
        r01.a0 a0Var = new r01.a0();
        a0Var.convertFrom(D);
        D.close();
        return a0Var;
    }
}
