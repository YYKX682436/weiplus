package u41;

/* loaded from: classes4.dex */
public class j extends l75.n0 implements ab0.d0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f424633e = {l75.n0.getCreateSQLs(u41.i.f424632p, "OpenIMSnsFlag")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f424634d;

    public j(l75.k0 k0Var) {
        super(k0Var, u41.i.f424632p, "OpenIMSnsFlag", null);
        this.f424634d = k0Var;
    }

    @Override // l75.n0
    /* renamed from: D0, reason: merged with bridge method [inline-methods] */
    public boolean replace(u41.i iVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Openim.OpenIMSnsFlagStg", "replace " + iVar.field_openIMUsername + "," + iVar.field_openIMSnsFlag);
        return super.replace(iVar);
    }

    @Override // l75.n0, l75.g0
    public boolean update(l75.f0 f0Var, java.lang.String[] strArr) {
        u41.i iVar = (u41.i) f0Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.Openim.OpenIMSnsFlagStg", "update " + iVar.field_openIMUsername + "," + iVar.field_openIMSnsFlag);
        return super.update(iVar, strArr);
    }

    public void y0() {
        l75.k0 k0Var = this.f424634d;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long j17 = 0;
        try {
            try {
                j17 = k0Var.F(java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
                k0Var.A("OpenIMSnsFlag", "DROP TABLE OpenIMSnsFlag");
                k0Var.A("OpenIMSnsFlag", f424633e[0]);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.Openim.OpenIMSnsFlagStg", "drop table Error :" + e17.getMessage());
            }
            k0Var.w(java.lang.Long.valueOf(j17));
            com.tencent.mars.xlog.Log.i("MicroMsg.Openim.OpenIMSnsFlagStg", "deleteTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
        } catch (java.lang.Throwable th6) {
            k0Var.w(java.lang.Long.valueOf(j17));
            throw th6;
        }
    }

    public long z0(java.lang.String str) {
        android.database.Cursor f17 = this.f424634d.f("SELECT * FROM OpenIMSnsFlag WHERE openIMUsername = \"" + str + "\"", null, 2);
        long j17 = 0;
        if (f17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Openim.OpenIMSnsFlagStg", "getFlag failed, openIMUsername:%s", str);
            return 0L;
        }
        if (f17.moveToFirst()) {
            u41.i iVar = new u41.i();
            iVar.convertFrom(f17);
            j17 = iVar.field_openIMSnsFlag;
        }
        f17.close();
        return j17;
    }
}
