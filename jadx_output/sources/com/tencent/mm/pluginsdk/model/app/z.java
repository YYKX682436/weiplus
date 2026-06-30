package com.tencent.mm.pluginsdk.model.app;

/* loaded from: classes8.dex */
public class z extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f189169e = {l75.n0.getCreateSQLs(com.tencent.mm.pluginsdk.model.app.m.f188983f2, "AppInfo")};

    /* renamed from: d, reason: collision with root package name */
    public final kk.j f189170d;

    public z(l75.k0 k0Var) {
        super(k0Var, com.tencent.mm.pluginsdk.model.app.m.f188983f2, "AppInfo", dm.m0.f238367z1);
        this.f189170d = new jt0.j(50);
        com.tencent.mm.pluginsdk.model.app.m mVar = new com.tencent.mm.pluginsdk.model.app.m();
        mVar.field_appId = "wx4310bbd51be7d979";
        if (super.get(mVar, new java.lang.String[0])) {
            return;
        }
        com.tencent.mm.pluginsdk.model.app.m mVar2 = new com.tencent.mm.pluginsdk.model.app.m();
        mVar2.field_appId = "wx4310bbd51be7d979";
        mVar2.field_appName = "weixinfile";
        mVar2.field_packageName = "com.tencent.mm.openapi";
        mVar2.field_status = -1;
        super.insert(mVar2);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x007d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String D0(java.lang.String r12, int r13) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.pluginsdk.model.app.z.D0(java.lang.String, int):java.lang.String");
    }

    public java.lang.String J0(com.tencent.mm.pluginsdk.model.app.m mVar, java.lang.String str, int i17) {
        if (mVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppInfoStorage", "getIconUrl, appInfo does not exist, appId: %s", str);
            return null;
        }
        if (!mVar.field_appId.equals(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppInfoStorage", "getIconUrl, appInfo.appId: %s not equal appId %s", mVar.field_appId, str);
            return null;
        }
        if (i17 == 1) {
            return mVar.field_appIconUrl;
        }
        if (i17 == 2) {
            return mVar.field_appWatermarkUrl;
        }
        if (i17 == 3) {
            return mVar.R;
        }
        if (i17 == 4) {
            return mVar.f238393y0;
        }
        if (i17 == 5) {
            return mVar.f238375l1;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.AppInfoStorage", "hasIconUrl, unknown iconType: %s", java.lang.Integer.valueOf(i17));
        return null;
    }

    public android.database.Cursor L0(int i17, int i18) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(256);
        sb6.append("select * from AppInfo where ");
        if (i17 != 0) {
            sb6.append(" ( serviceAppInfoFlag & ");
            sb6.append(i17);
            sb6.append(" ) != 0 and ");
        }
        sb6.append(" ( serviceShowFlag & ");
        sb6.append(i18);
        sb6.append(" ) != 0");
        android.database.Cursor rawQuery = rawQuery(sb6.toString(), new java.lang.String[0]);
        if (rawQuery != null) {
            return rawQuery;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.AppInfoStorage", "getServiceByAppInfoFlagAndShowFlag : cursor is null");
        return null;
    }

    @Override // l75.n0, l75.g0
    /* renamed from: P0, reason: merged with bridge method [inline-methods] */
    public boolean insert(com.tencent.mm.pluginsdk.model.app.m mVar) {
        if (mVar != null && !com.tencent.mm.sdk.platformtools.t8.K0(mVar.field_appId)) {
            l75.e0 e0Var = com.tencent.mm.pluginsdk.model.app.m.f188983f2;
            if ("wxce6f23b478a3a2a2".equals(mVar.field_appId) || "wx6fa7e3bab7e15415".equals(mVar.field_appId)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppInfoStorage", "insert appinfo: %s, %s, %s, %s, %s", mVar.field_appId, mVar.field_appName, java.lang.Integer.valueOf(mVar.field_serviceShowFlag), java.lang.Integer.valueOf(mVar.field_appInfoFlag), new com.tencent.mm.sdk.platformtools.z3());
            }
            if (super.insertNotify(mVar, false)) {
                java.lang.String str = mVar.field_appId;
                doNotify(str, 2, str);
                java.lang.String str2 = mVar.field_appId;
                if (str2 == null) {
                    return true;
                }
                ((lt0.f) this.f189170d).j(str2, mVar);
                return true;
            }
        }
        return false;
    }

    @Override // l75.n0, l75.g0
    /* renamed from: W0, reason: merged with bridge method [inline-methods] */
    public boolean update(com.tencent.mm.pluginsdk.model.app.m mVar, java.lang.String... strArr) {
        if (mVar == null || com.tencent.mm.sdk.platformtools.t8.K0(mVar.field_appId)) {
            return false;
        }
        l75.e0 e0Var = com.tencent.mm.pluginsdk.model.app.m.f188983f2;
        if ("wxce6f23b478a3a2a2".equals(mVar.field_appId) || "wx6fa7e3bab7e15415".equals(mVar.field_appId)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppInfoStorage", "update appinfo: %s, %s, %s, %s, %s", mVar.field_appId, mVar.field_appName, java.lang.Integer.valueOf(mVar.field_serviceShowFlag), java.lang.Integer.valueOf(mVar.field_appInfoFlag), new com.tencent.mm.sdk.platformtools.z3());
        }
        java.lang.String str = mVar.field_appId;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            ((lt0.f) this.f189170d).remove(str);
        }
        boolean updateNotify = super.updateNotify(mVar, false, strArr);
        if (updateNotify) {
            doNotify(mVar.field_appId + "", 3, mVar.field_appId);
        }
        return updateNotify;
    }

    @Override // l75.n0
    /* renamed from: y0, reason: merged with bridge method [inline-methods] */
    public boolean delete(com.tencent.mm.pluginsdk.model.app.m mVar, java.lang.String... strArr) {
        if (mVar == null || com.tencent.mm.sdk.platformtools.t8.K0(mVar.field_appId)) {
            return false;
        }
        l75.e0 e0Var = com.tencent.mm.pluginsdk.model.app.m.f188983f2;
        if ("wxce6f23b478a3a2a2".equals(mVar.field_appId) || "wx6fa7e3bab7e15415".equals(mVar.field_appId)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppInfoStorage", "delete appinfo: %s, %s, %s, %s, %s", mVar.field_appId, mVar.field_appName, java.lang.Integer.valueOf(mVar.field_serviceShowFlag), java.lang.Integer.valueOf(mVar.field_appInfoFlag), new com.tencent.mm.sdk.platformtools.z3());
        }
        java.lang.String str = mVar.field_appId;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            ((lt0.f) this.f189170d).remove(str);
        }
        boolean delete = super.delete((l75.f0) mVar, false, strArr);
        if (delete) {
            doNotify(mVar.field_appId + "", 5, mVar.field_appId);
        }
        return delete;
    }

    public com.tencent.mm.pluginsdk.model.app.m z0(java.lang.String str) {
        if (str == null || str.length() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppInfoStorage", "appId is null");
            return null;
        }
        kk.j jVar = this.f189170d;
        com.tencent.mm.pluginsdk.model.app.m mVar = (com.tencent.mm.pluginsdk.model.app.m) ((lt0.f) jVar).i(str);
        if (mVar == null) {
            mVar = null;
        }
        if (mVar != null && !com.tencent.mm.sdk.platformtools.t8.K0(mVar.field_appId)) {
            return mVar;
        }
        com.tencent.mm.pluginsdk.model.app.m mVar2 = new com.tencent.mm.pluginsdk.model.app.m();
        mVar2.field_appId = str;
        if (!super.get(mVar2, new java.lang.String[0])) {
            return null;
        }
        java.lang.String str2 = mVar2.field_appId;
        if (str2 != null) {
            ((lt0.f) jVar).j(str2, mVar2);
        }
        return mVar2;
    }
}
