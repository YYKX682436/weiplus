package com.tencent.mm.plugin.lite.storage;

/* loaded from: classes13.dex */
public class e extends l75.f0 {

    /* renamed from: n, reason: collision with root package name */
    public static final p75.n0 f144249n;

    /* renamed from: o, reason: collision with root package name */
    public static final java.lang.String[] f144250o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f144251p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f144252q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f144253r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f144254s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f144255t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f144256u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f144257v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f144258w;

    /* renamed from: x, reason: collision with root package name */
    public static final l75.e0 f144259x;

    /* renamed from: y, reason: collision with root package name */
    public static final o75.e f144260y;
    public java.lang.String field_appId;
    public java.lang.String field_configJson;
    public java.lang.String field_dynamicConfigPath;
    public int field_iLinkVersion;
    public java.lang.String field_md5;
    public java.lang.String field_signatureKey;
    public long field_updateTime;

    /* renamed from: d, reason: collision with root package name */
    public boolean f144261d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f144262e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f144263f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f144264g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f144265h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f144266i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f144267m = true;

    static {
        p75.n0 n0Var = new p75.n0(com.tencent.mm.plugin.lite.config.LiteAppConfigMgr.KEY_LITE_APP_SAMPLING_CONFIG_INFO);
        f144249n = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f144250o = new java.lang.String[0];
        f144251p = 93028124;
        f144252q = -1471139193;
        f144253r = -295931082;
        f144254s = 107902;
        f144255t = 1142236198;
        f144256u = 647263061;
        f144257v = 831222602;
        f144258w = 108705909;
        f144259x = initAutoDBInfo(com.tencent.mm.plugin.lite.storage.e.class);
        f144260y = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[7];
        java.lang.String[] strArr = new java.lang.String[8];
        e0Var.f316954c = strArr;
        strArr[0] = "appId";
        e0Var.f316955d.put("appId", "TEXT PRIMARY KEY ");
        e0Var.f316953b = "appId";
        e0Var.f316954c[1] = "signatureKey";
        e0Var.f316955d.put("signatureKey", "TEXT");
        e0Var.f316954c[2] = dm.i4.COL_UPDATETIME;
        e0Var.f316955d.put(dm.i4.COL_UPDATETIME, "LONG");
        e0Var.f316954c[3] = "md5";
        e0Var.f316955d.put("md5", "TEXT");
        e0Var.f316954c[4] = "dynamicConfigPath";
        e0Var.f316955d.put("dynamicConfigPath", "TEXT");
        e0Var.f316954c[5] = "iLinkVersion";
        e0Var.f316955d.put("iLinkVersion", "INTEGER");
        e0Var.f316954c[6] = "configJson";
        e0Var.f316955d.put("configJson", "TEXT");
        e0Var.f316954c[7] = "rowid";
        e0Var.f316956e = " appId TEXT PRIMARY KEY ,  signatureKey TEXT,  updateTime LONG,  md5 TEXT,  dynamicConfigPath TEXT,  iLinkVersion INTEGER,  configJson TEXT";
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
            if (f144251p == hashCode) {
                try {
                    this.field_appId = cursor.getString(i17);
                    this.f144261d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseLiteAppSamplingConfigInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f144252q == hashCode) {
                try {
                    this.field_signatureKey = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseLiteAppSamplingConfigInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f144253r == hashCode) {
                try {
                    this.field_updateTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseLiteAppSamplingConfigInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f144254s == hashCode) {
                try {
                    this.field_md5 = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseLiteAppSamplingConfigInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f144255t == hashCode) {
                try {
                    this.field_dynamicConfigPath = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseLiteAppSamplingConfigInfo", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f144256u == hashCode) {
                try {
                    this.field_iLinkVersion = cursor.getInt(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseLiteAppSamplingConfigInfo", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f144257v == hashCode) {
                try {
                    this.field_configJson = cursor.getString(i17);
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseLiteAppSamplingConfigInfo", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f144258w == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f144261d) {
            contentValues.put("appId", this.field_appId);
        }
        if (this.f144262e) {
            contentValues.put("signatureKey", this.field_signatureKey);
        }
        if (this.f144263f) {
            contentValues.put(dm.i4.COL_UPDATETIME, java.lang.Long.valueOf(this.field_updateTime));
        }
        if (this.f144264g) {
            contentValues.put("md5", this.field_md5);
        }
        if (this.f144265h) {
            contentValues.put("dynamicConfigPath", this.field_dynamicConfigPath);
        }
        if (this.f144266i) {
            contentValues.put("iLinkVersion", java.lang.Integer.valueOf(this.field_iLinkVersion));
        }
        if (this.f144267m) {
            contentValues.put("configJson", this.field_configJson);
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseLiteAppSamplingConfigInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS LiteAppSamplingConfigInfo ( ");
        l75.e0 e0Var = f144259x;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f144250o) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseLiteAppSamplingConfigInfo", "createTableSql %s", str2);
            k0Var.A(com.tencent.mm.plugin.lite.config.LiteAppConfigMgr.KEY_LITE_APP_SAMPLING_CONFIG_INFO, str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, com.tencent.mm.plugin.lite.config.LiteAppConfigMgr.KEY_LITE_APP_SAMPLING_CONFIG_INFO, k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseLiteAppSamplingConfigInfo", "updateTableSql %s", str3);
            k0Var.A(com.tencent.mm.plugin.lite.config.LiteAppConfigMgr.KEY_LITE_APP_SAMPLING_CONFIG_INFO, str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseLiteAppSamplingConfigInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f144259x;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f144260y;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return this.field_appId;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f144249n;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f144249n.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("appId")) {
            this.field_appId = contentValues.getAsString("appId");
            if (z17) {
                this.f144261d = true;
            }
        }
        if (contentValues.containsKey("signatureKey")) {
            this.field_signatureKey = contentValues.getAsString("signatureKey");
            if (z17) {
                this.f144262e = true;
            }
        }
        if (contentValues.containsKey(dm.i4.COL_UPDATETIME)) {
            this.field_updateTime = contentValues.getAsLong(dm.i4.COL_UPDATETIME).longValue();
            if (z17) {
                this.f144263f = true;
            }
        }
        if (contentValues.containsKey("md5")) {
            this.field_md5 = contentValues.getAsString("md5");
            if (z17) {
                this.f144264g = true;
            }
        }
        if (contentValues.containsKey("dynamicConfigPath")) {
            this.field_dynamicConfigPath = contentValues.getAsString("dynamicConfigPath");
            if (z17) {
                this.f144265h = true;
            }
        }
        if (contentValues.containsKey("iLinkVersion")) {
            this.field_iLinkVersion = contentValues.getAsInteger("iLinkVersion").intValue();
            if (z17) {
                this.f144266i = true;
            }
        }
        if (contentValues.containsKey("configJson")) {
            this.field_configJson = contentValues.getAsString("configJson");
            if (z17) {
                this.f144267m = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
