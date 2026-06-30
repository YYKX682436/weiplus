package dm;

/* loaded from: classes7.dex */
public class l0 extends l75.f0 {

    /* renamed from: n, reason: collision with root package name */
    public static final p75.n0 f238149n;

    /* renamed from: o, reason: collision with root package name */
    public static final java.lang.String[] f238150o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f238151p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f238152q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f238153r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f238154s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f238155t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f238156u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f238157v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f238158w;

    /* renamed from: x, reason: collision with root package name */
    public static final l75.e0 f238159x;

    /* renamed from: y, reason: collision with root package name */
    public static final o75.e f238160y;
    public java.lang.String field_appId;
    public int field_hitCount;
    public java.lang.String field_packageKey;
    public int field_packageType;
    public int field_reportId;
    public int field_source;
    public int field_version;

    /* renamed from: d, reason: collision with root package name */
    public boolean f238161d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f238162e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f238163f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f238164g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f238165h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f238166i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f238167m = true;

    static {
        p75.n0 n0Var = new p75.n0("AppBrandWxaPkgPreDownloadStatistics2");
        f238149n = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f238150o = new java.lang.String[0];
        f238151p = 93028124;
        f238152q = 351608024;
        f238153r = 908960928;
        f238154s = 29312057;
        f238155t = -896505829;
        f238156u = -1346432708;
        f238157v = -427040401;
        f238158w = 108705909;
        f238159x = initAutoDBInfo(dm.l0.class);
        f238160y = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[7];
        java.lang.String[] strArr = new java.lang.String[8];
        e0Var.f316954c = strArr;
        strArr[0] = "appId";
        e0Var.f316955d.put("appId", "TEXT");
        e0Var.f316954c[1] = "version";
        e0Var.f316955d.put("version", "INTEGER");
        e0Var.f316954c[2] = "packageType";
        e0Var.f316955d.put("packageType", "INTEGER");
        e0Var.f316954c[3] = "packageKey";
        e0Var.f316955d.put("packageKey", "TEXT");
        e0Var.f316954c[4] = ya.b.SOURCE;
        e0Var.f316955d.put(ya.b.SOURCE, "INTEGER default '0' ");
        e0Var.f316954c[5] = "hitCount";
        e0Var.f316955d.put("hitCount", "INTEGER default '0' ");
        e0Var.f316954c[6] = "reportId";
        e0Var.f316955d.put("reportId", "INTEGER default '0' ");
        e0Var.f316954c[7] = "rowid";
        e0Var.f316956e = " appId TEXT,  version INTEGER,  packageType INTEGER,  packageKey TEXT,  source INTEGER default '0' ,  hitCount INTEGER default '0' ,  reportId INTEGER default '0' ";
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
            if (f238151p == hashCode) {
                try {
                    this.field_appId = cursor.getString(i17);
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandWxaPkgPreDownloadStatistics2", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238152q == hashCode) {
                try {
                    this.field_version = cursor.getInt(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandWxaPkgPreDownloadStatistics2", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238153r == hashCode) {
                try {
                    this.field_packageType = cursor.getInt(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandWxaPkgPreDownloadStatistics2", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238154s == hashCode) {
                try {
                    this.field_packageKey = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandWxaPkgPreDownloadStatistics2", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238155t == hashCode) {
                try {
                    this.field_source = cursor.getInt(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandWxaPkgPreDownloadStatistics2", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238156u == hashCode) {
                try {
                    this.field_hitCount = cursor.getInt(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandWxaPkgPreDownloadStatistics2", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238157v == hashCode) {
                try {
                    this.field_reportId = cursor.getInt(i17);
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandWxaPkgPreDownloadStatistics2", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238158w == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f238161d) {
            contentValues.put("appId", this.field_appId);
        }
        if (this.f238162e) {
            contentValues.put("version", java.lang.Integer.valueOf(this.field_version));
        }
        if (this.f238163f) {
            contentValues.put("packageType", java.lang.Integer.valueOf(this.field_packageType));
        }
        if (this.f238164g) {
            contentValues.put("packageKey", this.field_packageKey);
        }
        if (this.f238165h) {
            contentValues.put(ya.b.SOURCE, java.lang.Integer.valueOf(this.field_source));
        }
        if (this.f238166i) {
            contentValues.put("hitCount", java.lang.Integer.valueOf(this.field_hitCount));
        }
        if (this.f238167m) {
            contentValues.put("reportId", java.lang.Integer.valueOf(this.field_reportId));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseAppBrandWxaPkgPreDownloadStatistics2", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS AppBrandWxaPkgPreDownloadStatistics2 ( ");
        l75.e0 e0Var = f238159x;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f238150o) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseAppBrandWxaPkgPreDownloadStatistics2", "createTableSql %s", str2);
            k0Var.A("AppBrandWxaPkgPreDownloadStatistics2", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "AppBrandWxaPkgPreDownloadStatistics2", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseAppBrandWxaPkgPreDownloadStatistics2", "updateTableSql %s", str3);
            k0Var.A("AppBrandWxaPkgPreDownloadStatistics2", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseAppBrandWxaPkgPreDownloadStatistics2", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f238159x;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f238160y;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return java.lang.Long.valueOf(this.systemRowid);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f238149n;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f238149n.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("appId")) {
            this.field_appId = contentValues.getAsString("appId");
            if (z17) {
                this.f238161d = true;
            }
        }
        if (contentValues.containsKey("version")) {
            this.field_version = contentValues.getAsInteger("version").intValue();
            if (z17) {
                this.f238162e = true;
            }
        }
        if (contentValues.containsKey("packageType")) {
            this.field_packageType = contentValues.getAsInteger("packageType").intValue();
            if (z17) {
                this.f238163f = true;
            }
        }
        if (contentValues.containsKey("packageKey")) {
            this.field_packageKey = contentValues.getAsString("packageKey");
            if (z17) {
                this.f238164g = true;
            }
        }
        if (contentValues.containsKey(ya.b.SOURCE)) {
            this.field_source = contentValues.getAsInteger(ya.b.SOURCE).intValue();
            if (z17) {
                this.f238165h = true;
            }
        }
        if (contentValues.containsKey("hitCount")) {
            this.field_hitCount = contentValues.getAsInteger("hitCount").intValue();
            if (z17) {
                this.f238166i = true;
            }
        }
        if (contentValues.containsKey("reportId")) {
            this.field_reportId = contentValues.getAsInteger("reportId").intValue();
            if (z17) {
                this.f238167m = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
