package s32;

/* loaded from: classes12.dex */
public class b extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f402460e = {l75.n0.getCreateSQLs(r32.a.f368959r, "HardDeviceChampionInfo")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f402461d;

    public b(l75.k0 k0Var) {
        super(k0Var, r32.a.f368959r, "HardDeviceChampionInfo", null);
        this.f402461d = k0Var;
        k0Var.A("HardDeviceChampionInfo", "CREATE INDEX IF NOT EXISTS ExdeviceRankChampionInfoRankIdAppNameIndex ON HardDeviceChampionInfo ( username )");
    }

    public r32.a y0(java.lang.String str) {
        java.lang.String format = java.lang.String.format("select *, rowid from %s where %s = ? limit 1", "HardDeviceChampionInfo", dm.i4.COL_USERNAME);
        java.lang.String[] strArr = new java.lang.String[1];
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        strArr[0] = str;
        android.database.Cursor f17 = this.f402461d.f(format, strArr, 2);
        r32.a aVar = null;
        if (f17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ExdeviceRankChampionStg", "Get no rank in DB");
            return null;
        }
        if (f17.moveToFirst()) {
            aVar = new r32.a();
            aVar.convertFrom(f17);
        }
        f17.close();
        return aVar;
    }

    public boolean z0(r32.a aVar, boolean z17) {
        iz5.a.g(null, aVar != null);
        if (update(aVar, dm.i4.COL_USERNAME)) {
            if (z17) {
                com.tencent.mm.plugin.exdevice.model.l3.hj().a("HardDeviceChampionInfo", new q32.d(null, null, aVar.field_username));
            }
            return true;
        }
        if (!insert(aVar)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ExdeviceRankChampionStg", "hy: insert or update failed");
            return false;
        }
        if (z17) {
            com.tencent.mm.plugin.exdevice.model.l3.hj().a("HardDeviceChampionInfo", new q32.d(null, null, aVar.field_username));
        }
        return true;
    }
}
