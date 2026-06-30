package dm;

/* loaded from: classes4.dex */
public class d0 extends l75.f0 {

    /* renamed from: g, reason: collision with root package name */
    public static final p75.n0 f236277g;

    /* renamed from: h, reason: collision with root package name */
    public static final java.lang.String[] f236278h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f236279i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f236280m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f236281n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f236282o;

    /* renamed from: p, reason: collision with root package name */
    public static final l75.e0 f236283p;

    /* renamed from: q, reason: collision with root package name */
    public static final o75.e f236284q;

    /* renamed from: d, reason: collision with root package name */
    public boolean f236285d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f236286e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f236287f = true;
    public java.lang.String field_appId;
    public long field_prefetchUpdateTime;
    public java.lang.String field_username;

    static {
        p75.n0 n0Var = new p75.n0("AppBrandPrefetchWxaAttrsMarkTable");
        f236277g = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f236278h = new java.lang.String[]{"CREATE INDEX IF NOT EXISTS AppBrandPrefetchWxaAttrsMarkTableAppIdIndex ON AppBrandPrefetchWxaAttrsMarkTable(appId)"};
        f236279i = -265713450;
        f236280m = 93028124;
        f236281n = -1021704051;
        f236282o = 108705909;
        f236283p = initAutoDBInfo(dm.d0.class);
        f236284q = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[3];
        java.lang.String[] strArr = new java.lang.String[4];
        e0Var.f316954c = strArr;
        strArr[0] = dm.i4.COL_USERNAME;
        e0Var.f316955d.put(dm.i4.COL_USERNAME, "TEXT PRIMARY KEY ");
        e0Var.f316953b = dm.i4.COL_USERNAME;
        e0Var.f316954c[1] = "appId";
        e0Var.f316955d.put("appId", "TEXT");
        e0Var.f316954c[2] = "prefetchUpdateTime";
        e0Var.f316955d.put("prefetchUpdateTime", "LONG");
        e0Var.f316954c[3] = "rowid";
        e0Var.f316956e = " username TEXT PRIMARY KEY ,  appId TEXT,  prefetchUpdateTime LONG";
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
            if (f236279i == hashCode) {
                try {
                    this.field_username = cursor.getString(i17);
                    this.f236285d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandPrefetchWxaAttrsMarkTable", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236280m == hashCode) {
                try {
                    this.field_appId = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandPrefetchWxaAttrsMarkTable", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236281n == hashCode) {
                try {
                    this.field_prefetchUpdateTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandPrefetchWxaAttrsMarkTable", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236282o == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f236285d) {
            contentValues.put(dm.i4.COL_USERNAME, this.field_username);
        }
        if (this.f236286e) {
            contentValues.put("appId", this.field_appId);
        }
        if (this.f236287f) {
            contentValues.put("prefetchUpdateTime", java.lang.Long.valueOf(this.field_prefetchUpdateTime));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseAppBrandPrefetchWxaAttrsMarkTable", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS AppBrandPrefetchWxaAttrsMarkTable ( ");
        l75.e0 e0Var = f236283p;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f236278h) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseAppBrandPrefetchWxaAttrsMarkTable", "createTableSql %s", str2);
            k0Var.A("AppBrandPrefetchWxaAttrsMarkTable", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "AppBrandPrefetchWxaAttrsMarkTable", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseAppBrandPrefetchWxaAttrsMarkTable", "updateTableSql %s", str3);
            k0Var.A("AppBrandPrefetchWxaAttrsMarkTable", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseAppBrandPrefetchWxaAttrsMarkTable", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f236283p;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f236284q;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return this.field_username;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f236277g;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f236277g.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey(dm.i4.COL_USERNAME)) {
            this.field_username = contentValues.getAsString(dm.i4.COL_USERNAME);
            if (z17) {
                this.f236285d = true;
            }
        }
        if (contentValues.containsKey("appId")) {
            this.field_appId = contentValues.getAsString("appId");
            if (z17) {
                this.f236286e = true;
            }
        }
        if (contentValues.containsKey("prefetchUpdateTime")) {
            this.field_prefetchUpdateTime = contentValues.getAsLong("prefetchUpdateTime").longValue();
            if (z17) {
                this.f236287f = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
