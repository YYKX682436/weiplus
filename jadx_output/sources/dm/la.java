package dm;

/* loaded from: classes4.dex */
public class la extends l75.f0 {

    /* renamed from: f, reason: collision with root package name */
    public static final p75.n0 f238319f;

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String[] f238320g;

    /* renamed from: h, reason: collision with root package name */
    public static final int f238321h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f238322i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f238323m;

    /* renamed from: n, reason: collision with root package name */
    public static final l75.e0 f238324n;

    /* renamed from: o, reason: collision with root package name */
    public static final o75.e f238325o;

    /* renamed from: d, reason: collision with root package name */
    public boolean f238326d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f238327e = true;
    public java.lang.String field_key;
    public int field_position;

    static {
        p75.n0 n0Var = new p75.n0("SmileyPanelConfigInfo");
        f238319f = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f238320g = new java.lang.String[0];
        f238321h = 106079;
        f238322i = 747804969;
        f238323m = 108705909;
        f238324n = initAutoDBInfo(dm.la.class);
        f238325o = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[2];
        java.lang.String[] strArr = new java.lang.String[3];
        e0Var.f316954c = strArr;
        strArr[0] = "key";
        e0Var.f316955d.put("key", "TEXT PRIMARY KEY ");
        e0Var.f316953b = "key";
        e0Var.f316954c[1] = "position";
        e0Var.f316955d.put("position", "INTEGER");
        e0Var.f316954c[2] = "rowid";
        e0Var.f316956e = " key TEXT PRIMARY KEY ,  position INTEGER";
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
            if (f238321h == hashCode) {
                try {
                    this.field_key = cursor.getString(i17);
                    this.f238326d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseSmileyPanelConfigInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238322i == hashCode) {
                try {
                    this.field_position = cursor.getInt(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseSmileyPanelConfigInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238323m == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f238326d) {
            contentValues.put("key", this.field_key);
        }
        if (this.f238327e) {
            contentValues.put("position", java.lang.Integer.valueOf(this.field_position));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseSmileyPanelConfigInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS SmileyPanelConfigInfo ( ");
        l75.e0 e0Var = f238324n;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f238320g) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseSmileyPanelConfigInfo", "createTableSql %s", str2);
            k0Var.A("SmileyPanelConfigInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "SmileyPanelConfigInfo", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseSmileyPanelConfigInfo", "updateTableSql %s", str3);
            k0Var.A("SmileyPanelConfigInfo", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseSmileyPanelConfigInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f238324n;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f238325o;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return this.field_key;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f238319f;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f238319f.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("key")) {
            this.field_key = contentValues.getAsString("key");
            if (z17) {
                this.f238326d = true;
            }
        }
        if (contentValues.containsKey("position")) {
            this.field_position = contentValues.getAsInteger("position").intValue();
            if (z17) {
                this.f238327e = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
