package dm;

/* loaded from: classes4.dex */
public class tc extends l75.f0 {

    /* renamed from: i, reason: collision with root package name */
    public static final p75.n0 f240199i;

    /* renamed from: m, reason: collision with root package name */
    public static final java.lang.String[] f240200m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f240201n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f240202o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f240203p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f240204q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f240205r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f240206s;

    /* renamed from: t, reason: collision with root package name */
    public static final l75.e0 f240207t;

    /* renamed from: u, reason: collision with root package name */
    public static final o75.e f240208u;
    public java.lang.String field_appId;
    public int field_appType;
    public byte[] field_gameRewardsData;
    public byte[] field_permissionBytes;
    public int field_versionType;

    /* renamed from: d, reason: collision with root package name */
    public boolean f240209d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f240210e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f240211f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f240212g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f240213h = true;

    static {
        p75.n0 n0Var = new p75.n0("WxaAppidABTestInfo");
        f240199i = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f240200m = new java.lang.String[0];
        f240201n = 93028124;
        f240202o = -793934597;
        f240203p = 689108018;
        f240204q = -1648143396;
        f240205r = -315778660;
        f240206s = 108705909;
        f240207t = initAutoDBInfo(dm.tc.class);
        f240208u = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[5];
        java.lang.String[] strArr = new java.lang.String[6];
        e0Var.f316954c = strArr;
        strArr[0] = "appId";
        e0Var.f316955d.put("appId", "TEXT");
        e0Var.f316954c[1] = "appType";
        e0Var.f316955d.put("appType", "INTEGER");
        e0Var.f316954c[2] = "versionType";
        e0Var.f316955d.put("versionType", "INTEGER");
        e0Var.f316954c[3] = "permissionBytes";
        e0Var.f316955d.put("permissionBytes", "BLOB");
        e0Var.f316954c[4] = "gameRewardsData";
        e0Var.f316955d.put("gameRewardsData", "BLOB");
        e0Var.f316954c[5] = "rowid";
        e0Var.f316956e = " appId TEXT,  appType INTEGER,  versionType INTEGER,  permissionBytes BLOB,  gameRewardsData BLOB";
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
            if (f240201n == hashCode) {
                try {
                    this.field_appId = cursor.getString(i17);
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWxaAppidABTestInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240202o == hashCode) {
                try {
                    this.field_appType = cursor.getInt(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWxaAppidABTestInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240203p == hashCode) {
                try {
                    this.field_versionType = cursor.getInt(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWxaAppidABTestInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240204q == hashCode) {
                try {
                    this.field_permissionBytes = cursor.getBlob(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWxaAppidABTestInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240205r == hashCode) {
                try {
                    this.field_gameRewardsData = cursor.getBlob(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWxaAppidABTestInfo", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240206s == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f240209d) {
            contentValues.put("appId", this.field_appId);
        }
        if (this.f240210e) {
            contentValues.put("appType", java.lang.Integer.valueOf(this.field_appType));
        }
        if (this.f240211f) {
            contentValues.put("versionType", java.lang.Integer.valueOf(this.field_versionType));
        }
        if (this.f240212g) {
            contentValues.put("permissionBytes", this.field_permissionBytes);
        }
        if (this.f240213h) {
            contentValues.put("gameRewardsData", this.field_gameRewardsData);
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseWxaAppidABTestInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS WxaAppidABTestInfo ( ");
        l75.e0 e0Var = f240207t;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f240200m) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseWxaAppidABTestInfo", "createTableSql %s", str2);
            k0Var.A("WxaAppidABTestInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "WxaAppidABTestInfo", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseWxaAppidABTestInfo", "updateTableSql %s", str3);
            k0Var.A("WxaAppidABTestInfo", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseWxaAppidABTestInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f240207t;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f240208u;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return java.lang.Long.valueOf(this.systemRowid);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f240199i;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f240199i.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("appId")) {
            this.field_appId = contentValues.getAsString("appId");
            if (z17) {
                this.f240209d = true;
            }
        }
        if (contentValues.containsKey("appType")) {
            this.field_appType = contentValues.getAsInteger("appType").intValue();
            if (z17) {
                this.f240210e = true;
            }
        }
        if (contentValues.containsKey("versionType")) {
            this.field_versionType = contentValues.getAsInteger("versionType").intValue();
            if (z17) {
                this.f240211f = true;
            }
        }
        if (contentValues.containsKey("permissionBytes")) {
            this.field_permissionBytes = contentValues.getAsByteArray("permissionBytes");
            if (z17) {
                this.f240212g = true;
            }
        }
        if (contentValues.containsKey("gameRewardsData")) {
            this.field_gameRewardsData = contentValues.getAsByteArray("gameRewardsData");
            if (z17) {
                this.f240213h = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
