package s32;

/* loaded from: classes12.dex */
public class d extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f402463e = {l75.n0.getCreateSQLs(r32.d.B, "HardDeviceRankInfo")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f402464d;

    public d(l75.k0 k0Var) {
        super(k0Var, r32.d.B, "HardDeviceRankInfo", null);
        this.f402464d = k0Var;
        k0Var.A("HardDeviceRankInfo", "CREATE INDEX IF NOT EXISTS ExdeviceRankInfoRankIdAppNameIndex ON HardDeviceRankInfo ( rankID, appusername )");
    }

    public boolean D0(java.lang.String str) {
        com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M(kk.k.g(str.getBytes()).toString() + "FileSelectorUI_LastSelectedTab");
        boolean i17 = M.i("MMKV_KEY_NEED_DELETE_DB", false);
        M.G("MMKV_KEY_NEED_DELETE_DB", false);
        com.tencent.mars.xlog.Log.i("MicroMsg.ExdeviceRankInfoStg", "isNeedDeleteAllData() called result:%s", java.lang.Boolean.valueOf(i17));
        return i17;
    }

    public void J0(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ExdeviceRankInfoStg", "markNeedDeleteAllData() called");
        com.tencent.mm.sdk.platformtools.o4.M(kk.k.g(str.getBytes()).toString() + "FileSelectorUI_LastSelectedTab").G("MMKV_KEY_NEED_DELETE_DB", true);
    }

    public boolean L0(r32.d dVar, boolean z17) {
        iz5.a.g(null, dVar != null);
        r32.d y07 = y0(new q32.d(dVar.field_rankID, dVar.field_appusername, dVar.field_username));
        if (y07 == null) {
            return false;
        }
        y07.field_likecount = dVar.field_likecount;
        y07.field_selfLikeState = dVar.field_selfLikeState;
        update(y07, "rankID", dm.i4.COL_USERNAME);
        if (z17) {
            com.tencent.mm.plugin.exdevice.model.l3.hj().a("HardDeviceRankInfo", new q32.d(dVar.field_rankID, dVar.field_appusername, dVar.field_username));
        }
        return true;
    }

    public r32.d y0(q32.d dVar) {
        r32.d dVar2 = null;
        if (dVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ExdeviceRankInfoStg", "hy: param error");
            return null;
        }
        java.lang.String format = java.lang.String.format("select *, rowid from %s where %s = ? and %s = ? limit 1", "HardDeviceRankInfo", "rankID", dm.i4.COL_USERNAME);
        java.lang.String[] strArr = new java.lang.String[2];
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        java.lang.String str = dVar.f359930a;
        if (str == null) {
            str = "";
        }
        strArr[0] = str;
        java.lang.String str2 = dVar.f359931b;
        strArr[1] = str2 != null ? str2 : "";
        android.database.Cursor f17 = this.f402464d.f(format, strArr, 2);
        if (f17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ExdeviceRankInfoStg", "Get no rank in DB");
            return null;
        }
        if (f17.moveToFirst()) {
            dVar2 = new r32.d();
            dVar2.convertFrom(f17);
        }
        f17.close();
        return dVar2;
    }

    public boolean z0(r32.d dVar, boolean z17) {
        if (L0(dVar, z17)) {
            return true;
        }
        insert(dVar);
        if (z17) {
            com.tencent.mm.plugin.exdevice.model.l3.hj().a("HardDeviceRankInfo", new q32.d(dVar.field_rankID, dVar.field_appusername, dVar.field_username));
        }
        return true;
    }
}
