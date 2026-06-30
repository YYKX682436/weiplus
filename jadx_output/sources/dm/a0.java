package dm;

/* loaded from: classes7.dex */
public class a0 extends l75.f0 {
    public static final o75.e A;

    /* renamed from: o, reason: collision with root package name */
    public static final p75.n0 f235524o;

    /* renamed from: p, reason: collision with root package name */
    public static final java.lang.String[] f235525p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f235526q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f235527r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f235528s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f235529t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f235530u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f235531v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f235532w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f235533x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f235534y;

    /* renamed from: z, reason: collision with root package name */
    public static final l75.e0 f235535z;
    public java.lang.String field_appPath;
    public java.lang.String field_brandId;
    public int field_recordId;
    public int field_scene;
    public java.lang.String field_thirdPartyAppUsingDesc;
    public long field_updateTime;
    public boolean field_usedInThirdPartyAppRecently;
    public int field_versionType;

    /* renamed from: d, reason: collision with root package name */
    public boolean f235536d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f235537e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f235538f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f235539g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f235540h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f235541i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f235542m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f235543n = true;

    static {
        p75.n0 n0Var = new p75.n0("AppBrandLauncherLayoutItem");
        f235524o = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f235525p = new java.lang.String[]{"CREATE INDEX IF NOT EXISTS AppBrandLauncherLayoutItemUpdateTimeIndex ON AppBrandLauncherLayoutItem(updateTime)", "CREATE INDEX IF NOT EXISTS AppBrandLauncherLayoutItemSceneIndex ON AppBrandLauncherLayoutItem(scene)"};
        f235526q = -799234740;
        f235527r = 137727746;
        f235528s = 689108018;
        f235529t = -295931082;
        f235530u = 109254796;
        f235531v = 1790162568;
        f235532w = -1987034253;
        f235533x = -794076698;
        f235534y = 108705909;
        f235535z = initAutoDBInfo(dm.a0.class);
        A = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[8];
        java.lang.String[] strArr = new java.lang.String[9];
        e0Var.f316954c = strArr;
        strArr[0] = "recordId";
        e0Var.f316955d.put("recordId", "INTEGER PRIMARY KEY ");
        e0Var.f316953b = "recordId";
        e0Var.f316954c[1] = "brandId";
        e0Var.f316955d.put("brandId", "TEXT");
        e0Var.f316954c[2] = "versionType";
        e0Var.f316955d.put("versionType", "INTEGER");
        e0Var.f316954c[3] = dm.i4.COL_UPDATETIME;
        e0Var.f316955d.put(dm.i4.COL_UPDATETIME, "LONG");
        e0Var.f316954c[4] = com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE;
        e0Var.f316955d.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "INTEGER");
        e0Var.f316954c[5] = "usedInThirdPartyAppRecently";
        e0Var.f316955d.put("usedInThirdPartyAppRecently", "INTEGER default 'false' ");
        e0Var.f316954c[6] = "thirdPartyAppUsingDesc";
        e0Var.f316955d.put("thirdPartyAppUsingDesc", "TEXT");
        e0Var.f316954c[7] = "appPath";
        e0Var.f316955d.put("appPath", "TEXT");
        e0Var.f316954c[8] = "rowid";
        e0Var.f316956e = " recordId INTEGER PRIMARY KEY ,  brandId TEXT,  versionType INTEGER,  updateTime LONG,  scene INTEGER,  usedInThirdPartyAppRecently INTEGER default 'false' ,  thirdPartyAppUsingDesc TEXT,  appPath TEXT";
        if (e0Var.f316953b == null) {
            e0Var.f316953b = "rowid";
        }
        return e0Var;
    }

    @Override // l75.f0
    public void convertFrom(android.database.Cursor cursor) {
        java.lang.String[] columnNames = cursor.getColumnNames();
        if (columnNames == null) {
            return;
        }
        int length = columnNames.length;
        for (int i17 = 0; i17 < length; i17++) {
            int hashCode = columnNames[i17].hashCode();
            boolean z17 = true;
            if (f235526q == hashCode) {
                try {
                    this.field_recordId = cursor.getInt(i17);
                    this.f235536d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandLauncherLayoutItem", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f235527r == hashCode) {
                try {
                    this.field_brandId = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandLauncherLayoutItem", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f235528s == hashCode) {
                try {
                    this.field_versionType = cursor.getInt(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandLauncherLayoutItem", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f235529t == hashCode) {
                try {
                    this.field_updateTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandLauncherLayoutItem", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f235530u == hashCode) {
                try {
                    this.field_scene = cursor.getInt(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandLauncherLayoutItem", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f235531v == hashCode) {
                try {
                    if (cursor.getInt(i17) == 0) {
                        z17 = false;
                    }
                    this.field_usedInThirdPartyAppRecently = z17;
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandLauncherLayoutItem", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f235532w == hashCode) {
                try {
                    this.field_thirdPartyAppUsingDesc = cursor.getString(i17);
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandLauncherLayoutItem", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f235533x == hashCode) {
                try {
                    this.field_appPath = cursor.getString(i17);
                } catch (java.lang.Throwable th13) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandLauncherLayoutItem", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f235534y == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f235536d) {
            contentValues.put("recordId", java.lang.Integer.valueOf(this.field_recordId));
        }
        if (this.f235537e) {
            contentValues.put("brandId", this.field_brandId);
        }
        if (this.f235538f) {
            contentValues.put("versionType", java.lang.Integer.valueOf(this.field_versionType));
        }
        if (this.f235539g) {
            contentValues.put(dm.i4.COL_UPDATETIME, java.lang.Long.valueOf(this.field_updateTime));
        }
        if (this.f235540h) {
            contentValues.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, java.lang.Integer.valueOf(this.field_scene));
        }
        if (this.f235541i) {
            if (this.field_usedInThirdPartyAppRecently) {
                contentValues.put("usedInThirdPartyAppRecently", (java.lang.Integer) 1);
            } else {
                contentValues.put("usedInThirdPartyAppRecently", (java.lang.Integer) 0);
            }
        }
        if (this.f235542m) {
            contentValues.put("thirdPartyAppUsingDesc", this.field_thirdPartyAppUsingDesc);
        }
        if (this.f235543n) {
            contentValues.put("appPath", this.field_appPath);
        }
        long j17 = this.systemRowid;
        if (j17 > 0) {
            contentValues.put("rowid", java.lang.Long.valueOf(j17));
        }
        return contentValues;
    }

    @Override // l75.f0
    public void createMyTable(l75.k0 k0Var) {
        if (k0Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseAppBrandLauncherLayoutItem", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS AppBrandLauncherLayoutItem ( ");
        l75.e0 e0Var = f235535z;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f235525p) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseAppBrandLauncherLayoutItem", "createTableSql %s", str2);
            k0Var.A("AppBrandLauncherLayoutItem", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "AppBrandLauncherLayoutItem", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseAppBrandLauncherLayoutItem", "updateTableSql %s", str3);
            k0Var.A("AppBrandLauncherLayoutItem", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseAppBrandLauncherLayoutItem", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f235535z;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return A;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return java.lang.Integer.valueOf(this.field_recordId);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f235524o;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f235524o.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("recordId")) {
            this.field_recordId = contentValues.getAsInteger("recordId").intValue();
            if (z17) {
                this.f235536d = true;
            }
        }
        if (contentValues.containsKey("brandId")) {
            this.field_brandId = contentValues.getAsString("brandId");
            if (z17) {
                this.f235537e = true;
            }
        }
        if (contentValues.containsKey("versionType")) {
            this.field_versionType = contentValues.getAsInteger("versionType").intValue();
            if (z17) {
                this.f235538f = true;
            }
        }
        if (contentValues.containsKey(dm.i4.COL_UPDATETIME)) {
            this.field_updateTime = contentValues.getAsLong(dm.i4.COL_UPDATETIME).longValue();
            if (z17) {
                this.f235539g = true;
            }
        }
        if (contentValues.containsKey(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE)) {
            this.field_scene = contentValues.getAsInteger(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE).intValue();
            if (z17) {
                this.f235540h = true;
            }
        }
        if (contentValues.containsKey("usedInThirdPartyAppRecently")) {
            this.field_usedInThirdPartyAppRecently = contentValues.getAsInteger("usedInThirdPartyAppRecently").intValue() != 0;
            if (z17) {
                this.f235541i = true;
            }
        }
        if (contentValues.containsKey("thirdPartyAppUsingDesc")) {
            this.field_thirdPartyAppUsingDesc = contentValues.getAsString("thirdPartyAppUsingDesc");
            if (z17) {
                this.f235542m = true;
            }
        }
        if (contentValues.containsKey("appPath")) {
            this.field_appPath = contentValues.getAsString("appPath");
            if (z17) {
                this.f235543n = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
