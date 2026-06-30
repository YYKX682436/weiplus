package dm;

/* loaded from: classes8.dex */
public class jc extends l75.f0 {
    public static final o75.e A;

    /* renamed from: o, reason: collision with root package name */
    public static final p75.n0 f237910o;

    /* renamed from: p, reason: collision with root package name */
    public static final java.lang.String[] f237911p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f237912q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f237913r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f237914s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f237915t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f237916u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f237917v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f237918w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f237919x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f237920y;

    /* renamed from: z, reason: collision with root package name */
    public static final l75.e0 f237921z;
    public int field_downloadNetType;
    public java.lang.String field_downloadUrl;
    public java.lang.String field_md5;
    public java.lang.String field_oldPath;
    public java.lang.String field_oldVersion;
    public java.lang.String field_pkgId;
    public int field_pkgSize;
    public java.lang.String field_version;

    /* renamed from: d, reason: collision with root package name */
    public boolean f237922d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f237923e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f237924f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f237925g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f237926h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f237927i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f237928m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f237929n = true;

    static {
        p75.n0 n0Var = new p75.n0("WePkgDiffPackage");
        f237910o = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f237911p = new java.lang.String[0];
        f237912q = 106723335;
        f237913r = 351608024;
        f237914s = -2066080591;
        f237915t = -1379525908;
        f237916u = 107902;
        f237917v = -1211148345;
        f237918w = -517783571;
        f237919x = -2057421617;
        f237920y = 108705909;
        f237921z = initAutoDBInfo(dm.jc.class);
        A = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[8];
        java.lang.String[] strArr = new java.lang.String[9];
        e0Var.f316954c = strArr;
        strArr[0] = "pkgId";
        e0Var.f316955d.put("pkgId", "TEXT PRIMARY KEY ");
        e0Var.f316953b = "pkgId";
        e0Var.f316954c[1] = "version";
        e0Var.f316955d.put("version", "TEXT");
        e0Var.f316954c[2] = "oldVersion";
        e0Var.f316955d.put("oldVersion", "TEXT");
        e0Var.f316954c[3] = "oldPath";
        e0Var.f316955d.put("oldPath", "TEXT");
        e0Var.f316954c[4] = "md5";
        e0Var.f316955d.put("md5", "TEXT");
        e0Var.f316954c[5] = "downloadUrl";
        e0Var.f316955d.put("downloadUrl", "TEXT");
        e0Var.f316954c[6] = "pkgSize";
        e0Var.f316955d.put("pkgSize", "INTEGER");
        e0Var.f316954c[7] = "downloadNetType";
        e0Var.f316955d.put("downloadNetType", "INTEGER");
        e0Var.f316954c[8] = "rowid";
        e0Var.f316956e = " pkgId TEXT PRIMARY KEY ,  version TEXT,  oldVersion TEXT,  oldPath TEXT,  md5 TEXT,  downloadUrl TEXT,  pkgSize INTEGER,  downloadNetType INTEGER";
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
            if (f237912q == hashCode) {
                try {
                    this.field_pkgId = cursor.getString(i17);
                    this.f237922d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWePkgDiffPackage", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237913r == hashCode) {
                try {
                    this.field_version = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWePkgDiffPackage", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237914s == hashCode) {
                try {
                    this.field_oldVersion = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWePkgDiffPackage", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237915t == hashCode) {
                try {
                    this.field_oldPath = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWePkgDiffPackage", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237916u == hashCode) {
                try {
                    this.field_md5 = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWePkgDiffPackage", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237917v == hashCode) {
                try {
                    this.field_downloadUrl = cursor.getString(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWePkgDiffPackage", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237918w == hashCode) {
                try {
                    this.field_pkgSize = cursor.getInt(i17);
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWePkgDiffPackage", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237919x == hashCode) {
                try {
                    this.field_downloadNetType = cursor.getInt(i17);
                } catch (java.lang.Throwable th13) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWePkgDiffPackage", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237920y == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f237922d) {
            contentValues.put("pkgId", this.field_pkgId);
        }
        if (this.f237923e) {
            contentValues.put("version", this.field_version);
        }
        if (this.f237924f) {
            contentValues.put("oldVersion", this.field_oldVersion);
        }
        if (this.f237925g) {
            contentValues.put("oldPath", this.field_oldPath);
        }
        if (this.f237926h) {
            contentValues.put("md5", this.field_md5);
        }
        if (this.f237927i) {
            contentValues.put("downloadUrl", this.field_downloadUrl);
        }
        if (this.f237928m) {
            contentValues.put("pkgSize", java.lang.Integer.valueOf(this.field_pkgSize));
        }
        if (this.f237929n) {
            contentValues.put("downloadNetType", java.lang.Integer.valueOf(this.field_downloadNetType));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseWePkgDiffPackage", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS WePkgDiffPackage ( ");
        l75.e0 e0Var = f237921z;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f237911p) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseWePkgDiffPackage", "createTableSql %s", str2);
            k0Var.A("WePkgDiffPackage", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "WePkgDiffPackage", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseWePkgDiffPackage", "updateTableSql %s", str3);
            k0Var.A("WePkgDiffPackage", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseWePkgDiffPackage", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f237921z;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return A;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return this.field_pkgId;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f237910o;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f237910o.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("pkgId")) {
            this.field_pkgId = contentValues.getAsString("pkgId");
            if (z17) {
                this.f237922d = true;
            }
        }
        if (contentValues.containsKey("version")) {
            this.field_version = contentValues.getAsString("version");
            if (z17) {
                this.f237923e = true;
            }
        }
        if (contentValues.containsKey("oldVersion")) {
            this.field_oldVersion = contentValues.getAsString("oldVersion");
            if (z17) {
                this.f237924f = true;
            }
        }
        if (contentValues.containsKey("oldPath")) {
            this.field_oldPath = contentValues.getAsString("oldPath");
            if (z17) {
                this.f237925g = true;
            }
        }
        if (contentValues.containsKey("md5")) {
            this.field_md5 = contentValues.getAsString("md5");
            if (z17) {
                this.f237926h = true;
            }
        }
        if (contentValues.containsKey("downloadUrl")) {
            this.field_downloadUrl = contentValues.getAsString("downloadUrl");
            if (z17) {
                this.f237927i = true;
            }
        }
        if (contentValues.containsKey("pkgSize")) {
            this.field_pkgSize = contentValues.getAsInteger("pkgSize").intValue();
            if (z17) {
                this.f237928m = true;
            }
        }
        if (contentValues.containsKey("downloadNetType")) {
            this.field_downloadNetType = contentValues.getAsInteger("downloadNetType").intValue();
            if (z17) {
                this.f237929n = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
