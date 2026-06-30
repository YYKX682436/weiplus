package dm;

/* loaded from: classes7.dex */
public class k0 extends l75.f0 {
    public static final int A;
    public static final int B;
    public static final int C;
    public static final int D;
    public static final int E;
    public static final int F;
    public static final l75.e0 G;
    public static final o75.e H;

    /* renamed from: r, reason: collision with root package name */
    public static final p75.n0 f237930r;

    /* renamed from: s, reason: collision with root package name */
    public static final p75.d f237931s;

    /* renamed from: t, reason: collision with root package name */
    public static final java.lang.String[] f237932t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f237933u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f237934v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f237935w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f237936x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f237937y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f237938z;
    public java.lang.String field_NewMd5;
    public java.lang.String field_appId;
    public long field_checksum;
    public long field_createTime;
    public int field_debugType;
    public java.lang.String field_downloadURL;
    public long field_endTime;
    public java.lang.String field_pkgPath;
    public long field_startTime;
    public int field_version;
    public java.lang.String field_versionMd5;

    /* renamed from: d, reason: collision with root package name */
    public boolean f237939d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f237940e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f237941f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f237942g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f237943h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f237944i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f237945m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f237946n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f237947o = true;

    /* renamed from: p, reason: collision with root package name */
    public boolean f237948p = true;

    /* renamed from: q, reason: collision with root package name */
    public boolean f237949q = true;

