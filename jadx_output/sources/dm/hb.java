package dm;

/* loaded from: classes4.dex */
public class hb extends l75.f0 {

    /* renamed from: f, reason: collision with root package name */
    public static final p75.n0 f237453f;

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String[] f237454g;

    /* renamed from: h, reason: collision with root package name */
    public static final int f237455h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f237456i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f237457m;

    /* renamed from: n, reason: collision with root package name */
    public static final l75.e0 f237458n;

    /* renamed from: o, reason: collision with root package name */
    public static final o75.e f237459o;

    /* renamed from: d, reason: collision with root package name */
    public boolean f237460d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f237461e = true;
    public int field_tableHash;
    public java.lang.String field_tableSQLMD5;

    static {
        p75.n0 n0Var = new p75.n0("TablesVersion");
        f237453f = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f237454g = new java.lang.String[0];
        f237455h = -1988896260;
        f237456i = 230099550;
        f237457m = 108705909;
        f237458n = initAutoDBInfo(dm.hb.class);
        f237459o = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[2];
        java.lang.String[] strArr = new java.lang.String[3];
        e0Var.f316954c = strArr;
        strArr[0] = "tableHash";
        e0Var.f316955d.put("tableHash", "INTEGER PRIMARY KEY ");
        e0Var.f316953b = "tableHash";
        e0Var.f316954c[1] = "tableSQLMD5";
        e0Var.f316955d.put("tableSQLMD5", "TEXT");
        e0Var.f316954c[2] = "rowid";
        e0Var.f316956e = " tableHash INTEGER PRIMARY KEY ,  tableSQLMD5 TEXT";
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
            if (f237455h == hashCode) {
                try {
                    this.field_tableHash = cursor.getInt(i17);
                    this.f237460d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseTablesVersion", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237456i == hashCode) {
                try {
                    this.field_tableSQLMD5 = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseTablesVersion", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237457m == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f237460d) {
            contentValues.put("tableHash", java.lang.Integer.valueOf(this.field_tableHash));
        }
        if (this.f237461e) {
            contentValues.put("tableSQLMD5", this.field_tableSQLMD5);
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseTablesVersion", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS TablesVersion ( ");
        l75.e0 e0Var = f237458n;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f237454g) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseTablesVersion", "createTableSql %s", str2);
            k0Var.A("TablesVersion", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "TablesVersion", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseTablesVersion", "updateTableSql %s", str3);
            k0Var.A("TablesVersion", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseTablesVersion", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f237458n;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f237459o;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return java.lang.Integer.valueOf(this.field_tableHash);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f237453f;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f237453f.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("tableHash")) {
            this.field_tableHash = contentValues.getAsInteger("tableHash").intValue();
            if (z17) {
                this.f237460d = true;
            }
        }
        if (contentValues.containsKey("tableSQLMD5")) {
            this.field_tableSQLMD5 = contentValues.getAsString("tableSQLMD5");
            if (z17) {
                this.f237461e = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
