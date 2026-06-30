package dm;

/* loaded from: classes4.dex */
public class y4 extends l75.f0 {

    /* renamed from: f, reason: collision with root package name */
    public static final p75.n0 f241193f;

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String[] f241194g;

    /* renamed from: h, reason: collision with root package name */
    public static final int f241195h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f241196i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f241197m;

    /* renamed from: n, reason: collision with root package name */
    public static final l75.e0 f241198n;

    /* renamed from: o, reason: collision with root package name */
    public static final o75.e f241199o;

    /* renamed from: d, reason: collision with root package name */
    public boolean f241200d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f241201e = true;
    public int field_type;
    public java.lang.String field_username;

    static {
        p75.n0 n0Var = new p75.n0("FinderOrAliasDeletingInfo");
        f241193f = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f241194g = new java.lang.String[]{"CREATE INDEX IF NOT EXISTS FinderOrAliasDeletingInfo_username_index ON FinderOrAliasDeletingInfo(username)"};
        f241195h = -265713450;
        f241196i = 3575610;
        f241197m = 108705909;
        f241198n = initAutoDBInfo(dm.y4.class);
        f241199o = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[2];
        java.lang.String[] strArr = new java.lang.String[3];
        e0Var.f316954c = strArr;
        strArr[0] = dm.i4.COL_USERNAME;
        e0Var.f316955d.put(dm.i4.COL_USERNAME, "TEXT default ''  PRIMARY KEY ");
        e0Var.f316953b = dm.i4.COL_USERNAME;
        e0Var.f316954c[1] = "type";
        e0Var.f316955d.put("type", "INTEGER");
        e0Var.f316954c[2] = "rowid";
        e0Var.f316956e = " username TEXT default ''  PRIMARY KEY ,  type INTEGER";
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
            if (f241195h == hashCode) {
                try {
                    this.field_username = cursor.getString(i17);
                    this.f241200d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderOrAliasDeletingInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f241196i == hashCode) {
                try {
                    this.field_type = cursor.getInt(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderOrAliasDeletingInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f241197m == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.field_username == null) {
            this.field_username = "";
        }
        if (this.f241200d) {
            contentValues.put(dm.i4.COL_USERNAME, this.field_username);
        }
        if (this.f241201e) {
            contentValues.put("type", java.lang.Integer.valueOf(this.field_type));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseFinderOrAliasDeletingInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS FinderOrAliasDeletingInfo ( ");
        l75.e0 e0Var = f241198n;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f241194g) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseFinderOrAliasDeletingInfo", "createTableSql %s", str2);
            k0Var.A("FinderOrAliasDeletingInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "FinderOrAliasDeletingInfo", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseFinderOrAliasDeletingInfo", "updateTableSql %s", str3);
            k0Var.A("FinderOrAliasDeletingInfo", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseFinderOrAliasDeletingInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f241198n;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f241199o;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return this.field_username;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f241193f;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f241193f.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey(dm.i4.COL_USERNAME)) {
            this.field_username = contentValues.getAsString(dm.i4.COL_USERNAME);
            if (z17) {
                this.f241200d = true;
            }
        }
        if (contentValues.containsKey("type")) {
            this.field_type = contentValues.getAsInteger("type").intValue();
            if (z17) {
                this.f241201e = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
