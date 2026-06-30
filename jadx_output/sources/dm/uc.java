package dm;

/* loaded from: classes4.dex */
public class uc extends l75.f0 {

    /* renamed from: h, reason: collision with root package name */
    public static final p75.n0 f240413h;

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.String[] f240414i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f240415m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f240416n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f240417o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f240418p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f240419q;

    /* renamed from: r, reason: collision with root package name */
    public static final l75.e0 f240420r;

    /* renamed from: s, reason: collision with root package name */
    public static final o75.e f240421s;
    public int field_appVersion;
    public int field_launchFallbackDirectlyMinVersion;
    public int field_reportId;
    public java.lang.String field_username;

    /* renamed from: d, reason: collision with root package name */
    public boolean f240422d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f240423e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f240424f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f240425g = true;

    static {
        p75.n0 n0Var = new p75.n0("WxaAttrVersionServerNotifyRecord");
        f240413h = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f240414i = new java.lang.String[]{"CREATE INDEX IF NOT EXISTS WxaAttrVersionServerNotifyRecordAppVersionIndex ON WxaAttrVersionServerNotifyRecord(appVersion)"};
        f240415m = -265713450;
        f240416n = 1484112759;
        f240417o = -427040401;
        f240418p = -2129938799;
        f240419q = 108705909;
        f240420r = initAutoDBInfo(dm.uc.class);
        f240421s = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[4];
        java.lang.String[] strArr = new java.lang.String[5];
        e0Var.f316954c = strArr;
        strArr[0] = dm.i4.COL_USERNAME;
        e0Var.f316955d.put(dm.i4.COL_USERNAME, "TEXT PRIMARY KEY ");
        e0Var.f316953b = dm.i4.COL_USERNAME;
        e0Var.f316954c[1] = "appVersion";
        e0Var.f316955d.put("appVersion", "INTEGER");
        e0Var.f316954c[2] = "reportId";
        e0Var.f316955d.put("reportId", "INTEGER");
        e0Var.f316954c[3] = "launchFallbackDirectlyMinVersion";
        e0Var.f316955d.put("launchFallbackDirectlyMinVersion", "INTEGER default '-1' ");
        e0Var.f316954c[4] = "rowid";
        e0Var.f316956e = " username TEXT PRIMARY KEY ,  appVersion INTEGER,  reportId INTEGER,  launchFallbackDirectlyMinVersion INTEGER default '-1' ";
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
            if (f240415m == hashCode) {
                try {
                    this.field_username = cursor.getString(i17);
                    this.f240422d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWxaAttrVersionServerNotifyRecord", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240416n == hashCode) {
                try {
                    this.field_appVersion = cursor.getInt(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWxaAttrVersionServerNotifyRecord", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240417o == hashCode) {
                try {
                    this.field_reportId = cursor.getInt(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWxaAttrVersionServerNotifyRecord", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240418p == hashCode) {
                try {
                    this.field_launchFallbackDirectlyMinVersion = cursor.getInt(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWxaAttrVersionServerNotifyRecord", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240419q == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f240422d) {
            contentValues.put(dm.i4.COL_USERNAME, this.field_username);
        }
        if (this.f240423e) {
            contentValues.put("appVersion", java.lang.Integer.valueOf(this.field_appVersion));
        }
        if (this.f240424f) {
            contentValues.put("reportId", java.lang.Integer.valueOf(this.field_reportId));
        }
        if (this.f240425g) {
            contentValues.put("launchFallbackDirectlyMinVersion", java.lang.Integer.valueOf(this.field_launchFallbackDirectlyMinVersion));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseWxaAttrVersionServerNotifyRecord", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS WxaAttrVersionServerNotifyRecord ( ");
        l75.e0 e0Var = f240420r;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f240414i) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseWxaAttrVersionServerNotifyRecord", "createTableSql %s", str2);
            k0Var.A("WxaAttrVersionServerNotifyRecord", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "WxaAttrVersionServerNotifyRecord", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseWxaAttrVersionServerNotifyRecord", "updateTableSql %s", str3);
            k0Var.A("WxaAttrVersionServerNotifyRecord", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseWxaAttrVersionServerNotifyRecord", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f240420r;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f240421s;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return this.field_username;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f240413h;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f240413h.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey(dm.i4.COL_USERNAME)) {
            this.field_username = contentValues.getAsString(dm.i4.COL_USERNAME);
            if (z17) {
                this.f240422d = true;
            }
        }
        if (contentValues.containsKey("appVersion")) {
            this.field_appVersion = contentValues.getAsInteger("appVersion").intValue();
            if (z17) {
                this.f240423e = true;
            }
        }
        if (contentValues.containsKey("reportId")) {
            this.field_reportId = contentValues.getAsInteger("reportId").intValue();
            if (z17) {
                this.f240424f = true;
            }
        }
        if (contentValues.containsKey("launchFallbackDirectlyMinVersion")) {
            this.field_launchFallbackDirectlyMinVersion = contentValues.getAsInteger("launchFallbackDirectlyMinVersion").intValue();
            if (z17) {
                this.f240425g = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
