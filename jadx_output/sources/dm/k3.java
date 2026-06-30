package dm;

/* loaded from: classes4.dex */
public class k3 extends l75.f0 {

    /* renamed from: f, reason: collision with root package name */
    public static final p75.n0 f237979f;

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String[] f237980g;

    /* renamed from: h, reason: collision with root package name */
    public static final int f237981h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f237982i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f237983m;

    /* renamed from: n, reason: collision with root package name */
    public static final l75.e0 f237984n;

    /* renamed from: o, reason: collision with root package name */
    public static final o75.e f237985o;

    /* renamed from: d, reason: collision with root package name */
    public boolean f237986d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f237987e = true;
    public int field_configId;
    public java.lang.String field_value;

    static {
        p75.n0 n0Var = new p75.n0("FavConfigInfo");
        f237979f = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f237980g = new java.lang.String[0];
        f237981h = -580140035;
        f237982i = 111972721;
        f237983m = 108705909;
        f237984n = initAutoDBInfo(dm.k3.class);
        f237985o = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[2];
        java.lang.String[] strArr = new java.lang.String[3];
        e0Var.f316954c = strArr;
        strArr[0] = "configId";
        e0Var.f316955d.put("configId", "INTEGER PRIMARY KEY ");
        e0Var.f316953b = "configId";
        e0Var.f316954c[1] = "value";
        e0Var.f316955d.put("value", "TEXT");
        e0Var.f316954c[2] = "rowid";
        e0Var.f316956e = " configId INTEGER PRIMARY KEY ,  value TEXT";
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
            if (f237981h == hashCode) {
                try {
                    this.field_configId = cursor.getInt(i17);
                    this.f237986d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFavConfigInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237982i == hashCode) {
                try {
                    this.field_value = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFavConfigInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237983m == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f237986d) {
            contentValues.put("configId", java.lang.Integer.valueOf(this.field_configId));
        }
        if (this.f237987e) {
            contentValues.put("value", this.field_value);
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseFavConfigInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS FavConfigInfo ( ");
        l75.e0 e0Var = f237984n;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f237980g) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseFavConfigInfo", "createTableSql %s", str2);
            k0Var.A("FavConfigInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "FavConfigInfo", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseFavConfigInfo", "updateTableSql %s", str3);
            k0Var.A("FavConfigInfo", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseFavConfigInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f237984n;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f237985o;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return java.lang.Integer.valueOf(this.field_configId);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f237979f;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f237979f.f352676a;
    }

    @Override // l75.f0
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            n51.f.b(jSONObject, "configId", java.lang.Integer.valueOf(this.field_configId));
            n51.f.b(jSONObject, "value", this.field_value);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("configId")) {
            this.field_configId = contentValues.getAsInteger("configId").intValue();
            if (z17) {
                this.f237986d = true;
            }
        }
        if (contentValues.containsKey("value")) {
            this.field_value = contentValues.getAsString("value");
            if (z17) {
                this.f237987e = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
