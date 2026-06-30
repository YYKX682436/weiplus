package dm;

/* loaded from: classes4.dex */
public class r9 extends l75.f0 {

    /* renamed from: i, reason: collision with root package name */
    public static final p75.n0 f239690i;

    /* renamed from: m, reason: collision with root package name */
    public static final java.lang.String[] f239691m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f239692n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f239693o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f239694p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f239695q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f239696r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f239697s;

    /* renamed from: t, reason: collision with root package name */
    public static final l75.e0 f239698t;

    /* renamed from: u, reason: collision with root package name */
    public static final o75.e f239699u;
    public java.lang.String field_appId;
    public int field_appVersion;
    public java.lang.String field_decryptKey;
    public java.lang.String field_pkgMd5;
    public int field_reportId;

    /* renamed from: d, reason: collision with root package name */
    public boolean f239700d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f239701e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f239702f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f239703g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f239704h = true;

    static {
        p75.n0 n0Var = new p75.n0("PushWxaPkgDecryptKeyTable");
        f239690i = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f239691m = new java.lang.String[0];
        f239692n = 93028124;
        f239693o = 1484112759;
        f239694p = 2066040210;
        f239695q = -986540014;
        f239696r = -427040401;
        f239697s = 108705909;
        f239698t = initAutoDBInfo(dm.r9.class);
        f239699u = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[5];
        java.lang.String[] strArr = new java.lang.String[6];
        e0Var.f316954c = strArr;
        strArr[0] = "appId";
        e0Var.f316955d.put("appId", "TEXT");
        e0Var.f316954c[1] = "appVersion";
        e0Var.f316955d.put("appVersion", "INTEGER");
        e0Var.f316954c[2] = "decryptKey";
        e0Var.f316955d.put("decryptKey", "TEXT");
        e0Var.f316954c[3] = "pkgMd5";
        e0Var.f316955d.put("pkgMd5", "TEXT");
        e0Var.f316954c[4] = "reportId";
        e0Var.f316955d.put("reportId", "INTEGER");
        e0Var.f316954c[5] = "rowid";
        e0Var.f316956e = " appId TEXT,  appVersion INTEGER,  decryptKey TEXT,  pkgMd5 TEXT,  reportId INTEGER";
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
            if (f239692n == hashCode) {
                try {
                    this.field_appId = cursor.getString(i17);
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BasePushWxaPkgDecryptKeyTable", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239693o == hashCode) {
                try {
                    this.field_appVersion = cursor.getInt(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BasePushWxaPkgDecryptKeyTable", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239694p == hashCode) {
                try {
                    this.field_decryptKey = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BasePushWxaPkgDecryptKeyTable", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239695q == hashCode) {
                try {
                    this.field_pkgMd5 = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BasePushWxaPkgDecryptKeyTable", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239696r == hashCode) {
                try {
                    this.field_reportId = cursor.getInt(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BasePushWxaPkgDecryptKeyTable", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239697s == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f239700d) {
            contentValues.put("appId", this.field_appId);
        }
        if (this.f239701e) {
            contentValues.put("appVersion", java.lang.Integer.valueOf(this.field_appVersion));
        }
        if (this.f239702f) {
            contentValues.put("decryptKey", this.field_decryptKey);
        }
        if (this.f239703g) {
            contentValues.put("pkgMd5", this.field_pkgMd5);
        }
        if (this.f239704h) {
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BasePushWxaPkgDecryptKeyTable", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS PushWxaPkgDecryptKeyTable ( ");
        l75.e0 e0Var = f239698t;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f239691m) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BasePushWxaPkgDecryptKeyTable", "createTableSql %s", str2);
            k0Var.A("PushWxaPkgDecryptKeyTable", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "PushWxaPkgDecryptKeyTable", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BasePushWxaPkgDecryptKeyTable", "updateTableSql %s", str3);
            k0Var.A("PushWxaPkgDecryptKeyTable", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BasePushWxaPkgDecryptKeyTable", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f239698t;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f239699u;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return java.lang.Long.valueOf(this.systemRowid);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f239690i;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f239690i.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("appId")) {
            this.field_appId = contentValues.getAsString("appId");
            if (z17) {
                this.f239700d = true;
            }
        }
        if (contentValues.containsKey("appVersion")) {
            this.field_appVersion = contentValues.getAsInteger("appVersion").intValue();
            if (z17) {
                this.f239701e = true;
            }
        }
        if (contentValues.containsKey("decryptKey")) {
            this.field_decryptKey = contentValues.getAsString("decryptKey");
            if (z17) {
                this.f239702f = true;
            }
        }
        if (contentValues.containsKey("pkgMd5")) {
            this.field_pkgMd5 = contentValues.getAsString("pkgMd5");
            if (z17) {
                this.f239703g = true;
            }
        }
        if (contentValues.containsKey("reportId")) {
            this.field_reportId = contentValues.getAsInteger("reportId").intValue();
            if (z17) {
                this.f239704h = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
