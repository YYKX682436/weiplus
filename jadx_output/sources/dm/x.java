package dm;

/* loaded from: classes4.dex */
public class x extends l75.f0 {

    /* renamed from: i, reason: collision with root package name */
    public static final p75.n0 f240933i;

    /* renamed from: m, reason: collision with root package name */
    public static final java.lang.String[] f240934m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f240935n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f240936o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f240937p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f240938q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f240939r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f240940s;

    /* renamed from: t, reason: collision with root package name */
    public static final l75.e0 f240941t;

    /* renamed from: u, reason: collision with root package name */
    public static final o75.e f240942u;
    public java.lang.String field_appId;
    public int field_appVersion;
    public boolean field_isDarkMode;
    public java.lang.String field_screenshotFilePath;
    public int field_versionType;

    /* renamed from: d, reason: collision with root package name */
    public boolean f240943d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f240944e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f240945f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f240946g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f240947h = true;

    static {
        p75.n0 n0Var = new p75.n0("AppBrandFakeNativeSplashScreenshot");
        f240933i = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f240934m = new java.lang.String[]{"CREATE INDEX IF NOT EXISTS AppBrandFakeNativeSplashScreenshotAPPIDINDEX ON AppBrandFakeNativeSplashScreenshot(appId)"};
        f240935n = 93028124;
        f240936o = 689108018;
        f240937p = 1484112759;
        f240938q = 947558787;
        f240939r = -484584633;
        f240940s = 108705909;
        f240941t = initAutoDBInfo(dm.x.class);
        f240942u = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[5];
        java.lang.String[] strArr = new java.lang.String[6];
        e0Var.f316954c = strArr;
        strArr[0] = "appId";
        e0Var.f316955d.put("appId", "TEXT");
        e0Var.f316954c[1] = "versionType";
        e0Var.f316955d.put("versionType", "INTEGER default '0' ");
        e0Var.f316954c[2] = "appVersion";
        e0Var.f316955d.put("appVersion", "INTEGER default '0' ");
        e0Var.f316954c[3] = "isDarkMode";
        e0Var.f316955d.put("isDarkMode", "INTEGER default 'false' ");
        e0Var.f316954c[4] = "screenshotFilePath";
        e0Var.f316955d.put("screenshotFilePath", "TEXT");
        e0Var.f316954c[5] = "rowid";
        e0Var.f316956e = " appId TEXT,  versionType INTEGER default '0' ,  appVersion INTEGER default '0' ,  isDarkMode INTEGER default 'false' ,  screenshotFilePath TEXT";
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
            if (f240935n == hashCode) {
                try {
                    this.field_appId = cursor.getString(i17);
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandFakeNativeSplashScreenshot", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240936o == hashCode) {
                try {
                    this.field_versionType = cursor.getInt(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandFakeNativeSplashScreenshot", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240937p == hashCode) {
                try {
                    this.field_appVersion = cursor.getInt(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandFakeNativeSplashScreenshot", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240938q == hashCode) {
                try {
                    this.field_isDarkMode = cursor.getInt(i17) != 0;
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandFakeNativeSplashScreenshot", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240939r == hashCode) {
                try {
                    this.field_screenshotFilePath = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandFakeNativeSplashScreenshot", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240940s == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f240943d) {
            contentValues.put("appId", this.field_appId);
        }
        if (this.f240944e) {
            contentValues.put("versionType", java.lang.Integer.valueOf(this.field_versionType));
        }
        if (this.f240945f) {
            contentValues.put("appVersion", java.lang.Integer.valueOf(this.field_appVersion));
        }
        if (this.f240946g) {
            if (this.field_isDarkMode) {
                contentValues.put("isDarkMode", (java.lang.Integer) 1);
            } else {
                contentValues.put("isDarkMode", (java.lang.Integer) 0);
            }
        }
        if (this.f240947h) {
            contentValues.put("screenshotFilePath", this.field_screenshotFilePath);
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseAppBrandFakeNativeSplashScreenshot", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS AppBrandFakeNativeSplashScreenshot ( ");
        l75.e0 e0Var = f240941t;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f240934m) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseAppBrandFakeNativeSplashScreenshot", "createTableSql %s", str2);
            k0Var.A("AppBrandFakeNativeSplashScreenshot", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "AppBrandFakeNativeSplashScreenshot", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseAppBrandFakeNativeSplashScreenshot", "updateTableSql %s", str3);
            k0Var.A("AppBrandFakeNativeSplashScreenshot", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseAppBrandFakeNativeSplashScreenshot", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f240941t;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f240942u;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return java.lang.Long.valueOf(this.systemRowid);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f240933i;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f240933i.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("appId")) {
            this.field_appId = contentValues.getAsString("appId");
            if (z17) {
                this.f240943d = true;
            }
        }
        if (contentValues.containsKey("versionType")) {
            this.field_versionType = contentValues.getAsInteger("versionType").intValue();
            if (z17) {
                this.f240944e = true;
            }
        }
        if (contentValues.containsKey("appVersion")) {
            this.field_appVersion = contentValues.getAsInteger("appVersion").intValue();
            if (z17) {
                this.f240945f = true;
            }
        }
        if (contentValues.containsKey("isDarkMode")) {
            this.field_isDarkMode = contentValues.getAsInteger("isDarkMode").intValue() != 0;
            if (z17) {
                this.f240946g = true;
            }
        }
        if (contentValues.containsKey("screenshotFilePath")) {
            this.field_screenshotFilePath = contentValues.getAsString("screenshotFilePath");
            if (z17) {
                this.f240947h = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
