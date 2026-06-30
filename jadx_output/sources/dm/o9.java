package dm;

/* loaded from: classes4.dex */
public class o9 extends l75.f0 {

    /* renamed from: i, reason: collision with root package name */
    public static final p75.n0 f238994i;

    /* renamed from: m, reason: collision with root package name */
    public static final java.lang.String[] f238995m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f238996n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f238997o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f238998p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f238999q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f239000r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f239001s;

    /* renamed from: t, reason: collision with root package name */
    public static final l75.e0 f239002t;

    /* renamed from: u, reason: collision with root package name */
    public static final o75.e f239003u;
    public java.lang.String field_appId;
    public java.lang.String field_pkgMd5;
    public java.lang.String field_pkgPath;
    public int field_type;
    public int field_version;

    /* renamed from: d, reason: collision with root package name */
    public boolean f239004d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f239005e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f239006f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f239007g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f239008h = true;

    static {
        p75.n0 n0Var = new p75.n0("PredownloadEncryptPkgInfo");
        f238994i = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f238995m = new java.lang.String[0];
        f238996n = 93028124;
        f238997o = 351608024;
        f238998p = 3575610;
        f238999q = -986540014;
        f239000r = -517880815;
        f239001s = 108705909;
        f239002t = initAutoDBInfo(dm.o9.class);
        f239003u = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[5];
        java.lang.String[] strArr = new java.lang.String[6];
        e0Var.f316954c = strArr;
        strArr[0] = "appId";
        e0Var.f316955d.put("appId", "TEXT");
        e0Var.f316954c[1] = "version";
        e0Var.f316955d.put("version", "INTEGER");
        e0Var.f316954c[2] = "type";
        e0Var.f316955d.put("type", "INTEGER");
        e0Var.f316954c[3] = "pkgMd5";
        e0Var.f316955d.put("pkgMd5", "TEXT");
        e0Var.f316954c[4] = "pkgPath";
        e0Var.f316955d.put("pkgPath", "TEXT");
        e0Var.f316954c[5] = "rowid";
        e0Var.f316956e = " appId TEXT,  version INTEGER,  type INTEGER,  pkgMd5 TEXT,  pkgPath TEXT";
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
            if (f238996n == hashCode) {
                try {
                    this.field_appId = cursor.getString(i17);
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BasePredownloadEncryptPkgInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238997o == hashCode) {
                try {
                    this.field_version = cursor.getInt(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BasePredownloadEncryptPkgInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238998p == hashCode) {
                try {
                    this.field_type = cursor.getInt(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BasePredownloadEncryptPkgInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238999q == hashCode) {
                try {
                    this.field_pkgMd5 = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BasePredownloadEncryptPkgInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239000r == hashCode) {
                try {
                    this.field_pkgPath = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BasePredownloadEncryptPkgInfo", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239001s == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f239004d) {
            contentValues.put("appId", this.field_appId);
        }
        if (this.f239005e) {
            contentValues.put("version", java.lang.Integer.valueOf(this.field_version));
        }
        if (this.f239006f) {
            contentValues.put("type", java.lang.Integer.valueOf(this.field_type));
        }
        if (this.f239007g) {
            contentValues.put("pkgMd5", this.field_pkgMd5);
        }
        if (this.f239008h) {
            contentValues.put("pkgPath", this.field_pkgPath);
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BasePredownloadEncryptPkgInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS PredownloadEncryptPkgInfo ( ");
        l75.e0 e0Var = f239002t;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f238995m) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BasePredownloadEncryptPkgInfo", "createTableSql %s", str2);
            k0Var.A("PredownloadEncryptPkgInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "PredownloadEncryptPkgInfo", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BasePredownloadEncryptPkgInfo", "updateTableSql %s", str3);
            k0Var.A("PredownloadEncryptPkgInfo", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BasePredownloadEncryptPkgInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f239002t;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f239003u;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return java.lang.Long.valueOf(this.systemRowid);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f238994i;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f238994i.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("appId")) {
            this.field_appId = contentValues.getAsString("appId");
            if (z17) {
                this.f239004d = true;
            }
        }
        if (contentValues.containsKey("version")) {
            this.field_version = contentValues.getAsInteger("version").intValue();
            if (z17) {
                this.f239005e = true;
            }
        }
        if (contentValues.containsKey("type")) {
            this.field_type = contentValues.getAsInteger("type").intValue();
            if (z17) {
                this.f239006f = true;
            }
        }
        if (contentValues.containsKey("pkgMd5")) {
            this.field_pkgMd5 = contentValues.getAsString("pkgMd5");
            if (z17) {
                this.f239007g = true;
            }
        }
        if (contentValues.containsKey("pkgPath")) {
            this.field_pkgPath = contentValues.getAsString("pkgPath");
            if (z17) {
                this.f239008h = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
