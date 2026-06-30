package dm;

/* loaded from: classes4.dex */
public class s extends l75.f0 {

    /* renamed from: g, reason: collision with root package name */
    public static final p75.n0 f239749g;

    /* renamed from: h, reason: collision with root package name */
    public static final java.lang.String[] f239750h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f239751i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f239752m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f239753n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f239754o;

    /* renamed from: p, reason: collision with root package name */
    public static final l75.e0 f239755p;

    /* renamed from: q, reason: collision with root package name */
    public static final o75.e f239756q;

    /* renamed from: d, reason: collision with root package name */
    public boolean f239757d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f239758e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f239759f = true;
    public long field_updateTime;
    public java.lang.String field_username;
    public int field_usernameHash;

    static {
        p75.n0 n0Var = new p75.n0("AppBrandAppLaunchUsernameDuplicateRecord2");
        f239749g = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f239750h = new java.lang.String[]{"CREATE INDEX IF NOT EXISTS AppBrandAppLaunchRecordUpdateTimeIndex ON AppBrandAppLaunchUsernameDuplicateRecord2(updateTime)"};
        f239751i = 1007641348;
        f239752m = -265713450;
        f239753n = -295931082;
        f239754o = 108705909;
        f239755p = initAutoDBInfo(dm.s.class);
        f239756q = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[3];
        java.lang.String[] strArr = new java.lang.String[4];
        e0Var.f316954c = strArr;
        strArr[0] = "usernameHash";
        e0Var.f316955d.put("usernameHash", "INTEGER PRIMARY KEY ");
        e0Var.f316953b = "usernameHash";
        e0Var.f316954c[1] = dm.i4.COL_USERNAME;
        e0Var.f316955d.put(dm.i4.COL_USERNAME, "TEXT");
        e0Var.f316954c[2] = dm.i4.COL_UPDATETIME;
        e0Var.f316955d.put(dm.i4.COL_UPDATETIME, "LONG");
        e0Var.f316954c[3] = "rowid";
        e0Var.f316956e = " usernameHash INTEGER PRIMARY KEY ,  username TEXT,  updateTime LONG";
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
            if (f239751i == hashCode) {
                try {
                    this.field_usernameHash = cursor.getInt(i17);
                    this.f239757d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandAppLaunchUsernameDuplicateRecord2", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239752m == hashCode) {
                try {
                    this.field_username = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandAppLaunchUsernameDuplicateRecord2", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239753n == hashCode) {
                try {
                    this.field_updateTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandAppLaunchUsernameDuplicateRecord2", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239754o == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f239757d) {
            contentValues.put("usernameHash", java.lang.Integer.valueOf(this.field_usernameHash));
        }
        if (this.f239758e) {
            contentValues.put(dm.i4.COL_USERNAME, this.field_username);
        }
        if (this.f239759f) {
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseAppBrandAppLaunchUsernameDuplicateRecord2", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS AppBrandAppLaunchUsernameDuplicateRecord2 ( ");
        l75.e0 e0Var = f239755p;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f239750h) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseAppBrandAppLaunchUsernameDuplicateRecord2", "createTableSql %s", str2);
            k0Var.A("AppBrandAppLaunchUsernameDuplicateRecord2", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "AppBrandAppLaunchUsernameDuplicateRecord2", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseAppBrandAppLaunchUsernameDuplicateRecord2", "updateTableSql %s", str3);
            k0Var.A("AppBrandAppLaunchUsernameDuplicateRecord2", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseAppBrandAppLaunchUsernameDuplicateRecord2", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f239755p;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f239756q;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return java.lang.Integer.valueOf(this.field_usernameHash);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f239749g;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f239749g.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("usernameHash")) {
            this.field_usernameHash = contentValues.getAsInteger("usernameHash").intValue();
            if (z17) {
                this.f239757d = true;
            }
        }
        if (contentValues.containsKey(dm.i4.COL_USERNAME)) {
            this.field_username = contentValues.getAsString(dm.i4.COL_USERNAME);
            if (z17) {
                this.f239758e = true;
            }
        }
        if (contentValues.containsKey(dm.i4.COL_UPDATETIME)) {
            this.field_updateTime = contentValues.getAsLong(dm.i4.COL_UPDATETIME).longValue();
            if (z17) {
                this.f239759f = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