    static {
        p75.n0 n0Var = new p75.n0("AppBrandWxaPkgManifestRecord");
        f237930r = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f237931s = new p75.d("appId", "string", tableName, "");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f237932t = new java.lang.String[]{"CREATE INDEX IF NOT EXISTS AppBrandWxaPkgManifestRecordPkgPathIndex ON AppBrandWxaPkgManifestRecord(pkgPath)"};
        f237933u = 93028124;
        f237934v = 351608024;
        f237935w = -670514810;
        f237936x = -1964995618;
        f237937y = 1536908355;
        f237938z = -517880815;
        A = 1369213417;
        B = -198232019;
        C = -1211149369;
        D = -2129294769;
        E = -1607243192;
        F = 108705909;
        G = initAutoDBInfo(dm.k0.class);
        H = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[11];
        java.lang.String[] strArr = new java.lang.String[12];
        e0Var.f316954c = strArr;
        strArr[0] = "appId";
        e0Var.f316955d.put("appId", "TEXT");
        e0Var.f316954c[1] = "version";
        e0Var.f316955d.put("version", "INTEGER");
        e0Var.f316954c[2] = "versionMd5";
        e0Var.f316955d.put("versionMd5", "TEXT");
        e0Var.f316954c[3] = "NewMd5";
        e0Var.f316955d.put("NewMd5", "TEXT");
        e0Var.f316954c[4] = "checksum";
        e0Var.f316955d.put("checksum", "LONG");
        e0Var.f316954c[5] = "pkgPath";
        e0Var.f316955d.put("pkgPath", "TEXT");
        e0Var.f316954c[6] = "createTime";
        e0Var.f316955d.put("createTime", "LONG");
        e0Var.f316954c[7] = "debugType";
        e0Var.f316955d.put("debugType", "INTEGER default '0' ");
        e0Var.f316954c[8] = "downloadURL";
        e0Var.f316955d.put("downloadURL", "TEXT");
        e0Var.f316954c[9] = "startTime";
        e0Var.f316955d.put("startTime", "LONG");
        e0Var.f316954c[10] = "endTime";
        e0Var.f316955d.put("endTime", "LONG");
        e0Var.f316954c[11] = "rowid";
        e0Var.f316956e = " appId TEXT,  version INTEGER,  versionMd5 TEXT,  NewMd5 TEXT,  checksum LONG,  pkgPath TEXT,  createTime LONG,  debugType INTEGER default '0' ,  downloadURL TEXT,  startTime LONG,  endTime LONG";
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
            if (f237933u == hashCode) {
                try {
                    this.field_appId = cursor.getString(i17);
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandWxaPkgManifestRecord", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237934v == hashCode) {
                try {
                    this.field_version = cursor.getInt(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandWxaPkgManifestRecord", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237935w == hashCode) {
                try {
                    this.field_versionMd5 = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandWxaPkgManifestRecord", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237936x == hashCode) {
                try {
                    this.field_NewMd5 = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandWxaPkgManifestRecord", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237937y == hashCode) {
                try {
                    this.field_checksum = cursor.getLong(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandWxaPkgManifestRecord", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237938z == hashCode) {
                try {
                    this.field_pkgPath = cursor.getString(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandWxaPkgManifestRecord", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (A == hashCode) {
                try {
                    this.field_createTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandWxaPkgManifestRecord", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (B == hashCode) {
                try {
                    this.field_debugType = cursor.getInt(i17);
                } catch (java.lang.Throwable th13) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandWxaPkgManifestRecord", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (C == hashCode) {
                try {
                    this.field_downloadURL = cursor.getString(i17);
                } catch (java.lang.Throwable th14) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandWxaPkgManifestRecord", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (D == hashCode) {
                try {
                    this.field_startTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th15) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandWxaPkgManifestRecord", th15, "convertFrom %s", columnNames[i17]);
                    java.lang.String str10 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (E == hashCode) {
                try {
                    this.field_endTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th16) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandWxaPkgManifestRecord", th16, "convertFrom %s", columnNames[i17]);
                    java.lang.String str11 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (F == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f237939d) {
            contentValues.put("appId", this.field_appId);
        }
        if (this.f237940e) {
            contentValues.put("version", java.lang.Integer.valueOf(this.field_version));
        }
        if (this.f237941f) {
            contentValues.put("versionMd5", this.field_versionMd5);
        }
        if (this.f237942g) {
            contentValues.put("NewMd5", this.field_NewMd5);
        }
        if (this.f237943h) {
            contentValues.put("checksum", java.lang.Long.valueOf(this.field_checksum));
        }
        if (this.f237944i) {
            contentValues.put("pkgPath", this.field_pkgPath);
        }
        if (this.f237945m) {
            contentValues.put("createTime", java.lang.Long.valueOf(this.field_createTime));
        }
        if (this.f237946n) {
            contentValues.put("debugType", java.lang.Integer.valueOf(this.field_debugType));
        }
        if (this.f237947o) {
            contentValues.put("downloadURL", this.field_downloadURL);
        }
        if (this.f237948p) {
            contentValues.put("startTime", java.lang.Long.valueOf(this.field_startTime));
        }
        if (this.f237949q) {
            contentValues.put("endTime", java.lang.Long.valueOf(this.field_endTime));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseAppBrandWxaPkgManifestRecord", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS AppBrandWxaPkgManifestRecord ( ");
        l75.e0 e0Var = G;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f237932t) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseAppBrandWxaPkgManifestRecord", "createTableSql %s", str2);
            k0Var.A("AppBrandWxaPkgManifestRecord", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "AppBrandWxaPkgManifestRecord", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseAppBrandWxaPkgManifestRecord", "updateTableSql %s", str3);
            k0Var.A("AppBrandWxaPkgManifestRecord", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseAppBrandWxaPkgManifestRecord", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return G;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return H;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return java.lang.Long.valueOf(this.systemRowid);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f237930r;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f237930r.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("appId")) {
            this.field_appId = contentValues.getAsString("appId");
            if (z17) {
                this.f237939d = true;
            }
        }
        if (contentValues.containsKey("version")) {
            this.field_version = contentValues.getAsInteger("version").intValue();
            if (z17) {
                this.f237940e = true;
            }
        }
        if (contentValues.containsKey("versionMd5")) {
            this.field_versionMd5 = contentValues.getAsString("versionMd5");
            if (z17) {
                this.f237941f = true;
            }
        }
        if (contentValues.containsKey("NewMd5")) {
            this.field_NewMd5 = contentValues.getAsString("NewMd5");
            if (z17) {
                this.f237942g = true;
            }
        }
        if (contentValues.containsKey("checksum")) {
            this.field_checksum = contentValues.getAsLong("checksum").longValue();
            if (z17) {
                this.f237943h = true;
            }
        }
        if (contentValues.containsKey("pkgPath")) {
            this.field_pkgPath = contentValues.getAsString("pkgPath");
            if (z17) {
                this.f237944i = true;
            }
        }
        if (contentValues.containsKey("createTime")) {
            this.field_createTime = contentValues.getAsLong("createTime").longValue();
            if (z17) {
                this.f237945m = true;
            }
        }
        if (contentValues.containsKey("debugType")) {
            this.field_debugType = contentValues.getAsInteger("debugType").intValue();
            if (z17) {
                this.f237946n = true;
            }
        }
        if (contentValues.containsKey("downloadURL")) {
            this.field_downloadURL = contentValues.getAsString("downloadURL");
            if (z17) {
                this.f237947o = true;
            }
        }
        if (contentValues.containsKey("startTime")) {
            this.field_startTime = contentValues.getAsLong("startTime").longValue();
            if (z17) {
                this.f237948p = true;
            }
        }
        if (contentValues.containsKey("endTime")) {
            this.field_endTime = contentValues.getAsLong("endTime").longValue();
            if (z17) {
                this.f237949q = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
