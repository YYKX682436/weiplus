package com.tencent.mm.plugin.lite.storage;

/* loaded from: classes13.dex */
public class b extends l75.f0 {
    public static final int A;
    public static final int B;
    public static final int C;
    public static final int D;
    public static final int E;
    public static final l75.e0 F;
    public static final o75.e G;

    /* renamed from: r, reason: collision with root package name */
    public static final p75.n0 f144188r;

    /* renamed from: s, reason: collision with root package name */
    public static final java.lang.String[] f144189s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f144190t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f144191u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f144192v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f144193w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f144194x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f144195y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f144196z;
    public int field_iLinkVersion;
    public long field_lastUseTime;
    public java.lang.String field_majorVersion;
    public java.lang.String field_md5;
    public java.lang.String field_patchId;
    public java.lang.String field_pkgPath;
    public java.lang.String field_pkgType;
    public java.lang.String field_signatureKey;
    public long field_updateTime;
    public java.lang.String field_url;
    public java.lang.String field_version;

    /* renamed from: d, reason: collision with root package name */
    public boolean f144197d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f144198e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f144199f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f144200g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f144201h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f144202i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f144203m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f144204n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f144205o = true;

    /* renamed from: p, reason: collision with root package name */
    public boolean f144206p = true;

    /* renamed from: q, reason: collision with root package name */
    public boolean f144207q = true;

