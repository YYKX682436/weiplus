package q43;

/* loaded from: classes8.dex */
public final class j extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f360099e = {l75.n0.getCreateSQLs(q43.a.F, "GameResourceDownload")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f360100d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(l75.k0 db6) {
        super(db6, q43.a.F, "GameResourceDownload", dm.u5.f240302r);
        kotlin.jvm.internal.o.g(db6, "db");
        l75.e0 e0Var = q43.a.F;
        this.f360100d = db6;
    }

    public final void D0(java.lang.String packageName, java.lang.String appId, int i17, int i18, long j17, int i19, n33.d gameResDownloadList) {
        kotlin.jvm.internal.o.g(packageName, "packageName");
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(gameResDownloadList, "gameResDownloadList");
        q43.a aVar = new q43.a();
        aVar.field_packageName = packageName;
        aVar.field_appId = appId;
        aVar.field_intervalSeconds = i17;
        aVar.field_expiredSeconds = i18;
        aVar.field_taskExpiredSeconds = j17;
        aVar.field_scene = i19;
        aVar.field_createTime = com.tencent.mm.sdk.platformtools.t8.i1();
        aVar.field_checkCgiTime = com.tencent.mm.sdk.platformtools.t8.i1();
        aVar.field_finishDownloadTime = com.tencent.mm.sdk.platformtools.t8.i1();
        aVar.field_downloadItemList = gameResDownloadList.toByteArray();
        com.tencent.mars.xlog.Log.i("MicroMsg.GameResourceDownloadStorage", "insert db ret:" + ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Vi().insert(aVar) + ", packageName:" + packageName + ", interval:" + i17 + ", expiredTime:" + i18);
        q43.g.f360094a.g();
    }

    public final void J0(java.lang.String packageName, int i17, int i18, n33.d gameResDownloadList) {
        kotlin.jvm.internal.o.g(packageName, "packageName");
        kotlin.jvm.internal.o.g(gameResDownloadList, "gameResDownloadList");
        com.tencent.mars.xlog.Log.i("MicroMsg.GameResourceDownloadStorage", "updateItemTime, packageName:".concat(packageName));
        q43.a z07 = z0(packageName);
        if (z07 != null) {
            z07.field_checkCgiTime = com.tencent.mm.sdk.platformtools.t8.i1();
            z07.field_intervalSeconds = i17;
            z07.field_downloadItemList = gameResDownloadList.toByteArray();
            z07.field_expiredSeconds = i18;
            update(z07, new java.lang.String[0]);
        }
        q43.g.f360094a.g();
    }

    public final void L0(java.lang.String packageName, int i17, long j17, int i18) {
        kotlin.jvm.internal.o.g(packageName, "packageName");
        com.tencent.mars.xlog.Log.i("MicroMsg.GameResourceDownloadStorage", "updateItemTime, packageName:".concat(packageName));
        q43.a z07 = z0(packageName);
        if (z07 != null) {
            z07.field_checkCgiTime = j17;
            z07.field_intervalSeconds = i17;
            z07.field_expiredSeconds = i18;
            update(z07, new java.lang.String[0]);
        }
        q43.g.f360094a.g();
    }

    public final boolean y0(java.lang.String packageName) {
        kotlin.jvm.internal.o.g(packageName, "packageName");
        java.lang.String str = "delete from GameResourceDownload where packageName=\"" + packageName + '\"';
        boolean execSQL = execSQL("GameResourceDownload", str);
        com.tencent.mars.xlog.Log.i("MicroMsg.GameResourceDownloadStorage", "delDownloadInfo, sql:" + str + ", ret:" + execSQL);
        q43.g.f360094a.g();
        return execSQL;
    }

    public final q43.a z0(java.lang.String packageName) {
        kotlin.jvm.internal.o.g(packageName, "packageName");
        q43.a aVar = null;
        if (packageName.length() == 0) {
            return null;
        }
        java.lang.String str = "select * from GameResourceDownload where packageName=\"" + packageName + '\"';
        com.tencent.mars.xlog.Log.i("MicroMsg.GameResourceDownloadStorage", "getDownloadStage, sql : %s", str);
        android.database.Cursor rawQuery = rawQuery(str, new java.lang.String[0]);
        if (rawQuery == null) {
            return null;
        }
        if (rawQuery.moveToNext()) {
            aVar = new q43.a();
            aVar.convertFrom(rawQuery);
        }
        rawQuery.close();
        return aVar;
    }
}
