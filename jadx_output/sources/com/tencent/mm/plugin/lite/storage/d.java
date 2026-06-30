package com.tencent.mm.plugin.lite.storage;

/* loaded from: classes13.dex */
public class d extends l75.f0 {
    public static final int A;
    public static final int B;
    public static final int C;
    public static final int D;
    public static final int E;
    public static final int F;
    public static final int G;
    public static final int H;
    public static final int I;

    /* renamed from: J, reason: collision with root package name */
    public static final l75.e0 f144228J;
    public static final o75.e K;

    /* renamed from: t, reason: collision with root package name */
    public static final p75.n0 f144229t;

    /* renamed from: u, reason: collision with root package name */
    public static final java.lang.String[] f144230u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f144231v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f144232w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f144233x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f144234y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f144235z;
    public java.lang.String field_appId;
    public java.lang.String field_groupId;
    public int field_iLinkVersion;
    public long field_lastUseTime;
    public java.lang.String field_md5;
    public java.lang.String field_openOption;
    public java.lang.String field_patchId;
    public java.lang.String field_pkgPath;
    public java.lang.String field_pkgType;
    public java.lang.String field_signatureKey;
    public long field_updateTime;
    public java.lang.String field_url;
    public java.lang.String field_version;

    /* renamed from: d, reason: collision with root package name */
    public boolean f144236d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f144237e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f144238f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f144239g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f144240h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f144241i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f144242m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f144243n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f144244o = true;

    /* renamed from: p, reason: collision with root package name */
    public boolean f144245p = true;

    /* renamed from: q, reason: collision with root package name */
    public boolean f144246q = true;

    /* renamed from: r, reason: collision with root package name */
    public boolean f144247r = true;

    /* renamed from: s, reason: collision with root package name */
    public boolean f144248s = true;

