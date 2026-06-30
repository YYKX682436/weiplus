package wz4;

/* loaded from: classes8.dex */
public class f extends l75.n0 {

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f450801f = {l75.n0.getCreateSQLs(wz4.e.C1, "WepkgVersion")};

    /* renamed from: g, reason: collision with root package name */
    public static volatile wz4.f f450802g = null;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f450803d;

    /* renamed from: e, reason: collision with root package name */
    public final l75.k0 f450804e;

    public f(l75.k0 k0Var) {
        super(k0Var, wz4.e.C1, "WepkgVersion", dm.pc.G);
        this.f450804e = k0Var;
        boolean z17 = k0Var != null;
        this.f450803d = z17;
        if (z17) {
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.Wepkg.WepkgVersionStorage", "storage can not work!!!");
    }

    public static wz4.f L0() {
        if (!gm0.j1.a()) {
            return new wz4.f(null);
        }
        if (f450802g == null) {
            synchronized (wz4.f.class) {
                if (f450802g == null || !f450802g.f450803d) {
                    f450802g = new wz4.f(gm0.j1.u().f273153f);
                }
            }
        }
        return f450802g;
    }

    public wz4.e D0(java.lang.String str) {
        if (this.f450803d && !com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            android.database.Cursor rawQuery = rawQuery(java.lang.String.format("select * from %s where %s=?", "WepkgVersion", "pkgId"), str);
            if (rawQuery.moveToFirst()) {
                wz4.e eVar = new wz4.e();
                eVar.convertFrom(rawQuery);
                rawQuery.close();
                com.tencent.mars.xlog.Log.i("MicroMsg.Wepkg.WepkgVersionStorage", "getRecordByPkgid exist record in DB, pkgid:%s, version:%s", eVar.field_pkgId, eVar.field_version);
                return eVar;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.Wepkg.WepkgVersionStorage", "getRecordByPkgid pkgid:%s, no record in DB", str);
            rawQuery.close();
        }
        return null;
    }

    public wz4.e J0(java.lang.String str) {
        if (this.f450803d && !com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            android.database.Cursor rawQuery = rawQuery(java.lang.String.format("select * from %s where %s=? and %s=0", "WepkgVersion", "pkgId", "disable"), str);
            if (rawQuery.moveToFirst()) {
                wz4.e eVar = new wz4.e();
                eVar.convertFrom(rawQuery);
                rawQuery.close();
                com.tencent.mars.xlog.Log.i("MicroMsg.Wepkg.WepkgVersionStorage", "getRecordByPkgidWithAble exist record in DB, pkgid:%s, version:%s, disableWvCache:%s, clearPkgTime:%s, checkIntervalTime:%s, domain:%s, bigPackageReady:%s, preloadFilesReady:%s, preloadFilesAtomic:%s, disable:%s", eVar.field_pkgId, eVar.field_version, java.lang.Boolean.valueOf(eVar.field_disableWvCache), java.lang.Long.valueOf(eVar.field_clearPkgTime), java.lang.Long.valueOf(eVar.field_checkIntervalTime), eVar.field_domain, java.lang.Boolean.valueOf(eVar.field_bigPackageReady), java.lang.Boolean.valueOf(eVar.field_preloadFilesReady), java.lang.Boolean.valueOf(eVar.field_preloadFilesAtomic), java.lang.Boolean.valueOf(eVar.field_disable));
                java.lang.Object obj = com.tencent.mm.plugin.wepkg.utils.n.f188501a;
                eVar.field_accessTime = com.tencent.mm.sdk.platformtools.t8.i1();
                super.update(eVar, new java.lang.String[0]);
                return eVar;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.Wepkg.WepkgVersionStorage", "getRecordByPkgidWithAble pkgid:%s, no record in DB", str);
            rawQuery.close();
        }
        return null;
    }

    public boolean P0(java.lang.String str) {
        if (!this.f450803d || com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return false;
        }
        wz4.e D0 = D0(str);
        if (D0 == null) {
            return true;
        }
        D0.field_disable = true;
        boolean update = super.update(D0, new java.lang.String[0]);
        com.tencent.mars.xlog.Log.i("MicroMsg.Wepkg.WepkgVersionStorage", "setWepkgDisable pkgid:%s, ret:%s", str, java.lang.Boolean.valueOf(update));
        return update;
    }

    public boolean W0(java.lang.String str, java.lang.String str2, boolean z17) {
        wz4.e D0;
        if (!this.f450803d || com.tencent.mm.sdk.platformtools.t8.K0(str) || (D0 = D0(str)) == null) {
            return false;
        }
        D0.field_bigPackageReady = z17;
        D0.field_pkgPath = str2;
        boolean update = super.update(D0, new java.lang.String[0]);
        com.tencent.mars.xlog.Log.i("MicroMsg.Wepkg.WepkgVersionStorage", "updateBigPackageReady pkgid:%s, pkgPath:%s, bigPackageReady:%b, ret:%s", str, str2, java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(update));
        return update;
    }

    public boolean b1(java.lang.String str) {
        wz4.e D0;
        if (!this.f450803d || (D0 = D0(str)) == null) {
            return false;
        }
        java.lang.Object obj = com.tencent.mm.plugin.wepkg.utils.n.f188501a;
        D0.field_nextCheckTime = com.tencent.mm.sdk.platformtools.t8.i1() + D0.field_checkIntervalTime;
        boolean update = super.update(D0, new java.lang.String[0]);
        com.tencent.mars.xlog.Log.i("MicroMsg.Wepkg.WepkgVersionStorage", "updateCheckTime pkgid:%s, ret:%s", str, java.lang.Boolean.valueOf(update));
        return update;
    }

    public boolean d1(java.lang.String str, boolean z17, long j17, long j18) {
        wz4.e D0;
        if (!this.f450803d || (D0 = D0(str)) == null) {
            return false;
        }
        D0.field_disableWvCache = z17;
        D0.field_clearPkgTime = j17;
        D0.field_nextCheckTime = (D0.field_nextCheckTime - D0.field_checkIntervalTime) + j18;
        D0.field_checkIntervalTime = j18;
        D0.field_disable = false;
        boolean update = super.update(D0, new java.lang.String[0]);
        com.tencent.mars.xlog.Log.i("MicroMsg.Wepkg.WepkgVersionStorage", "updateConfigInfo pkgid:%s, disableWvCache:%s, clearPkgTime:%s, checkIntervalTime:%s, ret:%s", str, java.lang.Boolean.valueOf(z17), java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18), java.lang.Boolean.valueOf(update));
        return update;
    }

    public boolean f1(java.lang.String str) {
        wz4.e D0;
        if (!this.f450803d || com.tencent.mm.sdk.platformtools.t8.K0(str) || (D0 = D0(str)) == null) {
            return false;
        }
        D0.field_createTime = 0L;
        boolean update = super.update(D0, new java.lang.String[0]);
        com.tencent.mars.xlog.Log.i("MicroMsg.Wepkg.WepkgVersionStorage", "updateCreateTimeToZero pkgid:%s, ret:%s", str, java.lang.Boolean.valueOf(update));
        return update;
    }

    public boolean i1(java.lang.String str, boolean z17) {
        wz4.e D0;
        if (!this.f450803d || com.tencent.mm.sdk.platformtools.t8.K0(str) || (D0 = D0(str)) == null) {
            return false;
        }
        D0.field_preloadFilesReady = z17;
        boolean update = super.update(D0, new java.lang.String[0]);
        com.tencent.mars.xlog.Log.i("MicroMsg.Wepkg.WepkgVersionStorage", "updatePreloadFilesReady pkgid:%s, preloadFilesReady:%b, ret:%s", str, java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(update));
        return update;
    }

    public final boolean y0(java.lang.String str) {
        if (!this.f450803d || com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Wepkg.WepkgVersionStorage", "WepkgVersionRecord addAutoDownloadCount ret:%s", java.lang.Boolean.valueOf(execSQL("WepkgVersion", java.lang.String.format("update %s set %s=%s+1 where %s='%s'", "WepkgVersion", "autoDownloadCount", "autoDownloadCount", "pkgId", str))));
        return true;
    }

    public boolean z0(java.lang.String str) {
        if (!this.f450803d || com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return false;
        }
        wz4.e eVar = new wz4.e();
        eVar.field_pkgId = str;
        boolean delete = super.delete(eVar, new java.lang.String[0]);
        com.tencent.mars.xlog.Log.i("MicroMsg.Wepkg.WepkgVersionStorage", "deleteRecordByPkgid pkgid:%s, ret:%s", str, java.lang.Boolean.valueOf(delete));
        return delete;
    }
}
