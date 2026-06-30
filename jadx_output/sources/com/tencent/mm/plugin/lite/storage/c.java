package com.tencent.mm.plugin.lite.storage;

/* loaded from: classes13.dex */
public class c extends l75.f0 {
    public static final o75.e A;

    /* renamed from: o, reason: collision with root package name */
    public static final p75.n0 f144208o;

    /* renamed from: p, reason: collision with root package name */
    public static final java.lang.String[] f144209p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f144210q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f144211r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f144212s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f144213t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f144214u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f144215v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f144216w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f144217x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f144218y;

    /* renamed from: z, reason: collision with root package name */
    public static final l75.e0 f144219z;
    public java.lang.String field_appId;
    public java.lang.String field_configJson;
    public java.lang.String field_dynamicConfigPath;
    public int field_iLinkVersion;
    public java.lang.String field_md5;
    public java.lang.String field_packageConfigPath;
    public java.lang.String field_signatureKey;
    public long field_updateTime;

    /* renamed from: d, reason: collision with root package name */
    public boolean f144220d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f144221e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f144222f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f144223g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f144224h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f144225i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f144226m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f144227n = true;

    static {
        p75.n0 n0Var = new p75.n0(com.tencent.mm.plugin.lite.config.LiteAppConfigMgr.KEY_LITE_APP_CONFIG_INFO);
        f144208o = n0Var;
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
        f144209p = new java.lang.String[0];
        f144210q = 93028124;
        f144211r = -1471139193;
        f144212s = -925050003;
        f144213t = -295931082;
        f144214u = 107902;
        f144215v = 1142236198;
        f144216w = 647263061;
        f144217x = 831222602;
        f144218y = 108705909;
        f144219z = initAutoDBInfo(com.tencent.mm.plugin.lite.storage.c.class);
        A = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[8];
        java.lang.String[] strArr = new java.lang.String[9];
        e0Var.f316954c = strArr;
        strArr[0] = "appId";
        e0Var.f316955d.put("appId", "TEXT PRIMARY KEY ");
        e0Var.f316953b = "appId";
        e0Var.f316954c[1] = "signatureKey";
        e0Var.f316955d.put("signatureKey", "TEXT");
        e0Var.f316954c[2] = "packageConfigPath";
        e0Var.f316955d.put("packageConfigPath", "TEXT");
        e0Var.f316954c[3] = dm.i4.COL_UPDATETIME;
        e0Var.f316955d.put(dm.i4.COL_UPDATETIME, "LONG");
        e0Var.f316954c[4] = "md5";
        e0Var.f316955d.put("md5", "TEXT");
        e0Var.f316954c[5] = "dynamicConfigPath";
        e0Var.f316955d.put("dynamicConfigPath", "TEXT");
        e0Var.f316954c[6] = "iLinkVersion";
        e0Var.f316955d.put("iLinkVersion", "INTEGER");
        e0Var.f316954c[7] = "configJson";
        e0Var.f316955d.put("configJson", "TEXT");
        e0Var.f316954c[8] = "rowid";
        e0Var.f316956e = " appId TEXT PRIMARY KEY ,  signatureKey TEXT,  packageConfigPath TEXT,  updateTime LONG,  md5 TEXT,  dynamicConfigPath TEXT,  iLinkVersion INTEGER,  configJson TEXT";
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
            if (f144210q == hashCode) {
                try {
                    this.field_appId = cursor.getString(i17);
                    this.f144220d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseLiteAppConfigInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f144211r == hashCode) {
                try {
                    this.field_signatureKey = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseLiteAppConfigInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f144212s == hashCode) {
                try {
                    this.field_packageConfigPath = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseLiteAppConfigInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f144213t == hashCode) {
                try {
                    this.field_updateTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseLiteAppConfigInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f144214u == hashCode) {
                try {
                    this.field_md5 = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseLiteAppConfigInfo", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f144215v == hashCode) {
                try {
                    this.field_dynamicConfigPath = cursor.getString(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseLiteAppConfigInfo", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f144216w == hashCode) {
                try {
                    this.field_iLinkVersion = cursor.getInt(i17);
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseLiteAppConfigInfo", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f144217x == hashCode) {
                try {
                    this.field_configJson = cursor.getString(i17);
                } catch (java.lang.Throwable th13) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseLiteAppConfigInfo", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f144218y == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f144220d) {
            contentValues.put("appId", this.field_appId);
        }
        if (this.f144221e) {
            contentValues.put("signatureKey", this.field_signatureKey);
        }
        if (this.f144222f) {
            contentValues.put("packageConfigPath", this.field_packageConfigPath);
        }
        if (this.f144223g) {
            contentValues.put(dm.i4.COL_UPDATETIME, java.lang.Long.valueOf(this.field_updateTime));
        }
        if (this.f144224h) {
            contentValues.put("md5", this.field_md5);
        }
        if (this.f144225i) {
            contentValues.put("dynamicConfigPath", this.field_dynamicConfigPath);
        }
        if (this.f144226m) {
            contentValues.put("iLinkVersion", java.lang.Integer.valueOf(this.field_iLinkVersion));
        }
        if (this.f144227n) {
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseLiteAppConfigInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS LiteAppConfigInfo ( ");
        l75.e0 e0Var = f144219z;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f144209p) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseLiteAppConfigInfo", "createTableSql %s", str2);
            k0Var.A(com.tencent.mm.plugin.lite.config.LiteAppConfigMgr.KEY_LITE_APP_CONFIG_INFO, str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, com.tencent.mm.plugin.lite.config.LiteAppConfigMgr.KEY_LITE_APP_CONFIG_INFO, k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseLiteAppConfigInfo", "updateTableSql %s", str3);
            k0Var.A(com.tencent.mm.plugin.lite.config.LiteAppConfigMgr.KEY_LITE_APP_CONFIG_INFO, str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseLiteAppConfigInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f144219z;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return A;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return this.field_appId;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f144208o;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f144208o.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("appId")) {
            this.field_appId = contentValues.getAsString("appId");
            if (z17) {
                this.f144220d = true;
            }
        }
        if (contentValues.containsKey("signatureKey")) {
            this.field_signatureKey = contentValues.getAsString("signatureKey");
            if (z17) {
                this.f144221e = true;
            }
        }
        if (contentValues.containsKey("packageConfigPath")) {
            this.field_packageConfigPath = contentValues.getAsString("packageConfigPath");
            if (z17) {
                this.f144222f = true;
            }
        }
        if (contentValues.containsKey(dm.i4.COL_UPDATETIME)) {
            this.field_updateTime = contentValues.getAsLong(dm.i4.COL_UPDATETIME).longValue();
            if (z17) {
                this.f144223g = true;
            }
        }
        if (contentValues.containsKey("md5")) {
            this.field_md5 = contentValues.getAsString("md5");
            if (z17) {
                this.f144224h = true;
            }
        }
        if (contentValues.containsKey("dynamicConfigPath")) {
            this.field_dynamicConfigPath = contentValues.getAsString("dynamicConfigPath");
            if (z17) {
                this.f144225i = true;
            }
        }
        if (contentValues.containsKey("iLinkVersion")) {
            this.field_iLinkVersion = contentValues.getAsInteger("iLinkVersion").intValue();
            if (z17) {
                this.f144226m = true;
            }
        }
        if (contentValues.containsKey("configJson")) {
            this.field_configJson = contentValues.getAsString("configJson");
            if (z17) {
                this.f144227n = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