    static {
        p75.n0 n0Var = new p75.n0("LiteAppBaselibInfo");
        f144188r = n0Var;
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
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f144189s = new java.lang.String[0];
        f144190t = -606876449;
        f144191u = -1471139193;
        f144192v = -517880815;
        f144193w = -517738714;
        f144194x = -791595133;
        f144195y = -295931082;
        f144196z = 116079;
        A = 107902;
        B = 1736147326;
        C = 647263061;
        D = 351608024;
        E = 108705909;
        F = initAutoDBInfo(com.tencent.mm.plugin.lite.storage.b.class);
        G = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[11];
        java.lang.String[] strArr = new java.lang.String[12];
        e0Var.f316954c = strArr;
        strArr[0] = com.tencent.liteapp.storage.WxaLiteAppBaselibInfo.KEY_MAJOR_VERSION;
        e0Var.f316955d.put(com.tencent.liteapp.storage.WxaLiteAppBaselibInfo.KEY_MAJOR_VERSION, "TEXT PRIMARY KEY ");
        e0Var.f316953b = com.tencent.liteapp.storage.WxaLiteAppBaselibInfo.KEY_MAJOR_VERSION;
        e0Var.f316954c[1] = "signatureKey";
        e0Var.f316955d.put("signatureKey", "TEXT");
        e0Var.f316954c[2] = "pkgPath";
        e0Var.f316955d.put("pkgPath", "TEXT");
        e0Var.f316954c[3] = "pkgType";
        e0Var.f316955d.put("pkgType", "TEXT");
        e0Var.f316954c[4] = "patchId";
        e0Var.f316955d.put("patchId", "TEXT");
        e0Var.f316954c[5] = dm.i4.COL_UPDATETIME;
        e0Var.f316955d.put(dm.i4.COL_UPDATETIME, "LONG");
        e0Var.f316954c[6] = "url";
        e0Var.f316955d.put("url", "TEXT");
        e0Var.f316954c[7] = "md5";
        e0Var.f316955d.put("md5", "TEXT");
        e0Var.f316954c[8] = "lastUseTime";
        e0Var.f316955d.put("lastUseTime", "LONG");
        e0Var.f316954c[9] = "iLinkVersion";
        e0Var.f316955d.put("iLinkVersion", "INTEGER");
        e0Var.f316954c[10] = "version";
        e0Var.f316955d.put("version", "TEXT");
        e0Var.f316954c[11] = "rowid";
        e0Var.f316956e = " majorVersion TEXT PRIMARY KEY ,  signatureKey TEXT,  pkgPath TEXT,  pkgType TEXT,  patchId TEXT,  updateTime LONG,  url TEXT,  md5 TEXT,  lastUseTime LONG,  iLinkVersion INTEGER,  version TEXT";
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
            if (f144190t == hashCode) {
                try {
                    this.field_majorVersion = cursor.getString(i17);
                    this.f144197d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseLiteAppBaselibInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f144191u == hashCode) {
                try {
                    this.field_signatureKey = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseLiteAppBaselibInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f144192v == hashCode) {
                try {
                    this.field_pkgPath = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseLiteAppBaselibInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f144193w == hashCode) {
                try {
                    this.field_pkgType = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseLiteAppBaselibInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f144194x == hashCode) {
                try {
                    this.field_patchId = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseLiteAppBaselibInfo", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f144195y == hashCode) {
                try {
                    this.field_updateTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseLiteAppBaselibInfo", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f144196z == hashCode) {
                try {
                    this.field_url = cursor.getString(i17);
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseLiteAppBaselibInfo", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (A == hashCode) {
                try {
                    this.field_md5 = cursor.getString(i17);
                } catch (java.lang.Throwable th13) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseLiteAppBaselibInfo", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (B == hashCode) {
                try {
                    this.field_lastUseTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th14) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseLiteAppBaselibInfo", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (C == hashCode) {
                try {
                    this.field_iLinkVersion = cursor.getInt(i17);
                } catch (java.lang.Throwable th15) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseLiteAppBaselibInfo", th15, "convertFrom %s", columnNames[i17]);
                    java.lang.String str10 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (D == hashCode) {
                try {
                    this.field_version = cursor.getString(i17);
                } catch (java.lang.Throwable th16) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseLiteAppBaselibInfo", th16, "convertFrom %s", columnNames[i17]);
                    java.lang.String str11 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (E == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f144197d) {
            contentValues.put(com.tencent.liteapp.storage.WxaLiteAppBaselibInfo.KEY_MAJOR_VERSION, this.field_majorVersion);
        }
        if (this.f144198e) {
            contentValues.put("signatureKey", this.field_signatureKey);
        }
        if (this.f144199f) {
            contentValues.put("pkgPath", this.field_pkgPath);
        }
        if (this.f144200g) {
            contentValues.put("pkgType", this.field_pkgType);
        }
        if (this.f144201h) {
            contentValues.put("patchId", this.field_patchId);
        }
        if (this.f144202i) {
            contentValues.put(dm.i4.COL_UPDATETIME, java.lang.Long.valueOf(this.field_updateTime));
        }
        if (this.f144203m) {
            contentValues.put("url", this.field_url);
        }
        if (this.f144204n) {
            contentValues.put("md5", this.field_md5);
        }
        if (this.f144205o) {
            contentValues.put("lastUseTime", java.lang.Long.valueOf(this.field_lastUseTime));
        }
        if (this.f144206p) {
            contentValues.put("iLinkVersion", java.lang.Integer.valueOf(this.field_iLinkVersion));
        }
        if (this.f144207q) {
            contentValues.put("version", this.field_version);
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseLiteAppBaselibInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS LiteAppBaselibInfo ( ");
        l75.e0 e0Var = F;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f144189s) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseLiteAppBaselibInfo", "createTableSql %s", str2);
            k0Var.A("LiteAppBaselibInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "LiteAppBaselibInfo", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseLiteAppBaselibInfo", "updateTableSql %s", str3);
            k0Var.A("LiteAppBaselibInfo", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseLiteAppBaselibInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return F;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return G;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return this.field_majorVersion;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f144188r;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f144188r.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey(com.tencent.liteapp.storage.WxaLiteAppBaselibInfo.KEY_MAJOR_VERSION)) {
            this.field_majorVersion = contentValues.getAsString(com.tencent.liteapp.storage.WxaLiteAppBaselibInfo.KEY_MAJOR_VERSION);
            if (z17) {
                this.f144197d = true;
            }
        }
        if (contentValues.containsKey("signatureKey")) {
            this.field_signatureKey = contentValues.getAsString("signatureKey");
            if (z17) {
                this.f144198e = true;
            }
        }
        if (contentValues.containsKey("pkgPath")) {
            this.field_pkgPath = contentValues.getAsString("pkgPath");
            if (z17) {
                this.f144199f = true;
            }
        }
        if (contentValues.containsKey("pkgType")) {
            this.field_pkgType = contentValues.getAsString("pkgType");
            if (z17) {
                this.f144200g = true;
            }
        }
        if (contentValues.containsKey("patchId")) {
            this.field_patchId = contentValues.getAsString("patchId");
            if (z17) {
                this.f144201h = true;
            }
        }
        if (contentValues.containsKey(dm.i4.COL_UPDATETIME)) {
            this.field_updateTime = contentValues.getAsLong(dm.i4.COL_UPDATETIME).longValue();
            if (z17) {
                this.f144202i = true;
            }
        }
        if (contentValues.containsKey("url")) {
            this.field_url = contentValues.getAsString("url");
            if (z17) {
                this.f144203m = true;
            }
        }
        if (contentValues.containsKey("md5")) {
            this.field_md5 = contentValues.getAsString("md5");
            if (z17) {
                this.f144204n = true;
            }
        }
        if (contentValues.containsKey("lastUseTime")) {
            this.field_lastUseTime = contentValues.getAsLong("lastUseTime").longValue();
            if (z17) {
                this.f144205o = true;
            }
        }
        if (contentValues.containsKey("iLinkVersion")) {
            this.field_iLinkVersion = contentValues.getAsInteger("iLinkVersion").intValue();
            if (z17) {
                this.f144206p = true;
            }
        }
        if (contentValues.containsKey("version")) {
            this.field_version = contentValues.getAsString("version");
            if (z17) {
                this.f144207q = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
