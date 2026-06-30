package dm;

/* loaded from: classes4.dex */
public class u0 extends l75.f0 {

    /* renamed from: g, reason: collision with root package name */
    public static final p75.n0 f240223g;

    /* renamed from: h, reason: collision with root package name */
    public static final java.lang.String[] f240224h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f240225i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f240226m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f240227n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f240228o;

    /* renamed from: p, reason: collision with root package name */
    public static final l75.e0 f240229p;

    /* renamed from: q, reason: collision with root package name */
    public static final o75.e f240230q;

    /* renamed from: d, reason: collision with root package name */
    public boolean f240231d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f240232e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f240233f = true;
    public java.lang.String field_aId;
    public long field_exposeTime;
    public long field_msgId;

    static {
        p75.n0 n0Var = new p75.n0("BizAdInfo");
        f240223g = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f240224h = new java.lang.String[0];
        f240225i = 95580;
        f240226m = 104191100;
        f240227n = 223959217;
        f240228o = 108705909;
        f240229p = initAutoDBInfo(dm.u0.class);
        f240230q = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[3];
        java.lang.String[] strArr = new java.lang.String[4];
        e0Var.f316954c = strArr;
        strArr[0] = "aId";
        e0Var.f316955d.put("aId", "TEXT PRIMARY KEY ");
        e0Var.f316953b = "aId";
        e0Var.f316954c[1] = "msgId";
        e0Var.f316955d.put("msgId", "LONG");
        e0Var.f316954c[2] = "exposeTime";
        e0Var.f316955d.put("exposeTime", "LONG");
        e0Var.f316954c[3] = "rowid";
        e0Var.f316956e = " aId TEXT PRIMARY KEY ,  msgId LONG,  exposeTime LONG";
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
            if (f240225i == hashCode) {
                try {
                    this.field_aId = cursor.getString(i17);
                    this.f240231d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBizAdInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240226m == hashCode) {
                try {
                    this.field_msgId = cursor.getLong(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBizAdInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240227n == hashCode) {
                try {
                    this.field_exposeTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseBizAdInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240228o == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f240231d) {
            contentValues.put("aId", this.field_aId);
        }
        if (this.f240232e) {
            contentValues.put("msgId", java.lang.Long.valueOf(this.field_msgId));
        }
        if (this.f240233f) {
            contentValues.put("exposeTime", java.lang.Long.valueOf(this.field_exposeTime));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseBizAdInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS BizAdInfo ( ");
        l75.e0 e0Var = f240229p;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f240224h) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseBizAdInfo", "createTableSql %s", str2);
            k0Var.A("BizAdInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "BizAdInfo", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseBizAdInfo", "updateTableSql %s", str3);
            k0Var.A("BizAdInfo", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseBizAdInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f240229p;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f240230q;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return this.field_aId;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f240223g;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f240223g.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("aId")) {
            this.field_aId = contentValues.getAsString("aId");
            if (z17) {
                this.f240231d = true;
            }
        }
        if (contentValues.containsKey("msgId")) {
            this.field_msgId = contentValues.getAsLong("msgId").longValue();
            if (z17) {
                this.f240232e = true;
            }
        }
        if (contentValues.containsKey("exposeTime")) {
            this.field_exposeTime = contentValues.getAsLong("exposeTime").longValue();
            if (z17) {
                this.f240233f = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
