package dm;

/* loaded from: classes4.dex */
public class i0 extends l75.f0 {

    /* renamed from: h, reason: collision with root package name */
    public static final p75.n0 f237491h;

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.String[] f237492i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f237493m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f237494n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f237495o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f237496p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f237497q;

    /* renamed from: r, reason: collision with root package name */
    public static final l75.e0 f237498r;

    /* renamed from: s, reason: collision with root package name */
    public static final o75.e f237499s;
    public int field_recordId;
    public long field_updateTime;
    public java.lang.String field_username;
    public int field_versionType;

    /* renamed from: d, reason: collision with root package name */
    public boolean f237500d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f237501e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f237502f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f237503g = true;

    static {
        p75.n0 n0Var = new p75.n0("AppBrandTaskRecentApp");
        f237491h = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f237492i = new java.lang.String[0];
        f237493m = -799234740;
        f237494n = -265713450;
        f237495o = 689108018;
        f237496p = -295931082;
        f237497q = 108705909;
        f237498r = initAutoDBInfo(dm.i0.class);
        f237499s = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[4];
        java.lang.String[] strArr = new java.lang.String[5];
        e0Var.f316954c = strArr;
        strArr[0] = "recordId";
        e0Var.f316955d.put("recordId", "INTEGER PRIMARY KEY ");
        e0Var.f316953b = "recordId";
        e0Var.f316954c[1] = dm.i4.COL_USERNAME;
        e0Var.f316955d.put(dm.i4.COL_USERNAME, "TEXT");
        e0Var.f316954c[2] = "versionType";
        e0Var.f316955d.put("versionType", "INTEGER");
        e0Var.f316954c[3] = dm.i4.COL_UPDATETIME;
        e0Var.f316955d.put(dm.i4.COL_UPDATETIME, "LONG");
        e0Var.f316954c[4] = "rowid";
        e0Var.f316956e = " recordId INTEGER PRIMARY KEY ,  username TEXT,  versionType INTEGER,  updateTime LONG";
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
            if (f237493m == hashCode) {
                try {
                    this.field_recordId = cursor.getInt(i17);
                    this.f237500d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandTaskRecentApp", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237494n == hashCode) {
                try {
                    this.field_username = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandTaskRecentApp", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237495o == hashCode) {
                try {
                    this.field_versionType = cursor.getInt(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandTaskRecentApp", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237496p == hashCode) {
                try {
                    this.field_updateTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandTaskRecentApp", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237497q == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f237500d) {
            contentValues.put("recordId", java.lang.Integer.valueOf(this.field_recordId));
        }
        if (this.f237501e) {
            contentValues.put(dm.i4.COL_USERNAME, this.field_username);
        }
        if (this.f237502f) {
            contentValues.put("versionType", java.lang.Integer.valueOf(this.field_versionType));
        }
        if (this.f237503g) {
            contentValues.put(dm.i4.COL_UPDATETIME, java.lang.Long.valueOf(this.field_updateTime));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseAppBrandTaskRecentApp", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS AppBrandTaskRecentApp ( ");
        l75.e0 e0Var = f237498r;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f237492i) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseAppBrandTaskRecentApp", "createTableSql %s", str2);
            k0Var.A("AppBrandTaskRecentApp", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "AppBrandTaskRecentApp", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseAppBrandTaskRecentApp", "updateTableSql %s", str3);
            k0Var.A("AppBrandTaskRecentApp", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseAppBrandTaskRecentApp", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f237498r;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f237499s;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return java.lang.Integer.valueOf(this.field_recordId);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f237491h;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f237491h.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("recordId")) {
            this.field_recordId = contentValues.getAsInteger("recordId").intValue();
            if (z17) {
                this.f237500d = true;
            }
        }
        if (contentValues.containsKey(dm.i4.COL_USERNAME)) {
            this.field_username = contentValues.getAsString(dm.i4.COL_USERNAME);
            if (z17) {
                this.f237501e = true;
            }
        }
        if (contentValues.containsKey("versionType")) {
            this.field_versionType = contentValues.getAsInteger("versionType").intValue();
            if (z17) {
                this.f237502f = true;
            }
        }
        if (contentValues.containsKey(dm.i4.COL_UPDATETIME)) {
            this.field_updateTime = contentValues.getAsLong(dm.i4.COL_UPDATETIME).longValue();
            if (z17) {
                this.f237503g = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