    static {
        p75.n0 n0Var = new p75.n0("LiteAppInfo");
        f144229t = n0Var;
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
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f144230u = new java.lang.String[0];
        f144231v = 93028124;
        f144232w = 293428218;
        f144233x = -1471139193;
        f144234y = -517880815;
        f144235z = -517738714;
        A = -791595133;
        B = -295931082;
        C = 351608024;
        D = 116079;
        E = 107902;
        F = 1736147326;
        G = 647263061;
        H = 230439775;
        I = 108705909;
        f144228J = initAutoDBInfo(com.tencent.mm.plugin.lite.storage.d.class);
        K = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[13];
        java.lang.String[] strArr = new java.lang.String[14];
        e0Var.f316954c = strArr;
        strArr[0] = "appId";
        e0Var.f316955d.put("appId", "TEXT PRIMARY KEY ");
        e0Var.f316953b = "appId";
        e0Var.f316954c[1] = "groupId";
        e0Var.f316955d.put("groupId", "TEXT");
        e0Var.f316954c[2] = "signatureKey";
        e0Var.f316955d.put("signatureKey", "TEXT");
        e0Var.f316954c[3] = "pkgPath";
        e0Var.f316955d.put("pkgPath", "TEXT");
        e0Var.f316954c[4] = "pkgType";
        e0Var.f316955d.put("pkgType", "TEXT");
        e0Var.f316954c[5] = "patchId";
        e0Var.f316955d.put("patchId", "TEXT");
        e0Var.f316954c[6] = dm.i4.COL_UPDATETIME;
        e0Var.f316955d.put(dm.i4.COL_UPDATETIME, "LONG");
        e0Var.f316954c[7] = "version";
        e0Var.f316955d.put("version", "TEXT");
        e0Var.f316954c[8] = "url";
        e0Var.f316955d.put("url", "TEXT");
        e0Var.f316954c[9] = "md5";
        e0Var.f316955d.put("md5", "TEXT");
        e0Var.f316954c[10] = "lastUseTime";
        e0Var.f316955d.put("lastUseTime", "LONG");
        e0Var.f316954c[11] = "iLinkVersion";
        e0Var.f316955d.put("iLinkVersion", "INTEGER");
        e0Var.f316954c[12] = "openOption";
        e0Var.f316955d.put("openOption", "TEXT");
        e0Var.f316954c[13] = "rowid";
        e0Var.f316956e = " appId TEXT PRIMARY KEY ,  groupId TEXT,  signatureKey TEXT,  pkgPath TEXT,  pkgType TEXT,  patchId TEXT,  updateTime LONG,  version TEXT,  url TEXT,  md5 TEXT,  lastUseTime LONG,  iLinkVersion INTEGER,  openOption TEXT";
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
            if (f144231v == hashCode) {
                try {
                    this.field_appId = cursor.getString(i17);
                    this.f144236d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseLiteAppInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f144232w == hashCode) {
                try {
                    this.field_groupId = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseLiteAppInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f144233x == hashCode) {
                try {
                    this.field_signatureKey = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseLiteAppInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f144234y == hashCode) {
                try {
                    this.field_pkgPath = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseLiteAppInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f144235z == hashCode) {
                try {
                    this.field_pkgType = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseLiteAppInfo", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (A == hashCode) {
                try {
                    this.field_patchId = cursor.getString(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseLiteAppInfo", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (B == hashCode) {
                try {
                    this.field_updateTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseLiteAppInfo", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (C == hashCode) {
                try {
                    this.field_version = cursor.getString(i17);
                } catch (java.lang.Throwable th13) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseLiteAppInfo", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (D == hashCode) {
                try {
                    this.field_url = cursor.getString(i17);
                } catch (java.lang.Throwable th14) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseLiteAppInfo", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (E == hashCode) {
                try {
                    this.field_md5 = cursor.getString(i17);
                } catch (java.lang.Throwable th15) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseLiteAppInfo", th15, "convertFrom %s", columnNames[i17]);
                    java.lang.String str10 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (F == hashCode) {
                try {
                    this.field_lastUseTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th16) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseLiteAppInfo", th16, "convertFrom %s", columnNames[i17]);
                    java.lang.String str11 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (G == hashCode) {
                try {
                    this.field_iLinkVersion = cursor.getInt(i17);
                } catch (java.lang.Throwable th17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseLiteAppInfo", th17, "convertFrom %s", columnNames[i17]);
                    java.lang.String str12 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (H == hashCode) {
                try {
                    this.field_openOption = cursor.getString(i17);
                } catch (java.lang.Throwable th18) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseLiteAppInfo", th18, "convertFrom %s", columnNames[i17]);
                    java.lang.String str13 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (I == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f144236d) {
            contentValues.put("appId", this.field_appId);
        }
        if (this.f144237e) {
            contentValues.put("groupId", this.field_groupId);
        }
        if (this.f144238f) {
            contentValues.put("signatureKey", this.field_signatureKey);
        }
        if (this.f144239g) {
            contentValues.put("pkgPath", this.field_pkgPath);
        }
        if (this.f144240h) {
            contentValues.put("pkgType", this.field_pkgType);
        }
        if (this.f144241i) {
            contentValues.put("patchId", this.field_patchId);
        }
        if (this.f144242m) {
            contentValues.put(dm.i4.COL_UPDATETIME, java.lang.Long.valueOf(this.field_updateTime));
        }
        if (this.f144243n) {
            contentValues.put("version", this.field_version);
        }
        if (this.f144244o) {
            contentValues.put("url", this.field_url);
        }
        if (this.f144245p) {
            contentValues.put("md5", this.field_md5);
        }
        if (this.f144246q) {
            contentValues.put("lastUseTime", java.lang.Long.valueOf(this.field_lastUseTime));
        }
        if (this.f144247r) {
            contentValues.put("iLinkVersion", java.lang.Integer.valueOf(this.field_iLinkVersion));
        }
        if (this.f144248s) {
            contentValues.put("openOption", this.field_openOption);
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseLiteAppInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS LiteAppInfo ( ");
        l75.e0 e0Var = f144228J;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f144230u) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseLiteAppInfo", "createTableSql %s", str2);
            k0Var.A("LiteAppInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "LiteAppInfo", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseLiteAppInfo", "updateTableSql %s", str3);
            k0Var.A("LiteAppInfo", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseLiteAppInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f144228J;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return K;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return this.field_appId;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f144229t;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f144229t.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("appId")) {
            this.field_appId = contentValues.getAsString("appId");
            if (z17) {
                this.f144236d = true;
            }
        }
        if (contentValues.containsKey("groupId")) {
            this.field_groupId = contentValues.getAsString("groupId");
            if (z17) {
                this.f144237e = true;
            }
        }
        if (contentValues.containsKey("signatureKey")) {
            this.field_signatureKey = contentValues.getAsString("signatureKey");
            if (z17) {
                this.f144238f = true;
            }
        }
        if (contentValues.containsKey("pkgPath")) {
            this.field_pkgPath = contentValues.getAsString("pkgPath");
            if (z17) {
                this.f144239g = true;
            }
        }
        if (contentValues.containsKey("pkgType")) {
            this.field_pkgType = contentValues.getAsString("pkgType");
            if (z17) {
                this.f144240h = true;
            }
        }
        if (contentValues.containsKey("patchId")) {
            this.field_patchId = contentValues.getAsString("patchId");
            if (z17) {
                this.f144241i = true;
            }
        }
        if (contentValues.containsKey(dm.i4.COL_UPDATETIME)) {
            this.field_updateTime = contentValues.getAsLong(dm.i4.COL_UPDATETIME).longValue();
            if (z17) {
                this.f144242m = true;
            }
        }
        if (contentValues.containsKey("version")) {
            this.field_version = contentValues.getAsString("version");
            if (z17) {
                this.f144243n = true;
            }
        }
        if (contentValues.containsKey("url")) {
            this.field_url = contentValues.getAsString("url");
            if (z17) {
                this.f144244o = true;
            }
        }
        if (contentValues.containsKey("md5")) {
            this.field_md5 = contentValues.getAsString("md5");
            if (z17) {
                this.f144245p = true;
            }
        }
        if (contentValues.containsKey("lastUseTime")) {
            this.field_lastUseTime = contentValues.getAsLong("lastUseTime").longValue();
            if (z17) {
                this.f144246q = true;
            }
        }
        if (contentValues.containsKey("iLinkVersion")) {
            this.field_iLinkVersion = contentValues.getAsInteger("iLinkVersion").intValue();
            if (z17) {
                this.f144247r = true;
            }
        }
        if (contentValues.containsKey("openOption")) {
            this.field_openOption = contentValues.getAsString("openOption");
            if (z17) {
                this.f144248s = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
