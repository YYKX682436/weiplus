package dm;

/* loaded from: classes4.dex */
public class g0 extends l75.f0 {

    /* renamed from: g, reason: collision with root package name */
    public static final p75.n0 f237004g;

    /* renamed from: h, reason: collision with root package name */
    public static final java.lang.String[] f237005h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f237006i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f237007m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f237008n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f237009o;

    /* renamed from: p, reason: collision with root package name */
    public static final l75.e0 f237010p;

    /* renamed from: q, reason: collision with root package name */
    public static final o75.e f237011q;

    /* renamed from: d, reason: collision with root package name */
    public boolean f237012d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f237013e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f237014f = true;
    public java.lang.String field_appId;
    public int field_appVersion;
    public int field_isSeparatedPluginsUsed;

    static {
        p75.n0 n0Var = new p75.n0("AppBrandSeparatedPluginsCompatMarkTable");
        f237004g = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f237005h = new java.lang.String[0];
        f237006i = 93028124;
        f237007m = 1484112759;
        f237008n = 806500198;
        f237009o = 108705909;
        f237010p = initAutoDBInfo(dm.g0.class);
        f237011q = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[3];
        java.lang.String[] strArr = new java.lang.String[4];
        e0Var.f316954c = strArr;
        strArr[0] = "appId";
        e0Var.f316955d.put("appId", "TEXT");
        e0Var.f316954c[1] = "appVersion";
        e0Var.f316955d.put("appVersion", "INTEGER");
        e0Var.f316954c[2] = "isSeparatedPluginsUsed";
        e0Var.f316955d.put("isSeparatedPluginsUsed", "INTEGER");
        e0Var.f316954c[3] = "rowid";
        e0Var.f316956e = " appId TEXT,  appVersion INTEGER,  isSeparatedPluginsUsed INTEGER";
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
            if (f237006i == hashCode) {
                try {
                    this.field_appId = cursor.getString(i17);
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandSeparatedPluginsCompatMarkTable", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237007m == hashCode) {
                try {
                    this.field_appVersion = cursor.getInt(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandSeparatedPluginsCompatMarkTable", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237008n == hashCode) {
                try {
                    this.field_isSeparatedPluginsUsed = cursor.getInt(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandSeparatedPluginsCompatMarkTable", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237009o == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f237012d) {
            contentValues.put("appId", this.field_appId);
        }
        if (this.f237013e) {
            contentValues.put("appVersion", java.lang.Integer.valueOf(this.field_appVersion));
        }
        if (this.f237014f) {
            contentValues.put("isSeparatedPluginsUsed", java.lang.Integer.valueOf(this.field_isSeparatedPluginsUsed));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseAppBrandSeparatedPluginsCompatMarkTable", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS AppBrandSeparatedPluginsCompatMarkTable ( ");
        l75.e0 e0Var = f237010p;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f237005h) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseAppBrandSeparatedPluginsCompatMarkTable", "createTableSql %s", str2);
            k0Var.A("AppBrandSeparatedPluginsCompatMarkTable", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "AppBrandSeparatedPluginsCompatMarkTable", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseAppBrandSeparatedPluginsCompatMarkTable", "updateTableSql %s", str3);
            k0Var.A("AppBrandSeparatedPluginsCompatMarkTable", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseAppBrandSeparatedPluginsCompatMarkTable", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f237010p;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f237011q;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return java.lang.Long.valueOf(this.systemRowid);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f237004g;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f237004g.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("appId")) {
            this.field_appId = contentValues.getAsString("appId");
            if (z17) {
                this.f237012d = true;
            }
        }
        if (contentValues.containsKey("appVersion")) {
            this.field_appVersion = contentValues.getAsInteger("appVersion").intValue();
            if (z17) {
                this.f237013e = true;
            }
        }
        if (contentValues.containsKey("isSeparatedPluginsUsed")) {
            this.field_isSeparatedPluginsUsed = contentValues.getAsInteger("isSeparatedPluginsUsed").intValue();
            if (z17) {
                this.f237014f = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
