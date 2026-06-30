package wz4;

/* loaded from: classes8.dex */
public class d extends l75.n0 {

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f450797f = {l75.n0.getCreateSQLs(wz4.c.N, "WepkgPreloadFiles")};

    /* renamed from: g, reason: collision with root package name */
    public static volatile wz4.d f450798g = null;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f450799d;

    /* renamed from: e, reason: collision with root package name */
    public final l75.k0 f450800e;

    public d(l75.k0 k0Var) {
        super(k0Var, wz4.c.N, "WepkgPreloadFiles", dm.oc.f239035v);
        this.f450800e = k0Var;
        boolean z17 = k0Var != null;
        this.f450799d = z17;
        if (z17) {
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.Wepkg.WepkgPreloadFilesStorage", "storage can not work!!!");
    }

    public static wz4.d J0() {
        if (!gm0.j1.a()) {
            return new wz4.d(null);
        }
        if (f450798g == null) {
            synchronized (wz4.d.class) {
                if (f450798g == null || !f450798g.f450799d) {
                    f450798g = new wz4.d(gm0.j1.u().f273153f);
                }
            }
        }
        return f450798g;
    }

    public wz4.c D0(java.lang.String str, java.lang.String str2) {
        if (this.f450799d && !com.tencent.mm.sdk.platformtools.t8.K0(str) && !com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            android.database.Cursor rawQuery = rawQuery(java.lang.String.format("select * from %s where %s=?", "WepkgPreloadFiles", "key"), com.tencent.mm.plugin.wepkg.utils.n.c(str, str2));
            if (rawQuery.moveToFirst()) {
                wz4.c cVar = new wz4.c();
                cVar.convertFrom(rawQuery);
                rawQuery.close();
                com.tencent.mars.xlog.Log.i("MicroMsg.Wepkg.WepkgPreloadFilesStorage", "getRecordByRid exist record in DB, pkgid:%s, rid:%s, version:%s", cVar.field_pkgId, cVar.field_rid, cVar.field_version);
                return cVar;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.Wepkg.WepkgPreloadFilesStorage", "getRecordByRid pkgid:%s, rid:%s, no record in DB", str, str2);
            rawQuery.close();
        }
        return null;
    }

    public boolean L0(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z17) {
        wz4.c D0;
        if (!this.f450799d || com.tencent.mm.sdk.platformtools.t8.K0(str) || com.tencent.mm.sdk.platformtools.t8.K0(str2) || (D0 = D0(str, str2)) == null) {
            return false;
        }
        D0.field_completeDownload = z17;
        D0.field_filePath = str3;
        boolean update = super.update(D0, new java.lang.String[0]);
        com.tencent.mars.xlog.Log.i("MicroMsg.Wepkg.WepkgPreloadFilesStorage", "updateDownloadCompleteState pkgid:%s, rid:%s, completeDownload:%s, filePath:%s, ret:%s", str, str2, java.lang.Boolean.valueOf(z17), str3, java.lang.Boolean.valueOf(update));
        return update;
    }

    public boolean y0(java.lang.String str) {
        if (!this.f450799d || com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return false;
        }
        wz4.c cVar = new wz4.c();
        cVar.field_pkgId = str;
        boolean delete = super.delete(cVar, "pkgId");
        com.tencent.mars.xlog.Log.i("MicroMsg.Wepkg.WepkgPreloadFilesStorage", "deleteRecordByPkgid pkgid:%s, ret:%s", str, java.lang.Boolean.valueOf(delete));
        return delete;
    }

    public java.util.List z0(java.lang.String str) {
        if (!this.f450799d && com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return null;
        }
        java.lang.String format = java.lang.String.format("select * from %s where %s=? and %s=0", "WepkgPreloadFiles", "pkgId", "completeDownload");
        android.database.Cursor rawQuery = rawQuery(format, str);
        com.tencent.mars.xlog.Log.i("MicroMsg.Wepkg.WepkgPreloadFilesStorage", "getNeedDownloadPreLoadFileList queryStr:%s", format);
        if (rawQuery == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Wepkg.WepkgPreloadFilesStorage", "cursor is null");
            return null;
        }
        if (!rawQuery.moveToFirst()) {
            rawQuery.close();
            com.tencent.mars.xlog.Log.i("MicroMsg.Wepkg.WepkgPreloadFilesStorage", "no record");
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        do {
            com.tencent.mm.plugin.wepkg.model.WepkgPreloadFile wepkgPreloadFile = new com.tencent.mm.plugin.wepkg.model.WepkgPreloadFile();
            wz4.c cVar = new wz4.c();
            cVar.convertFrom(rawQuery);
            wepkgPreloadFile.b(cVar);
            arrayList.add(wepkgPreloadFile);
        } while (rawQuery.moveToNext());
        rawQuery.close();
        com.tencent.mars.xlog.Log.i("MicroMsg.Wepkg.WepkgPreloadFilesStorage", "record list size:%s", java.lang.Integer.valueOf(arrayList.size()));
        return arrayList;
    }
}
