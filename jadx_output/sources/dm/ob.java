package dm;

/* loaded from: classes7.dex */
public class ob extends l75.f0 {

    /* renamed from: g, reason: collision with root package name */
    public static final p75.n0 f239022g;

    /* renamed from: h, reason: collision with root package name */
    public static final java.lang.String[] f239023h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f239024i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f239025m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f239026n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f239027o;

    /* renamed from: p, reason: collision with root package name */
    public static final l75.e0 f239028p;

    /* renamed from: q, reason: collision with root package name */
    public static final o75.e f239029q;

    /* renamed from: d, reason: collision with root package name */
    public boolean f239030d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f239031e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f239032f = true;
    public java.lang.String field_appId;
    public java.lang.String field_openId;
    public java.lang.String field_username;

    static {
        p75.n0 n0Var = new p75.n0("UserOpenIdInApp");
        f239022g = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f239023h = new java.lang.String[0];
        f239024i = -1010580219;
        f239025m = 93028124;
        f239026n = -265713450;
        f239027o = 108705909;
        f239028p = initAutoDBInfo(dm.ob.class);
        f239029q = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[3];
        java.lang.String[] strArr = new java.lang.String[4];
        e0Var.f316954c = strArr;
        strArr[0] = "openId";
        e0Var.f316955d.put("openId", "TEXT PRIMARY KEY ");
        e0Var.f316953b = "openId";
        e0Var.f316954c[1] = "appId";
        e0Var.f316955d.put("appId", "TEXT");
        e0Var.f316954c[2] = dm.i4.COL_USERNAME;
        e0Var.f316955d.put(dm.i4.COL_USERNAME, "TEXT");
        e0Var.f316954c[3] = "rowid";
        e0Var.f316956e = " openId TEXT PRIMARY KEY ,  appId TEXT,  username TEXT";
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
            if (f239024i == hashCode) {
                try {
                    this.field_openId = cursor.getString(i17);
                    this.f239030d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseUserOpenIdInApp", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239025m == hashCode) {
                try {
                    this.field_appId = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseUserOpenIdInApp", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239026n == hashCode) {
                try {
                    this.field_username = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseUserOpenIdInApp", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239027o == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f239030d) {
            contentValues.put("openId", this.field_openId);
        }
        if (this.f239031e) {
            contentValues.put("appId", this.field_appId);
        }
        if (this.f239032f) {
            contentValues.put(dm.i4.COL_USERNAME, this.field_username);
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseUserOpenIdInApp", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS UserOpenIdInApp ( ");
        l75.e0 e0Var = f239028p;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f239023h) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseUserOpenIdInApp", "createTableSql %s", str2);
            k0Var.A("UserOpenIdInApp", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "UserOpenIdInApp", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseUserOpenIdInApp", "updateTableSql %s", str3);
            k0Var.A("UserOpenIdInApp", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseUserOpenIdInApp", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f239028p;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f239029q;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return this.field_openId;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f239022g;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f239022g.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("openId")) {
            this.field_openId = contentValues.getAsString("openId");
            if (z17) {
                this.f239030d = true;
            }
        }
        if (contentValues.containsKey("appId")) {
            this.field_appId = contentValues.getAsString("appId");
            if (z17) {
                this.f239031e = true;
            }
        }
        if (contentValues.containsKey(dm.i4.COL_USERNAME)) {
            this.field_username = contentValues.getAsString(dm.i4.COL_USERNAME);
            if (z17) {
                this.f239032f = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
