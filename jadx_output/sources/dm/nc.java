package dm;

/* loaded from: classes4.dex */
public class nc extends l75.f0 {

    /* renamed from: i, reason: collision with root package name */
    public static final p75.n0 f238816i;

    /* renamed from: m, reason: collision with root package name */
    public static final java.lang.String[] f238817m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f238818n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f238819o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f238820p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f238821q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f238822r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f238823s;

    /* renamed from: t, reason: collision with root package name */
    public static final l75.e0 f238824t;

    /* renamed from: u, reason: collision with root package name */
    public static final o75.e f238825u;
    public java.lang.String field_appId;
    public java.lang.String field_domin;
    public java.lang.String field_key;
    public int field_recordId;
    public java.lang.String field_value;

    /* renamed from: d, reason: collision with root package name */
    public boolean f238826d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f238827e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f238828f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f238829g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f238830h = true;

    static {
        p75.n0 n0Var = new p75.n0("WebviewLocalData");
        f238816i = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f238817m = new java.lang.String[0];
        f238818n = -799234740;
        f238819o = 93028124;
        f238820p = 95767015;
        f238821q = 106079;
        f238822r = 111972721;
        f238823s = 108705909;
        f238824t = initAutoDBInfo(dm.nc.class);
        f238825u = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[5];
        java.lang.String[] strArr = new java.lang.String[6];
        e0Var.f316954c = strArr;
        strArr[0] = "recordId";
        e0Var.f316955d.put("recordId", "INTEGER PRIMARY KEY ");
        e0Var.f316953b = "recordId";
        e0Var.f316954c[1] = "appId";
        e0Var.f316955d.put("appId", "TEXT");
        e0Var.f316954c[2] = "domin";
        e0Var.f316955d.put("domin", "TEXT");
        e0Var.f316954c[3] = "key";
        e0Var.f316955d.put("key", "TEXT");
        e0Var.f316954c[4] = "value";
        e0Var.f316955d.put("value", "TEXT");
        e0Var.f316954c[5] = "rowid";
        e0Var.f316956e = " recordId INTEGER PRIMARY KEY ,  appId TEXT,  domin TEXT,  key TEXT,  value TEXT";
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
            if (f238818n == hashCode) {
                try {
                    this.field_recordId = cursor.getInt(i17);
                    this.f238826d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWebviewLocalData", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238819o == hashCode) {
                try {
                    this.field_appId = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWebviewLocalData", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238820p == hashCode) {
                try {
                    this.field_domin = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWebviewLocalData", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238821q == hashCode) {
                try {
                    this.field_key = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWebviewLocalData", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238822r == hashCode) {
                try {
                    this.field_value = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWebviewLocalData", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238823s == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f238826d) {
            contentValues.put("recordId", java.lang.Integer.valueOf(this.field_recordId));
        }
        if (this.f238827e) {
            contentValues.put("appId", this.field_appId);
        }
        if (this.f238828f) {
            contentValues.put("domin", this.field_domin);
        }
        if (this.f238829g) {
            contentValues.put("key", this.field_key);
        }
        if (this.f238830h) {
            contentValues.put("value", this.field_value);
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseWebviewLocalData", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS WebviewLocalData ( ");
        l75.e0 e0Var = f238824t;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f238817m) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseWebviewLocalData", "createTableSql %s", str2);
            k0Var.A("WebviewLocalData", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "WebviewLocalData", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseWebviewLocalData", "updateTableSql %s", str3);
            k0Var.A("WebviewLocalData", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseWebviewLocalData", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f238824t;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f238825u;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return java.lang.Integer.valueOf(this.field_recordId);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f238816i;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f238816i.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("recordId")) {
            this.field_recordId = contentValues.getAsInteger("recordId").intValue();
            if (z17) {
                this.f238826d = true;
            }
        }
        if (contentValues.containsKey("appId")) {
            this.field_appId = contentValues.getAsString("appId");
            if (z17) {
                this.f238827e = true;
            }
        }
        if (contentValues.containsKey("domin")) {
            this.field_domin = contentValues.getAsString("domin");
            if (z17) {
                this.f238828f = true;
            }
        }
        if (contentValues.containsKey("key")) {
            this.field_key = contentValues.getAsString("key");
            if (z17) {
                this.f238829g = true;
            }
        }
        if (contentValues.containsKey("value")) {
            this.field_value = contentValues.getAsString("value");
            if (z17) {
                this.f238830h = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
