package dm;

/* loaded from: classes4.dex */
public class b9 extends l75.f0 {

    /* renamed from: f, reason: collision with root package name */
    public static final p75.n0 f235899f;

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String[] f235900g;

    /* renamed from: h, reason: collision with root package name */
    public static final int f235901h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f235902i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f235903m;

    /* renamed from: n, reason: collision with root package name */
    public static final l75.e0 f235904n;

    /* renamed from: o, reason: collision with root package name */
    public static final o75.e f235905o;

    /* renamed from: d, reason: collision with root package name */
    public boolean f235906d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f235907e = true;
    public java.lang.String field_key;
    public byte[] field_value;

    static {
        p75.n0 n0Var = new p75.n0("PBCache");
        f235899f = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f235900g = new java.lang.String[0];
        f235901h = 106079;
        f235902i = 111972721;
        f235903m = 108705909;
        f235904n = initAutoDBInfo(dm.b9.class);
        f235905o = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[2];
        java.lang.String[] strArr = new java.lang.String[3];
        e0Var.f316954c = strArr;
        strArr[0] = "key";
        e0Var.f316955d.put("key", "TEXT PRIMARY KEY ");
        e0Var.f316953b = "key";
        e0Var.f316954c[1] = "value";
        e0Var.f316955d.put("value", "BLOB");
        e0Var.f316954c[2] = "rowid";
        e0Var.f316956e = " key TEXT PRIMARY KEY ,  value BLOB";
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
            if (f235901h == hashCode) {
                try {
                    this.field_key = cursor.getString(i17);
                    this.f235906d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BasePBCache", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f235902i == hashCode) {
                try {
                    this.field_value = cursor.getBlob(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BasePBCache", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f235903m == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f235906d) {
            contentValues.put("key", this.field_key);
        }
        if (this.f235907e) {
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BasePBCache", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS PBCache ( ");
        l75.e0 e0Var = f235904n;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f235900g) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BasePBCache", "createTableSql %s", str2);
            k0Var.A("PBCache", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "PBCache", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BasePBCache", "updateTableSql %s", str3);
            k0Var.A("PBCache", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BasePBCache", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f235904n;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f235905o;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return this.field_key;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f235899f;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f235899f.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("key")) {
            this.field_key = contentValues.getAsString("key");
            if (z17) {
                this.f235906d = true;
            }
        }
        if (contentValues.containsKey("value")) {
            this.field_value = contentValues.getAsByteArray("value");
            if (z17) {
                this.f235907e = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
