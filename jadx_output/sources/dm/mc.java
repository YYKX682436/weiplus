package dm;

/* loaded from: classes4.dex */
public class mc extends l75.f0 {

    /* renamed from: f, reason: collision with root package name */
    public static final p75.n0 f238590f;

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String[] f238591g;

    /* renamed from: h, reason: collision with root package name */
    public static final int f238592h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f238593i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f238594m;

    /* renamed from: n, reason: collision with root package name */
    public static final l75.e0 f238595n;

    /* renamed from: o, reason: collision with root package name */
    public static final o75.e f238596o;

    /* renamed from: d, reason: collision with root package name */
    public boolean f238597d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f238598e = true;
    public long field_expireTime;
    public java.lang.String field_host;

    static {
        p75.n0 n0Var = new p75.n0("WebViewHostsFilter");
        f238590f = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f238591g = new java.lang.String[0];
        f238592h = 3208616;
        f238593i = -834724724;
        f238594m = 108705909;
        f238595n = initAutoDBInfo(dm.mc.class);
        f238596o = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[2];
        java.lang.String[] strArr = new java.lang.String[3];
        e0Var.f316954c = strArr;
        strArr[0] = "host";
        e0Var.f316955d.put("host", "TEXT");
        e0Var.f316954c[1] = "expireTime";
        e0Var.f316955d.put("expireTime", "LONG");
        e0Var.f316954c[2] = "rowid";
        e0Var.f316956e = " host TEXT,  expireTime LONG";
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
            if (f238592h == hashCode) {
                try {
                    this.field_host = cursor.getString(i17);
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWebViewHostsFilter", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238593i == hashCode) {
                try {
                    this.field_expireTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWebViewHostsFilter", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238594m == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f238597d) {
            contentValues.put("host", this.field_host);
        }
        if (this.f238598e) {
            contentValues.put("expireTime", java.lang.Long.valueOf(this.field_expireTime));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseWebViewHostsFilter", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS WebViewHostsFilter ( ");
        l75.e0 e0Var = f238595n;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f238591g) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseWebViewHostsFilter", "createTableSql %s", str2);
            k0Var.A("WebViewHostsFilter", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "WebViewHostsFilter", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseWebViewHostsFilter", "updateTableSql %s", str3);
            k0Var.A("WebViewHostsFilter", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseWebViewHostsFilter", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f238595n;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f238596o;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return java.lang.Long.valueOf(this.systemRowid);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f238590f;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f238590f.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("host")) {
            this.field_host = contentValues.getAsString("host");
            if (z17) {
                this.f238597d = true;
            }
        }
        if (contentValues.containsKey("expireTime")) {
            this.field_expireTime = contentValues.getAsLong("expireTime").longValue();
            if (z17) {
                this.f238598e = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
