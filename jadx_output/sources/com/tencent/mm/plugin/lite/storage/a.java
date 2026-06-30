package com.tencent.mm.plugin.lite.storage;

/* loaded from: classes8.dex */
public class a extends l75.f0 {

    /* renamed from: i, reason: collision with root package name */
    public static final p75.n0 f144173i;

    /* renamed from: m, reason: collision with root package name */
    public static final java.lang.String[] f144174m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f144175n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f144176o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f144177p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f144178q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f144179r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f144180s;

    /* renamed from: t, reason: collision with root package name */
    public static final l75.e0 f144181t;

    /* renamed from: u, reason: collision with root package name */
    public static final o75.e f144182u;
    public java.lang.String field_headerMap;
    public java.lang.String field_host;
    public java.lang.String field_param;
    public java.lang.String field_paramMap;
    public long field_updateTime;

    /* renamed from: d, reason: collision with root package name */
    public boolean f144183d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f144184e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f144185f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f144186g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f144187h = true;

    static {
        p75.n0 n0Var = new p75.n0("LiteAppAuthInfo");
        f144173i = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f144174m = new java.lang.String[0];
        f144175n = 3208616;
        f144176o = 106436749;
        f144177p = -213310577;
        f144178q = 1171402127;
        f144179r = -295931082;
        f144180s = 108705909;
        f144181t = initAutoDBInfo(com.tencent.mm.plugin.lite.storage.a.class);
        f144182u = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[5];
        java.lang.String[] strArr = new java.lang.String[6];
        e0Var.f316954c = strArr;
        strArr[0] = "host";
        e0Var.f316955d.put("host", "TEXT PRIMARY KEY ");
        e0Var.f316953b = "host";
        e0Var.f316954c[1] = "param";
        e0Var.f316955d.put("param", "TEXT");
        e0Var.f316954c[2] = "headerMap";
        e0Var.f316955d.put("headerMap", "TEXT");
        e0Var.f316954c[3] = "paramMap";
        e0Var.f316955d.put("paramMap", "TEXT");
        e0Var.f316954c[4] = dm.i4.COL_UPDATETIME;
        e0Var.f316955d.put(dm.i4.COL_UPDATETIME, "LONG");
        e0Var.f316954c[5] = "rowid";
        e0Var.f316956e = " host TEXT PRIMARY KEY ,  param TEXT,  headerMap TEXT,  paramMap TEXT,  updateTime LONG";
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
            if (f144175n == hashCode) {
                try {
                    this.field_host = cursor.getString(i17);
                    this.f144183d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseLiteAppAuthInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f144176o == hashCode) {
                try {
                    this.field_param = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseLiteAppAuthInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f144177p == hashCode) {
                try {
                    this.field_headerMap = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseLiteAppAuthInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f144178q == hashCode) {
                try {
                    this.field_paramMap = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseLiteAppAuthInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f144179r == hashCode) {
                try {
                    this.field_updateTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseLiteAppAuthInfo", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f144180s == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f144183d) {
            contentValues.put("host", this.field_host);
        }
        if (this.f144184e) {
            contentValues.put("param", this.field_param);
        }
        if (this.f144185f) {
            contentValues.put("headerMap", this.field_headerMap);
        }
        if (this.f144186g) {
            contentValues.put("paramMap", this.field_paramMap);
        }
        if (this.f144187h) {
            contentValues.put(dm.i4.COL_UPDATETIME, java.lang.Long.valueOf(this.field_updateTime));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseLiteAppAuthInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS LiteAppAuthInfo ( ");
        l75.e0 e0Var = f144181t;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f144174m) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseLiteAppAuthInfo", "createTableSql %s", str2);
            k0Var.A("LiteAppAuthInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "LiteAppAuthInfo", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseLiteAppAuthInfo", "updateTableSql %s", str3);
            k0Var.A("LiteAppAuthInfo", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseLiteAppAuthInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f144181t;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f144182u;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return this.field_host;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f144173i;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f144173i.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("host")) {
            this.field_host = contentValues.getAsString("host");
            if (z17) {
                this.f144183d = true;
            }
        }
        if (contentValues.containsKey("param")) {
            this.field_param = contentValues.getAsString("param");
            if (z17) {
                this.f144184e = true;
            }
        }
        if (contentValues.containsKey("headerMap")) {
            this.field_headerMap = contentValues.getAsString("headerMap");
            if (z17) {
                this.f144185f = true;
            }
        }
        if (contentValues.containsKey("paramMap")) {
            this.field_paramMap = contentValues.getAsString("paramMap");
            if (z17) {
                this.f144186g = true;
            }
        }
        if (contentValues.containsKey(dm.i4.COL_UPDATETIME)) {
            this.field_updateTime = contentValues.getAsLong(dm.i4.COL_UPDATETIME).longValue();
            if (z17) {
                this.f144187h = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
