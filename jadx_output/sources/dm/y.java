package dm;

/* loaded from: classes4.dex */
public class y extends l75.f0 {

    /* renamed from: f, reason: collision with root package name */
    public static final p75.n0 f241128f;

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String[] f241129g;

    /* renamed from: h, reason: collision with root package name */
    public static final int f241130h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f241131i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f241132m;

    /* renamed from: n, reason: collision with root package name */
    public static final l75.e0 f241133n;

    /* renamed from: o, reason: collision with root package name */
    public static final o75.e f241134o;

    /* renamed from: d, reason: collision with root package name */
    public boolean f241135d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f241136e = true;
    public java.lang.String field_appId;
    public java.lang.String field_username;

    static {
        p75.n0 n0Var = new p75.n0("AppBrandIdentifierInfo");
        f241128f = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f241129g = new java.lang.String[0];
        f241130h = -265713450;
        f241131i = 93028124;
        f241132m = 108705909;
        f241133n = initAutoDBInfo(dm.y.class);
        f241134o = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[2];
        java.lang.String[] strArr = new java.lang.String[3];
        e0Var.f316954c = strArr;
        strArr[0] = dm.i4.COL_USERNAME;
        e0Var.f316955d.put(dm.i4.COL_USERNAME, "TEXT");
        e0Var.f316954c[1] = "appId";
        e0Var.f316955d.put("appId", "TEXT");
        e0Var.f316954c[2] = "rowid";
        e0Var.f316956e = " username TEXT,  appId TEXT";
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
            if (f241130h == hashCode) {
                try {
                    this.field_username = cursor.getString(i17);
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandIdentifierInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f241131i == hashCode) {
                try {
                    this.field_appId = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandIdentifierInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f241132m == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f241135d) {
            contentValues.put(dm.i4.COL_USERNAME, this.field_username);
        }
        if (this.f241136e) {
            contentValues.put("appId", this.field_appId);
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseAppBrandIdentifierInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS AppBrandIdentifierInfo ( ");
        l75.e0 e0Var = f241133n;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f241129g) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseAppBrandIdentifierInfo", "createTableSql %s", str2);
            k0Var.A("AppBrandIdentifierInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "AppBrandIdentifierInfo", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseAppBrandIdentifierInfo", "updateTableSql %s", str3);
            k0Var.A("AppBrandIdentifierInfo", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseAppBrandIdentifierInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f241133n;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f241134o;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return java.lang.Long.valueOf(this.systemRowid);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f241128f;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f241128f.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey(dm.i4.COL_USERNAME)) {
            this.field_username = contentValues.getAsString(dm.i4.COL_USERNAME);
            if (z17) {
                this.f241135d = true;
            }
        }
        if (contentValues.containsKey("appId")) {
            this.field_appId = contentValues.getAsString("appId");
            if (z17) {
                this.f241136e = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
