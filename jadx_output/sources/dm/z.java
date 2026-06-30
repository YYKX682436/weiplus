package dm;

/* loaded from: classes4.dex */
public class z extends l75.f0 {

    /* renamed from: h, reason: collision with root package name */
    public static final p75.n0 f241344h;

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.String[] f241345i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f241346m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f241347n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f241348o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f241349p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f241350q;

    /* renamed from: r, reason: collision with root package name */
    public static final l75.e0 f241351r;

    /* renamed from: s, reason: collision with root package name */
    public static final o75.e f241352s;
    public java.lang.String field_data;
    public java.lang.String field_dataType;
    public java.lang.String field_key;
    public int field_size;

    /* renamed from: d, reason: collision with root package name */
    public boolean f241353d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f241354e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f241355f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f241356g = true;

    static {
        p75.n0 n0Var = new p75.n0("AppBrandKVData");
        f241344h = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f241345i = new java.lang.String[0];
        f241346m = 106079;
        f241347n = 3076010;
        f241348o = 1789070852;
        f241349p = 3530753;
        f241350q = 108705909;
        f241351r = initAutoDBInfo(dm.z.class);
        f241352s = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[4];
        java.lang.String[] strArr = new java.lang.String[5];
        e0Var.f316954c = strArr;
        strArr[0] = "key";
        e0Var.f316955d.put("key", "TEXT PRIMARY KEY ");
        e0Var.f316953b = "key";
        e0Var.f316954c[1] = com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA;
        e0Var.f316955d.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, "TEXT");
        e0Var.f316954c[2] = "dataType";
        e0Var.f316955d.put("dataType", "TEXT");
        e0Var.f316954c[3] = "size";
        e0Var.f316955d.put("size", "INTEGER");
        e0Var.f316954c[4] = "rowid";
        e0Var.f316956e = " key TEXT PRIMARY KEY ,  data TEXT,  dataType TEXT,  size INTEGER";
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
            if (f241346m == hashCode) {
                try {
                    this.field_key = cursor.getString(i17);
                    this.f241353d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandKVData", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f241347n == hashCode) {
                try {
                    this.field_data = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandKVData", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f241348o == hashCode) {
                try {
                    this.field_dataType = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandKVData", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f241349p == hashCode) {
                try {
                    this.field_size = cursor.getInt(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandKVData", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f241350q == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f241353d) {
            contentValues.put("key", this.field_key);
        }
        if (this.f241354e) {
            contentValues.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, this.field_data);
        }
        if (this.f241355f) {
            contentValues.put("dataType", this.field_dataType);
        }
        if (this.f241356g) {
            contentValues.put("size", java.lang.Integer.valueOf(this.field_size));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseAppBrandKVData", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS AppBrandKVData ( ");
        l75.e0 e0Var = f241351r;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f241345i) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseAppBrandKVData", "createTableSql %s", str2);
            k0Var.A("AppBrandKVData", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "AppBrandKVData", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseAppBrandKVData", "updateTableSql %s", str3);
            k0Var.A("AppBrandKVData", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseAppBrandKVData", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f241351r;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f241352s;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return this.field_key;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f241344h;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f241344h.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("key")) {
            this.field_key = contentValues.getAsString("key");
            if (z17) {
                this.f241353d = true;
            }
        }
        if (contentValues.containsKey(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA)) {
            this.field_data = contentValues.getAsString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
            if (z17) {
                this.f241354e = true;
            }
        }
        if (contentValues.containsKey("dataType")) {
            this.field_dataType = contentValues.getAsString("dataType");
            if (z17) {
                this.f241355f = true;
            }
        }
        if (contentValues.containsKey("size")) {
            this.field_size = contentValues.getAsInteger("size").intValue();
            if (z17) {
                this.f241356g = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
