package vn3;

/* loaded from: classes13.dex */
public class a extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f438425e = {l75.n0.getCreateSQLs(com.tencent.mm.plugin.newtips.model.d.L, "NewTipsInfo")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f438426d;

    public a(l75.k0 k0Var) {
        super(k0Var, com.tencent.mm.plugin.newtips.model.d.L, "NewTipsInfo", null);
        this.f438426d = k0Var;
    }

    @Override // l75.n0, l75.g0
    /* renamed from: D0, reason: merged with bridge method [inline-methods] */
    public boolean update(com.tencent.mm.plugin.newtips.model.d dVar, java.lang.String... strArr) {
        if (dVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NewTipsCompatInfoStorage", "NewTipsCompatInfo is null!");
            return false;
        }
        boolean updateNotify = super.updateNotify(dVar, false, strArr);
        if (updateNotify) {
            doNotify(dVar.field_tipId + "", 3, java.lang.Integer.valueOf(dVar.field_tipId));
        }
        return updateNotify;
    }

    public com.tencent.mm.plugin.newtips.model.d y0(int i17) {
        l75.k0 k0Var = this.f438426d;
        if (k0Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NewTipsCompatInfoStorage", "getByTipsId, but db is null, return");
            return null;
        }
        android.database.Cursor D = k0Var.D("NewTipsInfo", null, "tipId=?", new java.lang.String[]{"" + i17}, null, null, null, 2);
        if (!D.moveToFirst()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.NewTipsCompatInfoStorage", "getByTipsId:%d, no data", java.lang.Integer.valueOf(i17));
            D.close();
            return null;
        }
        com.tencent.mm.plugin.newtips.model.d dVar = new com.tencent.mm.plugin.newtips.model.d();
        try {
            dVar.convertFrom(D);
            D.close();
            return dVar;
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NewTipsCompatInfoStorage", "getByTipsId convertFrom(cu) cause IlleagalStateException, return null");
            D.close();
            return null;
        }
    }

    @Override // l75.n0, l75.g0
    /* renamed from: z0, reason: merged with bridge method [inline-methods] */
    public boolean insert(com.tencent.mm.plugin.newtips.model.d dVar) {
        if (dVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NewTipsCompatInfoStorage", "NewTipsCompatInfo is null!");
            return false;
        }
        int i17 = dVar.field_tipId;
        if (i17 <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NewTipsCompatInfoStorage", "newTipsId is error, tipsId = %s", java.lang.Integer.valueOf(i17));
            return false;
        }
        boolean insertNotify = insertNotify(dVar, false);
        if (insertNotify) {
            doNotify(dVar.field_tipId + "", 2, java.lang.Integer.valueOf(dVar.field_tipId));
        }
        return insertNotify;
    }
}
