package dm;

/* loaded from: classes4.dex */
public class u extends l75.f0 {

    /* renamed from: f, reason: collision with root package name */
    public static final p75.n0 f240214f;

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String[] f240215g;

    /* renamed from: h, reason: collision with root package name */
    public static final int f240216h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f240217i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f240218m;

    /* renamed from: n, reason: collision with root package name */
    public static final l75.e0 f240219n;

    /* renamed from: o, reason: collision with root package name */
    public static final o75.e f240220o;

    /* renamed from: d, reason: collision with root package name */
    public boolean f240221d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f240222e = true;
    public java.lang.String field_token;
    public java.lang.String field_username;

    static {
        p75.n0 n0Var = new p75.n0("AppBrandBackgroundFetchDataToken");
        f240214f = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f240215g = new java.lang.String[0];
        f240216h = -265713450;
        f240217i = 110541305;
        f240218m = 108705909;
        f240219n = initAutoDBInfo(dm.u.class);
        f240220o = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[2];
        java.lang.String[] strArr = new java.lang.String[3];
        e0Var.f316954c = strArr;
        strArr[0] = dm.i4.COL_USERNAME;
        e0Var.f316955d.put(dm.i4.COL_USERNAME, "TEXT");
        e0Var.f316954c[1] = "token";
        e0Var.f316955d.put("token", "TEXT");
        e0Var.f316954c[2] = "rowid";
        e0Var.f316956e = " username TEXT,  token TEXT";
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
            if (f240216h == hashCode) {
                try {
                    this.field_username = cursor.getString(i17);
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandBackgroundFetchDataToken", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240217i == hashCode) {
                try {
                    this.field_token = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandBackgroundFetchDataToken", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240218m == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f240221d) {
            contentValues.put(dm.i4.COL_USERNAME, this.field_username);
        }
        if (this.f240222e) {
            contentValues.put("token", this.field_token);
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseAppBrandBackgroundFetchDataToken", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS AppBrandBackgroundFetchDataToken ( ");
        l75.e0 e0Var = f240219n;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f240215g) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseAppBrandBackgroundFetchDataToken", "createTableSql %s", str2);
            k0Var.A("AppBrandBackgroundFetchDataToken", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "AppBrandBackgroundFetchDataToken", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseAppBrandBackgroundFetchDataToken", "updateTableSql %s", str3);
            k0Var.A("AppBrandBackgroundFetchDataToken", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseAppBrandBackgroundFetchDataToken", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f240219n;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f240220o;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return java.lang.Long.valueOf(this.systemRowid);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f240214f;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f240214f.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey(dm.i4.COL_USERNAME)) {
            this.field_username = contentValues.getAsString(dm.i4.COL_USERNAME);
            if (z17) {
                this.f240221d = true;
            }
        }
        if (contentValues.containsKey("token")) {
            this.field_token = contentValues.getAsString("token");
            if (z17) {
                this.f240222e = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
