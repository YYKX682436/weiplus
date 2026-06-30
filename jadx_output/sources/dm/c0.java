package dm;

/* loaded from: classes4.dex */
public class c0 extends l75.f0 {

    /* renamed from: i, reason: collision with root package name */
    public static final p75.n0 f235991i;

    /* renamed from: m, reason: collision with root package name */
    public static final java.lang.String[] f235992m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f235993n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f235994o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f235995p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f235996q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f235997r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f235998s;

    /* renamed from: t, reason: collision with root package name */
    public static final l75.e0 f235999t;

    /* renamed from: u, reason: collision with root package name */
    public static final o75.e f236000u;
    public java.lang.String field_appId;
    public int field_appServiceType;
    public long field_lastLaunchTime;
    public int field_maxFileStorageSize;
    public int field_wechatPluginApp;

    /* renamed from: d, reason: collision with root package name */
    public boolean f236001d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f236002e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f236003f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f236004g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f236005h = true;

    static {
        p75.n0 n0Var = new p75.n0("AppBrandMessInfoRecord");
        f235991i = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f235992m = new java.lang.String[0];
        f235993n = 93028124;
        f235994o = 1704796520;
        f235995p = 1015916206;
        f235996q = 558083068;
        f235997r = 755532886;
        f235998s = 108705909;
        f235999t = initAutoDBInfo(dm.c0.class);
        f236000u = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[5];
        java.lang.String[] strArr = new java.lang.String[6];
        e0Var.f316954c = strArr;
        strArr[0] = "appId";
        e0Var.f316955d.put("appId", "TEXT PRIMARY KEY ");
        e0Var.f316953b = "appId";
        e0Var.f316954c[1] = "wechatPluginApp";
        e0Var.f316955d.put("wechatPluginApp", "INTEGER default '-1' ");
        e0Var.f316954c[2] = "appServiceType";
        e0Var.f316955d.put("appServiceType", "INTEGER default '-1' ");
        e0Var.f316954c[3] = "maxFileStorageSize";
        e0Var.f316955d.put("maxFileStorageSize", "INTEGER default '-1' ");
        e0Var.f316954c[4] = "lastLaunchTime";
        e0Var.f316955d.put("lastLaunchTime", "LONG");
        e0Var.f316954c[5] = "rowid";
        e0Var.f316956e = " appId TEXT PRIMARY KEY ,  wechatPluginApp INTEGER default '-1' ,  appServiceType INTEGER default '-1' ,  maxFileStorageSize INTEGER default '-1' ,  lastLaunchTime LONG";
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
            if (f235993n == hashCode) {
                try {
                    this.field_appId = cursor.getString(i17);
                    this.f236001d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandMessInfoRecord", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f235994o == hashCode) {
                try {
                    this.field_wechatPluginApp = cursor.getInt(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandMessInfoRecord", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f235995p == hashCode) {
                try {
                    this.field_appServiceType = cursor.getInt(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandMessInfoRecord", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f235996q == hashCode) {
                try {
                    this.field_maxFileStorageSize = cursor.getInt(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandMessInfoRecord", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f235997r == hashCode) {
                try {
                    this.field_lastLaunchTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandMessInfoRecord", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f235998s == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f236001d) {
            contentValues.put("appId", this.field_appId);
        }
        if (this.f236002e) {
            contentValues.put("wechatPluginApp", java.lang.Integer.valueOf(this.field_wechatPluginApp));
        }
        if (this.f236003f) {
            contentValues.put("appServiceType", java.lang.Integer.valueOf(this.field_appServiceType));
        }
        if (this.f236004g) {
            contentValues.put("maxFileStorageSize", java.lang.Integer.valueOf(this.field_maxFileStorageSize));
        }
        if (this.f236005h) {
            contentValues.put("lastLaunchTime", java.lang.Long.valueOf(this.field_lastLaunchTime));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseAppBrandMessInfoRecord", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS AppBrandMessInfoRecord ( ");
        l75.e0 e0Var = f235999t;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f235992m) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseAppBrandMessInfoRecord", "createTableSql %s", str2);
            k0Var.A("AppBrandMessInfoRecord", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "AppBrandMessInfoRecord", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseAppBrandMessInfoRecord", "updateTableSql %s", str3);
            k0Var.A("AppBrandMessInfoRecord", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseAppBrandMessInfoRecord", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f235999t;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f236000u;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return this.field_appId;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f235991i;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f235991i.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("appId")) {
            this.field_appId = contentValues.getAsString("appId");
            if (z17) {
                this.f236001d = true;
            }
        }
        if (contentValues.containsKey("wechatPluginApp")) {
            this.field_wechatPluginApp = contentValues.getAsInteger("wechatPluginApp").intValue();
            if (z17) {
                this.f236002e = true;
            }
        }
        if (contentValues.containsKey("appServiceType")) {
            this.field_appServiceType = contentValues.getAsInteger("appServiceType").intValue();
            if (z17) {
                this.f236003f = true;
            }
        }
        if (contentValues.containsKey("maxFileStorageSize")) {
            this.field_maxFileStorageSize = contentValues.getAsInteger("maxFileStorageSize").intValue();
            if (z17) {
                this.f236004g = true;
            }
        }
        if (contentValues.containsKey("lastLaunchTime")) {
            this.field_lastLaunchTime = contentValues.getAsLong("lastLaunchTime").longValue();
            if (z17) {
                this.f236005h = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
